package moe.are.add2num;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity
    extends AppCompatActivity
{
    private EditText editText;
    private EditText editText2;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText  = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        textView  = findViewById(R.id.textView);
        button    = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a, b;
                double sum;

                String s1 = editText.getText().toString();
                String s2 = editText2.getText().toString();

                a = Double.parseDouble(s1);
                b = Double.parseDouble(s2);

                sum = a + b;

                String s = Double.toString(sum);

                textView.setText(s);
            }
        });
    }
}
