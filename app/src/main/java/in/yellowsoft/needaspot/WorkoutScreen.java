package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Created by T on 22-12-2016.
 */

public class WorkoutScreen extends Fragment {
    LinearLayout done_btn;
    LinearLayout invite_people;
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
       final View view = inflater.inflate(R.layout.workout_activity_screen,container,false);
        done_btn = (LinearLayout) view.findViewById(R.id.done_btn);
        done_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WorkoutsPage workoutsPage = new WorkoutsPage();
                getFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,workoutsPage).commit();
            }
        });
        invite_people = (LinearLayout) view.findViewById(R.id.invite_people);
        invite_people.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               InvitePeople invitePeople = new InvitePeople();
                getFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,invitePeople).commit();
            }
        });
        return view;
    }

}
