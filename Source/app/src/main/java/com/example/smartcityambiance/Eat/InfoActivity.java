package com.example.smartcityambiance.Eat;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import com.example.smartcityambiance.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class InfoActivity extends FragmentActivity implements OnMapReadyCallback {




    private GoogleMap mMap;

    //defining default android studio maps
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);


        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

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
        // Add a marker in Vienna and position the camera view
        LatLng vienna = new LatLng(48.20941 , 16.352511);
        mMap.addMarker(new MarkerOptions().position(vienna).title("The Italian"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(vienna,15));

    }

}