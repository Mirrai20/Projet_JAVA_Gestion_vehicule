package Classes;

public class Collectionneur {
	//Attributs
		private int ID_col=0;
		private String Nom=null;
		private String Prenom=null;
		private String tele=null;
		private String email=null;
		private String password=null;
		
		
	//Constructors
	public Collectionneur() {
		 ID_col=0;
		 Nom=null;
		 Prenom=null;
		 tele=null;
		 email=null;
		 password=null;
	}
	public Collectionneur(int ID_col,String Nom,String Prenom,String tele,String email,String password) {
		 this.ID_col=ID_col;
		 this.Nom=Nom;
		 this.Prenom=Prenom;
		 this.tele=tele;
		 this.email=email;
		 this.password=password;
	}
	
	//GETTERS
		public int getId_col() {
			return this.ID_col;
		}
		
		public String getNom() {
			return this.Nom;
		}
		
		public String getPrenom() {
			return this.Prenom;
		}
		
		public String getTele() {
			return this.tele;
		}
		
		public String getEmail() {
			return this.email;
		}
		
		public String getPassword() {
			return this.password;
		}

	//SETTERS
		
		public void setID_col(int ID_col) {
			this.ID_col=ID_col;
		}
		
		public void setNom(String Nom) {
			this.Nom=Nom;
		}
		
		public void setPrenom(String Prenom) {
			this.Prenom=Prenom;
		}
		
		public void setTele(String tele) {
			this.tele=tele;
		}
		
		public void setEmail(String email) {
			this.email=email;
		}
		
		public void setPassword(String password) {
			this.password=password;
		}
		
	//Méthodes
		
		//Get Article By Id
    public static Collectionneur findBy(int value,String column,String table_name) {

           // $data = parent::findBy($value, $column, $table_name);
    		String data=null;
            if(data != null) {

            	Collectionneur coll = new Collectionneur();
            	coll.setID_col(value);
            	coll.setNom("");
            	coll.setPrenom("");
            	coll.setTele("");
            	coll.setEmail("");
            	coll.setPassword("");
                return coll;

            } else {
                return null;
            }

        }
}
