package org.example.models;

import java.util.Date;
import java.util.Objects;

public class Cat extends Animal {

    //region Attributs

    // Attributs specifiques au chat
    private String _character;
    private boolean _clawsCut;
    private boolean _longHair;

    //endregion

    //region Constructeurs

    // Constructeur vide
    public Cat() {
        super();
    }

    // Constructeur avec parametres
    public Cat(String name, double weight, int height, String sex, int age, int humanAgeEquivalent, Date arrivalDate,
               String character, boolean clawsCut, boolean longHair) {
        super(name, weight, height, sex, age, humanAgeEquivalent, arrivalDate);
        this._character = character;
        this._clawsCut = clawsCut;
        this._longHair = longHair;
    }

    //endregion

    //region Getters

    public String get_character() {
        return _character;
    }

    public boolean get_clawsCut() {
        return _clawsCut;
    }

    public boolean get_longHair() {
        return _longHair;
    }

    //endregion

    //region Setters

    public void set_character(String character) {
        this._character = character;
    }

    public void set_clawsCut(boolean clawsCut) {
        this._clawsCut = clawsCut;
    }

    public void set_longHair(boolean longHair) {
        this._longHair = longHair;
    }

    //endregion

    //region Methodes

    @Override
    public void makeSound() {
        System.out.println("Miaou !");
    }

    @Override
    public double getDeathProbability() {
        return 0.005; // chat
    }


    @Override
    public String toString() {
        return "Chat{" +
                "_name='" + get_name() + '\'' +
                ", _weight=" + get_weight() +
                ", _height=" + get_height() +
                ", _sex='" + get_sex() + '\'' +
                ", _age=" + get_age() +
                ", _humanAgeEquivalent=" + get_humanAgeEquivalent() +
                ", _arrivalDate=" + get_arrivalDate() +
                ", _character='" + _character + '\'' +
                ", _clawsCut=" + _clawsCut +
                ", _longHair=" + _longHair +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cat cat)) return false;
        if (!super.equals(obj)) return false;

        return _clawsCut == cat._clawsCut
                && _longHair == cat._longHair
                && Objects.equals(_character, cat._character);
    }

    //endregion
}
