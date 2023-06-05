package Programing.Section6;

public class Day_24_1_base_animal {
    private String name;
    private int brain;
    private int body;
    private int weight;

    public Day_24_1_base_animal(String name, int brain, int body, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("eat() method is called from the animal base class.");

    }

    public void move(int speed){
        System.out.println("animal.move().. Animal is moving at speed of " +speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }


    public int getWeight() {
        return weight;
    }
}
