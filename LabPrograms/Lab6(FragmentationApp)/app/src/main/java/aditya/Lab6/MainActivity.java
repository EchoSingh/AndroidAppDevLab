package aditya.Lab6;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {

    private Button bttn1,bttn2;
    private FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        bttn1 = (Button) findViewById(R.id.frag1bttn);
        bttn2 = (Button) findViewById(R.id.frag2bttn);
        fragmentManager = getSupportFragmentManager();

        bttn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new activity_fragment_one();

                fragmentManager.beginTransaction().replace(R.id.mainFrameLayout,fragment).commit();
            }
        });

        bttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new fragment_activity_two();

                fragmentManager.beginTransaction().replace(R.id.mainFrameLayout,fragment).commit();
            }
        });

        if(savedInstanceState == null){
            fragmentManager.beginTransaction().replace(R.id.mainFrameLayout,new activity_fragment_one()).commit();
        }
    }
}