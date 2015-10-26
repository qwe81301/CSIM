package com.example.administrator.myapplication_maptest20150925;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivityStartSite extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Button btn1 ,btn2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_activity_start_site);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        btn1 = (Button) findViewById(R.id.btn1);


        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MapsActivityStartSite.this, MusicService.class);
                intent.putExtra("KEY_ISPAUSE", false);
                startService(intent);



            }
        });



        btn2 = (Button) findViewById(R.id.btn2);


        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intent = new Intent();
                intent.setClass(MapsActivityStartSite.this, Input.class);

                Bundle bundle = new Bundle();
                bundle.putString("sitename", "聯合大學");
                intent.putExtras(bundle);
                setResult(90, intent); //requestCode需跟A.class的一樣
                MapsActivityStartSite.this.finish();

                startActivity(intent);
            }
        });


    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng ntu = new LatLng(25.021654,121.535301);//國立台灣大學
        mMap.addMarker(new MarkerOptions().position(ntu).title("國立台灣大學")); //25.021654,121.535301  國立台灣大學
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(taipei));

        // 建立地圖攝影機的位置物件
        CameraPosition cameraPosition =
                new CameraPosition.Builder()
                        .target(ntu)
                        .zoom(17)
                        .build();

        // 使用動畫的效果移動地圖
        mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

//        Polyline line = mMap.addPolyline(new PolylineOptions()
//                .add(new LatLng(24.544983, 120.812315), new LatLng(25.05716, 121.5078186))
//                .width(5)
//                .color(Color.RED));
    }
}
