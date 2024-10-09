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

        float number = 0;
        float sum = 0;
        int count = 0;
        int odd = 0;
        int even = 0;
        while(true)
        {
            number = inputManager.getFloat();
            sum += number;
            if(number < 0)
            {
                break;
            }
            if(number % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }

            count++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (sum/count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}