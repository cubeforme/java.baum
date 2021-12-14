package baum;
public class bluemchen {
    private knoten wurzel;
    
    public bluemchen(){
        wurzel=null;
    }
    
    public boolean suchen(datenelement wert){
        if (wurzel!=null){
            return wurzel.suchen(wert);
        }
        else{
            return false;
        }
    }
    
    public void einfuegen(datenelement d){
        if (wurzel!=null){
            wurzel.einfuegen(d);
        }
        else{
            wurzel=new knoten(d);
        }
    }
}
