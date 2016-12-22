package in.yellowsoft.needaspot;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 22-12-2016.
 */

public class MessageScreen extends Activity {
    ListView listView;
    MessageScreenAdapter messageScreenAdapter;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.messages_screen_items);
        listView = (ListView) findViewById(R.id.message_list);
        messageScreenAdapter = new MessageScreenAdapter(this);
        listView.setAdapter(messageScreenAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}
