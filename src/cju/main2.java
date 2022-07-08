package cju;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

class Student{
    String name;
    int ban;
    int  no;
    int kor;
    int eng;
    int math;

    int sum=0;
    float average=0.0f;

    Student(String name,int ban,int no, int kor,int eng,int math){
        this.name=name;
        this.ban=ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
    }
    public String info(){
        sum+=kor+eng+math;
        average=Math.round(sum/3f*100)/100f;


        return name+","+ban+","+no+","+kor+","+eng+","+math+","+sum+","+average;
    }


    public int getTotal(){
        return eng+math+kor;
    }

    public float getAverage(){
        return Math.round((getTotal()/1.0f*10)/1.0f);
    }
}
public class main2 {

    public static void main(String[] args) {


        Student s=new Student("홍길동",1,1,100,60,76);

        String str=s.info();
        System.out.println(str);


        System.out.println(s.getAverage());
        System.out.println(s.getTotal());

    }
}