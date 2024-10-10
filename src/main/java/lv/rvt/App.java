package lv.rvt;
import java.util.*;

class InputManager
{
    Scanner scanner;

    InputManager(Scanner scanner)
    {
        this.scanner = scanner;
    }

    public int getInt()
    {
        return Integer.valueOf(scanner.nextLine());
    }

    public float getFloat()
    {
        return Float.valueOf(scanner.nextLine());
    }

    public String getString()
    {
        return scanner.nextLine();
    }
}


public class App 
{
    static InputManager inputManager;
    static Scanner scanner;

    public static void main( String[] args )
    {
        scanner = new Scanner(System.in);
        inputManager = new InputManager(scanner);

        Stars.printSquare(3);
        Stars.printRectangle(17, 3);
        Stars.printTriangle(4);
        Stars.printRightTriangle(4);
        Stars.christmasTree(4);
        Stars.christmasTree(10);
    }
}