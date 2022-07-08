package cju.ch07;

import java.util.Scanner;


abstract class Unit2{
    int x,y;
    abstract void move(int x,int y);
    void stop(){
        System.out.println("멈춥니다.");
    }


    interface Fightable{
        void move(int x,int y);
        void attack(Fightable f);
    }

    class Fighter extends Unit2 implements Fightable{
       public void move(int x,int y){   //조상보다 접근제어자가 좁으면 안된다.
            System.out.println("["+x+","+y+"로 이동");
        }
        public void attack(Fightable f){
            System.out.println(f+"를 공격");
        }
    }
}


public class 추상 {


    public static void main(String[] args) {













    }
}
