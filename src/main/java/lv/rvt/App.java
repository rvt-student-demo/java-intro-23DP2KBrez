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

    static boolean g()
    {
        return true;
    }

    public static void main( String[] args )
    {
        scanner = new Scanner(System.in);
        inputManager = new InputManager(scanner);

        int a = inputManager.getInt();

        for(int i = a; i < 101; i++)
        {
            System.out.println(i);
        }
        scanner.close();
    }
}