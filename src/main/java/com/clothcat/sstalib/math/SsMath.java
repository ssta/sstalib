package com.clothcat.sstalib.math;

/**
 * Mathematical helper methods
 * <p/>
 * Created by ssta on 22/10/14.
 */
public class SsMath {
    public static CartesianPoint polarToCartesian(PolarPoint p) {
        double r = p.getR();
        double theta = p.getT();
        double x = r * Math.cos(theta);
        double y = r * Math.sin(theta);
        return new CartesianPoint(x, y);
    }

    public static PolarPoint cartesianToPolar(CartesianPoint p) {
        double x = p.getX();
        double y = p.getY();
        double r = Math.sqrt((x * x) + (y * y));
        double t = Math.atan2(y, x);
        return new PolarPoint(r, t);
    }
}
