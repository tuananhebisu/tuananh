/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import java.util.Calendar;

/**
 *
 * @author user
 */
public class Order {
    private int id;
    private Product product;
    private User user;
    private Calendar calender;
    private double total_order;

    public Order() {
    }

    public Order(int id, Product product, User user, Calendar calender, double total_order) {
        this.id = id;
        this.product = product;
        this.user = user;
        this.calender = calender;
        this.total_order = total_order;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Calendar getCalender() {
        return calender;
    }

    public void setCalender(Calendar calender) {
        this.calender = calender;
    }

    public double getTotal_order() {
        return total_order;
    }

    public void setTotal_order(double total_order) {
        this.total_order = total_order;
    }
   
    public String getName(){
        return user.getName();
    }
    public String getUnit(){
        return product.getUnit();
    }
    public Double getPrice_per_unit(){
        return product.getPrice_per_unit();
    }
    public int getNumber_per_cup(){
        return product.getNumber_per_cup();
    }
    public Double getTotal(){
        return product.getTotal();
    }
    public Object [] toObject(){
        return new Object[]{getId(),getName(),getUnit(),getPrice_per_unit(),getNumber_per_cup(),getTotal(),getTotal_order(),getCalender()};
    }
}
