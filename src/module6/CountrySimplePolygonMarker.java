package module6;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.ShapeFeature;
import de.fhpotsdam.unfolding.marker.SimplePolygonMarker;
import de.fhpotsdam.unfolding.data.Feature;
import de.fhpotsdam.unfolding.utils.MapPosition;
import de.fhpotsdam.unfolding.utils.ScreenPosition;
import processing.core.PGraphics;
import java.util.List;

public class CountrySimplePolygonMarker extends SimplePolygonMarker implements ShowTitle {
    private UnfoldingMap map;
    public CountrySimplePolygonMarker(UnfoldingMap map, Feature feature) {
        super(((ShapeFeature)feature).getLocations(), feature.getProperties());
        super.setId(feature.getId());
        this.map = map;
    }

    public void draw(PGraphics pg, List<MapPosition> mapPositionList) {
        super.draw(pg, mapPositionList);
        if (selected) {
            this.getLocation();
            ScreenPosition screenPosition = map.getScreenPosition(this.getLocation());
            showTitle(pg, this.getId(), screenPosition.x, screenPosition.y);
        }
    }
}
