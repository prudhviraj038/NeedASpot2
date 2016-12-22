package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

/**
 * Created by T on 22-12-2016.
 */

public class WorkoutDetailsScreen extends Activity {
    GridView gridView;
   WorkoutDetailsAdapter workoutDetailsAdapter;
    public  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_details_screen_items);
        gridView = (GridView) findViewById(R.id.members_list);
        workoutDetailsAdapter = new WorkoutDetailsAdapter(this);
        gridView.setAdapter(workoutDetailsAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
