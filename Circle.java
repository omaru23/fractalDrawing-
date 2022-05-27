
// Written by: Ubah Omar, omaru
import java.awt.Color;
import java.awt.*;
//import java.Math.*;

public class Circle {
    private double xPos;
    private double yPos;
    private double radius;
    private Color cirColor;

    public Circle(double xPos, double yPos, double radius){
        this.xPos = xPos;
        this.yPos=yPos;
        this.radius=radius;
    }
    public double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
    public double calculateArea(){
        return Math.PI * radius * radius;
    }
    public void setColor(Color cirColor){
        this.cirColor = cirColor;
    }
    public void setPos(double xPos , double yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public Color getColor(){
        return this.cirColor;
    }
    public double getXPos() {
        return this.xPos;
    }
    public double getYPos(){
        return this.yPos;

    }
    public double getRadius(){
        return this.radius;

    }
}
