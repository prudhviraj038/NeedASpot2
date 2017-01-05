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
 * Created by T on 22-12-2016.
 */

public class TrainersFragment extends Fragment {
    ListView listView;
    TrainersAdapter trainersAdapter;
   public View onCreateView(final LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
       final View view = inflater.inflate(R.layout.trainers_screen,container,false);
        listView = (ListView) view.findViewById(R.id.trainer_items);
        trainersAdapter = new TrainersAdapter(getActivity());
        listView.setAdapter(trainersAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ActivityScreen activityScreen = new ActivityScreen();
                getFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,activityScreen).commit();
            }
        });

       return view;


    }

}
