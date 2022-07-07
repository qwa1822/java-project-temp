package cju.ch07;

import java.util.Scanner;


class Time{
   private int hour;
   private int minute;
   private int second;



    public int getHour()
    {
        return hour;
    }


   public void setHour(int hour){

        if(isValidHour(hour)) return;
       this.hour=hour;

   }
   
   
    //매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는메서드
   private boolean isValidHour(int hour){
        return hour<0 || hour>23;
   }



}

public class 캡슐화 {
    public static void main(String[] args) {

    Time t=new Time();
    t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(100);


    }
}

