// Written by: Ubah Omar, omaru
import java.awt.Color;
public class Triangle {
    private double xPosLeft;
    private double yPosLeft;
    private double width;
    private double height;
    private Color triColor;
    public Triangle(double xPosLeft, double yPosLeft, double width, double height){
        this.xPosLeft = xPosLeft;
        this.yPosLeft = yPosLeft;
        this.width = width;
        this.height = height;

    }
//    Formula: P = 2a + b
    public double calculatePerimeter(){
        return (2 * this.width) + this.height;
    }
    public double calculateArea(){
        return (this.width * this.height) / 2;
    }
    public void setColor(Color triColor){
        this.triColor = triColor;

    }

    public void setxPosLeft(double xPosLeft, double yPosLeft ) {
        this.xPosLeft = xPosLeft;
        this.yPosLeft = yPosLeft;
    }

    public void setHeight(double height){
        this.height = height;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public Color getColor(){
        return this.triColor;
    }
   public double getXPos(){
        return this.xPosLeft;
   }
   public double getYPos(){
        return this.yPosLeft;
   }
    public double getHeight(){
        return height;
    }
    public double getWidth() {
        return width;
    }
}
