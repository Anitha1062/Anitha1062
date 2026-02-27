class BankAccount{
private String accountHolder;
private double balance;
private int amount;
public BankAccount(String accountHolder,double balance,int amount){
this.accountHolder=accountHolder;
this.balance=balance;
this.amount=amount;
}
public void deposite(double balance){
if(amount>0){
balance+=amount;
System.out.println("Amount Deposite Successfully");
}else{
System.out.println("Invalid Amount");
}
}
public void withdraw(double amont){
if(amount>0&&amount<=balance){
balance-= amount;
System.out.println("Amout Withdraw Successfully");
}else{
System.out.println("Insufficient Balance");
}
}
public double getBalance(){
return balance;
}
}

