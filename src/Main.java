/**
 * Developed by András Ács (acsandras@gmail.com)
 * Zealand / www.zealand.dk
 * Licensed under the MIT License
 * 13/12/2019
 */

public class Main {

    // TODO Din kode her
    public String hello(String navn) {
        if (navn.equalsIgnoreCase(""))
            return "Hello World!";
        else {
            return "Hello " + navn + "!";
        }
    }
    // Tested the method in MainTest file



}
