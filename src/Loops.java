
import java.util.*;

/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 17/12/2019
 */

public class Loops {

    private String brugere[] = {"Anders", "Birgit", "Carsten", "Dennis", "Esben"};

    public String[] getBrugere() {
        return brugere;
    }




    public static void main(String[] args) {
        Loops l = new Loops();
        l.printBrugereArr();
        System.out.println("*******");
        l.printBrugereReverseArr();
        System.out.println("*******");
        l.waitingFor0();
    }

    /**
     * Viser en liste med brugere i konsollen
     */
    public void printBrugereArr() {

       // TODO Din kode her

        for (int i = 0; i < brugere.length; i++){
            System.out.println(brugere[i]);
        }
    }

    /**
     * Viser en liste med brugere i konsollen i omvendt rækkefølge
     */
    public void printBrugereReverseArr() {

        // TODO Din kode her

        List<String> brugere2 = Arrays.asList(brugere);
        Collections.reverse(brugere2);
        String[] brugereRev = brugere2.toArray(brugere);
        for (int i = 0; i < brugereRev.length; i++){
            System.out.println(brugere[i]);
        }

    }

    public void waitingFor0() {

        // TODO Din kode her
        Scanner input = new Scanner(System.in);
        System.out.println("I'm waiting for 0! Please give me a number!");
        while (input.nextInt() != 0){
            System.out.println("Waiting for 0! New number please!... ");
            }
        System.out.println("You've entered 0! Thank you for playing! :D");
    }
}
