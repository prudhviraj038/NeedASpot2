package in.yellowsoft.needaspot;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;


public class ProfileActivity extends Fragment {
    EditText f_name,zip,age,goals,bio,user_city,user_state,user_country,certification;
    TextView er_tv;
    LinearLayout fm,m,save,er_ll;
    ImageView fm_img,m_img,close;
    String gender="0";
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState){
        final View view = inflater.inflate(R.layout.profile_activity,container,false);
        f_name=(EditText)view.findViewById(R.id.et_name);
        zip=(EditText) view.findViewById(R.id.et_zip);
        age=(EditText) view.findViewById(R.id.et_age);
        goals=(EditText) view.findViewById(R.id.et_goals);
        bio=(EditText) view.findViewById(R.id.et_bio);
        user_city=(EditText) view.findViewById(R.id.et_city);
        user_state=(EditText) view.findViewById(R.id.et_state);
        user_country=(EditText) view.findViewById(R.id.et_country);
        certification=(EditText) view.findViewById(R.id.et_certification);
        er_tv=(TextView) view.findViewById(R.id.error_text);

        fm=(LinearLayout)view.findViewById(R.id.fm_ll);
        m=(LinearLayout)view.findViewById(R.id.m_ll);
        save=(LinearLayout)view.findViewById(R.id.save_ll);
        er_ll=(LinearLayout)view.findViewById(R.id.error_popup);

        fm_img=(ImageView)view.findViewById(R.id.fm_img);
        m_img=(ImageView)view.findViewById(R.id.m_img);
        close=(ImageView)view.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                er_ll.setVisibility(View.GONE);
            }
        });
        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender="1";
                fm_img.setImageResource(R.drawable.radio_select);
                m_img.setImageResource(R.drawable.radio);
            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender="2";
                fm_img.setImageResource(R.drawable.radio);
                m_img.setImageResource(R.drawable.radio_select);
            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname   = f_name.getText().toString();
                String zipcode = zip.getText().toString();
                String Age     = age.getText().toString();
                String Goals   = goals.getText().toString();
                String Bio     = bio.getText().toString();
                String City    = user_city.getText().toString();
                String State   = user_state.getText().toString();
                String Country = user_country.getText().toString();
                String Certification = certification.getText().toString();

                if (fname.equals(""))
                   popup("Please enter your name");
                else if (City.equals(""))
                    popup("please enter your city");
                else if (State.equals(""))
                    popup("Please enter your state");
                else if (Country.equals(""))
                    popup("Please enter your country");
                else if (zipcode.equals(""))
                    popup("Please enter Zip code");
                else if (Age.equals(""))
                    popup("Please enter your age");
                else if (gender.equals("0"))
                    popup("Please select gender");
                else if (Goals.equals(""))
                    popup("Please enter your goals");
                else if (Bio.equals(""))
                    popup("Please enter your Biography");
                else if (Certification.equals(""))
                    popup("Please enter yout Certifications");
                else {
                    Ion.with(ProfileActivity.this)
                            .load("http://www.disruptivetechsolutions.com/NeedASpot/api/Account/UpdateUserProfile")
                            .setBodyParameter("EmailAddress","test@gmail.com")
                            .setBodyParameter("FullName",fname)
                            .setBodyParameter("City",City)
                            .setBodyParameter("State",State)
                            .setBodyParameter("Country",Country)
                            .setBodyParameter("ZipCode",zipcode)
                            .setBodyParameter("Gender",gender)
                            .setBodyParameter("DateofBirth",Age)
                            .setBodyParameter("Goals",Goals)
                            .setBodyParameter("Biography",Bio)
                            .setBodyParameter("Certification",Certification)
                            .asJsonObject()
                            .setCallback(new FutureCallback<JsonObject>() {
                                @Override
                                public void onCompleted(Exception e, JsonObject result) {
                                    if (result.get("Status").getAsString().equals("Success")) {
                                        Log.e("response", result.toString());
                                        Toast.makeText(getActivity(), result.get("Message").getAsString(), Toast.LENGTH_SHORT).show();
                                        ReminderScreen reminderScreen = new ReminderScreen();
                                        Bundle bundle = new Bundle();
                                        bundle.putString("gender",result.get("Gender").getAsString());
                                        bundle.putString("age",result.get("DateofBirth").getAsString());
                                        bundle.putString("city",result.get("City").getAsString());
                                        bundle.putString("goals",result.get("Goals").getAsString());
                                        bundle.putString("biography",result.get("Biography").getAsString());
                                        reminderScreen.setArguments(bundle);
                                        getFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment, reminderScreen).commit();
                                    }else {
                                        Toast.makeText(getActivity(),result.get("Message").getAsString(),Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });


                }
            }
        });
        return view;
    }
    public  void popup(String msg){
        er_ll.setVisibility(View.VISIBLE);
        er_tv.setText(msg);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

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
