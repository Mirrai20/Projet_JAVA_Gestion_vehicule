package Classes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Vehicule_en_vente extends Vehicule {
	//Attributs
		private int IdEnv=0;
		private String Date_dep_Vente=null;
		private String Date_vehu_Vendu=null;
		private float prix_vente =0;
		private String description=null;

		
	//Constructors
	public Vehicule_en_vente() {
		super();
		IdEnv=0;
		Date_dep_Vente=null;
		Date_vehu_Vendu=null;
		prix_vente =0;
		description=null;
	}
	public Vehicule_en_vente(int IdEnv,String Date_dep_Vente,String Date_vehu_Vente,float prix_vente,String description) {
		super();
		this.IdEnv=IdEnv;
		this.Date_dep_Vente=Date_dep_Vente;
		this.Date_vehu_Vendu=Date_vehu_Vente;
		this.prix_vente =prix_vente;
		this.description=description;
	}
	public Vehicule_en_vente(int ID_vehi,String Date_achat,int nb_places,String statut,float prix,String image,String couleur,String modele,String marque,String date_fabrication,int IdEnv,String Date_dep_Vente,String Date_vehu_Vente,float prix_vente,String description) {
		super(ID_vehi,Date_achat,nb_places,statut,prix,image,couleur,modele,marque,date_fabrication);
		this.IdEnv=IdEnv;
		this.Date_dep_Vente=Date_dep_Vente;
		this.Date_vehu_Vendu=Date_vehu_Vente;
		this.prix_vente =prix_vente;
		this.description=description;
	}
	
	//GETTERS
		public int getIdEnv() {
			return this.IdEnv;
		}
		
		public String getDate_dep_Vente() {
			return this.Date_dep_Vente;
		}
		
		public String getDate_vehu_Vendu() {
			return this.Date_vehu_Vendu;
		}
		
		public float getPrix_vente() {
			return this.prix_vente;
		}
		
		public String getDescription() {
			return this.description;
		}
		
	//SETTERS
		
		public void setIdEnv(int IdEnv) {
			this.IdEnv=IdEnv;
		}
		
		public void setDate_dep_Vente(String Date_dep_Vente) {
			this.Date_dep_Vente=Date_dep_Vente;
		}
		
		public void setDate_vehu_Vendu(String Date_vehu_Vente) {
			this.Date_vehu_Vendu=Date_vehu_Vente;
		}

		public void setPrix_vente(float prix_vente) {
			this.prix_vente=prix_vente;
		}
		
		public void setDescription(String description) {
			this.description=description;
		}
	
	
		//Méthodes
		public Vehicule_en_vente findVehvent(String value){
			try
			{
			
				String filename="src/FilesTXT/vehicule_envente.txt";
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
				    		this.setIdEnv(Integer.parseInt(split[0]));
				    		this.setDate_dep_Vente(split[1]);
				    		this.setDate_vehu_Vendu(split[2]);
				    		this.setPrix_vente(Float.parseFloat(split[3]));
				    		this.setDescription(split[4]);
				    		
					    	return this;

				    	}

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
		
		public boolean VenteVeh() {
			try
			{
			 String filename="src/FilesTXT/vehicule_envente.txt";
			 FileWriter fw = new FileWriter(filename,true);
			 String contenu=this.getIdEnv()+" "+this.getDate_dep_Vente()+" "+this.getDate_vehu_Vendu()+" "+this.getPrix_vente()+" "+this.getDescription();
			 fw.write(contenu+"\n");
			 
			 fw.close();
			 this.setStatut("En_vente");
			 if(this.updVeh()) {
				 return true;
			 }
			}
			catch(IOException ioe)
			{
			 System.err.println("IOException: "+ ioe.getMessage());
			}
			return false;
			
		}
		
		//retirer une vehicule from the the file vehicule_envente.txt
		public boolean RetV() {
			try
			{
			
				String filename="src/FilesTXT/vehicule_envente.txt";
				FileInputStream is = new FileInputStream(filename);
			    InputStreamReader isr = new InputStreamReader(is);
			    BufferedReader buffer = new BufferedReader(isr);
			    
			    String line = buffer.readLine();
		    	String[] split;
		    	String Contenu="";

			    while(line != null){
			    	split = line.split(" ");
			    	  if(this.getIdEnv()!=Integer.parseInt(split[0])) {
					    	 Contenu+=line+"\n";
					    }
			    	line = buffer.readLine();
			     }
			    
			    buffer.close();
			    
			     filename="src/FilesTXT/vehicule_envente.txt";
				 FileWriter fw = new FileWriter(filename);
				 fw.write(Contenu);
				 fw.close();
				 this.setStatut("En_service");
				 if(this.updVeh()) {
					 return true;
				 }
			}
			catch(IOException ioe)
			{
			 System.err.println("IOException: "+ ioe.getMessage());
			}
			return false;
		}
		

		//Modifier une vehicule dans le fichier vehicule.txt
		public boolean updVehenv() {
			try
			{
			
				String filename="src/FilesTXT/vehicule_envente.txt";
				FileInputStream is = new FileInputStream(filename);
			    InputStreamReader isr = new InputStreamReader(is);
			    BufferedReader buffer = new BufferedReader(isr);
			    
			    String line = buffer.readLine();
		    	String[] split;
		    	String Contenu="";

			    while(line != null){
			    	split = line.split(" ");
				    if(this.getIdEnv()==Integer.parseInt(split[0])) {
				    	Contenu+=this.getIdEnv()+" "+this.getDate_dep_Vente()+" "+this.getDate_vehu_Vendu()+" "+this.getPrix_vente()+" "+this.getDescription()+"\n";
				    }else {
				    	 Contenu+=line+"\n";
				    }
			    	line = buffer.readLine();
			     }
			    
			    buffer.close();
			    
			     filename="src/FilesTXT/vehicule_envente.txt";
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
		
		public ArrayList<Vehicule_en_vente> findAllVenv(){
			try
			{
			    ArrayList<Vehicule_en_vente> Vehs = new ArrayList<>();
			
				String filename="src/FilesTXT/vehicule_envente.txt";
				FileInputStream is = new FileInputStream(filename);
			    InputStreamReader isr = new InputStreamReader(is);
			    BufferedReader buffer = new BufferedReader(isr);
			    
			    String line = buffer.readLine();
			    int i=0;
		    	String[] split;

			    while(line != null){
			    	split = line.split(" ");
			    	Vehicule_en_vente e=new Vehicule_en_vente();
			    	
			    	if(e.findVeBy(split[0])!=null) {
			    		e.findVeBy(split[0]);
			    		e.setIdEnv(Integer.parseInt(split[0]));
			    		e.setDate_dep_Vente(split[1]);
			    		e.setDate_vehu_Vendu(split[2]);
			    		e.setPrix_vente(Float.parseFloat(split[3]));
			    		e.setDescription(split[4]);
			    		

			    	}
			    	
			    	
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


}
