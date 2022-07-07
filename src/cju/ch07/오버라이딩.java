package cju.ch07;

import java.util.Scanner;


class Point{
    int x;
    int y;

    //Object클래스의 toString()을 오버라이딩
    public String toString(){
        return "x:"+x+", y:"+y;
    }

}


class Point3D extends Point{
    int z;


    Point3D(int x,int y){
        this.x=x;
        this.y=y;
    }
    String getLocation(){
        return "x:"+x+", y:"+y+", z:"+z;
    }


}


public class 오버라이딩 {
    public static void main(String[] args) {

        Point3D p=new Point3D(3,5);
//        p.x=3;
//        p.y=5;
        System.out.println(p);

    }
}
