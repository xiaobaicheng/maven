package com.example.springbootweb1.pojo;

public class User {
    private String name;
    private Integer aage;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAage() {
        return aage;
    }

    public void setAage(Integer aage) {
        this.aage = aage;
    }

    public User() {
    }

    public User(String name, Integer aage, Address address) {
        this.name = name;
        this.aage = aage;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", aage=" + aage +
                ", address=" + address +
                '}';
    }
}
