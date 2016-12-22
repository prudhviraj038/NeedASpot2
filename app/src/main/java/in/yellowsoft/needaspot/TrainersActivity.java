package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 22-12-2016.
 */

public class TrainersActivity extends Activity {
    ListView listView;
    TrainersAdapter trainersAdapter;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trainers_screen);
        listView = (ListView) findViewById(R.id.trainer_items);
        trainersAdapter = new TrainersAdapter(TrainersActivity.this);
        listView.setAdapter(trainersAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });


    }

}
