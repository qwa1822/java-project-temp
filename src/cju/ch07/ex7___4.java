package cju.ch07;



class MyTv{
    private boolean isPoweron;
    private int channel;
    private int volume;



    final int MAX_VOLUME=100;
    final int MIN_Volume=0;
    final int MAX_CHANNEL=100;
    final int MIN_CHANNEL=1;


    public boolean getisPowerOn(){
        return isPoweron;
    }

    public void setisPowerOn(boolean isPoweron){
         this.isPoweron=isPoweron;

    }


    public int getChannel(){
        return channel;
    }

    public void setChannel(int channel){
        this.channel=channel;

    }


    public int getVolume( ){
        return volume;
    }


    public void SetVolume(int volume){
        this.volume=volume;
    }







}



public class ex7___4 {

    public static void main(String[] args) {


        MyTv t=new MyTv();
        t.setChannel(10);

        System.out.println("CH:"+t.getChannel());
        t.SetVolume(20);
        System.out.println("VOL:"+t.getVolume());

    }
}
