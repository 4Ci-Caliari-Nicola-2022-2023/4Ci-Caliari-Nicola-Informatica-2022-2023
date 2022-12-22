package packageFrigorifero;
public class Frigorifero{
    private String marca;
    private String modello;
    private int litriFrigo;
    private int litriFrizer;
    private double prezzo;
    private boolean acceso;
    private double consumokwat;
    private int temperaturaFrigo;
    private int temperaturaFrizer;
    public Frigorifero(String m, String mod, double p){
        if (m!=null){
            this.marca=m;
        }else{
            this.marca="anonimo";
        }
        if (mod!=null){
            this.modello=mod;
        }else{
            this.modello="anonimo";
        }
        if (p>0){
            this.prezzo=p;
        }else{
            this.prezzo=0.0;
        }
        this.litriFrigo=0;
        this.litriFrizer=0;
        this.acceso=false;
        this.consumokwat=0.0;
        this.temperaturaFrigo=0;
        this.temperaturaFrizer=0;
    }
    //
    public void accendi(){
        this.acceso = true;
    }
    public void spegni(){
        this.acceso = false;
    }
    //
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String m){
        if(m != null){
            this.marca = m;
        }else{
            this.marca="anonimo";
        }
    }
    //
    public String getModello(){
        return this.modello;
    }
    public void setModello(String mod){
        if(mod != null){
            this.modello = mod;
        }else{
            this.modello="anonimo";
        }
    }
    //
    public String toString(){
        String out="";
        out+="la marca è: "+this.marca+"\n";
        out+="il modello è: "+this.modello+"\n";
        out+="i litri del frigo sono: "+this.litriFrigo+"\n";
        out+="i litri del frizer sono: "+this.litriFrizer+"\n";
        out+="il prezzo è: "+this.prezzo+"\n";
        if (this.acceso){
            out+="è accesa\n";
        }else{
            out+="è spenta\n";
        }
        out+="il consumo è: "+this.consumokwat+"\n";
        out+="la temperatura del frigo è: "+this.temperaturaFrigo+"\n";
        out+="la temperatura del frizer è: "+this.temperaturaFrizer+"\n";
        return out;
    }
}
