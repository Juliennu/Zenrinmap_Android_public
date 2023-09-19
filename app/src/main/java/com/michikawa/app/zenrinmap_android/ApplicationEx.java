package com.michikawa.app.zenrinmap_android;

import android.app.Application;
import android.widget.Toast;

import com.zdc.android.zms.maps.ErrorCode;
import com.zdc.android.zms.maps.MapInitializer;

public class ApplicationEx extends Application {

    private final String SERVER_DOMAIN = "test.core.its-mo.com";
    private final String YOUR_CONSUMER_KEY = "クライアントID(Key)を入力";
    private final String YOUR_CONSUMER_SECRET = "OAuth認証（秘密鍵）を入力";

    @Override
    public void onCreate() {
        super.onCreate();

        int ret = MapInitializer.initialize(getApplicationContext(),
                SERVER_DOMAIN,
                YOUR_CONSUMER_KEY,
                YOUR_CONSUMER_SECRET
        );
        if(ret != ErrorCode.ZDCMAP_OK) {
            Toast.makeText(ApplicationEx.this, "initialize error :"+ret, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}