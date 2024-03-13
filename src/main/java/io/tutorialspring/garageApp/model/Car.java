package io.tutorialspring.garageApp.model;

import jakarta.persistence.*;


@Entity
@Table(name = "car")

public class Car {
    public enum Color {
        RED,
        BLUE,
        GREEN,
        YELLOW
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "model")
    private String model;
    @Column(name = "brand")
    private String brand;
    @Column(name = "released_year")
    private int year;
    @Column(name = "color")
    private Color color;
    public Car(){

    }

    public Car(long id, String model, String brand, int year, Color color) {
        super();
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
