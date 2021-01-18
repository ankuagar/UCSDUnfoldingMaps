package module3.practice;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.PointFeature;
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
        Feature valEq = new PointFeature(valLoc);
        valEq.addProperty("title", "Valdivia, Chile");
        valEq.addProperty("magnitude", "9.5");
        valEq.addProperty("date", "May 22, 1960");
        valEq.addProperty("year", "1960");

        Marker marker = new SimplePointMarker(valLoc, valEq.getProperties());
        marker.setColor(color(255, 255, 0)); //yellow

        //map = new UnfoldingMap(this, 200, 50, 700, 500, new Google.GoogleTerrainProvider());
        map = new UnfoldingMap(this,200, 50, 700, 500, new Microsoft.RoadProvider());
        map.zoomAndPanTo(4, valLoc);
        map.addMarker(marker);
        MapUtils.createDefaultEventDispatcher(this, map);
        //drawButtons(); // if added here, map will overwrite the buttons
    }

    public void draw() {
        background(255,0,0);
        //drawButtons(); // if added here, map will overwrite the buttons
        map.draw();
        drawButtons();

    }
    private void drawButtons() {
        fill(255,255, 255);
        rect(100, 100, 25, 25);

        fill(255,175, 100);
        rect(100, 150, 25, 25);

    }

    public void mousePressed() {
        System.out.println("Pressed" + " : " + mouseEvent.getButton() + " : " + mouseX + " : " + mouseY);
    }

    public void mouseReleased() {

        System.out.println("Released" + " : " + mouseEvent.getButton() + " : " + mouseX + " : " + mouseY);
    }

    public void mouseClicked() {
        System.out.println("Clicked" + " : " + mouseEvent.getButton() + " : " + mouseX + " : " + mouseY);
    }

    public void mouseMoved() {
        System.out.println("Moved" + " : " + mouseEvent.getButton() + " : " + mouseX + " : " + mouseY);
    }

    public static void main(String[] args) {
        PApplet.main (new String[] { "--present", "module3.practice.EarthQuakeCityMap" });
    }
}
