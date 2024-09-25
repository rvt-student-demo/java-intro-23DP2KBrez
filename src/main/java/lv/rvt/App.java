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

        System.out.println("Value of the gift?");
        int value = inputManager.getInt();
        if (value < 5000)
        {
            System.out.println("No tax!");
        }
        else if (value >= 5000 && value < 25000)
        {
            System.out.println("Tax: " + (100 + (value-5000)*0.08));
        }
        else if (value >= 25000 && value < 55000)
        {
            System.out.println("Tax: " + (1700 + (value-25000)*0.1));
        }
        else if (value >= 55000 && value < 200000)
        {
            System.out.println("Tax: " + (4700 + (value-55000 )*0.12));
        }
        else if (value >= 200000 && value < 1000000)
        {
            System.out.println("Tax: " + (22100 + (value-200000)*0.15));
        }
        else if (value >= 1000000)
        {
            System.out.println("Tax: " + (142100 + (value-1000000)*0.17));
        }
        scanner.close();
    }
}