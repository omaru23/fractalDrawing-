import java.awt.Color;
public class Rectangle {
    private double xPosLeft;
    private double yPosLeft;
    private double width;
    private double height;
    private Color recColor;


    public Rectangle(double xPosLeft, double yPosLeft, double width, double height) {
        this.xPosLeft = xPosLeft;
        this.yPosLeft = yPosLeft;
        this.width = width;
        this.height = height;
    }

    public double calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    public double calculateArea() {
        return this.height * this.width;
    }

    public void setColor(Color recColor) {
        this.recColor = recColor;
    }

    public void setPos(double xPosLeft, double yPosLeft) {
        this.xPosLeft = xPosLeft;
        this.yPosLeft = yPosLeft;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public Color getColor() {
        return this.recColor;
    }

    public double getXPos() {
        return this.xPosLeft;
    }
    public double getYPos() {
        return this.yPosLeft;
    }
    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }
}