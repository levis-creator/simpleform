package com.macrosoft.simpleform;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }
    public void  onSubmit(View view){
//        fetches items from the interface.
        EditText firstname=findViewById(R.id.firstname);
        EditText lastname=findViewById(R.id.lastname);
        EditText email=findViewById(R.id.emailAddress);
//        textview
        TextView firstnameTxt=findViewById(R.id.txtFirstName);
        TextView lastnameTxt=findViewById(R.id.txtLastName);
        TextView emailTxt=findViewById(R.id.txtEmail);

//        fetching inputted data from the input and setting text data
        firstnameTxt.setText("Firstname "  + firstname.getText().toString());
        lastnameTxt.setText("Lastname " + lastname.getText().toString());
        emailTxt.setText("Email " + email.getText().toString());

    }
}