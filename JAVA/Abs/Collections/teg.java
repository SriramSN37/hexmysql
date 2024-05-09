package JAVA.Abs.Collections;

import java.util.ArrayList;

public class teg {

    public static void main(String[] args) {
        ArrayList<Integer>pos=new ArrayList<Integer>();
        ArrayList<Integer>neg=new ArrayList<Integer>();
        ArrayList<Integer>arr=new ArrayList<Integer>();
        arr.add(0);
        arr.add(1);
        arr.add(0);
        arr.add(-1);
        arr.add(-2);

        for(int i=0;i<arr.size();i++){
            if(arr.get(i)>0){
                pos.add(arr.get(i));
            }
            else{
                neg.add(arr.get(i));
            }
    
}
    }
}
    
