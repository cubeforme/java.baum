package baum;
public class knoten {
    private knoten liN;
    private knoten reN;
    private datenelement inhalt;
    
    public knoten(datenelement i){
        liN=null;
        reN=null;
        inhalt=i;
    }
    
    public boolean suchen(datenelement wert){
        if (inhalt.eigeneristkleiner(wert)){
            if (reN!=null){
                return reN.suchen(wert);
            }
            else{
                return false;
            }
        }
        else{
            if (inhalt==wert){
                return true;
            }
            else{
                if (liN!=null){
                    return liN.suchen(wert);
                }
                else{
                    return false;
                }
            }
        }
    }
    
    public void einfuegen(datenelement d){
        if (inhalt.eigeneristkleiner(d)){
            if (reN==null){
                reN=new knoten(d);
            }
            else{
                reN.einfuegen(d);
            }
        }
        else{
            if (liN==null){
                liN=new knoten(d);
            }
            else{
                liN.einfuegen(d);
            }
        }
    }
}
