package com.example.calificacion;

public class CalificacionPresentador implements Main.Presentador {
    private Main.Model model;
    private Main.Vista vista;
    public CalificacionPresentador(Main.Vista vista){
        this.vista = vista;
        model = new CalificacionModel(this);
    }
    @Override
    public void mostrarCalificacion(String r) {
        if(vista!=null){
            vista.mostrarCalificacion(r);
        }
    }

    @Override
    public void calcular(Integer c1,Integer c2,Integer c3) {
        if(vista!=null){
            model.calcular(c1,c2,c3);
        }
    }
}

