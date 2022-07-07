package cju;

import java.util.Scanner;

public class Exam02 {


    public static String get(String input){

        String answer="";


        char[]s=input.toCharArray();

        int lt=0, rt=input.length()-1;

        while(lt<rt){
            //알파벳일떄 참인데
            //!부정을 붙여서 알파벳이 아닐떄
            if(!Character.isAlphabetic(s[lt]))
                lt++;
            if(!Character.isAlphabetic(s[rt]))
                rt--;
            else{
                char tmp=s[lt];
                s[lt]=s[rt];
                s[rt]=tmp;
                lt++;
                rt--;

            }


        }

        answer=String.valueOf(s);



        return answer;
    }
    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        String b=sc.next();

        Exam02 T=new Exam02();


        System.out.println(T.get(b));



    }
}
