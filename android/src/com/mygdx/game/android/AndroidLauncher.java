package com.mygdx.game.android;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class AndroidLauncher extends AndroidApplication {
	entryPoint eP;
	GameScreen GameScreen;
	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		AndroidApplicationConfiguration config= new AndroidApplicationConfiguration();
		config.useAccelerometer = false;
		config.useCompass = false;
        eP=new entryPoint();
		initialize(eP, config);

	}
}
