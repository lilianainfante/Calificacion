package com.example.calificacion;

public class Main {
    public interface Vista {
        public void mostrarCalificacion(String r);
    }

    public interface Presentador {
        public void mostrarCalificacion(String r);

        public void calcular(Integer n1, Integer n2, Integer n3);
    }

    public interface Model {
        public void calcular(Integer n1, Integer n2, Integer n3);
    }
}
