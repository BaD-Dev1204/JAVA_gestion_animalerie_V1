package org.example.models;

import java.util.Date;
import java.util.Objects;

public abstract class Animal {

    //region Attributs

    // Attributs communs a tous les animaux
    private String _name;
    private double _weight;
    private int _height;
    private String _sex;
    private int _age;
    private int _humanAgeEquivalent;
    private Date _arrivalDate;

    //endregion

    //region Constructeurs

    // Constructeur vide
    public Animal() {
    }

    // Constructeur avec parametres
    public Animal(String name, double weight, int height, String sex, int age, int humanAgeEquivalent, Date arrivalDate) {
        this._name = name;
        this._weight = weight;
        this._height = height;
        this._sex = sex;
        this._age = age;
        this._humanAgeEquivalent = humanAgeEquivalent;
        this._arrivalDate = arrivalDate;
    }

    //endregion

    //region Getters

    public String get_name() {
        return _name;
    }

    public double get_weight() {
        return _weight;
    }

    public int get_height() {
        return _height;
    }

    public String get_sex() {
        return _sex;
    }

    public int get_age() {
        return _age;
    }

    public int get_humanAgeEquivalent() {
        return _humanAgeEquivalent;
    }

    public Date get_arrivalDate() {
        return _arrivalDate;
    }

    //endregion

    //region Setters

    public void set_name(String name) {
        this._name = name;
    }

    public void set_weight(double weight) {
        this._weight = weight;
    }

    public void set_height(int height) {
        this._height = height;
    }

    public void set_sex(String sex) {
        this._sex = sex;
    }

    public void set_age(int age) {
        this._age = age;
    }

    public void set_humanAgeEquivalent(int humanAgeEquivalent) {
        this._humanAgeEquivalent = humanAgeEquivalent;
    }

    public void set_arrivalDate(Date arrivalDate) {
        this._arrivalDate = arrivalDate;
    }

    //endregion

    //region Methodes


    public abstract void  makeSound();
    public abstract double getDeathProbability();

    @Override
    public String toString() {
        return "Animal{" +
                "_name='" + _name + '\'' +
                ", _weight=" + _weight +
                ", _height=" + _height +
                ", _sex='" + _sex + '\'' +
                ", _age=" + _age +
                ", _humanAgeEquivalent=" + _humanAgeEquivalent +
                ", _arrivalDate=" + _arrivalDate +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Animal animal)) return false;

        return Double.compare(animal._weight, _weight) == 0
                && _height == animal._height
                && _age == animal._age
                && _humanAgeEquivalent == animal._humanAgeEquivalent
                && Objects.equals(_name, animal._name)
                && Objects.equals(_sex, animal._sex)
                && Objects.equals(_arrivalDate, animal._arrivalDate);
    }

    //endregion
}
