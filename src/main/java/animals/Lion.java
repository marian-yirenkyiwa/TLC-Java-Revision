package animals;

public class Lion extends Animal{

    private String eyeColor;

    //creating the default constructor of the Lion class
    public Lion() {

    }
    //creating
//    public Lion(String name, float weight, String color, String type, String habitat, String eyeColor) {
//        super(name, weight, color, type, habitat);
//        this.eyeColor = eyeColor;
//    }

    //overriding move() method in the Animal base class to implement it in its own way
    @Override
    public void move(){
        System.out.println("The Lion is moving");
    }

    //overriding eat() method in the Animal base class to implement it in its own way
    @Override
    public void eat(){ System.out.println("The Lion is eating"); }




}
