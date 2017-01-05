package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

/**
 * Created by T on 22-12-2016.
 */

public class InvitePeople extends Fragment {
    ListView listView;
    InvitePeopleAdapter invitePeopleAdapter;
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.invite_people_screen_items,container,false);
        listView = (ListView) view.findViewById(R.id.people_list);
        invitePeopleAdapter = new InvitePeopleAdapter(getActivity());
        listView.setAdapter(invitePeopleAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                MainActivityScreen mainActivityScreen = new MainActivityScreen();
                getFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,mainActivityScreen).commit();
            }
        });
        return view;

    }
}
