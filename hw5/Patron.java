public class Patron {
  private String name;
  private String email;
  private int idnumber;
  private double balance;
  
  public  Patron(String name, String email, int idnumber, double balance) {
    this.name = name;
    this.email = email;
    this.idnumber = idnumber;
    this.balance = balance;
  }
  public double adjustBalance(double amount) {
    balance = balance + amount;
    return balance;
  }
  public boolean equals(Object other) {
    if(this.idNumber==other.idNumber) {
      return true;
    }
    else {
      return false;
    }
  }
  public String toString() {
    return String.format("Name: " + name + "Email: " + email + "ID: " + idnumber + "Balance: " + balance + ".");
  
  }
}