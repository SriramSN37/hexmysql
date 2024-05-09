package JAVA.Abs.Collections;
import java.util.*;
public class al {
    

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Red");
        al.add("Green");
        al.add("Yellow");
        al.add("Blue");
        al.add("Pink");

        for(String s: al){
            System.out.println(s);
        }
       
    }
}
