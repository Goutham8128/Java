public class BankMain {
    public static void main(String[] args){
        BankAccount account=new BankAccount();
        account.setCustomerName("Goutham");
        account.setAccountNumber(134010100025662L);
        account.setMobileNo(9409998939L);
        account.setAccountBalance(879);

        account.depositFunds(980);

        account.withdrawFunds(2277);
        if(account.getAccountBalance()<0)
            System.out.println("Transaction invalid");




        System.out.println("Customer name is "+account.getCustomerName());
        System.out.println("Customer account number is "+account.getAccountNumber());
        System.out.println("Customer mobile number is"+account.getMobileNo());
    }
}
