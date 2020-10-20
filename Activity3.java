package id.ac.id.telkomuniversity.tass.praktik5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {
EditText text1, text2;
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        text1 = findViewById(R.id.pslama);
        text2 = findViewById(R.id.psbaru);
        button = findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity3.this, "Password telah berhasil diubah", Toast.LENGTH_LONG).show();
            }
        });
    }
}