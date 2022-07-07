package cju.ch07;

import java.util.Scanner;




abstract class Player{   //추상클래스(미완성 클래스)
    abstract void play(int pos); //추상 메서드(미완성 메서드)
    abstract void stop();
}


//추상 클래스는 상속을 통해 완성해야 객체 생성가능

class AudioPlayer extends Player{
    void play(int pos){
        System.out.println(pos+"위치");
    }
    void stop(){
        System.out.println("재생을 멈춥니다.");
    }
}


public class 추상클래스 {
    public static void main(String[] args) {

    AudioPlayer ap=new AudioPlayer();
    ap.play(100);

    ap.stop();

    //미완성 설계도, 미완성 메서드를 갖고 있는 클래스










    }
}
