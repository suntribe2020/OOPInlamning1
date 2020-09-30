package animals;

import javax.swing.*;

/**
 * Created by Katri Vidén
 * Date: 2020-09-26
 * Time: 09:34
 * Project: OOPInlämning1
 * Copyright: MIT
 */

public class Pet implements IPrint {

    protected enum Fodder {
        // Skapar enum för fodertyperna eftersom dessa är konstanta,
        // och associerar värden till dessa
        CATFOOD("kattfoder"),
        DOGFOOD("hundfoder"),
        SNAKEFOOD("ormpellets");

        public final String fodderType;

        public String toString() {
            return fodderType;
        }

        // Skapar en konstruktor för enums/uppräkningskonstanterna
        Fodder(String fodderType) {
            this.fodderType = fodderType;
        }
    }

    // Inkapsling av variabler, genom att använda private (i största möjliga mån)
    private final String name;
    private final int weight;
    private final Fodder type;
    private final ImageIcon icon;

    public Pet(String name, int weight, Fodder type, ImageIcon icon) {
        this.name = name;
        this.weight = weight;
        this.type = type;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    // Metod som räknar ut hur mycket mat varje djur ska ha
    private int amountOfFood() {
        return switch (type) {
            case CATFOOD -> weight / 150;
            case DOGFOOD -> weight / 100;
            case SNAKEFOOD -> 20;
        };
    }

    // Implementerar utskriftsmetoden printOut() som skapades i interfacet
    public void printOut() {
        JOptionPane.showMessageDialog(null,getName() + " ska ha " + amountOfFood() +
                " gram " + type + ".", "Djurfoder", JOptionPane.INFORMATION_MESSAGE, icon);
    }
}
