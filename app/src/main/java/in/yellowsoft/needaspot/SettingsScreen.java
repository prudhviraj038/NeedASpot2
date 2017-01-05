package in.yellowsoft.needaspot;

import android.app.Activity;
import android.content.RestrictionsManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by T on 22-12-2016.
 */

public class SettingsScreen extends Fragment {
    TextView back_btn;
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.settings_screen,container,false);
        back_btn = (TextView) view.findViewById(R.id.back_btn);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ReminderScreen reminderScreen = new ReminderScreen();
                getFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,reminderScreen).commit();
            }
        });
        return view;
    }
}
