package it.academy.Jquery.model;

public class Thing {
    private int id;
    private String value;

    public Thing(int id, String value) {
        this.id = id;
        this.value = value;
    }

    public Thing() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
