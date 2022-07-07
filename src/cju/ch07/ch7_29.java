package cju.ch07;

import java.util.Scanner;


class Product2{
    int price;
    int bonusPoint;

    Product2(int price){
        this.price=price;
        bonusPoint=(int)(price/10.0);
    }

    Product2(){

    }
}

class Tv3 extends Product2{
    Tv3(){
        super(100);
    }

    public String toString(){
        return "TV:";
    }



}


class Computer2 extends Product2{
    Computer2(){
        super(3000);
    }
    public String toString(){
        return "Computer:";
    }
}

class Audio2 extends Product2{
    Audio2(){
        super(50);
    }

    public String toString(){
        return "Audio";
    }
}

class Buyer2{
    int money=10000;
    int bonusPoint=0;

    Product2[] cart=new Product2[10];
    int i=0;
    
    
    
    void buy(Product2 d){
        if(money<d.price){
            System.out.println("잔액이 부족합니다");
            return;
        }


        money-=d.price;
        bonusPoint+=d.bonusPoint;
        cart[i++]=d;
        System.out.println(d+"를 구입하셧습니다.");
    }

    void summary(){
        int sum=0;
        String itemList="";

        for(int i=0; i<cart.length; i++){
            if(cart[i]==null) break;
            sum+=cart[i].price;
            itemList+=cart[i]+",";
        }

        System.out.println("구입하신 물품의 총금액은"+sum+"입니다");
        System.out.println("구입하신 제품은"+itemList+"입니다.");
    }
}





public class ch7_29 {
    public static void main(String[] args) {


        Buyer2 d=new Buyer2();
        d.buy(new Tv3());
        d.buy(new Computer2());
        d.buy(new Audio2());
        d.summary();


    }
}
