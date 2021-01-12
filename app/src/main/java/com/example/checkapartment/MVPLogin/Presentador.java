package com.example.checkapartment.MVPLogin;

public class Presentador {
    private ILogin iLogin;
    private ModeloLogin modeloLogin;
    public Presentador(ILogin iLogin){
        this.iLogin=iLogin;
        this.modeloLogin=new ModeloLogin();


    }

public void validarPassword (String password){
     modeloLogin.validarPassword(password);
    }

public String mensajeLoging() {
    return modeloLogin.getMensaje();
    }

public int contadorLogin() {
    return modeloLogin.getContador();

    }

}
