package com.zoo;

public class Penguin extends Animal {

    public Penguin(String name, int age){
        super(name, age);
    }

    @Override

    public void makeSound(){
        System.out.println(getName() + " squawks and waddles!");
    }
}
