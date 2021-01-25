package module6;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.data.MarkerFactory;
import de.fhpotsdam.unfolding.data.MultiFeature;
import de.fhpotsdam.unfolding.marker.MultiMarker;
import de.fhpotsdam.unfolding.utils.ScreenPosition;
import processing.core.PGraphics;
import de.fhpotsdam.unfolding.marker.Marker;
import java.util.List;

public class CountryMultiMarker extends MultiMarker implements ShowTitle{
    private UnfoldingMap map;
    private PGraphics pg;
    public CountryMultiMarker(PGraphics pg, Feature feature) {
        super();
        this.pg = pg;
        List<Feature> featureList = ((MultiFeature)feature).getFeatures();
        List<Marker> markerList = new MarkerFactory().createMarkers(featureList);
        super.setMarkers(markerList);
        super.setProperties(feature.getProperties());
        super.setId(feature.getId());

    }
    public void draw(UnfoldingMap map) {
        super.draw(map);
        if (selected) {
            ScreenPosition screenPosition = map.getScreenPosition(this.getLocation());
            showTitle(pg, this.getId(), screenPosition.x, screenPosition.y);
        }

    }
}



