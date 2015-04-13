//KELAS MONSTER ShadowLord
public class ShadowLord extends Monster {
    
    //KONSTRUKTOR
    public ShadowLord () {
        super("ShadowLord", 10, 60, 0, 50, 2);
		System.out.println("ShadowLord telah muncul di arena");		
    }
    
    public void run() {
    	//Monster akan kabur ketika mencapai HP minimal
    }
}
