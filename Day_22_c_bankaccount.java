package Programing.Section6;

public class Day_22_c_bankaccount {
    private int account_number;
    private int balance ;
    private int phone_number;
    private String name;
    private String email;

    // making a constructor

    public Day_22_c_bankaccount(){
        this(9999,9899,"default account","default email");
        System.out.println("Empty constructor(without-parameters) is called");
    }

    public Day_22_c_bankaccount (int account_number , int phone_number, String name, String email){
        this.account_number=account_number;
        this.balance=balance;
        this.phone_number=phone_number;
        this.name=name;
        this.email=email;
        System.out.println("Account constructor with parameter is called");
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void deposit_funds ( int deposit ){
            this.balance += deposit;
            System.out.println(" An amount of "+deposit+" has been deposited successfully");
            System.out.println(" current balance is:" +this.balance);


    }

    public int withdraw_funds( int withdraw ){

        if(balance - withdraw<0){

            System.out.println("only "+balance+" available . payment cannot be processed");
        }
        else {
            this.balance -= withdraw;
            System.out.println(" withdrawal of "+withdraw +" processed successfully, current balance is:" +this.balance);
            return 0;
        }

        return this.balance;
    }

}
