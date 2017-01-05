package in.yellowsoft.needaspot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by T on 24-12-2016.
 */

public class MediaScreen extends Fragment{
    GridView gridView;
    MediaScreenAdapter mediaScreenAdapter;
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.media_screen_items,container,false);
        gridView = (GridView) view.findViewById(R.id.video_items);
        mediaScreenAdapter = new MediaScreenAdapter(getActivity());
        gridView.setAdapter(mediaScreenAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
              MediaVideoScreen mediaVideoScreen = new MediaVideoScreen();
                getFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,mediaVideoScreen).commit();
            }
        });

        return view;

    }
}
