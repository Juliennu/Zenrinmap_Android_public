package com.michikawa.app.zenrinmap_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.zdc.android.zms.maps.CameraUpdateFactory;
import com.zdc.android.zms.maps.MapFragment;
import com.zdc.android.zms.maps.OnMapReadyCallback;
import com.zdc.android.zms.maps.ZDCMap;
import com.zdc.android.zms.maps.model.LatLng;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapFragment fragment = (MapFragment)getFragmentManager().findFragmentById(R.id.map);
        fragment.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(ZDCMap zdcMap) {
                zdcMap.setMapType("its-mo");
                zdcMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(35.68, 139.76), 6));
            }
        });
    }
}