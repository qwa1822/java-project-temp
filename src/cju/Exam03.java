package cju;

import java.util.Scanner;

public class Exam03 {

    public String get(String str) {


        String answer = "";
        for (int i = 0; i < str.length(); i++){

//              //참일떄만answer 에 누적시킴.
            if (str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);

          }

        return answer;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String b=sc.next();

        Exam03 T=new Exam03();

        System.out.println(T.get(b));
    }
}
