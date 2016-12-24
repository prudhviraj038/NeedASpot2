package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 24-12-2016.
 */

public class MainActivityScreen extends Activity {
    ListView listView;
    MainActivityScreenAdapter mainActivityScreenAdapter;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_screen_items);
        listView = (ListView) findViewById(R.id.activity_items);
        mainActivityScreenAdapter = new MainActivityScreenAdapter(this);
        listView.setAdapter(mainActivityScreenAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
}
