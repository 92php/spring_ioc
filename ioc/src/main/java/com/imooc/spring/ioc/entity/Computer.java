package com.imooc.spring.ioc.entity;

public class Computer {
    private String brand;
    private String type;
    private String sn;
    private String price;

    public Computer() {
    }

    public Computer(String brand, String type, String sn, String price) {
        this.brand = brand;
        this.type = type;
        this.sn = sn;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", sn='" + sn + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
