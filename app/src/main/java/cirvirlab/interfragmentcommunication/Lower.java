package cirvirlab.interfragmentcommunication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Lower extends Fragment {
    TextView text;
    String takenData;

    public Lower() {
        // Required empty public constructor
    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_lower, container, false);
        if(savedInstanceState==null)
        {

        }
        else
        {
            takenData=savedInstanceState.getString("text");
            TextView localText = (TextView)view.findViewById(R.id.textView);
            localText.setText(takenData);
        }
        return view;
    }
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        text =(TextView)getActivity().findViewById(R.id.textView);
    }
    public void displayData(String some_data) {
        text.setText(some_data);
    }
}
