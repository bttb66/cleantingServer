package sopt.client.cleanting.Tutorials;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import sopt.client.cleanting.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThirdTutorialFragment extends Fragment {


    public ThirdTutorialFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_third_tutorial, container, false);
        return layout;
    }

}
