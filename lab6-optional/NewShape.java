package com.company;

import java.awt.*;
import java.awt.geom.Path2D;
import java.sql.Struct;

public class NewShape extends Polygon {

    public NewShape(int x, int y )
    {
        this.addPoint( x, y-50 );
        this.addPoint( x+10 , y-25);
        this.addPoint( x+35, y-35);
        this.addPoint( x+25, y-10);
        this.addPoint( x+50, y);
        this.addPoint( x+25, y+10);
        this.addPoint( x+35, y+35);
        this.addPoint( x+10, y+25);
        this.addPoint( x, y+50);
        this.addPoint( x-10, y+25);
        this.addPoint( x-35, y+35);
        this.addPoint( x-25, y+10);
        this.addPoint( x-50, y);
        this.addPoint( x-25, y-10);
        this.addPoint( x-35, y-35);
        this.addPoint( x-10, y-25);
        this.addPoint( x, y-50);
        this.addPoint( x, y+25);
        this.addPoint( x, y+50);


    }



}