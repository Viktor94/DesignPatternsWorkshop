package com.company;

import java.util.ArrayList;
import java.util.List;

public class Class {

    private String name;

    private List<Field> fields;

    public Class() {
        this.fields = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void addField(Field field) {
        fields.add(field);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String nl = System.lineSeparator();
        sb.append("public class ").append(name).append(nl)
                .append("{").append(nl);
        for (Field f : fields)
            sb.append("  ").append(f).append(nl);
        sb.append("}").append(nl);
        return sb.toString();
    }
}
