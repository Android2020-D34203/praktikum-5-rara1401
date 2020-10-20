package id.ac.id.telkomuniversity.tass.praktik5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
TextView textView1, textView2, textView3, textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle b = getIntent().getExtras();

        textView1 = findViewById(R.id.textView5);
        textView2 = findViewById(R.id.textView6);
        textView3 = findViewById(R.id.username);
        textView4 = findViewById(R.id.password);

        textView1.setText(b.getCharSequence("username"));
        textView2.setText(b.getCharSequence("password"));


    }

}