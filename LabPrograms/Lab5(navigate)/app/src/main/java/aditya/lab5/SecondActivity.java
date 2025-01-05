package aditya.lab5;


import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    Button btn2;
    Uri webpage;
    Intent it2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        btn2 = (Button) findViewById(R.id.bttn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                webpage = Uri.parse("https://github.com/EchoSingh");
                it2 = new Intent(Intent.ACTION_VIEW,webpage);
                startActivity(it2);
            }
        });
    }
}