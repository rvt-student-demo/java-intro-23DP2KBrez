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
        
        int number = inputManager.getInt();

        if(number == 0)
        {
            System.out.println(1);
            return;
        }

        int answer = 1;
        for(int i = 1; i < number + 1; i++)
        {
            answer *= i;
        }
        System.out.println(answer);

    }
}