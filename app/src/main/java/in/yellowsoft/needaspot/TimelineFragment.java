package in.yellowsoft.needaspot;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 27-12-2016.
 */

public class TimelineFragment extends Fragment {
    ListView listView;
    TimelineAdapter timelineAdapter;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.timeline_activity_items, container, false);
        listView = (ListView) view.findViewById(R.id.list_items);
        timelineAdapter = new TimelineAdapter(getActivity());
        listView.setAdapter(timelineAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;
    }
}
