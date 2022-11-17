public class Articolo{
    
	private String nome;
    private double sconto;
    private double prezzo;
    
	public Articolo(){
        this.nome = "";
        this.sconto = 0.0;
        this.prezzo = 0.0;
    }
    
	public void setNome(String nome){
        if(nome != null){
            this.nome = nome;
        }
    }
    
	public void setSconto(double s){
        if(s > 1 && s < 99){
            this.sconto = s;
        }else{
            this.sconto = 0;
        }
    }
    
	public void setPrezzo(double p){
        if(p > -1){
            this.prezzo = p;
        }else{
            this.prezzo = 0;
        }
    }
}
