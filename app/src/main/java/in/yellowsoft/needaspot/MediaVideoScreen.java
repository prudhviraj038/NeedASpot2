package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 24-12-2016.
 */

public class MediaVideoScreen extends Activity {
    ListView listView;
    MediaVideoScreenAdapter mediaVideoScreenAdapter;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_video_screen_items);
        listView = (ListView) findViewById(R.id.video_list);
        mediaVideoScreenAdapter = new MediaVideoScreenAdapter(this);
        listView.setAdapter(mediaVideoScreenAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


    }
}
