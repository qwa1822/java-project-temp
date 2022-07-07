import java.util.Scanner;

public class Test34 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int index = scan.nextInt();
        int cnt = scan.nextInt();


        if(index >=1 && index <26 && (index+cnt) < 26) {

            index--;

            for(int i = index; i<index+cnt; i++)

                System.out.print((char)('A'+i));
        }else {
            System.out.println("Error");
        }

    }

}