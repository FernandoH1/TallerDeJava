package com.company.Serie;

public interface Entregable {
    public abstract void entregar();

    public abstract void devolver();

    public abstract boolean isEntregado();

    public abstract boolean compareTo(Object o);
}
