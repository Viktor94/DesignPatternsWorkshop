package com.company;

class PersonFactory {

    private static int id;

    public Person createPerson(String name) {
        return new Person(id++, name);
    }
}
