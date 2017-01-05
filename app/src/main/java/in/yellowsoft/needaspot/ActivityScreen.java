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

public class ActivityScreen extends Fragment {
    ListView listView;
    ActivityScreenAdapter activityScreenAdapter;
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.activity_screen,container,false);
        listView = (ListView) view.findViewById(R.id.activity_items);
        activityScreenAdapter = new ActivityScreenAdapter(getActivity());
        listView.setAdapter(activityScreenAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;

    }
}
