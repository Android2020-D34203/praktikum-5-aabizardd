package id.ac.id.telkomuniversity.tass.pratikum7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnLogin, btnFg;
    private EditText etUsername, etPassword;
    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setData();

    }

    public void initView(){
        btnLogin = findViewById(R.id.btLogin);
        btnFg = findViewById(R.id.btForgetPassword);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);

    }

    public void setData(){

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                username = etUsername.getText().toString();
                password = etPassword.getText().toString();


                //action
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("username",username);
                intent.putExtra("password",password);
                startActivity(intent);
            }
        });

        btnFg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //action
                Intent intent = new Intent(MainActivity.this, MainActivity3.class);

                startActivity(intent);
            }
        });




    }
}