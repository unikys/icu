package unikys.icu;

import java.util.List;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.OverlayItem;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ICUMapActivity extends MapActivity {

	LocationManager mLocationManager;
	LocationListener locationListener;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_icumap);
        MapView mapView = (MapView) findViewById(R.id.icu_mapview);
        mapView.setBuiltInZoomControls(true);
        
        mLocationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        
        LocationListener locationListener = new LocationListener() {
			@Override
			public void onStatusChanged(String provider, int status, Bundle extras) {
			}
			
			@Override
			public void onProviderEnabled(String provider) {
			}
			
			@Override
			public void onProviderDisabled(String provider) {
			}
			
			@Override
			public void onLocationChanged(Location location) {
				Log.d("Location", location.toString());
			}
		};
		
		mLocationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, locationListener);

        List<Overlay> mapOverlays = mapView.getOverlays();
        Drawable drawable = this.getResources().getDrawable(R.drawable.androidmarker);
        ICUItemizedOverlay itemizedoverlay = new ICUItemizedOverlay(drawable, this);    

        GeoPoint point = new GeoPoint(19240000,-99120000);
        OverlayItem overlayitem = new OverlayItem(point, "Hola, Mundo!", "I'm in Mexico City!");

        itemizedoverlay.addOverlay(overlayitem);
        mapOverlays.add(itemizedoverlay);

        LayoutInflater              layoutInflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        ICUMapBalloon noteBalloon = (ICUMapBalloon) layoutInflater.inflate(R.layout.map_icuballoon, null);
        RelativeLayout.LayoutParams layoutParams   = new RelativeLayout.LayoutParams(200,100);
        layoutParams.addRule(RelativeLayout.CENTER_VERTICAL);
        layoutParams.addRule(RelativeLayout.CENTER_HORIZONTAL);
        noteBalloon.setLayoutParams(layoutParams);

        MapController mapController = mapView.getController();
        
        mapView.removeView(noteBalloon);
        noteBalloon.setVisibility(View.VISIBLE);
        mapController.animateTo(overlayitem.getPoint());
        mapView.addView(noteBalloon, new MapView.LayoutParams(200,200,overlayitem.getPoint(),MapView.LayoutParams.BOTTOM_CENTER));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_icumap, menu);
        return true;
    }

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}
