package com.company;

public class CodeBuilder {

    private Class aClass;

    public CodeBuilder(String className) {
        aClass = new Class();
        aClass.setName(className);
    }

    public CodeBuilder addField(String name, String type) {
        aClass.addField(new Field(name, type));
        return this;
    }

    @Override
    public String toString() {
        return aClass.toString();
    }
}