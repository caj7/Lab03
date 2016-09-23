package edu.calvin.caj7.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Lab03 extends AppCompatActivity {

    private TextView invalidView;
    private ImageView androidImageView;
    private EditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab03);

        invalidView = (TextView) findViewById(R.id.invalidView);
        invalidView.setVisibility(View.INVISIBLE);
        androidImageView = (ImageView) findViewById(R.id.imageView);
        androidImageView.setVisibility(View.INVISIBLE);
        passwordEditText = (EditText) findViewById(R.id.editText);
        passwordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {


            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event){
                String password = passwordEditText.getText().toString();
                if(password.equals("YES")) {
                    invalidView.setVisibility(View.INVISIBLE);
                    androidImageView.setVisibility(View.VISIBLE);

                } else {
                    invalidView.setVisibility(View.VISIBLE);
                    androidImageView.setVisibility(View.INVISIBLE);
                }
                return false;
                }
            });
    }

}
