package ol.interaction;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import ol.Options;

/**
 * Defaults options for {@link Interaction#defaults(InteractionOptions)}.
 * @author sbaumhekel
 */
@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class DefaultInteractionsOptions implements Options {

    /**
     * Whether Alt-Shift-drag rotate is desired. Default is true.
     * @param altShiftDragRotate
     */
    @JsProperty
    public native void setAltShiftDragRotate(boolean altShiftDragRotate);

    /**
     * Zoom to the closest integer zoom level after the wheel/trackpad or pinch
     * gesture ends. Default is false.
     * @param constrainResolution
     */
    @JsProperty
    public native void setConstrainResolution(boolean constrainResolution);

    /**
     * Whether double click zoom is desired. Default is true.
     * @param doubleClickZoom
     */
    @JsProperty
    public native void setDoubleClickZoom(boolean doubleClickZoom);

    /**
     * Whether drag pan is desired. Default is true.
     * @param dragPan
     */
    @JsProperty
    public native void setDragPan(boolean dragPan);

    /**
     * Whether keyboard interaction is desired. Default is true.
     * @param keyboard
     */
    @JsProperty
    public native void setKeyboard(boolean keyboard);

    /**
     * Whether mousewheel zoom is desired. Default is true.
     * @param mouseWheelZoom
     */
    @JsProperty
    public native void setMouseWheelZoom(boolean mouseWheelZoom);

    /**
     * Whether pinch rotate is desired. Default is true.
     * @param pinchRotate
     */
    @JsProperty
    public native void setPinchRotate(boolean pinchRotate);

    /**
     * Whether pinch zoom is desired. Default is true.
     * @param pinchZoom
     */
    @JsProperty
    public native void setPinchZoom(boolean pinchZoom);

    /**
     * Whether Shift-drag zoom is desired. Default is true.
     * @param shiftDragZoom
     */
    @JsProperty
    public native void setShiftDragZoom(boolean shiftDragZoom);

    /**
     * Zoom delta.
     * @param zoomDelta
     */
    @JsProperty
    public native void setZoomDelta(int zoomDelta);

    /**
     * Zoom duration.
     * @param zoomDuration
     */
    @JsProperty
    public native void setZoomDuration(int zoomDuration);

}