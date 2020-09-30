import animals.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Skapar djuren
        Dog sixten = new Dog("Sixten", 5000);
        Dog dogge = new Dog("Dogge", 10000);
        Cat venus = new Cat("Venus", 5000);
        Cat ove = new Cat("Ove", 3000);
        Snake hypno = new Snake("Hypno", 1000);

        //Skapar en lista med djuren
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(sixten);
        pets.add(dogge);
        pets.add(venus);
        pets.add(ove);
        pets.add(hypno);

        // Skapar en icon med hjälp av klassen ImageIcon
        ImageIcon icon = new ImageIcon(
                "icons/animals2.png");

        String input;
        boolean feedAnimals = true;
        // Loopar så länge man väljer att mata djuren
        while (feedAnimals) {
            input = (String) JOptionPane.showInputDialog(null, whichPetToFeed(pets),
                    "HealthyPets", JOptionPane.QUESTION_MESSAGE, icon, null, "");
            if (input == null) {
                JOptionPane.showMessageDialog(null, "Du valde att avbryta.");
                System.exit(0);
            } else {
                switch (input.toLowerCase()) {
                    case "sixten" -> printThroughInterface(sixten);
                    case "dogge" -> printThroughInterface(dogge);
                    case "venus" -> printThroughInterface(venus);
                    case "ove" -> printThroughInterface(ove);
                    case "hypno" -> printThroughInterface(hypno);
                    case "stopp" -> feedAnimals = false;
                    default -> {
                        JOptionPane.showMessageDialog(null, "Felaktig input," +
                                " vänligen prova igen!");
                    }
                }
            }
        }
    }

    // Skapar en metod som via interfacet skriver ut ett utskriftsmeddelande
    // Polymorfism -> samma metod anropas, men olika kod existerar,
    // beroende på objektets typ
    public static void printThroughInterface(IPrint print) {
        print.printOut();
    }

    public static String whichPetToFeed(ArrayList<Pet> pets) {
        StringBuilder builder = new StringBuilder();
        builder.append("Vilket djur ska få mat?\n");
        builder.append("Djur som bor på hotellet:\n\n");
        for(Pet pet : pets) {
            builder.append(pet.getName()).append("\n");
        }
        builder.append("\nSkriv 'stopp' för att sluta.");
        return builder.toString();
    }
}
