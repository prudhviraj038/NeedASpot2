package in.yellowsoft.needaspot;

import android.app.Activity;
import android.content.Intent;
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
import android.widget.ViewFlipper;


public class LoginActivity extends Activity {
    EditText l_email,l_password,r_email,r_password,r_v_password;
    TextView f_password,register,signin_tv;
    TextView er_tv;
    ImageView close;
    ViewFlipper viewFlipper;
    LinearLayout signin,signup,er_ll;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);
        viewFlipper=(ViewFlipper)findViewById(R.id.viewFlipper);
        l_email=(EditText)findViewById(R.id.l_email);
        l_password=(EditText)findViewById(R.id.l_password);
        r_email=(EditText)findViewById(R.id.r_email);
        r_password=(EditText)findViewById(R.id.r_password);
        r_v_password=(EditText)findViewById(R.id.r_password_v);

        f_password=(TextView)findViewById(R.id.f_password);
        register=(TextView)findViewById(R.id.l_register);
        signin_tv=(TextView)findViewById(R.id.signin_re);

        signin=(LinearLayout)findViewById(R.id.signin_ll);
        signup=(LinearLayout)findViewById(R.id.signup_ll);

        er_ll=(LinearLayout)findViewById(R.id.error_pop_login);
        er_tv=(TextView)findViewById(R.id.error_tv_login);
        close=(ImageView)findViewById(R.id.close_login);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                er_ll.setVisibility(View.GONE);
            }
        });
        signin_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setDisplayedChild(0);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewFlipper.setDisplayedChild(1);
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (l_email.getText().toString().equals(""))
                    popup("Please enter email id");
                else if (l_password.getText().toString().equals(""))
                    popup("Please enter password");
                else {
                    Toast.makeText(LoginActivity.this, "Successfully login", Toast.LENGTH_SHORT).show();
                    Intent mainIntent = new Intent(getApplicationContext(),ProfileActivity.class);
                    startActivity(mainIntent);
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r_email.getText().toString().equals(""))
                    popup("Please enter email id");
                else if (r_password.getText().toString().equals(""))
                    popup("Please enter password");
                else if (r_v_password.getText().toString().equals(""))
                    popup("Please enter verify password");
                else {
                    Toast.makeText(LoginActivity.this, "Successfully signup", Toast.LENGTH_SHORT).show();
                    viewFlipper.setDisplayedChild(0);
                }
            }
        });
    }
    public  void popup(String msg){
        er_ll.setVisibility(View.VISIBLE);
        er_tv.setText(msg);
    }
    public void onBackPressed() {
        if(viewFlipper.getDisplayedChild()==1){
            viewFlipper.setDisplayedChild(0);
        }else{
            finish();
        }
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
