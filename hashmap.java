import java.util.*;
class hashmap{
    public static void main(String [] args){
        HashMap<String,String> a=new HashMap<>();
        a.put("sno","14");
        a.put("sname","chaithra");
        System.out.println(a);
        // {sno=39, sname=sv}
        //printing hash by key value
        if(a.containsKey("sno")){
            String d=a.get("sno");
            System.out.println(d);
        }
    }
}