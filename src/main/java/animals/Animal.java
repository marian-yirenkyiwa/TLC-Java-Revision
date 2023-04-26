package animals;

public class Animal {

    private String name;
    private float weight;
    private String color;
    private String type;
    private String habitat;

    //creating a default constructor in the Animal class
    public Animal(){

    }

    //creating a constructor to initialize the attributes of the Animal class
//    public Animal(String name, float weight, String color, String type, String habitat){
//        this.name = name;
//        this.weight= weight;
//        this.color = color;
//        this.type = type;
//        this.habitat = habitat;
//    }

    //creating a move() method in the Base Class so that child classes can inherit
    public void move(){
        System.out.println("The animal is moving");
    }

    //creating an eat() method in the Base Class so that child classes can inherit
    public void eat(){
        System.out.println("The animal is eating");
    }

    //implementing getters and setters so that child class can access private variables
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }



}
