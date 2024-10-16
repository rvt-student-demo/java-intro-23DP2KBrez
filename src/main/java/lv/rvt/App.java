package lv.rvt;
import java.util.*;

public class App 
{
    static Scanner scanner;
    public static void main( String[] args )
    {
        scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true)
        {
            int ievade = Integer.parseInt(scanner.nextLine());
            if(ievade == 0)
            {
                System.out.println(list.get(1)+ list.get(2));
                break;
            }
            list.add(ievade);
        }
    }
}