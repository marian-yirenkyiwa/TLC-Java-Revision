package animals;

public class Eagle extends Animal{
    private double beak_weight;
    private double feet_weight;

    public void setBeak_weight(double beak_weight){
        this.beak_weight = beak_weight;
    }

    public double getBeak_weight(){
        return beak_weight;
    }

    public void setFeet_weight(double feet_weight){
        this.feet_weight = feet_weight;
    }

    public double getFeet_weight() {
        return feet_weight;
    }

    //a method to compare eagle's feet and beak size using java ternary operator
    public void compare_beak_and_feet_weight(){
        double feet_w = this.feet_weight;
        double beak_w = this.beak_weight;
        double highest_weight = (feet_w > beak_w ? feet_w : beak_w);
        System.out.println("The highest between the two is " + highest_weight);
    }

    //the Eagle Class overriding the move() and eat() method from its parent Class 'Animal'
    @Override
    public void move(){
        System.out.println("The eagle is flying");
    }

    @Override
    public void eat(){
        System.out.println("The eagle is eating fig");
    }


}
