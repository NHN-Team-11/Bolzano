package Chapter8.이중민;
public class Test {
    public static void main(String[] args) {
        Planet planet = new Planet("수성");
        Spaceship spaceship = new Spaceship(planet);
        System.out.println(spaceship.getArrivePlanet());
    }
}
