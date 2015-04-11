public class Point {
    private int x;
    private int y;
    
    //konstruktor
    public Point(){
    }
    public Point(int x1, int y1){
        x=x1;
        y=y1;
    }
    
    //getter
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    //setter
    public void setX(int x1){
        x=x1;
    }
    public void setY(int y1){
        y=y1;
    }
}
