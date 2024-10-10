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

    public static void printText() 
    {
        System.out.println("In a hole in the ground there lived a method");
    }
    public static void main( String[] args )
    {
        scanner = new Scanner(System.in);
        inputManager = new InputManager(scanner);

        System.out.println("How many times?");
        int number = inputManager.getInt();

        for(int i = 0; i < number; i++)
        {
            printText();
        }
    }
}