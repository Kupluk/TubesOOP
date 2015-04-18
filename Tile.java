public class Tile {
    private char lambang; //si tile tersebut lambang nya kaya gimana
    
    //konstruktor
    public Tile(){
    }
    public Tile(char c){
        lambang=c;
    }
    
    //getter
    public char getLambang(){
        return lambang;
    }
    
    //setter
    public void setLambang(char l){
        lambang=l;
    }
}
