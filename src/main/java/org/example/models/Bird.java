package org.example.models;

import java.util.Date;
import java.util.Objects;

public class Bird extends Animal {

    //region Attributs

    // Attributs specifiques a l'oiseau
    private String _color;
    private boolean _aviary;

    //endregion

    //region Constructeurs

    // Constructeur vide
    public Bird() {
        super();
    }

    // Constructeur avec parametres
    public Bird(String name, double weight, int height, String sex, int age, int humanAgeEquivalent, Date arrivalDate,
                String color, boolean aviary) {
        super(name, weight, height, sex, age, humanAgeEquivalent, arrivalDate);
        this._color = color;
        this._aviary = aviary;
    }

    //endregion

    //region Getters

    public String get_color() {
        return _color;
    }

    public boolean get_aviary() {
        return _aviary;
    }

    //endregion

    //region Setters

    public void set_color(String color) {
        this._color = color;
    }

    public void set_aviary(boolean aviary) {
        this._aviary = aviary;
    }

    //endregion

    //region Methodes

    @Override
    public void makeSound() {
        System.out.println("Cui cui !");
    }


    @Override
    public double getDeathProbability() {
        return 0.03; // 3%
    }


    @Override
    public String toString() {
        return "Oiseau{" +
                "_name='" + get_name() + '\'' +
                ", _weight=" + get_weight() +
                ", _height=" + get_height() +
                ", _sex='" + get_sex() + '\'' +
                ", _age=" + get_age() +
                ", _humanAgeEquivalent=" + get_humanAgeEquivalent() +
                ", _arrivalDate=" + get_arrivalDate() +
                ", _color='" + _color + '\'' +
                ", _aviary=" + _aviary +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Bird bird)) return false;
        if (!super.equals(obj)) return false;

        return _aviary == bird._aviary
                && Objects.equals(_color, bird._color);
    }

    //endregion
}
