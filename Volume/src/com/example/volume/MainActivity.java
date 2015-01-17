package com.example.volume;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	int myCurrentVolume = 0;
	String myString = "Hello World";
	AudioManager myAudio;
	

	private TextView myVolumeLevel;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		myVolumeLevel = (TextView) this
				.findViewById(R.id.text_VolumeLevel);
		
		myAudio = (AudioManager) getSystemService(Context.AUDIO_SERVICE); 
		myCurrentVolume = myAudio.getStreamVolume(AudioManager.STREAM_RING);
		
		
		String myString = String.valueOf(myCurrentVolume);
		myVolumeLevel.setText(myString);

			
		
		
	}

}
