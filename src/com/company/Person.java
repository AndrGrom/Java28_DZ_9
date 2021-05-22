package com.company;

import java.io.Serializable;

public class Person implements Serializable {

    private String name;
    private String surname;
    private Address address;

    public Person(String name, String surname, Address address) throws NullFieldException{

        if (name == null) throw new NullFieldException("Прорверьте Имя = Null");
        if (name == null) throw new NullFieldException("Прорверьте Фамилию = Null");
        if (name == null) throw new NullFieldException("Прорверьте Адрес = Null");

        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }
    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", city=" + address.getCity() + '\'' +
                ", street=" + address.getStreet() + '\'' +
                ", number=" + address.getNumber() +
                '}';
    }
}
