// FractalDrawer class draws a fractal of a shape indicated by user input
// Written/edited by: Ubah Omar, omaru

import java.awt.Color;
import java.util.Scanner;
import java.lang.Math;


public class FractalDrawer {
    private double totalArea=0;  // member variable for tracking the total area
    public FractalDrawer() {}  // constructor

    //TODO:
    // drawFractal creates a new Canvas object
    // and determines which shapes to draw a fractal by calling appropriate helper function
    // drawFractal returns the area of the fractal
    public double drawFractal(String type) {
        Canvas drawing = new Canvas(800,800);
         if (type.equals("Circle")) {
             drawCircleFractal(250, 200, 100, Color.BLUE, drawing , 1);
             return totalArea;
         }
         if (type.equals("Triangle")) {
             drawTriangleFractal(250, 200, 100, 150, Color.YELLOW, drawing, 1);
             return totalArea;
         }
         if (type.equals("Rectangle")) {
             drawRectangleFractal(200, 200, 100, 150, Color.RED, drawing, 1);
             return totalArea;
         } else{
             System.out.println("Invalid input");
             return 0;
         }
    }
    //TODO:
    // drawTriangleFractal draws a triangle fractal using recursive techniques
    public void drawTriangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
        if (level > 7){
            return;
        } else {
            Triangle myTriangle = new Triangle(width,height,x ,y);
            totalArea+= myTriangle.calculateArea();
            myTriangle.setColor(c);
            can.drawShape(myTriangle);
            drawTriangleFractal(width/2, height/2, x+1/2, y-Math.sin(Math.PI/30), Color.GREEN, can, level-1);

        }
    }
    // TODO:
    // drawCircleFractal draws a circle fractal using recursive techniques
    public void drawCircleFractal(double radius, double x, double y, Color c, Canvas can, int level){
            if (level > 7) {
                return;
            } else {
                Circle myCircle = new Circle(radius, x, y);
                totalArea += myCircle.calculateArea();
                myCircle.setColor(c);
                can.drawShape(myCircle);
            }
        }
    //TODO:
    // drawRectangleFractal draws a rectangle fractal using recursive techniques
    public void drawRectangleFractal(double width, double height, double x, double y, Color c, Canvas can, int level){
                if (level > 7) {
                    return;
                } else {
                    Rectangle myRectangle = new Rectangle(width, height, x, y);
                    totalArea += myRectangle.calculateArea();
                    myRectangle.setColor(c);
                    can.drawShape(myRectangle);


                    drawRectangleFractal(width/2, height/2, x- width/2, y+ height/2, Color.GREEN, can, level+1);
                    drawRectangleFractal(width/2, height/2, x+ width/2, y- height/2, Color.RED, can, level+1);
                    drawRectangleFractal(width/2, height/2, x- width/2, y+ height/2, Color.BLUE, can, level+1);

                }
            }
    //TODO:
    // main should ask user for shape input, and then draw the corresponding fractal.
    // should print area of fractal
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please select from Circle, Triangle, or Rectangle:");
        String type = input.nextLine();
        FractalDrawer fDraw = new FractalDrawer();
        fDraw.drawFractal(type);

    }
}




