package com.example.q1;

import androidx.appcompat.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText eta, etb, etc;
    Button button;
    TextView Result;
    double a, b, c,d, x1, x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eta = (EditText)  findViewById(R.id.eta);
        etb = (EditText)  findViewById(R.id.etb);
        etc = (EditText)  findViewById(R.id.etc);
        button  = (Button)  findViewById(R.id.button);
        Result  = (TextView)  findViewById(R.id.Result);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!eta.getText().toString().equals("") && !etb.getText().toString().equals("")
                        && !etc.getText().toString().equals("")) {
                    a = Double.parseDouble(eta.getText().toString());
                    b = Double.parseDouble(etb.getText().toString());
                    c = Double.parseDouble(etc.getText().toString());

                    d = Math.pow(b, 2) - (4 * a * c);

                    if (d == 0.0) {

                        x1 = -b / (2 * a);
                        Result.setText("d =" + d + "\nx = " + x1);
                    } else if (d < 0) {
                        Result.setText("No Real Roots");
                    } else if (d > 0.0) {

                        x1 = (-b + Math.sqrt(d) / (2 * a));
                        x2 = (-b - Math.sqrt(d) / (2 * a));
                        Result.setText("d =" + d + "\nx1 = " + x1 + "\nx2 = " + x2);

                    }

                }
            }

        });
    }
}

