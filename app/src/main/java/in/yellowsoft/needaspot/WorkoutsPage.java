package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 24-12-2016.
 */

public class WorkoutsPage extends Fragment {
    ListView listView;
    WorkoutsPageAdapter workoutsPageAdapter;
   public View onCreateView(final LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.workouts_page_items,container,false);
        listView = (ListView) view.findViewById(R.id.workouts);
        workoutsPageAdapter = new WorkoutsPageAdapter(getActivity());
        listView.setAdapter(workoutsPageAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                WorkoutDetailsScreen workoutDetailsScreen = new WorkoutDetailsScreen();
                getFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,workoutDetailsScreen).commit();
            }
        });

       return view;

    }
}
