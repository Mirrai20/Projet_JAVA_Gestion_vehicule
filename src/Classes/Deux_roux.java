package Classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Deux_roux extends Vehicule{

	//Attributs
	private int ID_DR=0;
		
	//Constructors	
	public Deux_roux() {
		super();
		ID_DR=0;
		this.setTypeveh("Deux_roux");
	}
	
	public Deux_roux(int ID_DR) {
		super();
		this.ID_DR=ID_DR;
		this.setTypeveh("Deux_roux");
	}
	public Deux_roux(int ID_vehi,String Date_achat,int nb_places,String statut,float prix,String image,String couleur,String modele,String marque,String date_fabrication) {
		super(ID_vehi,Date_achat,nb_places,statut,prix,image,couleur,modele,marque,date_fabrication);
		this.ID_DR=ID_vehi;
		this.setTypeveh("Deux_roux");
	}
	//GETTERS
	public int getID_DR() {
			return this.ID_DR;
	}
			
	
	//SETTERS
	public void setID_DR(int ID_DR) {
			this.ID_DR=ID_DR;
	}
	
	//Méthodes
	public Deux_roux findDRby(String value){
		try
		{
		
			String filename="src/FilesTXT/deux_roux.txt";
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
			    		this.setID_DR(Integer.parseInt(split[0]));
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
		 String filename="src/FilesTXT/deux_roux.txt";
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
	//Supprimer une vehicule deux_roux dans le fichier deux_roux.txt
	public boolean DelV() {
		try
		{
		
			String filename="src/FilesTXT/deux_roux.txt";
			FileInputStream is = new FileInputStream(filename);
		    InputStreamReader isr = new InputStreamReader(is);
		    BufferedReader buffer = new BufferedReader(isr);
		    
		    String line = buffer.readLine();
	    	String[] split;
	    	String Contenu="";
	    	System.out.println("test1");
		    while(line != null){
		    	split = line.split(" ");
			    if(this.getId_vehi()!=Integer.parseInt(split[0])) {
			    	Contenu+=line+"\n";
			    }
		    	line = buffer.readLine();
		     }
		    
		    buffer.close();
		    System.out.println("test2");
		     filename="src/FilesTXT/deux_roux.txt";
			 FileWriter fw = new FileWriter(filename);
			 fw.write(Contenu);
			 fw.close();
			 System.out.println("test3");
		    if(this.DelVeh()) {
		    	System.out.println("test4V");
			    return true;
		    }else {
		    	System.out.println("test4F");
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
