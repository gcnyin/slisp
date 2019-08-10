package com.github.rigophypheriveri.slisp.interpretor;

public class Variable {
    private Integer id;
    private Integer type;
    private Integer value;

    public Variable(Integer id, Integer type, Integer value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public Integer getId() {
        return id;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Variable{" +
                "id=" + id +
                ", type=" + type +
                ", value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Variable variable = (Variable) o;

        if (id != null ? !id.equals(variable.id) : variable.id != null) return false;
        if (type != null ? !type.equals(variable.type) : variable.type != null) return false;
        return value != null ? value.equals(variable.value) : variable.value == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}