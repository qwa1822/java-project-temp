package cju;

import java.util.Locale;
import java.util.Scanner;

public class Exam05 {
    public static int get(String a,char b){


        int count=0;
        a=a.toUpperCase();
        b=Character.toUpperCase(b);


        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==b)
                count++;
        }

        return count;
    }



    public static void main(String[] args) {

7

   }
}
