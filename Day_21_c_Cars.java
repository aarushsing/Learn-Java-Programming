package Programing.Section6;

public class Day_21_c_Cars {
    private int doors;
    private String model;


    public void setModel(String model) {
        String validmodel =model.toLowerCase();
        if (validmodel.equals("porsche") || validmodel=="audi"){
            this.model = model;
        }
        else {
            this.model = "unknown car";
        }
    }

    public String getModel() {
        return model;
    }

    public void setDoors (int doors){
        int validdoors = doors;

        if (validdoors ==2 || validdoors==4){
            this.doors=doors;
        }
        else{
            this.doors = 0;
        }

    }

    public int getDoors(){
        return this.doors;
    }

}
