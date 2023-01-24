public class Coordenadas {
    private int x;
    private int y;

    public Coordenadas (int x,int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void incrementX() {
        x++;
    }

    public void decreaseX() {
        x--;
    }

    public void incrementY() {
        y++;
    }

    public void decreaaseY() {
        y--;
    }

    public String toString() {
        return "X = " + x + " Y  = " + y;
    }
}


