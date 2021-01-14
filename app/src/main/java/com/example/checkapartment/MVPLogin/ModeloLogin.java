package com.example.checkapartment.MVPLogin;

import android.widget.Button;

public class ModeloLogin {
    private String password = "123Pass";
    private String mensaje;
    private int contador=0;

public void validarPassword(String clave){
        if (!clave.equals(password)) {
            mensaje = "password incorrect";
            contador++;
        }
        else {
            mensaje="validada";
            contador=0;
        }

    }
    public String getMensaje() {
        return mensaje;
    }
    public int getContador() {
        return contador;
    }
}

