/**
 * Kreis
 */
public class Kreis {

    private static final int AUS = 0;
    private static final int AN  = 1;

    int state = AN;

    int positionX;
    int positionY;
    int radius;
    String farbe;
    String letzteFarbe;

    public Kreis() {
        this(100, 100, 50, "gruen");
    }

    public Kreis(int x, int y, int r, String farbe) {
        this.positionX  = x;
        this.positionY  = y;
        this.radius     = r;
        this.farbe      = farbe;
    }

    public void verschieben(int x, int y) {
        this.positionX  += x;
        this.positionY  += y;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public void vergroessern(int z){
        this.radius *= z;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    public void changeColor(String c){
        this.farbe = c;
    }  

    public void schalten(){
        if (state == AUS) {
            this.state = AN;
            this.farbe = this.letzteFarbe;
        } else {
            this.state = AUS;
            this.letzteFarbe = this.farbe;
            this.farbe = "schwarz";
        }
    }
}