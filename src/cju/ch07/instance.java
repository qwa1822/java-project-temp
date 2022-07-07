package cju.ch07;


class Product{
    int money;
    int bonuspoint;

    Product(int money){
        this.money=money;
        bonuspoint=(int)(money/10.0);
    }
}

class Tv1 extends Product{
    Tv1(){
        super(1000);
    }

    public String toString(){
        return "TV";
    }


}

class Computer extends Product{
    Computer(){
        super(2000);
    }
    public String toString(){
        return "Computer";
    }
}

class Buy{
    int money=10000;
    int bonuspoint=0;

    void Buyer(Product d){
        if(d.money>money){
            System.out.println("남은 잔액이 없습니다");
            return;
        }
        money-=d.money;
        bonuspoint+=d.bonuspoint;
    }
}


public class instance {
    public static void main(String[] args) {


        Buy d=new Buy();
        d.Buyer(new Tv1());
        d.Buyer(new Computer());

        System.out.println("남은 잔액은"+d.money+"입니다");
        System.out.println("현재 보너스 "+d.bonuspoint+"입니다.");


    }
}
