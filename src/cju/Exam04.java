package cju;

import java.util.Locale;
import java.util.Scanner;

public class Exam04 {


    public int get(String a,char b){


        int max=0;
        a=a.toUpperCase();
        b=Character.toUpperCase(b);

        for(int i=0; i<a.length(); i++){
            if(a.charAt(i)==b)
                max++;
        }

        return max;
    }
    public static void main(String[] args) {
        Exam04 T=new Exam04();
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
        char c=sc.next().charAt(0);


        System.out.println(T.get(s,c));


    }
    }
