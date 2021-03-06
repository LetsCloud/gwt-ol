/*******************************************************************************
 * Copyright 2014, 2017 gwt-ol3
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package ol;

import ol.layer.Layer;
import ol.proj.Projection;
import ol.proj.ProjectionOptions;

/**
 *
 * @author Tino Desjardins
 *
 */
public class MapTest extends GwtOLBaseTestCase {

    public void testMapCreation() {

        injectUrlAndTest(() -> {

            ProjectionOptions projectionOptions = new ProjectionOptions();
            projectionOptions.setCode("EPSG:21781");
            projectionOptions.setUnits("m");

            Projection projection = new Projection(projectionOptions);

            ViewOptions viewOptions = new ViewOptions();
            viewOptions.setProjection(projection);
            View view = new View(viewOptions);

            Coordinate centerCoordinate = new Coordinate(660000, 190000);

            view.setCenter(centerCoordinate);
            view.setZoom(9);

            final MapOptions mapOptions = new MapOptions();
            mapOptions.setTarget("map");
            mapOptions.setView(view);
            mapOptions.setLoadTilesWhileAnimating(true);
            mapOptions.setLoadTilesWhileInteracting(true);

            Map map = new Map(mapOptions);
            assertNotNull(map);

            map.forEachFeatureAtPixel(new Pixel(100, 100), new FeatureAtPixelFunction() {

                @Override
                public boolean call(Feature feature, Layer layer) {
                    return false;
                }

            });

        });

    }

}
