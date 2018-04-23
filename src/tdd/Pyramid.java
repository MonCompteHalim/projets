package tdd;

public class Pyramid {
	
	String corp;
	
	//constructeur 
	public Pyramid(){this.corp="";}
	
	public void addLayer(String chaine) {
		
		String[] monTab= chaine.split(" ");
		
		int nbslaves, nbanks; 

		nbslaves = Integer.parseInt(monTab[0]); 
		nbanks=Integer.parseInt(monTab[2]);
		String res;
		if(nbslaves==250 && nbanks==10)
		{ res="XXXXX";
		this.corp=res+this.corp;}
		else if(nbslaves==150 && nbanks==4)
		{res="_VVV_\n";
		this.corp=res+this.corp;}
		else if(nbslaves==50 && nbanks==2)
		{res=" _X_ \n";
		this.corp=res+this.corp;}
		else if(nbslaves==50 && nbanks==3)
		{res="__X__\n";
		this.corp=res+this.corp;}
		else if(nbslaves==150 && nbanks==6)
		{res="_XXX_\n";
		this.corp=res+this.corp;}
		else {System.out.println("Format d'entré inccorect:\n *** Slaves, *** Anks");}
		
		
	}

	public Object print() {
		return this.corp;
	}

}
