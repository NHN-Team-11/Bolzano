package Chapter8.이중민;
public class Spaceship {
    private Planet arrivePlanet;

    public Spaceship(Planet arrivePlanet) { 
        this.arrivePlanet = arrivePlanet;
    }

    public String getArrivePlanet() {
        return arrivePlanet.getPlanetName();
    }

    public void setArrivePlanet(Planet arrivePlanet) {
        this.arrivePlanet = arrivePlanet;
    }
    
    
}

class Planet {
    private String planetName;

    public Planet(String planetName) {
        this.planetName = planetName;
    }

    public String getPlanetName() {
        return planetName;
    }
    
}
