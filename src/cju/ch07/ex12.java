package cju.ch07;


import java.awt.*;
import java.awt.event.ActionListener;

public class ex12
{
    class InstanceInner{
            int iv=100;

            final static int CONST=100;




    }

    static class StaticInner{
        int iv=200;
        static int cv=200;
    }

    void myMethod(){
        class LocalInner{

            int iv=300;

            final static int CONST=300;
        }
    }





    public static void main(String[] args) {


        //익명클래스
        /*
        이름이 없는 일회용 클래스 정의와 생성을 동시에

         */




    }
}
