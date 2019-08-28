package com.example.calificacion;

public class CalificacionModel implements Main.Model {
    private Main.Presentador presentador;
    private Integer calificacionfinal;
    private String indicador;

    public CalificacionModel(Main.Presentador presentador){
        this.presentador= presentador;
    }
    @Override
    public void calcular(Integer c1,Integer c2,Integer c3) {
        //calificacionfinal = String.valueOf((c1+c2+c3)/3);
        calificacionfinal = (c1+c2+c3)/3;

        if (calificacionfinal<12.4){
            indicador = "no logrado";
        }else if (12.5<=calificacionfinal && calificacionfinal <= 14){
            indicador = "logrado bajo";
        }else if (15<=calificacionfinal && calificacionfinal <= 17){
            indicador = "logro medio";
        }else if (18<=calificacionfinal && calificacionfinal <= 20){
            indicador = "logro destacado";
        }

        presentador.mostrarCalificacion(String.valueOf(calificacionfinal)+" "+indicador);

    }
}

