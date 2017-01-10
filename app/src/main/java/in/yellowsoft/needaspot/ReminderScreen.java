package in.yellowsoft.needaspot;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by T on 27-12-2016.
 */

public class ReminderScreen extends Fragment {
    ImageView settings;
    TextView name,gender,city,goals,biography;
    String user_name;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.reminder_screen,container,false);
        settings = (ImageView) view.findViewById(R.id.settings);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SettingsScreen settingsScreen = new SettingsScreen();
                getFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,settingsScreen).commit();
            }
        });

        name = (TextView) view.findViewById(R.id.name);
        gender = (TextView) view.findViewById(R.id.gender);
        city   = (TextView) view.findViewById(R.id.city);
        goals  = (TextView) view.findViewById(R.id.goals);
        biography = (TextView) view.findViewById(R.id.biography);

        Bundle bundle=getArguments();
        gender.setText(String.valueOf(bundle.getString("gender")));
        city.setText(String.valueOf(bundle.getString("city")));
        goals.setText(String.valueOf(bundle.getString("goals")));
        biography.setText(String.valueOf(bundle.getString("biography")));

        return view;
    }
}
