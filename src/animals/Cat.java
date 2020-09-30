package animals;

import javax.swing.*;

/**
 * Created by Katri Vidén
 * Date: 2020-09-26
 * Time: 09:35
 * Project: OOPInlämning1
 * Copyright: MIT
 */
public class Cat extends Pet {

    public Cat(String name, int weight) {
        // Anrop till superklassens konstruktor
        super(name, weight, Fodder.CATFOOD, new ImageIcon("icons/cat2.png"));
    }
}
