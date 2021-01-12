package com.example.checkapartment;

import android.os.Bundle;

import com.example.checkapartment.MVPLogin.ILogin;
import com.example.checkapartment.MVPLogin.Presentador;
import com.example.checkapartment.databinding.ActivityLoginBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements ILogin {
    private ActivityLoginBinding binding;
    private ILogin iLogin;
    private Presentador presentador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presentador = new Presentador(iLogin);


        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String password = binding.editTextTextPassword.getText().toString();
                validarPassword(password);
                Toast.makeText(LoginActivity.this, mensajeLoging(), Toast.LENGTH_SHORT).show();
                if (contadorLogin() == 3) {
                    binding.button.setEnabled(false);
                }
            }
        });
    }

    @Override
    public void validarPassword(String password) {
        presentador.validarPassword(password);

    }

    @Override
    public String mensajeLoging() {

        return presentador.mensajeLoging();
    }

    @Override
    public int contadorLogin() {
        return presentador.contadorLogin();
    }
}