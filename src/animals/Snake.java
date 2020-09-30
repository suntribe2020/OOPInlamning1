package animals;

import javax.swing.*;

/**
 * Created by Katri Vidén
 * Date: 2020-09-26
 * Time: 09:35
 * Project: OOPInlämning1
 * Copyright: MIT
 */
public class Snake extends Pet {

    public Snake(String name, int weight) {
        super(name, weight, Fodder.SNAKEFOOD, new ImageIcon("icons/snake.png"));
    }
}
