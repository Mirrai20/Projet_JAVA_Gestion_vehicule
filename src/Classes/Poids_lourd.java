package Classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Poids_lourd extends Vehicule {
	//Attributs
		private int ID_PL=0;
		
	//Constructors	
	public Poids_lourd() {
		super();
		ID_PL=0;
		this.setTypeveh("Poids_lourd");
	}
	
	public Poids_lourd(int ID_PL) {
		super();
		this.ID_PL=ID_PL;
		this.setTypeveh("Poids_lourd");
	}
	public Poids_lourd(int ID_vehi,String Date_achat,int nb_places,String statut,float prix,String image,String couleur,String modele,String marque,String date_fabrication) {
		super(ID_vehi,Date_achat,nb_places,statut,prix,image,couleur,modele,marque,date_fabrication);
		this.ID_PL=ID_vehi;
		this.setTypeveh("Poids_lourd");
	}
	//GETTERS
	public int getID_PL() {
			return this.ID_PL;
	}		
	
	//SETTERS
	public void setID_PL(int ID_PL) {
			this.ID_PL=ID_PL;
	}
		
	//Méthodes
	
	public Poids_lourd findPLby(String value){
		try
		{
		
			String filename="src/FilesTXT/poids_lourd.txt";
			FileInputStream is = new FileInputStream(filename);
		    InputStreamReader isr = new InputStreamReader(is);
		    BufferedReader buffer = new BufferedReader(isr);
		    
		    String line = buffer.readLine();
	    	String[] split;

		    while(line != null){
		    	split = line.split(" ");
			    if(value.equals(split[0])) {
			    	if(this.findVeBy(split[0])!=null) {
			    		this.findVeBy(split[0]);
			    		this.setID_PL(Integer.parseInt(split[0]));
			    		this.setTypeveh(split[1]);
			    	}
				    return this;

			    }
	
		    	line = buffer.readLine();
		     }
		    buffer.close();
		}
		catch(IOException ioe)
		{
		 System.err.println("IOException: "+ ioe.getMessage());
		}
		return null;
	}
	
	

	public boolean addV() {
		try
		{
		 String filename="src/FilesTXT/poids_lourd.txt";
		 FileWriter fw = new FileWriter(filename,true);
		 String contenu=this.getId_vehi()+" "+this.getTypeveh();
		 
		 if(this.addVeh()) {
			 fw.write(contenu+"\n");
		 }else {
			 return false;
		 }
		 
		 fw.close();
		 return true;
		}
		catch(IOException ioe)
		{
		 System.err.println("IOException: "+ ioe.getMessage());
		}
		return false;
		
	}
	//Supprimer une poids_lourd dans le fichier poids_lourd.txt
		public boolean DelV() {
			try
			{
			
				String filename="src/FilesTXT/poids_lourd.txt";
				FileInputStream is = new FileInputStream(filename);
			    InputStreamReader isr = new InputStreamReader(is);
			    BufferedReader buffer = new BufferedReader(isr);
			    
			    String line = buffer.readLine();
		    	String[] split;
		    	String Contenu="";

			    while(line != null){
			    	split = line.split(" ");
				    if(this.getId_vehi()!=Integer.parseInt(split[0])) {
				    	Contenu+=line+"\n";
				    }
			    	line = buffer.readLine();
			     }
			    
			    buffer.close();
			    
			     filename="src/FilesTXT/poids_lourd.txt";
				 FileWriter fw = new FileWriter(filename);
				 fw.write(Contenu);
				 fw.close();
				 if(this.DelVeh()) {
					    return true;
				 }else {
				    	return false;
				  }
			}
			catch(IOException ioe)
			{
			 System.err.println("IOException: "+ ioe.getMessage());
			}
			return false;
		}

}
