package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 22-12-2016.
 */

public class InvitePeople extends Activity {
    ListView listView;
    InvitePeopleAdapter invitePeopleAdapter;
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.invite_people_screen_items);
        listView = (ListView) findViewById(R.id.people_list);
        invitePeopleAdapter = new InvitePeopleAdapter(this);
        listView.setAdapter(invitePeopleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });

    }
}
