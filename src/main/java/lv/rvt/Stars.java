package lv.rvt;

public class Stars 
{
    public static void printStars(int stars)
    {
        for(int i = 0; i < stars; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int spaces)
    {
        for(int i = 0; i < spaces; i++)
        {
            System.out.print(" ");
        }
    }

    public static void printSquare(int size)
    {
        for(int i = 0; i < size; i++)
        {
            printStars(4);
        }
    }

    public static void printRectangle(int width, int height)
    {
        for(int i = 0; i < height; i++)
        {
            printStars(width);
        }
    }

    public static void printTriangle(int size)
    {
        for(int i = 1; i < size + 1; i++)
        {
            printStars(i);
        }
    }

    public static void printRightTriangle(int size)
    {
        for(int i = 1; i < size + 1; i++)
        {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height)
    {
        int stars = 1;
        for(int i = 1; i < height + 1; i++)
        {
            printSpaces(height - i);
            printStars(stars);
            stars += 2;
        }
        for(int i = 0; i < 3; i++)
        {
            printSpaces(height - 2);
            printStars(3);
        }
    }
}
