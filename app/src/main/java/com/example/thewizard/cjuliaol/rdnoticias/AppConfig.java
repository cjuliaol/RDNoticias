package com.example.thewizard.cjuliaol.rdnoticias;

import android.app.Application;
import android.nfc.Tag;
import android.util.Log;

import com.parse.Parse;
import com.parse.ParseInstallation;

/**
 * Created by cjuliaol on 13-Dec-15.
 */
public class AppConfig extends Application {

    public static final String TAG ="AppConfigLog";

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "oNz38ffWL6dYJMdm0qtNY93LavyXXXXdsoE3QLcH", "O90RL1dajB9lc7BzRIUTgwXH0oGgAyfaTsEkNGvW");
        ParseInstallation.getCurrentInstallation().saveInBackground();


    }
}
