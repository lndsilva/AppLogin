package br.senac.sp.l13.applogin;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    private AppCompatEditText appCompatEditTextEmail, appCompatEditTextSenha;
    private TextInputLayout textInputLayoutEmail, textInputLayoutSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        appCompatEditTextEmail = (AppCompatEditText) findViewById(R.id.editTextEmail);
        appCompatEditTextSenha = (AppCompatEditText) findViewById(R.id.editTextSenha);

        textInputLayoutEmail = (TextInputLayout) findViewById(R.id.textLayoutEmail);
        textInputLayoutSenha = (TextInputLayout) findViewById(R.id.textLayoutSenha);

        btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarCampos();
            }
        });
    }

    private void validarCampos() {
        if (appCompatEditTextEmail.getText().toString().isEmpty()) {
            textInputLayoutEmail.setErrorEnabled(true);
            textInputLayoutEmail.setError("Preencha com seu email");
        } else {
            textInputLayoutEmail.setErrorEnabled(false);
        }
        if (appCompatEditTextSenha.getText().toString().isEmpty()) {
            textInputLayoutSenha.setErrorEnabled(true);
            textInputLayoutSenha.setError("Preencha com sua senha");
        } else {
            textInputLayoutSenha.setErrorEnabled(false);
        }
    }
}