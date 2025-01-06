package aditya.temp;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    RadioButton rb1,rb2,rb3,rb4;
    Button bttn;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        bttn = (Button) findViewById(R.id.btn);

        bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectedans = "No Selection yet";
                if(rb1.isChecked()){
                    selectedans = rb1.getText().toString();
                }
                if(rb2.isChecked()){
                    selectedans = rb2.getText().toString();
                }
                if(rb3.isChecked()){
                    selectedans = rb3.getText().toString();
                }
                if(rb4.isChecked()){
                    selectedans = rb4.getText().toString();
                }
                if(selectedans.equals("javascript object notation")){
                    Toast.makeText(MainActivity.this, "Correct Answer", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}