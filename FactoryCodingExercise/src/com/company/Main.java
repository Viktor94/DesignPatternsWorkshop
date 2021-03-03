package com.company;

public class Main {

    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();

        Person person1 = personFactory.createPerson("Józsi");
        Person person2 = personFactory.createPerson("Pista");

        System.out.println(person1.id);
        System.out.println(person2.id);
    }
}
