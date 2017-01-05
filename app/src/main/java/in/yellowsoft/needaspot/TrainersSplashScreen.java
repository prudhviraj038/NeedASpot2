package in.yellowsoft.needaspot;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by T on 27-12-2016.
 */

public class TrainersSplashScreen extends Fragment {
    TextView started_btn;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.trainers_splash_screen,container,false);
        started_btn = (TextView) view.findViewById(R.id.started_btn);
        started_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TrainersFragment trainersFragment = new TrainersFragment();
                getFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,trainersFragment).commit();
            }
        });
        return view;
    }
}
