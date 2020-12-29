package module3.practice;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.providers.Microsoft;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;
import de.fhpotsdam.unfolding.geo.Location;

public class EarthQuakeCityMap extends PApplet {
    private UnfoldingMap map;

    @Override
    public void setup() {
        size(950, 600);
        Location valLoc = new Location(-38.14f, -73.03f);
        Marker marker = new SimplePointMarker(valLoc);
        marker.setColor(color(255, 255, 0)); //yellow

        //map = new UnfoldingMap(this, 200, 50, 700, 500, new Google.GoogleTerrainProvider());
        map = new UnfoldingMap(this,200, 50, 700, 500, new Microsoft.HybridProvider());
        map.zoomToLevel(4);
        map.addMarker(marker);
        MapUtils.createDefaultEventDispatcher(this, map);
    }

    public void draw() {
        background(255);
        map.draw();

    }
    public static void main(String[] args) {
        PApplet.main (new String[] { "--present", "module3.practice.EarthQuakeCityMap" });
    }
}
