/*******************************************************************************
 * Copyright 2014, 2016 gwt-ol3
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
package ol.geom;

import jsinterop.annotations.JsType;
import ol.Coordinate;

/**
 * LinearRing geometry.
 *
 * @author sbaumhekel
 */
@JsType(isNative = true)
public class LinearRing extends SimpleGeometryCoordinates {

    public LinearRing(Coordinate[] coordinates) {}

    public LinearRing(Coordinate[] coordinates, String geometryLayout) {}

    /**
     * Return the area of the linear ring on projected plane.
     *
     * @return area (on projected plane).
     */
    public native double getArea();

}
