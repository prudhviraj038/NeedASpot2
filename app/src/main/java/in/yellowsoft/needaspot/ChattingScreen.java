package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 22-12-2016.
 */

public class ChattingScreen extends Activity {
    ListView listView;
    ChattingScreenAdapter chattingScreenAdapter;
    public void onCreate(Bundle savedInstanceSate){
        super.onCreate(savedInstanceSate);
        setContentView(R.layout.chat_screen_items);
        listView = (ListView) findViewById(R.id.chat_messages);
        chattingScreenAdapter = new ChattingScreenAdapter(this);
        listView.setAdapter(chattingScreenAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
