package Programing.Section6;

public class Day_23_c_constructor_challenge {
    private String Name;
    private double credit_limit;
    private String email_address;

    public Day_23_c_constructor_challenge(){
        this("Empty name's",999,"xyz@gmail.com");
        System.out.println("empty constructed is called");
    }
    public Day_23_c_constructor_challenge(String name, double credit_limit){
        this(name,credit_limit,"idontknow@gmail.com");
        System.out.println("two field constructed is called");
    }

    public Day_23_c_constructor_challenge(String name, double credit_limit, String email_address) {
        this.Name = name;
        this.credit_limit = credit_limit;
        this.email_address = email_address;
        System.out.println("all field constructed is called");
    }


    public String getName() {
        return Name;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public String getEmail_address() {
        return email_address;
    }
}
