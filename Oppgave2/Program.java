package Oppgave2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {

    public static void main() {
        System.out.println("Velkommen! Skriv in navn separert med <Enter>. Skriv \"avslutt\" for å avslutte.");
        Scanner myScanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<String>();
        while (true) {
            String name = myScanner.nextLine();
            if (name.equalsIgnoreCase("avslutt")) {
                break;
            }
            if (!isInputValid(name)){
                System.out.println("Navn må være på minst to bokstaver og ikke inneholde tall. Prøv igjen!");
            }
            else {
                nameList.add(name);
            }

        }
        myScanner.close();

        Collections.sort(nameList);

        System.out.println("Her er resultatet:");

        int totalChars = 0;
        String longestName = "";

        for(String name: nameList){
            System.out.println(name);
            totalChars += name.length();
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        
        int averageLength = totalChars/nameList.size(); 
        System.out.println("Gjennomsnittlig lengde på navnene: " + averageLength);
        System.out.println("Lengste navn: " + longestName);


    }

    private static boolean isInputValid(String input) {
        if (input.length() > 1) {
            for (int i = 0; i < input.length(); i++){
                char c = input.charAt(i);
                if (!Character.isLetter(c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    
}