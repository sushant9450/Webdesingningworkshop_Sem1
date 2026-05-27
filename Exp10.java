abstract class BankAccount {
private int accountId;
private String holderName;
private double balanceAmount;
BankAccount(int accountId, String holderName, double balanceAmount) {
this.accountId = accountId;
this.holderName = holderName;
this.balanceAmount = balanceAmount;
}
public int getAccountId() {
return accountId;
}
public String getHolderName() {
return holderName;
}
public double getBalanceAmount() {
return balanceAmount;
}
public void setHolderName(String holderName) {
this.holderName = holderName;
}
public void setBalanceAmount(double balanceAmount) {
this.balanceAmount = balanceAmount;
}
public void depositMoney(double amount) {
balanceAmount = balanceAmount + amount;
System.out.println("Deposited Amount : " + amount);
}
public void showDetails() {
System.out.println("Account ID : " + accountId);
System.out.println("Account Holder : " + holderName);
System.out.println("Available Balance : " + balanceAmount);
}
abstract void calculateInterest();
}
class SavingsAccount extends BankAccount {
SavingsAccount(int accountId, String holderName, double balanceAmount) {
super(accountId, holderName, balanceAmount);
}
@Override
void calculateInterest() {
    double interest = getBalanceAmount() * 0.04;
System.out.println("Savings Account Interest : " + interest);
}
}
class CurrentAccount extends BankAccount {
CurrentAccount(int accountId, String holderName, double balanceAmount) {
super(accountId, holderName, balanceAmount);
}
@Override
void calculateInterest() {
double interest = getBalanceAmount() * 0.025;
System.out.println("Current Account Interest : " + interest);
}
}
public class Exp10 {
public static void main(String[] args) {
System.out.println("Name : Sushant Singh");
System.out.println("Section : CSE-26");
System.out.println("Roll No : 2503201001207");
System.out.println();
SavingsAccount savingUser =
new SavingsAccount(501, "Rahul", 12000);
CurrentAccount currentUser =
new CurrentAccount(502, "Sneha", 30000);
System.out.println("===== SAVINGS ACCOUNT =====");
savingUser.depositMoney(2500);
savingUser.showDetails();
savingUser.calculateInterest();
System.out.println();
System.out.println("===== CURRENT ACCOUNT =====");
currentUser.depositMoney(4000);
currentUser.showDetails();
currentUser.calculateInterest();
}
}