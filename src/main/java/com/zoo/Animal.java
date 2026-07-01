package com.zoo;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){ return this.name;}
    public  int getAge(){ return age;}

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Age cannot be less than 0");
            this.age = 0;
        }else{
            this.age = age;
        }
    }
    public void makeSound(){
        System.out.println(name + " makes a generic animal sound.");
    }
}
