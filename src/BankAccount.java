public class BankAccount {
    private long accountNumber;
    private int accountBalance;
    private String customerName;
    private String email;
    private long mobileNo;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }
    public void BankAccount(){
        System.out.println("Empty constructor");
    }
    public void BankAccount(String customerName, String email,int accountBalance, long accountNumber, long mobileNo){
        System.out.println("Constructor with parameters: ");
    }
    public void depositFunds(int depositAmount){
        accountBalance+= depositAmount;
        System.out.println("$"+depositAmount+"made new Balance $"+accountBalance);

    }
    public void withdrawFunds(int withdrawAmount){
        accountBalance-=withdrawAmount;
        System.out.println("The new account Balance after withdrawing $"+ withdrawAmount+ " is $"+ accountBalance);
    }
}
