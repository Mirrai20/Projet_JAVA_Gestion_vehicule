package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Voiture extends Vehicule{
	//Attributs
		private int ID_voitu=0;
	
	//Constructors	
	public Voiture() {
		super();
		ID_voitu=0;
		this.setTypeveh("Voiture");
	}
	
	public Voiture(int ID_voitu) {
		super();
		this.ID_voitu=ID_voitu;
		this.setTypeveh("Voiture");
	}
	public Voiture(int ID_vehi,String Date_achat,int nb_places,String statut,float prix,String image,String couleur,String modele,String marque,String date_fabrication) {
		super(ID_vehi,Date_achat,nb_places,statut,prix,image,couleur,modele,marque,date_fabrication);
		this.ID_voitu=ID_vehi;
		this.setTypeveh("Voiture");
	}

	//GETTERS
	public int getID_voitu() {
			return this.ID_voitu;
	}
	
	//SETTERS
	public void setID_voitu(int ID_voitu) {
			this.ID_voitu=ID_voitu;
	}
		

	//Méthodes
	public Voiture findVoby(String value){
		try
		{
		
			String filename="src/FilesTXT/voiture.txt";
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
			    		this.setID_voitu(Integer.parseInt(split[0]));
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
		 String filename="src/FilesTXT/voiture.txt";
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
	
	//Supprimer une voiture dans le fichier voiture.txt
	public boolean DelV() {
		try
		{
		
			String filename="src/FilesTXT/voiture.txt";
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
		    
		     filename="src/FilesTXT/voiture.txt";
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
	//Test main
	public void Ecrire() {
		try
		{
		 String filename="src/FilesTXT/voiture.txt";
		 FileWriter fw = new FileWriter(filename,true);
		 fw.write("test");
		 fw.close();
		}
		catch(IOException ioe)
		{
		 System.err.println("IOException: "+ ioe.getMessage());
		}
 
    }
	
	public void Lire() {
		try
		{
			String filename="src/FilesTXT/vehicule.txt";
			FileInputStream is = new FileInputStream(filename);
		    InputStreamReader isr = new InputStreamReader(is);
		    BufferedReader buffer = new BufferedReader(isr);
		    
		    String line = buffer.readLine();
		    int i=0;
		    while(line != null){
		    	String[] split = line.split(" ");
		    	System.out.println("\n\t**********Voiture numéro "+(i+1)+"**********");
		    	System.out.println("ID vehicule = "+split[0]+"\nDate d'achat = "+split[1]+"\nNombre de places = "+split[2]+"\nStatut = "+split[3]+"\nPrix = "+split[4]+"\nImage = "+split[5]+"\nMarque = "+split[8]+"\nModele = "+split[7]+"\nCouleur = "+split[6]+"\nDate de fabrication = "+split[9]);
		    //	System.out.println(line);

		    	line = buffer.readLine();
		    	i++;
		     }
		    buffer.close();
		}
		catch(IOException ioe)
		{
		 System.err.println("IOException: "+ ioe.getMessage());
		}
 
    }
/*	public static void main(String args[]) {
		  Voiture vo=new Voiture();
	//	  ArrayList<Vehicule> Veh = new ArrayList<>();
	//	  Veh=vo.findAllVe();
	//	  System.out.println(Veh.get(0).getMarque());
	//	  System.out.println(Veh.get(1).getMarque());
	/*	  if(vo.findVoby(String.valueOf(1)) != null ){
			  System.out.println(vo.getMarque());
		  }else {
			  System.out.println("fichier vide");
		  }
		  */
		//  vo.Ecrire();
	//	  vo.Lire();
		  
	//}
}
