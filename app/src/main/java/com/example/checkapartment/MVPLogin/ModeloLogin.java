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

   // Si es exitosa, debe llevar a una segunda actividad. Si no, debe
   //     indicar que el password no es el indicado, debe tener un contador
   //     de errores, si alcanza los tres intentos, debe bloquear el Button de
   //     ingreso. Teniendo que reiniciar la app para intentarlo otra vez.