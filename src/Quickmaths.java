/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */
import java.util.Scanner;


public class Quickmaths {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("User please enter number A");
        int a=input.nextInt();
        System.out.println("User please enter number B");
        int b=input.nextInt();
        System.out.println("This is the average of number A and B: " + gennemsnit(a,b) + " This is the sum of number A and B: "+ sum(a,b));
        System.out.println("This part of the program keeps running as long as you enter numbers :)");
        start();

    }
    /**gennemsnit(int a, int b) bruges til at udregne gennemsnittet af de to tal**/
    public static int gennemsnit(int a, int b){
                int c = a+b;
                c=c/2;
        return c;
    }
    public static int sum(int a, int b){
        int c = a+b;
        return c;
    }
    public static void start(){
        Scanner input = new Scanner(System.in);
        while (true){
            int a,b,c;
            System.out.println("User please input number A");
            a = input.nextInt();
            System.out.println("User please input number B");
            b = input.nextInt();
            c=a+b/2;
            System.out.println("This is the average of A and B: "+c);
            c=a+b;
            System.out.println("This is the sum of A and B: "+c);
        }
    }


}
