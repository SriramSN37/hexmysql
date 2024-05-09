package JAVA.Abs.Collections;
import java.util.*;
public class contain {
    
    public static void main(String[] args) {
        
        int a[]= {3,5,6,5,3,7,8,9,9};
		ArrayList<Integer> arr=new ArrayList<Integer>();
		for(Integer i:a)
		{
			if(arr.contains(i))
			{
				System.out.println(i);
			}
			else
			{
				arr.add(i);
			}
    }
}
}
