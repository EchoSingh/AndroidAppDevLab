package aditya.Lab6;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class fragment_activity_two extends Fragment {
    private Button btn2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activity_two,container,false);
        TextView textView = view.findViewById(R.id.f2tv1);
        textView.setText("Fragment Two");

        btn2 = view.findViewById(R.id.bttn2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Fragment Two",Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}