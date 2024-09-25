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

        int count = 0;
        int sum = 0;
        while (true) 
        {
            System.out.println("Give a number: ");
            int number = inputManager.getInt();
            
            if (number == 0) 
            {
                System.out.println("Number of numbers: " + count);
                System.out.println("Sum of the numbers: "+ sum);
                break;
            }
            else
            {
                sum += number;
                count++;
            }
        }
        scanner.close();
    }
}