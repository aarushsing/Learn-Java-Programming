package Programing.Section6;

public class Day_24_2_sub_c_dog extends Day_24_1_base_animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Day_24_2_sub_c_dog(String name, int brain, int body, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

        System.out.println("Name is " + name + " have " + eyes + " eyes and " + coat);
    }

        private void chew(){
            System.out.println("chew() method which is a private method of subclass dog is called");
        }

        @Override
        public void eat(){
            System.out.println("eat() method is called from dog class.");
            chew();
        super.eat();
    }


    public void walk() {
        System.out.println("dog.walk() method is called");
        super.move(5);
    }
    public void run() {
        System.out.println("dog.run() method is called");
        move(10);
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move() [this is overridden method from subclass dog and idhar kuch changes hue hai..]");
        super.move(speed);
    }
}
