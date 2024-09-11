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
        return Integer.parseInt(scanner.nextLine());
    }

    public float getFloat()
    {
        return Float.parseFloat(scanner.nextLine());
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
        
        System.out.println("Ievadi savu vardu:");
        String name = inputManager.getString();
        System.out.println("Ievadi savu uzvardu:");
        String surname = inputManager.getString();
        System.out.println("Ievadi savu grupu:");
        String group = inputManager.getString();

        System.out.println("Skolnieks: "+name+" "+surname+"; Grupa: "+group);

        scanner.close();
    }
}