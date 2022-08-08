package Java.ch06;

public class Human {

    public int height;
    public double weight;
    public String name;
    public int age;


    Human(int height,double weight,String name,int age){
        this.height=height;
        this.weight=weight;
        this.name=name;
        this.age=age;
    }


    public String showInfOo(){
        return height+",이고"+weight+"킬로이며,이름은 "+name+"이고"+age+"이다";
    }

}
