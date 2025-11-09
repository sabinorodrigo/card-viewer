package br.com.lordsabino.card;

import br.com.lordsabino.card.model.Card;
import br.com.lordsabino.card.model.MagicAndTrap;
import br.com.lordsabino.card.model.Monster;

import java.util.Arrays;
import java.util.List;

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

        Card doubleSpell = MagicAndTrap.createMagicAndTrapCards(
                "Double Spell",
                "Spell",
                "Normal",
                "24096228",
                "Cost, Effect",
                "Unlimited",
                "Discard 1 Spell Card, then target 1 Spell Card in your opponent's Graveyard; place that target in the appropriate Zone on your side of the field, and as this card's effect resolution, follow its card text as if you had used it yourself."
        );

        Card potOfGreed = MagicAndTrap.createMagicAndTrapCards(
                "Pot of Greed",
                "Spell",
                "Normal",
                "55144522",
                "Effect",
                "Limited",
                "Draw 2 cards"
        );

        Card magicJammer = MagicAndTrap.createMagicAndTrapCards(
                "Magic Jammer",
                "Trap",
                "Counter",
                "77414722",
                "Activation requirement, Cost, Effect",
                "Unlimited",
                "When a Spell Card is activated: Discard 1 card; negate the activation, and if you do, destroy it"
        );

        List<Card> cards = Arrays.asList(darkMagician, sevenToolsOfTheBandit, doubleSpell, potOfGreed, magicJammer);

        cards.forEach(System.out::println);
    }
}
