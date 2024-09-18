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

        System.out.println("Give points[0-100]:");
        float points = inputManager.getFloat();
        if(points < 0)
        {
            System.out.println("Impossible");
        }
        else if (points < 49 && points > 0)
        {
            System.out.println("failed");
        }
        else if (points > 49 && points < 60)
        {
            System.out.println("1");
        }
        else if (points >= 60 && points <= 70)
        {
            System.out.println("2");
        }
        else if (points >= 70 && points <= 80)
        {
            System.out.println("3");
        }
        else if (points >= 80 && points <= 90)
        {
            System.out.println("4");
        }
        else if (points >= 90 && points <= 100)
        {
            System.out.println("5");
        }
        else if (points > 100)
        {
            System.out.println("Incredible!");
        }
    }
}