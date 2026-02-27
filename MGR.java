public class MGR{
public static void main(String[] args){
BankAccount b1=new BankAccount("Anitha",10000.0,15000);
b1.deposite(5000);
b1.withdraw(3000);
System.out.println("Available Balance:"+b1.getBalance());
}
}