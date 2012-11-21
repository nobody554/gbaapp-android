package com.gbaapp.goinbandassociation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;

public class MainActivity extends Activity {
	
    public static Intent getOpenFacebookIntent(Context context) {

 	   try {
 	    context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
 	    return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/69714166214"));
 	   } catch (Exception e) {
 	    return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/GoinBandAssociation"));
 	   }
 	}
    
    public static Intent getOpenTwitterIntent(Context context) {
    	try {
    		context.getPackageManager().getPackageInfo("com.twitter.android", 0);
    		return new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?screen_name=GoinBandAlumni"));
    	} catch (Exception e) {
    		return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/GoinBandAlumni"));
    	}
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ImageButton button_info = (ImageButton) findViewById(R.id.imageButton2);
        button_info.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent infoIntent = new Intent(getApplicationContext(), InfoActivity.class);
				startActivity(infoIntent);
			}
        });
        
        ImageButton button_schedule = (ImageButton) findViewById(R.id.imageButton3);
        button_schedule .setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent scheduleIntent = new Intent(MainActivity.this,ScheduleActivity.class);
				MainActivity.this.startActivity(scheduleIntent);
				
			}
		});
        
        ImageButton button_maps = (ImageButton) findViewById(R.id.imageButton4);
        button_maps .setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent mapsIntent = new Intent(MainActivity.this,MapsActivity.class);
				MainActivity.this.startActivity(mapsIntent);
			}
		});
        
        ImageButton button_hotels = (ImageButton) findViewById(R.id.imageButton5);
        button_hotels .setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent hotelsIntent = new Intent(MainActivity.this,HotelsActivity.class);
				MainActivity.this.startActivity(hotelsIntent);
			}
		});
        
        ImageButton button_survey = (ImageButton) findViewById(R.id.imageButton6);
        button_survey .setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent surveyIntent = new Intent(MainActivity.this,SurveyActivity.class);
				MainActivity.this.startActivity(surveyIntent);
			}
		});
                
        ImageButton button_contact = (ImageButton) findViewById(R.id.imageButton7);
        button_contact .setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				Intent contactIntent = new Intent(MainActivity.this,ContactActivity.class);
				startActivity(contactIntent);
			}
		});
        
        ImageButton button_facebook = (ImageButton) findViewById(R.id.imageButton9);
        button_facebook .setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				startActivity(getOpenFacebookIntent(null));
			}
		});
			
        ImageButton button_twitter = (ImageButton) findViewById(R.id.imageButton10);
        button_twitter .setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				startActivity(getOpenTwitterIntent(null));
			}
        });
        
    }
    
}
