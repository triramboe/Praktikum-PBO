package Rooms;

public class LivingRoom extends Room{
    private double length;
    private double width;


    public LivingRoom (double length, double width){
        this.length = length;
        this.width = width;
    }


    public double area() {
        return length * width;
    }
}
