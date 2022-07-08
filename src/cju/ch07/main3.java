package cju.ch07;



class SutdaDeck{
    final int CARD_NUM=20;
    SutdaCard[] cards=new SutdaCard[CARD_NUM];


    SutdaDeck(){
        for(int i=0; i<cards.length; i++){
            if(i==1 || i==3 || i==8){
                cards[i]=new SutdaCard(i+1,true);
            }else{
                cards[i]=new SutdaCard(i%10+1,false);
            }
        }
    }


    public void shuffle(){


        int temp=0;
        SutdaCard tmp;


        for(int i=0; i<cards.length; i++){
            int min=(int)(Math.random()*cards.length);
            tmp=cards[i];
            cards[i]=cards[min];
            cards[min]=tmp;


        }

    }

    public SutdaCard pick(int index){
    if(index<0 || index>=CARD_NUM)
        return null;
    return cards[index];

    }

    SutdaCard pick(){
        int idx=(int)(Math.random()*cards.length);
        return cards[idx];
    }



}


class SutdaCard{

    int num;
    boolean isKwang;


    SutdaCard(){
        this(1,true);
    }


    SutdaCard(int num,boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;

    }


    public String toString(){
        return num+(isKwang?"K":"");
    }

}







public class main3 {


    public static void main(String[] args) {


        SutdaDeck deck=new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();




        for(int i=0; i<deck.cards.length; i++){
            System.out.print (deck.cards[i]+",");
        }

        System.out.println();
        System.out.println(deck.pick(0));


    }
}
