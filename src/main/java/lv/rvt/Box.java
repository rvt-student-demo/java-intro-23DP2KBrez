package lv.rvt;

public class Box {

    public double width;
    public double height;
    public double length;

    public double length() { return length; }
    public double height() { return height; }
    public double width() { return width; }

    private Box oldBox;

    public Box( double width, double height, double length )
    {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public Box ( double side )
    {
        this.width = side;
        this.height = side;
        this.length = side;    
    }

    Box( Box oldBox )
    {
        this.oldBox = oldBox;
    }
    
    public double volume()
    {
        return width * height * length;
    }
    
    private double faceArea()
    {
        return height * length;
    }
    private double topArea()
    {
        return width * length;
    }
    private double sideArea()
    {
        return width * height;
    }
    public double area()
    {
        return faceArea() * 2 + topArea() * 2 + sideArea() * 2;
    }

    public Box biggerBox( Box oldBox )
    {
        return new Box( 1.25*oldBox.width(), 1.25*oldBox.height(), 1.25*oldBox.length());
    }

    public Box smallerBox( Box oldBox )
    {
        return new Box( 0.75*oldBox.width(), 0.75*oldBox.height(), 0.75*oldBox.length());
    }

    public boolean nests(Box outlideBox)
    {
        if(length > outlideBox.length() && width > outlideBox.width() && height > outlideBox.height())
        {
            return true;
        }
        return false;
    }
}
