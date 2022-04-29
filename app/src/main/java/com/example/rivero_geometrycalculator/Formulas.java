package com.example.rivero_geometrycalculator;

import java.lang.Math;
public class Formulas {

    double x;
    double y;

    public static double coneAreaFormula(double radius, double height){
        // Area = pi*radius(radius + square root of h squared and r squared)
        return (Math.PI*radius)*(radius + Math.sqrt((height*height) + (radius*radius)));
    }
    public static double coneVolumeFormula(double radius, double height){
        //Volume = pi *r cubed * height/3
        return Math.PI * (radius*radius*radius) * (height/3);
    }


}


