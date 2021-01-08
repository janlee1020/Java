/**
 * Simple HashTable class.
 *
 * @author Janet Lee
 *
 */
public class HashTable<K, V> {

  /**
   * Item class is a simple wrapper for key/value pairs.
   */
  class Item<K, V> { // leave this non-private for testing.
    private K key;
    private V value;
    private boolean tombstone;

    /**
     * Create an Item object.
     */
    public Item(K key, V value) {
      this.key = key;
      this.value = value;
      this.tombstone = false;
    }
  }

  public static final int INITIAL_CAPACITY = 16; // must be a power of 2.
  public static final double MAX_LOAD = .5;

  Item<K, V>[] table; // (Leave this non-private for testing.)
  private int size;

  /**
   * HashTable constructor.
   */
  @SuppressWarnings("unchecked")
  public HashTable() {
    table = (Item[]) new Item[INITIAL_CAPACITY];
    size = 0;
  }


  /**
   * Store the provided key/value pair.
   */
  public void put(K key, V value) {
    if ((size + 1) / (double) table.length > MAX_LOAD) {
      rehash();
    }
    int ind = findKey(key);
    table[ind] = new Item<K,V>(key, value);
    size++;
  }

  /**
   * Return the value associated with the provided key, or null if no such value
   * exists.
   */
  public V get(K key) {
    int ind = findKey(key);
    if (ind == -1) {
      return null;
    }
    else {
      return table[ind].value;
    }
  }


  /**
   * Remove the provided key from the hash table and return the associated
   * value. Returns null if the key is not stored in the table.
   */
  public V remove(K key) {
    int ind = findKey(key);
    if (ind == -1) {
      return null;
    }
    else {
      table[ind].tombstone = true;
      size--;
      return table[ind].value;
    }

  }

  /**
   * Return the number of items stored in the table.
   */
  public int size() {
    return size;
  }

  // PRIVATE HELPER METHODS BELOW THIS POINT----------


  /**
   * Double the size of the hash table and rehash all existing items.
   */
  private void rehash() {
    Item<K,V> [] hashnode = table;
    Item<K,V> [] table = (Item[]) new Item[hashnode.length * 2];
    size = 0;
    for (int i = 0; i < table.length; i++) {
      if (hashnode[i] != null) {
        put(hashnode[i].key, hashnode[i].value);
      }
    }
  }


  /**
   * Find the index of a key or return -1 if it can't be found. If removal is
   * implemented, this will skip over tombstone positions during the search.
   */
  private int findKey(K key) {
    int ind = indexFor(key.hashCode(), table.length);
    while ((table[ind].key != key) || (table[ind].tombstone)) {
      ind++; 
    }
    if (table[ind] == null) {
      return -1;
    }
    else {
      return ind; 
    }
    }
    
    



  /**
   * Returns index for hash code h.
   */
  private int indexFor(int h, int length) {
    return hash(h) & (length - 1);
  }

  /**
   * Applies a supplemental hash function to a given hashCode, which defends
   * against poor quality hash functions. This is critical because HashMap uses
   * power-of-two length hash tables, that otherwise encounter collisions for
   * hashCodes that do not differ in lower bits.
   */
  private int hash(int h) {
    // This function ensures that hashCodes that differ only by
    // constant multiples at each bit position have a bounded
    // number of collisions (approximately 8 at default load factor).
    h ^= (h >>> 20) ^ (h >>> 12);
    return h ^ (h >>> 7) ^ (h >>> 4);
  }



}



// The hash and indexFor methods are taken directly from the Java HashMap
// implementation with some modifications. That code is licensed as follows:
/*
 * Copyright 1997-2007 Sun Microsystems, Inc. All Rights Reserved. DO NOT ALTER
 * OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License version 2 only, as published by
 * the Free Software Foundation. Sun designates this particular file as subject
 * to the "Classpath" exception as provided by Sun in the LICENSE file that
 * accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License version 2 for more
 * details (a copy is included in the LICENSE file that accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version 2
 * along with this work; if not, write to the Free Software Foundation, Inc., 51
 * Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara, CA
 * 95054 USA or visit www.sun.com if you need additional information or have any
 * questions.
 */