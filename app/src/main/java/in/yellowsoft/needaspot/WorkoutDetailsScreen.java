package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by T on 22-12-2016.
 */

public class WorkoutDetailsScreen extends Fragment {
    GridView gridView;
   WorkoutDetailsAdapter workoutDetailsAdapter;
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.workout_details_screen_items,container,false);
        gridView = (GridView) view.findViewById(R.id.members_list);
        workoutDetailsAdapter = new WorkoutDetailsAdapter(getActivity());
        gridView.setAdapter(workoutDetailsAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;
    }
}
