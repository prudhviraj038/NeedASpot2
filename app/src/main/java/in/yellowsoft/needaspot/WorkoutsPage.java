package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 24-12-2016.
 */

public class WorkoutsPage extends Activity {
    ListView listView;
    WorkoutsPageAdapter workoutsPageAdapter;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workouts_page_items);
        listView = (ListView) findViewById(R.id.workouts);
        workoutsPageAdapter = new WorkoutsPageAdapter(this);
        listView.setAdapter(workoutsPageAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
}
