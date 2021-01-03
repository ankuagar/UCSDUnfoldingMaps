package module3.practice;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.GeoJSONReader;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.MultiMarker;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

import java.util.List;

public class LifeExpectancy extends PApplet {

    private UnfoldingMap map;
    List<Feature> countries;
    List<Marker> countryMarkers;


    public void setup() {
        size(800, 600);
        map = new UnfoldingMap(this, new Google.GoogleMapProvider());
        countries = GeoJSONReader.loadData(this, "countries.geo.json");

//        for(Feature f: countries) {
//            System.out.println(f.getClass().getName() + " " + f.properties + " " + f.getId() );
//
//        }
        countryMarkers = MapUtils.createSimpleMarkers(countries);
        for(Marker m: countryMarkers) {
            System.out.println(m.getClass().getName());
            if(! (m instanceof MultiMarker)) {
                m.setColor(color(255,0, 170));
                map.addMarker(m);
                System.out.println(m.getClass().getName() + " " + m.getProperties() + " " + m.getId() + m.getLocation());
            }
        }
//        map.addMarkers(countryMarkers);
        MapUtils.createDefaultEventDispatcher(this, map);
    }
    public void draw() {
        background(10);
        map.draw();
    }

    public static void main(String[] args) {
        PApplet.main (new String[] { "--present", "module3.practice.LifeExpectancy" });
    }
}
