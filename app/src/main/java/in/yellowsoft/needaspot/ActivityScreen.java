package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 22-12-2016.
 */

public class ActivityScreen extends Activity {
    ListView listView;
    ActivityScreenAdapter activityScreenAdapter;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        listView = (ListView) findViewById(R.id.activity_items);
        activityScreenAdapter = new ActivityScreenAdapter(this);
        listView.setAdapter(activityScreenAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
}
