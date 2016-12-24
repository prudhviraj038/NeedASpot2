package in.yellowsoft.needaspot;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by T on 24-12-2016.
 */

public class MainActivityScreenAdapter extends BaseAdapter{
    LayoutInflater inflater;
    Context context;

    protected MainActivityScreenAdapter(Context context){
        this.context =context;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return 7;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final View item_view = inflater.inflate(R.layout.main_activity_screen,null);
        return item_view;
    }
}
