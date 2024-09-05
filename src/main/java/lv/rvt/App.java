package lv.rvt;
import java.util.Scanner;

//First realisation (without OOP)
public class App 
{
    public static void main( String[] args )
    {   
        Scanner scanner = new Scanner(System.in);
        String name;
        String surname;
        String group;
        
        System.out.println("Enter your name:");
        name = scanner.nextLine();
        System.out.println("Enter your surname:");
        surname = scanner.nextLine();
        System.out.println("Enter your group:");
        group = scanner.nextLine();

        System.out.println("You aswers:");
        System.out.println(name+" "+surname+" "+group);

        scanner.close();
    } 
}