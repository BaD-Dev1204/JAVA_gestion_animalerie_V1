package org.example.models;

import java.util.Date;
import java.util.Objects;

public class Dog extends Animal {

    //region Attributs

    // Attributs specifiques au chien
    private String _collarColor;
    private boolean _trained;
    private String _breed;

    //endregion

    //region Constructeurs

    // Constructeur vide
    public Dog() {
        super();
    }

    // Constructeur avec parametres
    public Dog(String name, double weight, int height, String sex, int age, int humanAgeEquivalent, Date arrivalDate,
               String collarColor, boolean trained, String breed) {
        super(name, weight, height, sex, age, humanAgeEquivalent, arrivalDate);
        this._collarColor = collarColor;
        this._trained = trained;
        this._breed = breed;
    }

    //endregion

    //region Getters

    public String get_collarColor() {
        return _collarColor;
    }

    public boolean get_trained() {
        return _trained;
    }

    public String get_breed() {
        return _breed;
    }

    //endregion

    //region Setters

    public void set_collarColor(String collarColor) {
        this._collarColor = collarColor;
    }

    public void set_trained(boolean trained) {
        this._trained = trained;
    }

    public void set_breed(String breed) {
        this._breed = breed;
    }

    //endregion

    //region Methodes

    @Override
    public void makeSound() {
        System.out.println("Wouf !");
    }

    @Override
    public double getDeathProbability() {
        return 0.01; // 1%
    }

    @Override
    public String toString() {
        return "Chien{" +
                "_name='" + get_name() + '\'' +
                ", _weight=" + get_weight() +
                ", _height=" + get_height() +
                ", _sex='" + get_sex() + '\'' +
                ", _age=" + get_age() +
                ", _humanAgeEquivalent=" + get_humanAgeEquivalent() +
                ", _arrivalDate=" + get_arrivalDate() +
                ", _collarColor='" + _collarColor + '\'' +
                ", _trained=" + _trained +
                ", _breed='" + _breed + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Dog dog)) return false;
        if (!super.equals(obj)) return false;

        return _trained == dog._trained
                && Objects.equals(_collarColor, dog._collarColor)
                && Objects.equals(_breed, dog._breed);
    }

    //endregion
}
