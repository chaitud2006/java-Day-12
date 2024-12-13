import java.util.*;
public class Linked_List
{
    public static void main(String args[])
    {
        LinkedList<Integer>a=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        a.add(567);
        a.add(789);
        a.add(900);
        System.out.println(a);
        a.addFirst(89);
        System.out.println(a);
        a.add(90);
        System.out.println(a);
    }
}