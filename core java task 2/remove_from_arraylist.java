//Write a java program to remove element from an arraylist.
import java.util.ArrayList;
public class remove
{
    public static void main(String args[]) {
        ArrayList<String> ct = new ArrayList<>();
        ct.add("Mumbai");
        ct.add("Chhenai");
        ct.add("Nagpur");
        ct.add("Pune");
        ct.add("Nashik");
        System.out.println("\nOriginal element from ArrayList is : " + ct);
        ct.remove("Chhenai");
        System.out.println("\nAfter removing one element from ArrayList is : " + ct);
        ct.remove("Nagpur");
        System.out.println("\nAfter removing two objects from ArrayList is : " + ct);
    }
}


