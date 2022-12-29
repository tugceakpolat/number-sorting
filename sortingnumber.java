import java.util.Scanner;
public class sortingnumber {

    public static void main(String[] args) {


         int a;
         int b;
         int c;
//Ödev :  Küçükten büyüğe sıralayacağız.

        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter The 1st Number : ");
        a = input.nextInt();

        System.out.print("Please Enter The 2st Number : ");
        b = input.nextInt();

        System.out.print("Please Enter The 3st Number : ");
        c = input.nextInt();


        if((a<b) && (a<c)){
            if(b<c){
                System.out.println("Ordering numbers from smallest to largest : " + "a < b < c");
            }else{
                System.out.println("Ordering numbers from smallest to largest : " + "a < c < b");
            }
        }

        else if((b<a) && (b<c)){
            if(a<c){
                System.out.println("Ordering numbers from smallest to largest : " + "b < a < c");
            }else{
                System.out.println("Ordering numbers from smallest to largest : " + "b < c < a");
            }
        }

        else{
            if (b<a){
                System.out.println("Ordering numbers from smallest to largest : " + "c < b < a");
            }else {
                System.out.println("Ordering numbers from smallest to largest : " + "c < a < b");
            }

        }
    }

}
