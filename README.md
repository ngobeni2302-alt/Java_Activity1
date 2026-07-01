# Java_Activity1
Beginner Encapsulation &amp;&amp; Inheritance

# Activity 1: Beginner Encapsulation & Inheritance (Zoo Management System)

Welcome to your first Java OOP hands-on activity! In this challenge, you will build a foundational backend system for a **Zoo Management System**. 

The goal of this activity is to help you practically understand and implement **Encapsulation** and **Inheritance** without looking at completed code.

---

## 🏗️ Core OOP Concepts to Apply

### 1. Encapsulation (Data Hiding & Validation)
* You will restrict direct access to object attributes by marking fields as `private`.
* You will expose these attributes safely using public **Getters** and **Setters**.
* You will implement validation rules inside the setters to prevent corrupted data (e.g., negative ages).

### 2. Inheritance (Reusability & Polymorphism)
* You will create a generic parent class (`Animal`) that contains shared characteristics.
* You will create specific child classes (`Lion`, `Penguin`) that inherit from the parent class using the `extends` keyword.
* You will override parent behaviors (`makeSound()`) to implement unique actions for specific animals.

---

## 📝 Your Task Instructions

You need to create 4 Java classes inside the package `com.zoo`. Follow the specifications below to implement them from scratch.

### Task 1: Create the Parent Class `Animal.java`
* **Package:** `com.zoo`
* **Instance Variables (Private):**
  * `name` (String)
  * `age` (int)
* **Constructor:**
  * Accepts `String name` and `int age`.
  * Assigns the values to the attributes. *Hint: Use your setter for age to ensure validation applies during initialization.*
* **Encapsulation Requirements:**
  * Create public getters for both `name` and `age`.
  * Create a public setter for `age`. Inside this setter, add a validation check: If the provided 
  * age is less than `0`, print an error message and force the age value to set to `0`. Otherwise, 
  * assign the provided value.
* **Methods:**
  * Create a public method `public void makeSound()` that prints: `"[Animal Name] makes a generic animal sound."`

### Task 2: Create the Child Class `Lion.java`
* **Package:** `com.zoo`
* **Inheritance:** Make this class inherit from `Animal`.
* **Constructor:**
  * Accepts `String name` and `int age`.
  * Pass these values directly to the parent class constructor using the `super()` keyword.
* **Polymorphism (Method Overriding):**
  * Override the `makeSound()` method so that it prints: `"[Lion Name] roars proudly! 🦁"`

### Task 3: Create the Child Class `Penguin.java`
* **Package:** `com.zoo`
* **Inheritance:** Make this class inherit from `Animal`.
* **Constructor:**
  * Accepts `String name` and `int age`.
  * Pass these values to the parent constructor using `super()`.
* **Polymorphism (Method Overriding):**
  * Override the `makeSound()` method so that it prints: `"[Penguin Name] squawks and waddles! 🐧"`

### Task 4: Test Everything in `Main.java`
* **Package:** `com.zoo`
* **Main Method:** Inside `public static void main(String[] args)`, perform the following verification steps:
  1. Instantiate a `Lion` object named **Simba** who is `5` years old.
  2. Instantiate a `Penguin` object named **Pingu** with an invalid age of `-2` (to verify your encapsulation rule triggers).
  3. Print out the name and age of both animals using their getter methods.
  4. Call the `makeSound()` method on both objects to observe how inheritance and polymorphism process specific child actions.
