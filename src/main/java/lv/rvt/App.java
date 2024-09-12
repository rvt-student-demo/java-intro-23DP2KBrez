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
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        inputManager = new InputManager(scanner);

        float first = inputManager.getFloat();
        float second = inputManager.getFloat();
    
        System.out.println(first + second);
    }
}