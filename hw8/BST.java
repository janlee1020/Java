

//}
/*
 * OpenDSA Project Distributed under the MIT License
 * 
 * Copyright (c) 2011-2016 - Ville Karavirta and Cliff Shaffer
 */

// Unfinished Binary Search Tree implementation
class BST<E extends Comparable<E>> {
  protected BSTNode<E> root; // Root of the BST
  protected int nodecount; // Number of nodes in the BST

  // constructor
  BST() {
    root = null;
    nodecount = 0;
  }

  // Reinitialize tree
  public void clear() {
    root = null;
    nodecount = 0;
  }

  // Insert a record into the tree.
  // Records can be anything, but they must be Comparable
  // e: The record to insert.
  public void insert(E e) {
    root = inserthelp(root, e);
    nodecount++;
  }

  private BSTNode<E> inserthelp(BSTNode<E> rt, E e) {
    if (rt == null)
      return new BSTNode<E>(e);
    if (rt.element().compareTo(e) >= 0)
      rt.setLeft(inserthelp(rt.left(), e));
    else
      rt.setRight(inserthelp(rt.right(), e));
    return rt;

  }


  // Return the record with key value k, null if none exists
  // key: The key value to find
  public E find(E key) {
    return findhelp(root, key);
  }

  private E findhelp(BSTNode<E> rt, E key) {
    if (rt == null)
      return null;
    if (rt.element().compareTo(key) > 0)
      return findhelp(rt.left(), key);
    if (rt.element().compareTo(key) == 0)
      return rt.element();
    else
      return findhelp(rt.right(), key);

  }

  // Return the number of records in the dictionary
  public int size() {
    return nodecount;
  }


  // UNFINISHED METHODS BELOW THIS POINT**************************

  /**
   * Recursively calculate the number of nodes in this BST.
   */
  
  public int recursiveSize() {
    //You will need a recursive helper method!
    return rsHelper(root);
  }
  
  private int rsHelper(BSTNode<E> node) {
    if (node == null) {
      return 0;
    }
    
    return 1 + rsHelper(node.left()) + rsHelper(node.right());
  } 
  
 public E minElement() {
   return minHelper(root);
 }
 
 private E minHelper(BSTNode<E> node) {
   if (node == null) {
     return null;
   }
   if (node.left() == null) {
     return node.element();
   }
   return minHelper(node.left());
 }

 public E maxElement() {
   return maxHelper(root);
 }
 
 private E maxHelper(BSTNode<E> node) {
   if (node == null) {
     return null;
   }
   
   if (node.right() == null) {
     return node.element();
   }
   return maxHelper(node.right());
 }

      /**

      * Return an ordered linked list containing all of the elements from the

      * tree.

      */

  public LList<E> makeOrderedList() {
    LList<E> llist = new LList<E>();
    olHelper(root, llist);
    return llist;
  }

  private void olHelper(BSTNode<E> node, LList<E> llist) {
    if (node != null) {
      olHelper(node.left(), llist);
      llist.append(node.element());
      olHelper(node.right(), llist);
    }
  }


  public boolean isValidBST() {
    return valHelper(root);
  }

  private boolean valHelper(BSTNode<E> node) {
    if (node == null || node.isLeaf()) {
      return true;
    }
    
    if (node.left() != null && maxHelper(node.left()).compareTo(node.element()) > 0) {
      return false;
    }

    if (node.right() != null && minHelper(node.right()).compareTo(node.element()) < 0) {
      return false;
    }
    
    return valHelper(node.left()) && valHelper(node.right());
  }

}
