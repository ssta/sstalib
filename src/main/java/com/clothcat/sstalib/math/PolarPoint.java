package com.clothcat.sstalib.math;

/**
 * Created by ssta on 22/10/14.
 */
public class PolarPoint {
    private double r;
    private double t;

    PolarPoint(double r, double t) {
        this.r = r;
        this.t = t;
    }

    public double getR() {
        return r;
    }

    public double getT() {
        return t;
    }
}
