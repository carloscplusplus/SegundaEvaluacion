package com.uso.segundaevaluacion;

import android.graphics.Bitmap;

/**
 * Created by Carlos on 04/11/2017.
 */

public class Imagen {
public String ruta;
public Bitmap formato;

    public Imagen(String ruta, Bitmap formato){
        this.ruta = ruta;
        this.formato = formato;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Bitmap getFormato() {
        return formato;
    }

    public void setFormato(Bitmap formato) {
        this.formato = formato;
    }
}
