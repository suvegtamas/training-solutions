package immutable;

public class Satellite {
    private CelestialCoordinates celestialCoordinates;
    private String registerIdent;

    public Satellite(CelestialCoordinates celestialCoordinates, String registerIdent) {
        if (isEmpty(registerIdent)) {
            throw new IllegalArgumentException("Register ident must not be empty!");
        }
        this.celestialCoordinates = celestialCoordinates;
        this.registerIdent = registerIdent;
    }

    public String getRegisterIdent() {
        return registerIdent;
    }

    public void modifyDestination(CelestialCoordinates diff) {
        if (celestialCoordinates.getX() > diff.getX() && celestialCoordinates.getY() > diff.getY() && celestialCoordinates.getZ() > diff.getZ()) {
            int difX = celestialCoordinates.getX() + diff.getX();
            int difY = celestialCoordinates.getY() + diff.getY();
            int difZ = celestialCoordinates.getZ() + diff.getZ();
            celestialCoordinates = new CelestialCoordinates(difX, difY, difZ);
        }


    }


    public boolean isEmpty(String str) {
        return str == null || str.isBlank();
    }

    @Override
    public String toString() {
        return registerIdent + ": " + "CelestialCoordinates: " + "x=" + celestialCoordinates.getX() +
                                                                 ", y=" + celestialCoordinates.getY() +
                                                                 ", z=" +celestialCoordinates.getZ();
        // ASD567: CelestialCoordinates: x=14, y=25, z=47
    }
}
