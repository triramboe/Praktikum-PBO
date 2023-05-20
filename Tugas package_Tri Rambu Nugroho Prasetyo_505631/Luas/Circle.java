package Luas;

public class Circle extends MathLib {
    public double getRadius() {
        return radius;
    }

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void getLuas(){
        System.out.println("Luas Area dengan radius " + getRadius() + " adalah " + MathLib.pi*getRadius()*getRadius());
    }



}
