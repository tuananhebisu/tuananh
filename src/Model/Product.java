/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author user
 */
public class Product {
    private int id;
    private String title;
    private String description;
    private String unit;//loai
    private double price_per_unit;//gia loai
    private int number_per_cup;
    private double total;

    public Product() {
    }

    public Product(int id, String title, String description, String unit, double price_per_unit, int number_per_cup, double total) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.unit = unit;
        this.price_per_unit = price_per_unit;
        this.number_per_cup = number_per_cup;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getPrice_per_unit() {
        return price_per_unit;
    }

    public void setPrice_per_unit(double price_per_unit) {
        this.price_per_unit = price_per_unit;
    }

    public int getNumber_per_cup() {
        return number_per_cup;
    }

    public void setNumber_per_cup(int number_per_cup) {
        this.number_per_cup = number_per_cup;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
