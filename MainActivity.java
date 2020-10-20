package id.ac.id.telkomuniversity.tass.praktik5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text1, text2;
    Button button, button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = findViewById(R.id.username);
        text2 = findViewById(R.id.password);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
    }

    public void login(View view) {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        Bundle b = new Bundle();

        b.putString("username",text1.getText().toString());
        b.putString("password",text2.getText().toString());

        intent.putExtras(b);
        startActivity(intent);
    }

    public void forgetpassword(View view) {
        Intent intent = new Intent(MainActivity.this, Activity3.class);
        Bundle b = new Bundle();

        b.putString("username", text1.getText().toString());
        b.putString("password", text2.getText().toString());

        intent.putExtras(b);
        startActivity(intent);
    }
}