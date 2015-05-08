package com.jhchoo;

import java.util.ArrayList;

import android.graphics.drawable.Drawable;

import com.google.android.maps.ItemizedOverlay;
import com.google.android.maps.OverlayItem;

public class HelloItemizedOverlay extends ItemizedOverlay {

	private ArrayList<OverlayItem> mOverlays = new ArrayList<OverlayItem>();
	
	public HelloItemizedOverlay(Drawable defaultMarker) {
		super(boundCenterBottom(defaultMarker)); //아이콘의 아래의 중간부분이 좌표에 위치하도록 지정
	}

	@Override
	protected OverlayItem createItem(int i) {
		// TODO Auto-generated method stub
		return mOverlays.get(i); 
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return  mOverlays.size();
	}

	 public void addOverlay(OverlayItem overlay) { 
	     mOverlays.add(overlay); 
	     populate(); 
	 }
}
