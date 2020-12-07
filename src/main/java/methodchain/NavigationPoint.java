package methodchain;

public class NavigationPoint {
    private int navDist;
    private int navAzi;

    public NavigationPoint(int navDist, int navAzi) {
        this.navDist = navDist;
        this.navAzi = navAzi;
    }

    public int getNavDist() {
        return navDist;
    }

    public int getNavAzi() {
        return navAzi;
    }

    @Override
    public String toString(){
        return "distance: " + navDist + " azimut: " + navAzi;
    }

}
