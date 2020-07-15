package com.example.testlocation.Interface;

import com.example.testlocation.MyLatLng;
import com.google.android.gms.maps.model.LatLng;

import java.util.List;

public interface IOLoadLocationListener {
    void onLoadLocationSucess(List<MyLatLng> latLngs);
    void onLoadLocationFailed(String message);
}
