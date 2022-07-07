package cju.ch07;




public class Ex7_4 {

    public static void main(String[] args) {



    }
}


class Point222{
    int x,y;


    Point222(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class Point3D2 extends Point222{
    int z;

    Point3D2(int x, int y,int z){
        super(x,y);
        this.z=z;
    }
}