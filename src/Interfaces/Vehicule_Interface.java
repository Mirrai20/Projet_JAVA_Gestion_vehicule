package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import Classes.Voiture;
import Classes.DatePicker;
import Classes.Vehicule;
import Classes.Deux_roux;
import Classes.Poids_lourd;
import Classes.Vehicule_en_vente;

public class Vehicule_Interface extends javax.swing.JInternalFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String test;
    public  String  etats;
    Vehicule ve=new Vehicule();
    Voiture vo=new Voiture();
    Deux_roux dr=new Deux_roux();
    Poids_lourd pl=new Poids_lourd();
    Vehicule_en_vente Venv= new Vehicule_en_vente();
    ArrayList<Vehicule> Veh = new ArrayList<>();
    
    public Vehicule_Interface() {
       
        initComponents();
         remove_title_bar();
        Affichage();
        ImageIcon img = new ImageIcon(getClass().getResource("/images/txt2.png"));
        txtbachground.setIcon(img);
       marquerecherche.setText("Taper Marque Véhicule");
       ImageIcon img2 = new ImageIcon(getClass().getResource("/images/txt2.png"));
        txtbackground1.setIcon(img2);
       modelerecherche.setText("Taper Modéle Véhicule"); 
       
       txtbackground2.setIcon(img2);
       couleurrecherche.setText("Taper Couleur Véhicule");
       
       buttonGroup1.add(RadioService);
       buttonGroup1.add(RadioEnvente);

    }
 void remove_title_bar(){
        putClientProperty("Vehicule.isPalette", Boolean.TRUE);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(null);
    }
  public void Affichage() {
        try {     
            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
            Tablej.setModel(obj);
        	Veh=ve.findAllVe();
        	for(int i=0;i<Veh.size();i++) {
        		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
                obj.addRow(row);

        	}

        } catch (Exception e) {
            System.out.println(e);
        }

    }
  
  public void clear() {
        try {
        	txtcouleur.setText("");
	        btndateAch.setText("PopUp Date");
	        txtnbplace.setText("");
	        txtprix.setText("");
	        btndateFab.setText("PopUp Date");
	        txtmarque.setText("");
	        txtmodele.setText("");
	        RadioService.setSelected(false);
	        RadioEnvente.setSelected(false);
	        c1.setSelectedIndex(0);
	        
	        Tablej.removeAll();
	    	DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	        Tablej.setModel(obj);
	      
	        for(int i=0;i<Veh.size();i++) {
	        	obj.removeRow(0);
	        }
	        
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        modelerecherche = new javax.swing.JTextField();
        txtbackground1 = new javax.swing.JLabel();
        couleurrecherche = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
    
        c1 = new javax.swing.JComboBox<>();
        
        txtmarque = new javax.swing.JTextField();
        txtmodele = new javax.swing.JTextField();
        txtdateAch = new javax.swing.JTextField();
        
        txtprix = new javax.swing.JTextField();
        txtnbplace = new javax.swing.JTextField();
        txtdatefab = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtcouleur = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtnumv = new javax.swing.JTextField();
        RadioService = new javax.swing.JRadioButton();
        RadioEnvente = new javax.swing.JRadioButton();
        marquerecherche = new javax.swing.JTextField();
        txtbachground = new javax.swing.JLabel();
        txtbackground2 = new javax.swing.JLabel();
  
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablej = new javax.swing.JTable(){
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int d , int c){
                return false;

            }
        };
        jPanel4 = new javax.swing.JPanel();
        btnnv = new javax.swing.JButton();
        btnenregistrer = new javax.swing.JButton();
        btnmodifier = new javax.swing.JButton();
        btnsupprimer = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        printbtn = new javax.swing.JButton();

        setBorder(null);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vv.png"))); 
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1366, 53);
        //Bare de recherche modele
        modelerecherche.setBackground(new java.awt.Color(240, 240, 240));
        modelerecherche.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        modelerecherche.setForeground(new java.awt.Color(51, 153, 255));
        modelerecherche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modelerecherche.setBorder(null);
        modelerecherche.setDoubleBuffered(true);
        modelerecherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modelerechercheMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modelerechercheMouseEntered(evt);
            }
        });
        modelerecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelerechercheActionPerformed(evt);
            }
        });
        modelerecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                modelerechercheKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                modelerechercheKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modelerechercheKeyTyped(evt);
            }
        });
        getContentPane().add(modelerecherche);
        modelerecherche.setBounds(312, 89, 213, 14);

        txtbackground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txt2.png"))); 
        getContentPane().add(txtbackground1);
        txtbackground1.setBounds(310, 80, 220, 30);
        
      //Bare de recherche couleur
        couleurrecherche.setBackground(new java.awt.Color(240, 240, 240));
        couleurrecherche.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        couleurrecherche.setForeground(new java.awt.Color(51, 153, 255));
        couleurrecherche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        couleurrecherche.setBorder(null);
        couleurrecherche.setDoubleBuffered(true);
        couleurrecherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	couleurrechercheMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	couleurrechercheMouseEntered(evt);
            }
        });
        couleurrecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	couleurrechercheActionPerformed(evt);
            }
        });
        couleurrecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
            	couleurrechercheKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
            	couleurrechercheKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
            	couleurrechercheKeyTyped(evt);
            }
        });
        getContentPane().add(couleurrecherche);
        couleurrecherche.setBounds(552, 89, 213, 14);

        
        txtbackground2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txt2.png"))); 
        getContentPane().add(txtbackground2);
        txtbackground2.setBounds(550, 80, 220, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/interface.png"))); 
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(230, 70, 70, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true), "Information Véhicules :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 3, 12), java.awt.Color.black)); 
        jPanel1.setForeground(new java.awt.Color(0, 0, 204));

        
        jLabel7.setText("Type de vehicule :");
        jLabel10.setText("Date d'achat :");
        jLabel11.setText("Nombre de places :");
        jLabel12.setText("Prix :");   
        jLabel3.setText("Marque :");
        jLabel5.setText("Modele :");
        jLabel1.setText("Couleur :");
        jLabel13.setText("Date de fabrication :");
        jLabel9.setText("Statut :");
        
        RadioService.setText("En Service");
        RadioService.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RadioServiceMouseReleased(evt);
            }
        });
        RadioService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioServiceActionPerformed(evt);
            }
        });

        RadioEnvente.setText("En Vente");
        RadioEnvente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RadioEnventeMouseClicked(evt);
            }
        });
        RadioEnvente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioEnventeActionPerformed(evt);
            }
        });

      
     // array of string containing choice
        String s1[] = { "Voiture", "Poid lourd", "Deux roux"};
 
        c1 = new JComboBox(s1);
 
   
 
        
        btndateAch = new JButton("PopUp Date");

        btndateAch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btndateAch.setText(new DatePicker(jPanel1).setPickedDate());
				
			}
		});
        
        btndateFab = new JButton("PopUp Date");

        btndateFab.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btndateFab.setText(new DatePicker(jPanel1).setPickedDate());
			}
		});
    
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                            .addComponent(txtcouleur, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        /* jLabel10*/   .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                            .addComponent(btndateAch, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        
        /* jLabel11*/	.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
        					.addComponent(txtnbplace, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        /* jLabel12*/	.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
        					.addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        /* jLabel13*/	.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
							.addComponent(btndateFab, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
 
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtmodele, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addComponent(txtmarque)))
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(RadioService)
                        .addGap(10,10, 10)
                        .addComponent(RadioEnvente))
                    .addComponent(jLabel7))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmarque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmodele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btndateAch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
 
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtnbplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btndateFab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcouleur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(RadioService)
                    .addComponent(RadioEnvente))
                .addGap(103, 103, 103))
            
 
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(700, 330, 350, 350);
        //Bare de rechercher marque
        marquerecherche.setBackground(new java.awt.Color(240, 240, 240));
        marquerecherche.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        marquerecherche.setForeground(new java.awt.Color(51, 153, 255));
        marquerecherche.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        marquerecherche.setBorder(null);
        marquerecherche.setDoubleBuffered(true);
        marquerecherche.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marquerechercheMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marquerechercheMouseEntered(evt);
            }
        });
        marquerecherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marquerechercheActionPerformed(evt);
            }
        });
        marquerecherche.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                marquerechercheKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                marquerechercheKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
              //  marquerechercheKeyTyped(evt);
            }
        });
        getContentPane().add(marquerecherche);
        marquerecherche.setBounds(4, 89, 213, 14);

        txtbachground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/txt2.png"))); 
        getContentPane().add(txtbachground);
        txtbachground.setBounds(0, 80, 220, 30);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)), "Liste des Véhicules :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 3, 12))); 

        Tablej.setFont(new java.awt.Font("Verdana", 1, 11)); 
        

        Tablej.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
            		"Vehicule ID", "Date d'achat", "nombre de places", "Prix", "Marque","Modele","Couleur","Date de fabrication","Statut"
            }
        ) {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true,true,true,true,true,true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tablej.setRowHeight(20);

        jScrollPane1.setViewportView(Tablej);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 120, 1150, 190);

      

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 51, 0)), "Action :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Verdana", 3, 12))); 

        btnnv.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        btnnv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file.png"))); 
        btnnv.setText("Nouveau");
        btnnv.setToolTipText("");
        btnnv.setAutoscrolls(true);
        btnnv.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnnv.setContentAreaFilled(false);
        btnnv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnnv.setOpaque(true);
        btnnv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnnvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnnvMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnnvMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnnvMouseReleased(evt);
            }
        });
        btnnv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnvActionPerformed(evt);
            }
        });

        btnenregistrer.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        btnenregistrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); 
        btnenregistrer.setText("Enregistrer");
        btnenregistrer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnenregistrer.setContentAreaFilled(false);
        btnenregistrer.setOpaque(true);
        btnenregistrer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnenregistrerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnenregistrerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnenregistrerMousePressed(evt);
            }
        });
        btnenregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenregistrerActionPerformed(evt);
            }
        });
        btnenregistrer.setEnabled(false);
        
        btnmodifier.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        btnmodifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file (2).png"))); 
        btnmodifier.setText("Modifier");
        btnmodifier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnmodifier.setContentAreaFilled(false);
        btnmodifier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmodifier.setOpaque(true);
        btnmodifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmodifierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmodifierMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnmodifierMousePressed(evt);
            }
            
        });
       
        btnmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifierActionPerformed(evt);
            }
        });

        btnsupprimer.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        btnsupprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file (1).png"))); 
        btnsupprimer.setText("Supprimer");
        btnsupprimer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnsupprimer.setContentAreaFilled(false);
        btnsupprimer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsupprimer.setOpaque(true);
        btnsupprimer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsupprimerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsupprimerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnsupprimerMousePressed(evt);
            }
        });
        btnsupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnsupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnnv, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnenregistrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnv, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnenregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnsupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 440, 390, 130);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mettre en vente :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Verdana", 1, 12))); 

        printbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        printbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mtr_vente.png"))); 
        printbtn.setText("Vendre");
        printbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        printbtn.setContentAreaFilled(false);
        printbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printbtn.setOpaque(true);
        printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	VentebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
            	VentebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	VentebtnMousePressed(evt);
            }
        });
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentebtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(printbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(printbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(400, 445, 140, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	if(Veh.size()>0) {
        	clear();
    	}	
    	Affichage();
    	
        ImageIcon img = new ImageIcon(getClass().getResource("/images/txt2.png"));
        txtbachground.setIcon(img);
        marquerecherche.setText("Taper Marque Véhicule");
        ImageIcon img2 = new ImageIcon(getClass().getResource("/images/txt2.png"));
        txtbackground1.setIcon(img2);
        modelerecherche.setText("Taper Modéle Véhicule");
        
        txtbackground2.setIcon(img2);
        couleurrecherche.setText("Taper Couleur Véhicule");
        
    	btnsupprimer.setEnabled(true);
        btnnv.setEnabled(true);
    	btnmodifier.setEnabled(true);
        btnenregistrer.setEnabled(false);
    }

    //gestion du text couleur
    private void couleurrechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelerechercheMouseClicked
    	if(Veh.size()>0) {
        	clear();
    	}
    	Affichage();
        ImageIcon img = new ImageIcon(getClass().getResource("/images/txt2.png"));
        txtbackground1.setIcon(img);
        modelerecherche.setText("Taper Modéle Véhicule");
        txtbachground.setIcon(img);
        marquerecherche.setText("Taper Marque Véhicule");
        ImageIcon img2 = new ImageIcon(getClass().getResource("/images/txt1.png"));
   
        
        txtbackground2.setIcon(img2);
        couleurrecherche.setText("");

    }

    private void couleurrechercheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelerechercheMouseEntered
    	
    }//GEN-LAST:event_modelerechercheMouseEntered

    private void couleurrechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelerechercheActionPerformed
    	if(!couleurrecherche.getText().equals("")) {
    	//	System.out.println("Je chercher : "+couleurrecherche.getText());
	    	if(Veh.size()>0) {
	        	clear();
	    	}
	    	System.out.println(Veh.size());
	    	try {     
	            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	            Tablej.setModel(obj);
	         	Veh=ve.findAllVe();
	         	for(int i=0;i<Veh.size();i++) {
	         		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
	                if(Veh.get(i).getCouleur().replaceAll("_", " ").toUpperCase().equals(couleurrecherche.getText().toUpperCase())) {
	         			obj.addRow(row);
	                }
	         	}
	
	         } catch (Exception e) {
	             System.out.println(e);
	         }
	    }else {
    		if(Veh.size()>0) {
	        	clear();
	    	}
    		Affichage();
    	}
        // TODO add your handling code here:
    }//GEN-LAST:event_modelerechercheActionPerformed

    private void couleurrechercheKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelerechercheKeyPressed
    	if(!couleurrecherche.getText().equals("")) {
	    	if(Veh.size()>0) {
	        	clear();
	    	}
	    	System.out.println(Veh.size());
	    	try {     
	            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	            Tablej.setModel(obj);
	         	Veh=ve.findAllVe();
	         	for(int i=0;i<Veh.size();i++) {
	         		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
	                if(Veh.get(i).getCouleur().replaceAll("_", " ").toUpperCase().equals(couleurrecherche.getText().toUpperCase())) {
	         			obj.addRow(row);
	                }
	         	}
	
	         } catch (Exception e) {
	             System.out.println(e);
	         }
	    }else {
    		if(Veh.size()>0) {
	        	clear();
	    	}
    		Affichage();
    	}
    }//GEN-LAST:event_modelerechercheKeyPressed

    private void couleurrechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelerechercheKeyReleased
    	if(!couleurrecherche.getText().equals("")) {
	    	if(Veh.size()>0) {
	        	clear();
	    	}
	    	System.out.println(Veh.size());
	    	try {     
	            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	            Tablej.setModel(obj);
	         	Veh=ve.findAllVe();
	         	for(int i=0;i<Veh.size();i++) {
	         		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
	                if(Veh.get(i).getCouleur().replaceAll("_", " ").toUpperCase().equals(couleurrecherche.getText().toUpperCase())) {
	         			obj.addRow(row);
	                }
	         	}
	
	         } catch (Exception e) {
	             System.out.println(e);
	         }
	    }else {
    		if(Veh.size()>0) {
	        	clear();
	    	}
    		Affichage();
    	}
    }//GEN-LAST:event_modelerechercheKeyReleased

    private void couleurrechercheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelerechercheKeyTyped
	    if(!couleurrecherche.getText().equals("")) {
    		System.out.println("Je chercher : "+couleurrecherche.getText());
	    	if(Veh.size()>0) {
	        	clear();
	    	}
	    	System.out.println(Veh.size());
	    	try {     
	            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	            Tablej.setModel(obj);
	         	Veh=ve.findAllVe();
	         	for(int i=0;i<Veh.size();i++) {
	         		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
	                if(Veh.get(i).getCouleur().replaceAll("_", " ").toUpperCase().equals(couleurrecherche.getText().toUpperCase())) {
	         			obj.addRow(row);
	                }
	         	}
	
	         } catch (Exception e) {
	             System.out.println(e);
	         }
	    }else {
    		if(Veh.size()>0) {
	        	clear();
	    	}
    		Affichage();
    	}
    }//GEN-LAST:event_modelerechercheKeyTyped

    //gestion du text modele
    private void modelerechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelerechercheMouseClicked
    	if(Veh.size()>0) {
        	clear();
    	}
    	Affichage();
        ImageIcon img2 = new ImageIcon(getClass().getResource("/images/txt1.png"));
        txtbackground1.setIcon(img2);
        modelerecherche.setText("");
        ImageIcon img = new ImageIcon(getClass().getResource("/images/txt2.png"));
        txtbachground.setIcon(img);
        marquerecherche.setText("Taper Marque Véhicule");
        
        txtbackground2.setIcon(img);
        couleurrecherche.setText("Taper Couleur Véhicule");

    }

    private void modelerechercheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modelerechercheMouseEntered
    	
    }//GEN-LAST:event_modelerechercheMouseEntered

    private void modelerechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelerechercheActionPerformed
    	if(!modelerecherche.getText().equals("")) {
    		System.out.println("Je chercher : "+modelerecherche.getText());
	    	if(Veh.size()>0) {
	        	clear();
	    	}
	    	System.out.println(Veh.size());
	    	try {     
	            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	            Tablej.setModel(obj);
	         	Veh=ve.findAllVe();
	         	for(int i=0;i<Veh.size();i++) {
	         		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
	                if(Veh.get(i).getModele().replaceAll("_", " ").toUpperCase().equals(modelerecherche.getText().toUpperCase())) {
	         			obj.addRow(row);
	                }
	         	}
	
	         } catch (Exception e) {
	             System.out.println(e);
	         }
	    }else {
    		if(Veh.size()>0) {
	        	clear();
	    	}
    		Affichage();
    	}
        // TODO add your handling code here:
    }//GEN-LAST:event_modelerechercheActionPerformed

    private void modelerechercheKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelerechercheKeyPressed
    	System.out.println("test8");
    	if(!modelerecherche.getText().equals("")) {
    		System.out.println("Je chercher : "+modelerecherche.getText());
	    	if(Veh.size()>0) {
	        	clear();
	    	}
	    	System.out.println(Veh.size());
	    	try {     
	            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	            Tablej.setModel(obj);
	         	Veh=ve.findAllVe();
	         	for(int i=0;i<Veh.size();i++) {
	         		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
	                if(Veh.get(i).getModele().replaceAll("_", " ").toUpperCase().equals(modelerecherche.getText().toUpperCase())) {
	         			obj.addRow(row);
	                }
	         	}
	
	         } catch (Exception e) {
	             System.out.println(e);
	         }
	    }else {
    		if(Veh.size()>0) {
	        	clear();
	    	}
    		Affichage();
    	}
    }//GEN-LAST:event_modelerechercheKeyPressed

    private void modelerechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelerechercheKeyReleased
    	System.out.println("test7");
    	if(!modelerecherche.getText().equals("")) {
    		System.out.println("Je chercher : "+modelerecherche.getText());
	    	if(Veh.size()>0) {
	        	clear();
	    	}
	    	System.out.println(Veh.size());
	    	try {     
	            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	            Tablej.setModel(obj);
	         	Veh=ve.findAllVe();
	         	for(int i=0;i<Veh.size();i++) {
	         		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
	                if(Veh.get(i).getModele().replaceAll("_", " ").toUpperCase().equals(modelerecherche.getText().toUpperCase())) {
	         			obj.addRow(row);
	                }
	         	}
	
	         } catch (Exception e) {
	             System.out.println(e);
	         }
	    }else {
    		if(Veh.size()>0) {
	        	clear();
	    	}
    		Affichage();
    	}
    }//GEN-LAST:event_modelerechercheKeyReleased

    private void modelerechercheKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modelerechercheKeyTyped
	    if(!modelerecherche.getText().equals("")) {
    		System.out.println("Je chercher : "+modelerecherche.getText());
	    	if(Veh.size()>0) {
	        	clear();
	    	}
	    	System.out.println(Veh.size());
	    	try {     
	            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	            Tablej.setModel(obj);
	         	Veh=ve.findAllVe();
	         	for(int i=0;i<Veh.size();i++) {
	         		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
	                if(Veh.get(i).getModele().replaceAll("_", " ").toUpperCase().equals(modelerecherche.getText().toUpperCase())) {
	         			obj.addRow(row);
	                }
	         	}
	
	         } catch (Exception e) {
	             System.out.println(e);
	         }
	    }else {
    		if(Veh.size()>0) {
	        	clear();
	    	}
    		Affichage();
    	}
    }//GEN-LAST:event_modelerechercheKeyTyped

    //gestion du text marque
    private void marquerechercheMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marquerechercheMouseClicked

        ImageIcon img = new ImageIcon(getClass().getResource("/images/txt1.png"));
        txtbachground.setIcon(img);
        marquerecherche.setText("");
        ImageIcon img2 = new ImageIcon(getClass().getResource("/images/txt2.png"));
        txtbackground1.setIcon(img2);
        modelerecherche.setText("Taper Modéle Véhicule");
        
        txtbackground2.setIcon(img2);
        couleurrecherche.setText("Taper Couleur Véhicule");

    }//GEN-LAST:event_marquerechercheMouseClicked

    private void marquerechercheMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marquerechercheMouseEntered
     
    }//GEN-LAST:event_marquerechercheMouseEntered

    private void marquerechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marquerechercheActionPerformed
    	if(!marquerecherche.getText().equals("")) {
	    	if(Veh.size()>0) {
	        	clear();
	    	}
	    	try {     
	            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	            Tablej.setModel(obj);
	         	Veh=ve.findAllVe();
	         	for(int i=0;i<Veh.size();i++) {
	         		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
	                if(Veh.get(i).getMarque().replaceAll("_", " ").toUpperCase().equals(marquerecherche.getText().toUpperCase())) {
	         			obj.addRow(row);
	                }
	         	}
	
	         } catch (Exception e) {
	             System.out.println(e);
	         }
    	}else {
    		if(Veh.size()>0) {
	        	clear();
	    	}
    		Affichage();
    	}
    }//GEN-LAST:event_marquerechercheActionPerformed

    private void marquerechercheKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marquerechercheKeyPressed
    	if(!marquerecherche.getText().equals("")) {
	    	if(Veh.size()>0) {
	        	clear();
	    	}
	    	try {     
	            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	            Tablej.setModel(obj);
	         	Veh=ve.findAllVe();
	         	for(int i=0;i<Veh.size();i++) {
	         		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
	                if(Veh.get(i).getMarque().replaceAll("_", " ").toUpperCase().equals(marquerecherche.getText().toUpperCase())) {
	         			obj.addRow(row);
	                }
	         	}
	
	         } catch (Exception e) {
	             System.out.println(e);
	         }
    	}else {
    		if(Veh.size()>0) {
	        	clear();
	    	}
    		Affichage();
    	}
    }//GEN-LAST:event_marquerechercheKeyPressed

    private void marquerechercheKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marquerechercheKeyReleased
    	if(!marquerecherche.getText().equals("")) {
	    	if(Veh.size()>0) {
	        	clear();
	    	}
	    	try {     
	            DefaultTableModel obj= (DefaultTableModel) Tablej.getModel();
	            Tablej.setModel(obj);
	         	Veh=ve.findAllVe();
	         	for(int i=0;i<Veh.size();i++) {
	         		Object row[]={Veh.get(i).getId_vehi(),Veh.get(i).getDate_achat(),Veh.get(i).getNb_places(),Veh.get(i).getPrix(),Veh.get(i).getMarque(),Veh.get(i).getModele(),Veh.get(i).getCouleur(),Veh.get(i).getDate_fabrication(),Veh.get(i).getStatut()};
	                if(Veh.get(i).getMarque().replaceAll("_", " ").toUpperCase().equals(marquerecherche.getText().toUpperCase())) {
	         			obj.addRow(row);
	                }
	         	}
	
	         } catch (Exception e) {
	             System.out.println(e);
	         }
    	}else {
    		if(Veh.size()>0) {
	        	clear();
	    	}
    		Affichage();
    	}
    }//GEN-LAST:event_marquerechercheKeyReleased

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
    	if(Veh.size()>0) {
        	clear();
    	}	
    	Affichage();
    	
        ImageIcon img = new ImageIcon(getClass().getResource("/images/txt2.png"));
        txtbachground.setIcon(img);
        marquerecherche.setText("Taper Marque Véhicule");
        ImageIcon img2 = new ImageIcon(getClass().getResource("/images/txt2.png"));
        txtbackground1.setIcon(img2);
        modelerecherche.setText("Taper Modéle Véhicule");
        
        txtbackground2.setIcon(img2);
        couleurrecherche.setText("Taper Couleur Véhicule");
        
    	btnsupprimer.setEnabled(true);
        btnnv.setEnabled(true);
    	btnmodifier.setEnabled(true);
        btnenregistrer.setEnabled(false);       
    }//GEN-LAST:event_formMouseClicked

    private void RadioEnventeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioEnventeActionPerformed
    	etats = "En service";
    }//GEN-LAST:event_RadioEnventeActionPerformed

    private void RadioServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioServiceActionPerformed
    	etats = "En vente";        // TODO add your handling code here:
    }//GEN-LAST:event_RadioServiceActionPerformed

    private void RadioServiceMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioServiceMouseReleased
    	etats = "En service";    // TODO add your handling code here:
    }//GEN-LAST:event_RadioServiceMouseReleased

    private void RadioEnventeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RadioEnventeMouseClicked
    	etats = "En vente";   // TODO add your handling code here:
    }//GEN-LAST:event_RadioEnventeMouseClicked

   
    private void btnnvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnvMouseEntered
        btnnv.setBackground(new java.awt.Color(32,242,4));
    }//GEN-LAST:event_btnnvMouseEntered

    private void btnnvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnvMouseExited
        btnnv.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_btnnvMouseExited

    private void btnnvMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnvMousePressed
        btnnv.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnnvMousePressed

    private void btnnvMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnvMouseReleased
    	if (!txtprix.getText().equals("") && !txtcouleur.getText().equals("")  && !txtmarque.getText().equals("") && !txtmodele.getText().equals("") && !btndateAch.getText().equals("PopUp Date") && !txtnbplace.getText().equals("") && !btndateFab.getText().equals("PopUp Date") && (RadioService.isSelected() || RadioEnvente.isSelected())) {
    	 
           String statut="";
           if (RadioService.isSelected()) {
        	   statut="En_service";
           }else {
        	   statut="En_vente";
           }
           String typeVe = (String) c1.getSelectedItem();
           typeVe=typeVe.replaceAll(" ", "_").toLowerCase();
           System.out.println(typeVe);
           // Voiture v=new Voiture(Veh.size()+1,btndateAch.getText(),Integer.parseInt(txtnbplace.getText()),statut,Float.parseFloat(txtprix.getText()),"image",txtcouleur.getText(),txtmodele.getText(),txtmarque.getText(),btndateFab.getText());
             
           try {
        	   boolean verifie=false;
        	   
        	     switch(typeVe) {
            		case "voiture":
            			Voiture v1=new Voiture(Veh.get(Veh.size()-1).getId_vehi()+1,btndateAch.getText(),Integer.parseInt(txtnbplace.getText().replaceAll(" ", "").toLowerCase()),statut,Float.parseFloat(txtprix.getText().replaceAll(" ", "").toLowerCase()),"image",txtcouleur.getText().replaceAll(" ", "_").toLowerCase(),txtmodele.getText().replaceAll(" ", "_").toLowerCase(),txtmarque.getText().replaceAll(" ", "_").toLowerCase(),btndateFab.getText());
            			verifie=v1.addV();
            			System.out.println(verifie);
            			break;
            		case "poid_lourd": 
            			Poids_lourd v2=new Poids_lourd(Veh.get(Veh.size()-1).getId_vehi()+1,btndateAch.getText(),Integer.parseInt(txtnbplace.getText().replaceAll(" ", "").toLowerCase()),statut,Float.parseFloat(txtprix.getText().replaceAll(" ", "").toLowerCase()),"image",txtcouleur.getText().replaceAll(" ", "_").toLowerCase(),txtmodele.getText().replaceAll(" ", "_").toLowerCase(),txtmarque.getText().replaceAll(" ", "_").toLowerCase(),btndateFab.getText());
            			verifie=v2.addV();
            			break;
            	
            		
            		case "deux_roux":
            			Deux_roux v3= new Deux_roux(Veh.get(Veh.size()-1).getId_vehi()+1,btndateAch.getText(),Integer.parseInt(txtnbplace.getText().replaceAll(" ", "").toLowerCase()),statut,Float.parseFloat(txtprix.getText().replaceAll(" ", "").toLowerCase()),"image",txtcouleur.getText().replaceAll(" ", "_").toLowerCase(),txtmodele.getText().replaceAll(" ", "_").toLowerCase(),txtmarque.getText().replaceAll(" ", "_").toLowerCase(),btndateFab.getText());
            			verifie=v3.addV();
            			break;
        	     }
                
        	   if(verifie) {
            	   System.out.println(typeVe+" "+txtprix.getText()+" "+txtcouleur.getText()+" "+txtmarque.getText()+" "+txtmodele.getText()+" "+btndateAch.getText()+" "+txtnbplace.getText()+" "+btndateFab.getText()+" "+c1.getSelectedItem()+" "+statut);
                   JOptionPane.showMessageDialog(jPanel1, "Une nouvelle vehicule a été ajouté");
               }else {
            	   JOptionPane.showMessageDialog(jPanel1, "ERREUR, on a pas pu stocker cette vehicule","ERROR",
           				JOptionPane.ERROR_MESSAGE);
               } 
           }catch (Exception e) {
               System.out.println(e);
           }
           
          
    	}else {
    		JOptionPane.showMessageDialog(jPanel1, "Vous devez remplir tous les entrées avant","warning",
    				JOptionPane.WARNING_MESSAGE);
    		 System.out.println(RadioService.isSelected() +" :::::  "+ RadioEnvente.isSelected());
    	}
    
    	clear();    	
    	Affichage();
    }//GEN-LAST:event_btnnvMouseReleased

    private void btnnvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnvActionPerformed

    }//GEN-LAST:event_btnnvActionPerformed

    private void btnenregistrerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnenregistrerMouseEntered
        btnenregistrer.setBackground(new java.awt.Color(0,218,170));
    }//GEN-LAST:event_btnenregistrerMouseEntered

    private void btnenregistrerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnenregistrerMouseExited
        btnenregistrer.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_btnenregistrerMouseExited

    private void btnenregistrerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnenregistrerMousePressed
        btnenregistrer.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnenregistrerMousePressed

    private void btnenregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenregistrerActionPerformed
  
    	if (!txtprix.getText().equals("") && !txtcouleur.getText().equals("")  && !txtmarque.getText().equals("") && !txtmodele.getText().equals("") && !btndateAch.getText().equals("PopUp Date") && !txtnbplace.getText().equals("") && !btndateFab.getText().equals("PopUp Date") && (RadioService.isSelected() || RadioEnvente.isSelected())) {

            String statut="";
            if (RadioService.isSelected()) {
         	   statut="En_service";
            }else {
         	   statut="En_vente";
            }
            String typeVe = (String) c1.getSelectedItem();
            typeVe=typeVe.replaceAll(" ", "_").toLowerCase();
            System.out.println(typeVe);
            // Voiture v=new Voiture(Veh.size()+1,btndateAch.getText(),Integer.parseInt(txtnbplace.getText()),statut,Float.parseFloat(txtprix.getText()),"image",txtcouleur.getText(),txtmodele.getText(),txtmarque.getText(),btndateFab.getText());
              
            try {
         	   boolean verifie=false;
         	   
         	     switch(typeVe) {
             		case "voiture":
             			Voiture v1=new Voiture(ve.getId_vehi(),btndateAch.getText(),Integer.parseInt(txtnbplace.getText().replaceAll(" ", "").toLowerCase()),statut,Float.parseFloat(txtprix.getText().replaceAll(" ", "").toLowerCase()),"image",txtcouleur.getText().replaceAll(" ", "_").toLowerCase(),txtmodele.getText().replaceAll(" ", "_").toLowerCase(),txtmarque.getText().replaceAll(" ", "_").toLowerCase(),btndateFab.getText());
             			verifie=v1.updVeh();
             			System.out.println(verifie);
             			break;
             		case "poid_lourd": 
             			Poids_lourd v2=new Poids_lourd(ve.getId_vehi(),btndateAch.getText(),Integer.parseInt(txtnbplace.getText().replaceAll(" ", "").toLowerCase()),statut,Float.parseFloat(txtprix.getText().replaceAll(" ", "").toLowerCase()),"image",txtcouleur.getText().replaceAll(" ", "_").toLowerCase(),txtmodele.getText().replaceAll(" ", "_").toLowerCase(),txtmarque.getText().replaceAll(" ", "_").toLowerCase(),btndateFab.getText());
             			verifie=v2.updVeh();
             			break;
             	
             		
             		case "deux_roux":
             			Deux_roux v3= new Deux_roux(ve.getId_vehi(),btndateAch.getText(),Integer.parseInt(txtnbplace.getText().replaceAll(" ", "").toLowerCase()),statut,Float.parseFloat(txtprix.getText().replaceAll(" ", "").toLowerCase()),"image",txtcouleur.getText().replaceAll(" ", "_").toLowerCase(),txtmodele.getText().replaceAll(" ", "_").toLowerCase(),txtmarque.getText().replaceAll(" ", "_").toLowerCase(),btndateFab.getText());
             			verifie=v3.updVeh();
             			break;
         	     }
                 
         	   if(verifie) {
             	   System.out.println(typeVe+" "+txtprix.getText()+" "+txtcouleur.getText()+" "+txtmarque.getText()+" "+txtmodele.getText()+" "+btndateAch.getText()+" "+txtnbplace.getText()+" "+btndateFab.getText()+" "+c1.getSelectedItem()+" "+statut);
                    JOptionPane.showMessageDialog(jPanel1, "La vehicule a été bien modifier");
                    
                }else {
             	   JOptionPane.showMessageDialog(jPanel1, "ERREUR, on a pas pu modifier cette vehicule","ERROR",
            				JOptionPane.ERROR_MESSAGE);
                } 
            }catch (Exception e) {
                System.out.println(e);
            }
            btnsupprimer.setEnabled(true);
            btnnv.setEnabled(true);
        	btnmodifier.setEnabled(true);
            btnenregistrer.setEnabled(false);
           
     	}else {
     		JOptionPane.showMessageDialog(jPanel1, "Vous ne devez pas laisser une entrée vide","warning",
     				JOptionPane.WARNING_MESSAGE);
     		 System.out.println(RadioService.isSelected() +" :::::  "+ RadioEnvente.isSelected());
     	}
    	if(Veh.size()>0) {
        	clear();
    	}    	
    	Affichage();
    }//GEN-LAST:event_btnenregistrerActionPerformed

    private void btnmodifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodifierMouseEntered
        btnmodifier.setBackground(new java.awt.Color(188,1,255));
    }//GEN-LAST:event_btnmodifierMouseEntered

    private void btnmodifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodifierMouseExited
        btnmodifier.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_btnmodifierMouseExited

    private void btnmodifierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodifierMousePressed
        btnmodifier.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnmodifierMousePressed

    private void btnmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifierActionPerformed
    	
        int  selection= Tablej.getSelectedRow();
        if(selection!=-1) {
        	 btnenregistrer.setEnabled(true);
        	btnsupprimer.setEnabled(false);
            btnnv.setEnabled(false);
	       //  System.out.println("row selectionné : "+Veh.get(selection).getId_vehi()+" "+Veh.get(selection).getMarque() );
            ve.setId_vehi(Veh.get(selection).getId_vehi());
	         txtcouleur.setText(Veh.get(selection).getCouleur());
	         btndateAch.setText(Veh.get(selection).getDate_achat());
	         txtnbplace.setText(String.valueOf(Veh.get(selection).getNb_places()) );
	         txtprix.setText(String.valueOf(Veh.get(selection).getPrix()));
	         btndateFab.setText(Veh.get(selection).getDate_fabrication());
	         txtmarque.setText(Veh.get(selection).getMarque());
	         txtmodele.setText(Veh.get(selection).getModele());
	     
	         
	         if(vo.findVoby(String.valueOf(Veh.get(selection).getId_vehi()))!=null) {
	        	 Veh.get(selection).setTypeveh("voiture");
	         }else {
	        	 if(dr.findDRby(String.valueOf(Veh.get(selection).getId_vehi()))!=null) {
	        		 Veh.get(selection).setTypeveh("Deux_roux");
	        	 }else {
	        		 if(pl.findPLby(String.valueOf(Veh.get(selection).getId_vehi()))!=null) {
	        			 Veh.get(selection).setTypeveh("Poids_lourd");
	        		 }
	        	 }
	         }
	         
	         System.out.println(Veh.get(selection).getTypeveh());
	         
	         switch(Veh.get(selection).getTypeveh()) {  
	         
	         	case"voiture":c1.setSelectedIndex(0);break;
	         	case"Poids_lourd":c1.setSelectedIndex(1);break;
	         	case"Deux_roux":c1.setSelectedIndex(2);break;
	         	default:JOptionPane.showMessageDialog(jPanel1, "ERROR: on n'a pas pu recupérer les informations de cette vehicule","ERROR",
	    				JOptionPane.ERROR_MESSAGE);break;
	
	         	
	         }
	         c1.setEnabled(false);
	         
	         switch(Veh.get(selection).getStatut()) {
	         	case  "En_service":
	         			RadioService.setSelected(true);RadioEnvente.setSelected(false);
	         			break;
	         	case "En_vente":
	         			RadioEnvente.setSelected(true);RadioService.setSelected(false);
	         			break;
	         }
	         RadioService.setEnabled(false);
	         RadioEnvente.setEnabled(false);
        }else {
        	JOptionPane.showMessageDialog(Tablej, "WARNIG: Veuillez choisir une vehicule dans la table","WARNING",JOptionPane.WARNING_MESSAGE);
        }
      
        
    }//GEN-LAST:event_btnmodifierActionPerformed

    private void btnsupprimerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsupprimerMouseEntered
        btnsupprimer.setBackground(new java.awt.Color(255,1,18));
    }//GEN-LAST:event_btnsupprimerMouseEntered

    private void btnsupprimerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsupprimerMouseExited
        btnsupprimer.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_btnsupprimerMouseExited

    private void btnsupprimerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsupprimerMousePressed
        btnsupprimer.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnsupprimerMousePressed

    private void btnsupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsupprimerActionPerformed
    	//Supprimer la vehicule
     	 int  selection= Tablej.getSelectedRow();
         if(selection!=-1) {
	        

        	 if(JOptionPane.showConfirmDialog(Tablej,"Est ce que voulez-vous vraiment supprimer cette vehicule ?")==0) {
        		boolean verifie=false;
        		if(vo.findVoby(String.valueOf(Veh.get(selection).getId_vehi()))!=null) {
        			verifie=vo.DelV();
        		}else {
        	         if(dr.findDRby(String.valueOf(Veh.get(selection).getId_vehi()))!=null) {
        	        	 verifie=dr.DelV();
        	         }else {
        	        	if(pl.findPLby(String.valueOf(Veh.get(selection).getId_vehi()))!=null) {
        	        		verifie=pl.DelV();
        	        	  }
        	        	 }
        	       }
        		System.out.println(verifie);
        	    if(verifie) {
        		 JOptionPane.showMessageDialog(Tablej, "INFORMATION: Cette vehicule a été supprimer avec succès !","INFORMATION",
   	    				JOptionPane.INFORMATION_MESSAGE);
        	    }else {
                 	JOptionPane.showMessageDialog(Tablej, "ERROR: Un erreur a été produit","WARNING",JOptionPane.ERROR_MESSAGE);
        	    }
        	 
        	 }else {
        		 JOptionPane.showMessageDialog(Tablej, "INFORMATION: Aucune vehicule n'a été supprimer !","INFORMATION",
  	    				JOptionPane.INFORMATION_MESSAGE);
  	    		}
   
 	         
         }else {
         	JOptionPane.showMessageDialog(Tablej, "WARNIG: Veuillez choisir une vehicule dans la table","WARNING",JOptionPane.WARNING_MESSAGE);
         }
         if(Veh.size()>0) {
         	clear();
     	}
         Affichage();
    }//GEN-LAST:event_btnsupprimerActionPerformed

    private void VentebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMouseEntered
        printbtn.setBackground(new java.awt.Color(0,153,153));
    }//GEN-LAST:event_printbtnMouseEntered

    private void VentebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMouseExited
        printbtn.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_printbtnMouseExited

    private void VentebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMousePressed
    	//Mettre une vehicule en vente
    	 int  selection= Tablej.getSelectedRow();
        if(selection!=-1) {
	        
        	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
        	LocalDateTime now = LocalDateTime.now();  
        	//System.out.println(dtf.format(now)); 
        	Venv.findVeBy(String.valueOf(Veh.get(selection).getId_vehi()));
        	Venv.setIdEnv(Veh.get(selection).getId_vehi());
        	Venv.setDate_dep_Vente(String.valueOf(dtf.format(now)));
        	Venv.setDate_vehu_Vendu("Pas_encore");
        	Venv.setDescription("encours");
        	Venv.setStatut("En_vente");
        	// Get the user's name.
            String prixdevente = JOptionPane.showInputDialog("Merci d'entrer votre prix pour vente :");
            
        	Venv.setPrix_vente(Integer.parseInt(prixdevente));

        	if(Venv.VenteVeh()) {
        		JOptionPane.showMessageDialog(Tablej, "INFORMATION: Cette vehicule a été parmi les vehicules en vente !","INFORMATION",
   	    				JOptionPane.INFORMATION_MESSAGE);
        	}else {
             	JOptionPane.showMessageDialog(Tablej, "ERROR: Un erreur a été produit","WARNING",JOptionPane.ERROR_MESSAGE);

        	}
	         
        }else {
        	JOptionPane.showMessageDialog(Tablej, "WARNIG: Veuillez choisir une vehicule dans la table","WARNING",JOptionPane.WARNING_MESSAGE);
        	
        }
        if(Veh.size()>0) {
        	clear();
    	}
        Affichage();
        printbtn.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_printbtnMousePressed

    private void VentebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
    	
    }//GEN-LAST:event_printbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadioEnvente;
    private javax.swing.JRadioButton RadioService;
    private javax.swing.JTable Tablej;
    private javax.swing.JButton btnenregistrer;
    public javax.swing.JButton btnmodifier;
    private javax.swing.JButton btnnv;
    private javax.swing.JButton btnsupprimer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printbtn;
    private javax.swing.JLabel txtbachground;
    private javax.swing.JLabel txtbackground1;
    private javax.swing.JLabel txtbackground2;

    private javax.swing.JTextField txtcouleur;
    private javax.swing.JTextField txtmarque;
    private javax.swing.JTextField txtmodele;
    private javax.swing.JTextField txtdateAch;
    private javax.swing.JTextField txtnbplace;
    private javax.swing.JTextField txtprix;
    private javax.swing.JTextField txtdatefab;
    private javax.swing.JTextField txtdesc;

    private javax.swing.JComboBox c1;
    private JButton btndateAch;
    private JButton btndateFab;
    private javax.swing.JTextField txtnumv;
    private javax.swing.JTextField marquerecherche;
    private javax.swing.JTextField modelerecherche;
    private javax.swing.JTextField couleurrecherche;

    // End of variables declaration//GEN-END:variables
}
