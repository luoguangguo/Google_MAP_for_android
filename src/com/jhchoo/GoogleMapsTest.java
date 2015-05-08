package com.jhchoo;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

public class GoogleMapsTest extends MapActivity {

	private MapView myMap;
	List<Overlay> mapOverlays;
	Drawable drawable;
	HelloItemizedOverlay itemizedOverlay;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		myMap = (MapView) findViewById(R.id.maps);
		myMap.setBuiltInZoomControls(true); // 하단에 확대추가 버튼
		myMap.setSatellite(true);

		GeoPoint p = new GeoPoint(37497931, 127027547); //좌표
		MapController mc = myMap.getController();
		mc.animateTo(p); //좌표점 이동
		mc.setZoom(16); //확대 (1~21)

		mapOverlays = myMap.getOverlays();
		drawable = this.getResources().getDrawable(R.drawable.androidmarker);
		itemizedOverlay = new HelloItemizedOverlay(drawable);

		OverlayItem overlayitem = new OverlayItem(p, "", "");

		itemizedOverlay.addOverlay(overlayitem);
		mapOverlays.add(itemizedOverlay);
	}

	@Override
	protected boolean isRouteDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
}