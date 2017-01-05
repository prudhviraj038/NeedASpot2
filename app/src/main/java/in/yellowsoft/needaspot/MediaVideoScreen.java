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

public class MediaVideoScreen extends Fragment {
    ListView listView;
    MediaVideoScreenAdapter mediaVideoScreenAdapter;
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.media_video_screen_items,container,false);
        listView = (ListView) view.findViewById(R.id.video_list);
        mediaVideoScreenAdapter = new MediaVideoScreenAdapter(getActivity());
        listView.setAdapter(mediaVideoScreenAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;


    }
}
