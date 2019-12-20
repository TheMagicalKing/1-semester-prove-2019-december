/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {
    //Dette er en kommentar i min kode, eller også kan man sige det er en del af opgave 10, Man kan bruge kommentare til at forklare hvad der sker
    // TODO Din kode her
    public String hello(String navn) {
        //F.eks. kan jeg fortælle at her tjekker vi om navn er en tom string
        if (navn.equalsIgnoreCase(""))
            return "Hello World!";
        else {//Og her siger vi at hvis navn ikke er tom skal vi gøre følgende :)
            return "Hello " + navn + "!";
        }
    }
    // Tested the method in MainTest file



}
