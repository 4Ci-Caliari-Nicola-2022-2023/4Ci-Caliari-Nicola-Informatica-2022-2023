import java.util.*;
public class VenditaArticolo{
    
	private Articolo a;
    
	public VenditaArticolo(){
        this.a = new Articolo();
    }
    
	public void start(){
        this.describeProgram();
        this.getInput();
        this.sellArticolo();
        this.displayOutput();
    }
    
	public void describeProgram(){
        System.out.println("descrivo il programma");
    }
    
	public void getInput(){
        System.out.println("io prendo in ingresso i dati");
        Scanner input = new Scanner(System.in);
        System.out.println("dammi il nome");
        a.setNome(input.nextLine());
        System.out.println("dammi lo sconto");
        a.setSconto(input.nextDouble());
        System.out.println("dammi il prezzo");
        a.setPrezzo(input.nextDouble());
    }
    
	public void sellArticolo(){
        System.out.println("io calcolo gli acquisti");
    }
    
	public void displayOutput(){
        System.out.println("io visualizzo i risultati");
    }
}
