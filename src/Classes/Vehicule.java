package Classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Vehicule {
	//Attributs
	private int ID_vehi=0;
	private String Date_achat=null;
	private int nb_places=0;
	private String statut=null;
	private float prix=0;
	private String image=null;
	private String couleur=null;
	private String modele=null;
	private String marque=null;
	private String date_fabrication=null;
	private String typeveh=null;


	//Constructors
	public Vehicule() {
		ID_vehi=0;
		Date_achat=null;
		nb_places=0;
		statut=null;
		prix=0;
		image=null;
		couleur=null;
		modele=null;
		marque=null;
		date_fabrication=null;
		typeveh=null;
	}
	public Vehicule(int ID_vehi,String Date_achat,int nb_places,String statut,float prix,String image,String couleur,String modele,String marque,String date_fabrication) {
		this.ID_vehi=ID_vehi;
		this.Date_achat=Date_achat;
		this.nb_places=nb_places;
		this.statut=statut;
		this.prix=prix;
		this.image=image;
		this.couleur=couleur;
		this.modele=modele;
		this.marque=marque;
		this.date_fabrication=date_fabrication;
		this.typeveh=null;
	}
	
	//GETTERS
	public int getId_vehi() {
		return this.ID_vehi;
	}
	
	public String getDate_achat() {
		return this.Date_achat;
	}
	
	public int getNb_places() {
		return this.nb_places;
	}
	
	public String getStatut() {
		return this.statut;
	}
	
	public float getPrix() {
		return this.prix;
	}
	
	public String getImage() {
		return this.image;
	}
	
	public String getCouleur() {
		return this.couleur;
	}
	
	public String getModele() {
		return this.modele;
	}
	
	public String getMarque() {
		return this.marque;
	}
	
	public String getDate_fabrication() {
		return this.date_fabrication;
	}
	
	public String getTypeveh() {
		return this.typeveh;
	}

	//SETTERS
	
	public void setId_vehi(int ID_vehi) {
		this.ID_vehi=ID_vehi;
	}
	
	public void setDate_achat(String Date_achat) {
		this.Date_achat=Date_achat;
	}
	
	public void setNb_places(int nb_places) {
		this.nb_places=nb_places;
	}

	public void setStatut(String statut) {
		this.statut=statut;
	}
	
	public void setPrix(float prix) {
		this.prix=prix;
	}

	public void setImage(String image) {
		this.image=image;
	}
	
	public void setCouleur(String couleur) {
		this.couleur=couleur;
	}
	
	public void setModele(String modele) {
		this.modele=modele;
	}

	public void setMarque(String marque) {
		this.marque=marque;
	}
	
	public void setDate_fabrication(String date_fabrication) {
		this.date_fabrication=date_fabrication;
	}
	
	public void setTypeveh(String typeveh) {
		this.typeveh=typeveh;
	}
	

	//Methods
	public ArrayList<Vehicule> findAllVe(){
		try
		{
		    ArrayList<Vehicule> Vehs = new ArrayList<>();
		
			String filename="src/FilesTXT/vehicule.txt";
			FileInputStream is = new FileInputStream(filename);
		    InputStreamReader isr = new InputStreamReader(is);
		    BufferedReader buffer = new BufferedReader(isr);
		    
		    String line = buffer.readLine();
		    int i=0;
	    	String[] split;

		    while(line != null){
		    	split = line.split(" ");
			    Vehicule e=new Vehicule();

		    	e.setId_vehi(Integer.parseInt(split[0]));
		    	e.setDate_achat(split[1]);
		    	e.setNb_places(Integer.parseInt(split[2]));
		    	e.setStatut(split[3]);
		    	e.setPrix(Float.parseFloat(split[4].replaceAll("_", " ")));
		    	e.setImage(split[5]);
		    	e.setCouleur(split[6].replaceAll("_", " "));
		    	e.setModele(split[7].replaceAll("_", " "));
		    	e.setMarque(split[8].replaceAll("_", " "));
		    	e.setDate_fabrication(split[9]);
		    	
		    	//System.out.println("****"+i+" : "+ split[7]);
		    	line = buffer.readLine();
		    	i++;
		    	Vehs.add(e);
		     }
		    buffer.close();
		    return Vehs;
		}
		catch(IOException ioe)
		{
		 System.err.println("IOException: "+ ioe.getMessage());
		}
		return null;
	}	

	public Vehicule findVeBy(String value){
		try
		{
		
			String filename="src/FilesTXT/vehicule.txt";
			FileInputStream is = new FileInputStream(filename);
		    InputStreamReader isr = new InputStreamReader(is);
		    BufferedReader buffer = new BufferedReader(isr);
		    
		    String line = buffer.readLine();
	    	String[] split;

		    while(line != null){
		    	split = line.split(" ");
			    if(value.equals(split[0])) {
			    	this.setId_vehi(Integer.parseInt(split[0]));
			    	this.setDate_achat(split[1]);
			    	this.setNb_places(Integer.parseInt(split[2]));
			    	this.setStatut(split[3].replaceAll("_", " "));
			    	this.setPrix(Float.parseFloat(split[4].replaceAll("_", " ")));
			    	this.setImage(split[5]);
			    	this.setCouleur(split[6].replaceAll("_", " "));
			    	this.setModele(split[7].replaceAll("_", " "));
			    	this.setMarque(split[8].replaceAll("_", " "));
			    	this.setDate_fabrication(split[9]);

			    }
		    	line = buffer.readLine();
		     }
		    buffer.close();
		    return this;
		}
		catch(IOException ioe)
		{
		 System.err.println("IOException: "+ ioe.getMessage());
		}
		return null;
	}	

	//Ajouter une vehicule dans le fichier vehicule.txt
	public boolean addVeh() {
		try
		{
		 String filename="src/FilesTXT/vehicule.txt";
		 FileWriter fw = new FileWriter(filename,true);
		 String contenu=this.getId_vehi()+" "+this.getDate_achat()+" "+this.getNb_places()+" "+this.getStatut()+" "+this.getPrix()+" "+this.getImage()+" "+this.getCouleur()+" "+this.getModele()+" "+this.getMarque()+" "+this.getDate_fabrication();
		 fw.write(contenu+"\n");
		 fw.close();
		 return true;
		}
		catch(IOException ioe)
		{
		 System.err.println("IOException: "+ ioe.getMessage());
		}
		return false;
		
	}
	
	//Modifier une vehicule dans le fichier vehicule.txt
	public boolean updVeh() {
		try
		{
		
			String filename="src/FilesTXT/vehicule.txt";
			FileInputStream is = new FileInputStream(filename);
		    InputStreamReader isr = new InputStreamReader(is);
		    BufferedReader buffer = new BufferedReader(isr);
		    
		    String line = buffer.readLine();
	    	String[] split;
	    	String Contenu="";

		    while(line != null){
		    	split = line.split(" ");
			    if(this.getId_vehi()==Integer.parseInt(split[0])) {
			    	Contenu+=this.getId_vehi()+" "+this.getDate_achat()+" "+this.getNb_places()+" "+this.getStatut()+" "+this.getPrix()+" "+this.getImage()+" "+this.getCouleur()+" "+this.getModele()+" "+this.getMarque()+" "+this.getDate_fabrication()+"\n";
			    	System.out.println(this.getId_vehi()+" "+this.getId_vehi()+" "+this.getDate_fabrication());
			    }else {
			    	 Contenu+=line+"\n";
			    }
		    	line = buffer.readLine();
		     }
		    
		    buffer.close();
		    
		     filename="src/FilesTXT/vehicule.txt";
			 FileWriter fw = new FileWriter(filename);
			 fw.write(Contenu);
			 fw.close();
		    
		    return true;
		}
		catch(IOException ioe)
		{
		 System.err.println("IOException: "+ ioe.getMessage());
		}
		return false;
	}
	//Supprimer une vehicule dans le fichier vehicule.txt
	public boolean DelVeh() {
		try
		{
		
			String filename="src/FilesTXT/vehicule.txt";
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
		    
		     filename="src/FilesTXT/vehicule.txt";
			 FileWriter fw = new FileWriter(filename);
			 fw.write(Contenu);
			 fw.close();
		    
		    return true;
		}
		catch(IOException ioe)
		{
		 System.err.println("IOException: "+ ioe.getMessage());
		}
		return false;
	}
}

	