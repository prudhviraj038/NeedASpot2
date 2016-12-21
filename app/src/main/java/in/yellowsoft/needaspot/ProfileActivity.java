package in.yellowsoft.needaspot;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class ProfileActivity extends Activity {
    EditText f_name,zip,age,goals,bio;
    TextView er_tv;
    LinearLayout fm,m,save,er_ll;
    ImageView fm_img,m_img,close;
    String gender="0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_activity);
        f_name=(EditText)findViewById(R.id.et_name);
        zip=(EditText)findViewById(R.id.et_zip);
        age=(EditText)findViewById(R.id.et_age);
        goals=(EditText)findViewById(R.id.et_goals);
        bio=(EditText)findViewById(R.id.et_bio);
        er_tv=(TextView)findViewById(R.id.error_text);

        fm=(LinearLayout)findViewById(R.id.fm_ll);
        m=(LinearLayout)findViewById(R.id.m_ll);
        save=(LinearLayout)findViewById(R.id.save_ll);
        er_ll=(LinearLayout)findViewById(R.id.error_popup);

        fm_img=(ImageView)findViewById(R.id.fm_img);
        m_img=(ImageView)findViewById(R.id.m_img);
        close=(ImageView)findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                er_ll.setVisibility(View.GONE);
            }
        });
        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender="female";
                fm_img.setImageResource(R.drawable.radio_select);
                m_img.setImageResource(R.drawable.radio);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender="male";
                fm_img.setImageResource(R.drawable.radio);
                m_img.setImageResource(R.drawable.radio_select);
            }
        });
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f_name.getText().toString().equals(""))
                   popup("Please enter your name");
                else if (zip.getText().toString().equals(""))
                    popup("Please enter Zip code");
                else if (age.getText().toString().equals(""))
                    popup("Please enter your age");
                else if (gender.equals("0"))
                    popup("Please select gender");
                else if (goals.getText().toString().equals(""))
                    popup("Please enter your goals");
                else if (bio.getText().toString().equals(""))
                    popup("Please enter your Biography");
                else {
                    Toast.makeText(ProfileActivity.this,"Successfully saved", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    public  void popup(String msg){
        er_ll.setVisibility(View.VISIBLE);
        er_tv.setText(msg);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
