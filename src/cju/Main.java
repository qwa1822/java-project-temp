package cju;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        String all="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        if(1<=i && i<=26 && i+j<=27) {
            System.out.println(all.length() < j ? "Error" : all.substring(i - 1, i - 1 + j));
        }
        else{
            System.out.println("Error");
        }
    }
}
