package in.yellowsoft.needaspot;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/**
 * Created by T on 27-12-2016.
 */

public class MainFragment extends FragmentActivity {
    FrameLayout need_a_spot_fragment;
    LinearLayout profile,discovery,add,activity,workouts;
   @Override
    protected void onCreate(Bundle savedInstanceState){
       super.onCreate(savedInstanceState);
       setContentView(R.layout.main_fragment);
       need_a_spot_fragment = (FrameLayout) findViewById(R.id.need_a_spot_fragment);
       profile   = (LinearLayout) findViewById(R.id.profile);
       discovery = (LinearLayout) findViewById(R.id.discovery);
       add       = (LinearLayout) findViewById(R.id.add);
       activity  = (LinearLayout) findViewById(R.id.activity);
       workouts  = (LinearLayout) findViewById(R.id.workouts);

       profile.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ProfileActivity profileActivity = new ProfileActivity();
               getSupportFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,profileActivity).commit();
           }
       });

       discovery.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               TimelineFragment timelineFragment = new TimelineFragment();
               getSupportFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,timelineFragment).commit();
           }
       });

       add.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               MediaScreen mediaScreen = new MediaScreen();
               getSupportFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,mediaScreen).commit();
           }
       });

       activity.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

           }
       });

       workouts.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               WorkoutScreen workoutScreen = new WorkoutScreen();
               getSupportFragmentManager().beginTransaction().replace(R.id.need_a_spot_fragment,workoutScreen).commit();

           }
       });


   }
}
