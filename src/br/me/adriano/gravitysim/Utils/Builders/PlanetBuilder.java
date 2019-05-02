package br.me.adriano.gravitysim.Utils.Builders;

import br.me.adriano.gravitysim.Utils.Math.Vector;
import br.me.adriano.gravitysim.Utils.Physics.Planet;

public class PlanetBuilder {
    double mass, radius;
    Vector position;

    public Planet build(){
        Planet p = new Planet();
        p.radius = radius;
        p.mass = mass;
        p.position = position;
        return p;
    }

    public PlanetBuilder setMass(double mass){
        this.mass = mass;
        return this;
    }

    public PlanetBuilder setRadius(double radius){
        this.radius = radius;
        return this;
    }

    public PlanetBuilder setPosition(Vector position){
        this.position = position;
        return this;
    }

    public PlanetBuilder setPosition(double x){
        this.position = new Vector(x);
        return this;
    }

    public PlanetBuilder setPosition(double x, double y){
        this.position = new Vector(x, y);
        return this;
    }

    public PlanetBuilder setPosition(double x, double y, double z){
        this.position = new Vector(x, y, z);
        return this;
    }
}
