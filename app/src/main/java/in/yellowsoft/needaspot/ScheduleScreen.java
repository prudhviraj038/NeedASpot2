package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 26-12-2016.
 */

public class ScheduleScreen extends Activity {
    ListView listView;
    ScheduleScreenAdapter scheduleScreenAdapter;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_screen_list);
        listView = (ListView) findViewById(R.id.schedule_items);
        scheduleScreenAdapter = new ScheduleScreenAdapter(this);
        listView.setAdapter(scheduleScreenAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
