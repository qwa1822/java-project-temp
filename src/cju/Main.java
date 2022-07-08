package cju;

import java.awt.*;
import java.util.Scanner;




public class Main {



    public static void main(String[] args) {




    }
}


abstract class Unit{
    int x, y;

    abstract void move(int x,int y);
    void stop(){

    }
}

class Marine extends Unit{
    void move(int x,int y){
        System.out.println("Marine[x="+x+",y="+y+"]");
    }
    void stimPack(){

    }
}


class Tank extends  Unit{
    void move(int x,int y){
        System.out.println("Tank[x="+x+",y="+y+"]");
    }

    void changeMode(){

    }
}

class DropShip extends Unit{
    void move(int x,int y){
        System.out.println("DROPSHIP [x="+x+",y="+y+"]");
    }

    void load(){

    }

    void unload(){

    }
}


