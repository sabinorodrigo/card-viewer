package br.com.lordsabino.card.model;

import java.util.Objects;

public class MagicAndTrap extends Card {

    private Long id;

    private String name;

    private String cardType;

    private String property;

    private String passcode;

    private String cardEffectTypes;

    private String statuses;

    private String cardDescriptions;

    public MagicAndTrap() {}

    private MagicAndTrap(String name, String cardType, String property, String passcode, String cardEffectTypes, String statuses, String cardDescriptions) {
        this.name = name;
        this.cardType = cardType;
        this.property = property;
        this.passcode = passcode;
        this.cardEffectTypes = cardEffectTypes;
        this.statuses = statuses;
        this.cardDescriptions = cardDescriptions;
    }

    public static MagicAndTrap createMagicAndTrapCards(
            String name, String cardType, String property,
            String passcode, String cardEffectTypes, String statuses,
            String cardDescriptions
    ) {
        return new MagicAndTrap(name, cardType, property, passcode, cardEffectTypes, statuses, cardDescriptions);
    }

    @Override
    public String toString() {
        String format = "Name: %s%nCard Type: %s%nProperty: %s%nPasscode: %s%nCard Effect Types: %s%nStatuses: %s%nCard Descriptions: %s%n";
        return String.format(format,
                getName(),
                getCardType(),
                getProperty(),
                getPasscode(),
                getCardEffectTypes(),
                getStatuses(),
                getCardDescriptions());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }

    public String getCardEffectTypes() {
        return cardEffectTypes;
    }

    public void setCardEffectTypes(String cardEffectTypes) {
        this.cardEffectTypes = cardEffectTypes;
    }

    public String getStatuses() {
        return statuses;
    }

    public void setStatuses(String statuses) {
        this.statuses = statuses;
    }

    public String getCardDescriptions() {
        return cardDescriptions;
    }

    public void setCardDescriptions(String cardDescriptions) {
        this.cardDescriptions = cardDescriptions;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MagicAndTrap that = (MagicAndTrap) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
