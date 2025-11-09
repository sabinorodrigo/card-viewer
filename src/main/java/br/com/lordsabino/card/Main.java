package br.com.lordsabino.card;

import br.com.lordsabino.card.model.Card;
import br.com.lordsabino.card.model.MagicAndTrap;
import br.com.lordsabino.card.model.Monster;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Card darkMagician = new Monster(
                "Dark Magician",
                "Monster",
                "DARK",
                "Spellcaster/Normal",
                7,
                2500,
                2100,
                "46986414",
                "Unlimited",
                "The ultimate wizard in terms of attack and defense."
        );

        Card sevenToolsOfTheBandit = new MagicAndTrap(
              "Seven Tools of the Bandit",
              "Trap",
              "Counter",
              "03819470",
              "Activation requirement, Cost, Effect",
              "Unlimited",
              "When a Trap Card is activated: Pay 1000 LP; negate the activation, and if you do, destroy it."
        );

        System.out.println(darkMagician);
        System.out.println(sevenToolsOfTheBandit);
    }
}
