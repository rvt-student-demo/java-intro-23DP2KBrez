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

    static void divisibleByThreeInRange(int a, int b)
    {
        for(int i = a; b + 1 > i; i++)
        {
            if(i % 3 == 0)
            {
                System.out.println(i);
            }
        }
    }

    public static void main( String[] args )
    {
        scanner = new Scanner(System.in);
        inputManager = new InputManager(scanner);
        divisibleByThreeInRange(3, 9);

        scanner.close();
    }
}