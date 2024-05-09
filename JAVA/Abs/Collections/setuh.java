package JAVA.Abs.Collections;
import java.util.*;
public class setuh {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        String city[]={"delhi","pune","madras","delhi","pune"};
        for(String s:city){
            set.add(s);
        }
        System.out.println(set);

    }   
}
