package in.yellowsoft.needaspot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by T on 24-12-2016.
 */

public class MediaScreen extends Activity{
    GridView gridView;
    MediaScreenAdapter mediaScreenAdapter;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_screen_items);
        gridView = (GridView) findViewById(R.id.video_items);
        mediaScreenAdapter = new MediaScreenAdapter(this);
        gridView.setAdapter(mediaScreenAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Intent video = new Intent(MediaScreen.this,MediaVideoScreen.class);
                startActivity(video);
            }
        });

    }
}
