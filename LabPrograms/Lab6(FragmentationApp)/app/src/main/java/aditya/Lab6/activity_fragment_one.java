package aditya.Lab6;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class activity_fragment_one extends Fragment {
    private Button btn1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity_one,container,false);
        TextView textView = view.findViewById(R.id.f1tv1);
        textView.setText("Fragment One");

        btn1 = view.findViewById(R.id.bttn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Fragment One",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}