package Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
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

public class Vehicule_enVente_Interface extends javax.swing.JInternalFrame {
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
    ArrayList<Vehicule_en_vente> Veh = new ArrayList<>();

    
    public Vehicule_enVente_Interface() {
       
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
        	Veh=Venv.findAllVenv();
        	for(int i=0,j=0;i<Veh.size();i++,j++) {
        		  if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null) {
        			  Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix_vente(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
                      obj.addRow(row);
        		  }
        	

        	}

        } catch (Exception e) {
            System.out.println(e);
        }

    }
  
  public void clear() {
        try {
	        btndatedepV.setText("PopUp Date");
	        txtprix.setText("");
	        btndateVehVendu.setText("PopUp Date");
	        
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
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
    
        txtdateAch = new javax.swing.JTextField();
        
        txtprix = new javax.swing.JTextField();
        txtdatefab = new javax.swing.JTextField();
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
        btnenregistrer = new javax.swing.JButton();
        btnmodifier = new javax.swing.JButton();
        btnretirer = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        printbtn = new javax.swing.JButton();

        setBorder(null);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/de.png"))); 
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Information Véhicules :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 3, 12), java.awt.Color.black)); 
        jPanel1.setForeground(new java.awt.Color(0, 0, 204));

        
        jLabel10.setText("Date vente dep :");
        jLabel12.setText("Prix de vente:");   
       
        jLabel13.setText("Date veh vendu  :");
      
      
     
 
        
        btndatedepV = new JButton("PopUp Date");

        btndatedepV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btndatedepV.setText(new DatePicker(jPanel1).setPickedDate());
				
			}
		});
        
        btndateVehVendu = new JButton("PopUp Date");

        btndateVehVendu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				btndateVehVendu.setText(new DatePicker(jPanel1).setPickedDate());
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
        						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        							.addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
        							.addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
        								.addComponent(btndatedepV, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
        								.addComponent(txtprix)))

        /* jLabel13*/	.addGroup(jPanel1Layout.createSequentialGroup()
							.addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
							.addComponent(btndateVehVendu, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))

                    )
                .addGap(0, 28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btndatedepV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
   
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btndateVehVendu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))

                .addGap(250, 250, 250))
            
 
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(700, 450, 350, 125);
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
            		"Vehicule ID", "Date d'achat", "nombre de places", "Prix pour vendre", "Marque","Modele","Couleur","Date de fabrication","Description"
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
        /*Bouton modifier*/
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

        btnretirer.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        btnretirer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/file (1).png"))); 
        btnretirer.setText("Retirer");
        btnretirer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnretirer.setContentAreaFilled(false);
        btnretirer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnretirer.setOpaque(true);
        btnretirer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnretirerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnretirerMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnretirerMousePressed(evt);
            }
        });
        btnretirer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnretirerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(40,40,40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnretirer, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnenregistrer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnretirer, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnenregistrer, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnmodifier, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 440, 390, 130);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buy this one:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Verdana", 1, 12))); 

        printbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        printbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mtr_vente.png"))); 
        printbtn.setText("Acheter");
        printbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        printbtn.setContentAreaFilled(false);
        printbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printbtn.setOpaque(true);
        printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	acheterbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
            	acheterbtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
            	acheterbtnMousePressed(evt);
            }
        });
        printbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acheterbtnActionPerformed(evt);
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
        
    	btnretirer.setEnabled(true);
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
	         	Veh=Venv.findAllVenv();
	         	for(int i=0;i<Veh.size();i++) {
	               
	                if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null) {  
	                	Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
	        			  if(Veh.get(i).getCouleur().replaceAll("_", " ").toUpperCase().equals(couleurrecherche.getText().toUpperCase())) {
	  	         			obj.addRow(row);
	  	                }
	                  
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
	         	Veh=Venv.findAllVenv();
	         	for(int i=0;i<Veh.size();i++) {
	         		if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null){
	                	Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
	        			  if(Veh.get(i).getCouleur().replaceAll("_", " ").toUpperCase().equals(couleurrecherche.getText().toUpperCase())) {
	  	         			obj.addRow(row);
	  	         			
	  	         			}
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
	         	Veh=Venv.findAllVenv();
	         	for(int i=0;i<Veh.size();i++) {
	         		if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null) {
	         			
	                	Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
	        			  if(Veh.get(i).getCouleur().replaceAll("_", " ").toUpperCase().equals(couleurrecherche.getText().toUpperCase())) {
	  	         			obj.addRow(row);
	  	         			}
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
	         	Veh=Venv.findAllVenv();
	         	for(int i=0;i<Veh.size();i++) {
	         		if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null){
	         			
	                	Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
	        			  if(Veh.get(i).getCouleur().replaceAll("_", " ").toUpperCase().equals(couleurrecherche.getText().toUpperCase())) {
	  	         			obj.addRow(row);
	  	         			}
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
	         	Veh=Venv.findAllVenv();
	         	for(int i=0;i<Veh.size();i++) {
	                 if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null){
	                	 
	                	Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
	                	  if(Veh.get(i).getModele().replaceAll("_", " ").toUpperCase().equals(modelerecherche.getText().toUpperCase())) {
	  	         			obj.addRow(row);
	  	         			}
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
	         	Veh=Venv.findAllVenv();
	         	for(int i=0;i<Veh.size();i++) {
	                if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null) {
	                	
	                	Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
	                	if(Veh.get(i).getModele().replaceAll("_", " ").toUpperCase().equals(modelerecherche.getText().toUpperCase())){
	  	         			obj.addRow(row);
	  	         			}
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
	         	Veh=Venv.findAllVenv();
	         	for(int i=0;i<Veh.size();i++) {
	         		if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null) {
	         			
	                	Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
	                	if(Veh.get(i).getModele().replaceAll("_", " ").toUpperCase().equals(modelerecherche.getText().toUpperCase()))  {
	  	         			obj.addRow(row);
	  	         			}
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
	         	Veh=Venv.findAllVenv();
	         	for(int i=0;i<Veh.size();i++) {
	         		if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null) {
	         			
	                	Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
	                	if(Veh.get(i).getModele().replaceAll("_", " ").toUpperCase().equals(modelerecherche.getText().toUpperCase())){
	  	         			obj.addRow(row);
	  	         			}
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
	         	Veh=Venv.findAllVenv();
	         	for(int i=0;i<Veh.size();i++) {
	         		if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null)  {
	         			
	                	Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
	                	if(Veh.get(i).getMarque().replaceAll("_", " ").toUpperCase().equals(marquerecherche.getText().toUpperCase())) {
	  	         			obj.addRow(row);
	  	         			}
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
	         	Veh=Venv.findAllVenv();
	         	for(int i=0;i<Veh.size();i++) {
	         		if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null)  {
	         			
	                	Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
	                	if(Veh.get(i).getMarque().replaceAll("_", " ").toUpperCase().equals(marquerecherche.getText().toUpperCase())) {
	  	         			obj.addRow(row);
	  	         			}
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
	         	Veh=Venv.findAllVenv();
	         	for(int i=0;i<Veh.size();i++) {
	         		if(Venv.findVehvent(String.valueOf(Veh.get(i).getId_vehi()))!=null)  {
	         			
	                	Object row[]={Venv.getId_vehi(),Venv.getDate_achat(),Venv.getNb_places(),Venv.getPrix(),Venv.getMarque(),Venv.getModele(),Venv.getCouleur(),Venv.getDate_fabrication(),Venv.getDescription()};
	                	if(Veh.get(i).getMarque().replaceAll("_", " ").toUpperCase().equals(marquerecherche.getText().toUpperCase())) {
	  	         				obj.addRow(row);
	  	         			}
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
        
    	btnretirer.setEnabled(true);
    	btnmodifier.setEnabled(true);
        btnenregistrer.setEnabled(false);       
    }//GEN-LAST:event_formMouseClicked

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
     	if (!txtprix.getText().equals("") && !btndatedepV.getText().equals("PopUp Date") && !btndateVehVendu.getText().equals("PopUp Date") && !btndatedepV.getText().equals("") && !btndateVehVendu.getText().equals("")) {
            int  selection= Tablej.getSelectedRow();
           	Venv.setIdEnv( Veh.get(selection).getId_vehi());
           	Venv.setId_vehi( Veh.get(selection).getId_vehi());   		
           	Venv=Venv.findVehvent(String.valueOf(Veh.get(selection).getId_vehi()));
           	Venv.setPrix_vente(Float.parseFloat(txtprix.getText()));
        	Venv.setDate_dep_Vente(btndatedepV.getText().replace(" ", "_"));
        	Venv.setDate_vehu_Vendu(btndateVehVendu.getText().replace(" ", "_"));
           		
           	if(Venv.updVehenv()) {
              		JOptionPane.showMessageDialog(Tablej, "INFORMATION: Cette vehicule a été bien modifier !","INFORMATION",
          	    				JOptionPane.INFORMATION_MESSAGE);
            }else {
                    	JOptionPane.showMessageDialog(Tablej, "ERROR: Un erreur a été produit","WARNING",JOptionPane.ERROR_MESSAGE);

               }
            btnretirer.setEnabled(true);
        	btnmodifier.setEnabled(true);
            btnenregistrer.setEnabled(false);
           
     	}else {
     		JOptionPane.showMessageDialog(jPanel1, "Vous ne devez pas laisser une entrée vide","warning",
     				JOptionPane.WARNING_MESSAGE);
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
        	btnretirer.setEnabled(false);
            Venv.setId_vehi(Veh.get(selection).getId_vehi());
	         btndatedepV.setText(Veh.get(selection).getDate_dep_Vente());
	         txtprix.setText(String.valueOf(Veh.get(selection).getPrix_vente()));
	         btndateVehVendu.setText(Veh.get(selection).getDate_vehu_Vendu());    	         
	       
	       
        }else {
        	JOptionPane.showMessageDialog(Tablej, "WARNIG: Veuillez choisir une vehicule dans la table","WARNING",JOptionPane.WARNING_MESSAGE);
        }
      
        
    }//GEN-LAST:event_btnmodifierActionPerformed

    private void btnretirerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnretirerMouseEntered
        btnretirer.setBackground(new java.awt.Color(255,1,18));
    }//GEN-LAST:event_btnretirerMouseEntered

    private void btnretirerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnretirerMouseExited
        btnretirer.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_btnretirerMouseExited

    private void btnretirerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnretirerMousePressed
        btnretirer.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnretirerMousePressed

    private void btnretirerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnretirerActionPerformed
    	//Mettre une vehicule en service
   	 int  selection= Tablej.getSelectedRow();
       if(selection!=-1) {
	          
       	if (JOptionPane.showConfirmDialog(Tablej,"Est ce que voulez-vous vraiment retirer cette vehicule de la liste des ventes ?")==0) {
       		Venv.setIdEnv( Veh.get(selection).getId_vehi());
       		Venv.setId_vehi( Veh.get(selection).getId_vehi());   		
       		Venv=Venv.findVehvent(String.valueOf(Veh.get(selection).getId_vehi()));
       		
       		if(Venv.RetV()) {
           		JOptionPane.showMessageDialog(Tablej, "INFORMATION: Cette vehicule a été rendre en service !","INFORMATION",
      	    				JOptionPane.INFORMATION_MESSAGE);
           	}else {
                	JOptionPane.showMessageDialog(Tablej, "ERROR: Un erreur a été produit","WARNING",JOptionPane.ERROR_MESSAGE);

           	}
       	}else {
       		JOptionPane.showMessageDialog(Tablej, "INFORMATION: Cette vehicule n'a pas été retirer !","INFORMATION",
  	    				JOptionPane.INFORMATION_MESSAGE);
       	}
	         
       }else {
       	JOptionPane.showMessageDialog(Tablej, "WARNIG: Veuillez choisir une vehicule dans la table","WARNING",JOptionPane.WARNING_MESSAGE);
       	
       }
       if(Veh.size()>0) {
       	clear();
   	}
       Affichage();
    }//GEN-LAST:event_btnretirerActionPerformed

    private void acheterbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMouseEntered
        printbtn.setBackground(new java.awt.Color(0,153,153));
    }//GEN-LAST:event_printbtnMouseEntered

    private void acheterbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMouseExited
        printbtn.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_printbtnMouseExited

    private void acheterbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMousePressed
    	//acheter cette vehicule
    	 int  selection= Tablej.getSelectedRow();
         if(selection!=-1) {
  	          
         	if (JOptionPane.showConfirmDialog(Tablej,"Est ce que voulez-vous vraiment acheter cette vehicule ?")==0) {
         		Venv.setIdEnv( Veh.get(selection).getId_vehi());
         		Venv.setId_vehi( Veh.get(selection).getId_vehi());   		
         		Venv=Venv.findVehvent(String.valueOf(Veh.get(selection).getId_vehi()));
         		Venv.setDescription("Vendu");
         		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");  
            	LocalDateTime now = LocalDateTime.now();  
            	
         		Venv.setDate_vehu_Vendu(String.valueOf(dtf.format(now)));
         		if(Venv.updVehenv()) {
             		JOptionPane.showMessageDialog(Tablej, "INFORMATION: Félicitation vous avez acheté cette vehicule !","INFORMATION",
        	    				JOptionPane.INFORMATION_MESSAGE);
             	}else {
                  	JOptionPane.showMessageDialog(Tablej, "ERROR: Un erreur a été produit","WARNING",JOptionPane.ERROR_MESSAGE);

             	}
         	}else {
         		JOptionPane.showMessageDialog(Tablej, "INFORMATION: vous n'avez rien acheté !","INFORMATION",
    	    				JOptionPane.INFORMATION_MESSAGE);
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

    private void acheterbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbtnActionPerformed
    	
    }//GEN-LAST:event_printbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tablej;
    private javax.swing.JButton btnenregistrer;
    public javax.swing.JButton btnmodifier;
    private javax.swing.JButton btnretirer;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel10;
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

    private javax.swing.JTextField txtdateAch;
    private javax.swing.JTextField txtprix;
    private javax.swing.JTextField txtdatefab;

    private JButton btndatedepV;
    private JButton btndateVehVendu;
    private javax.swing.JTextField marquerecherche;
    private javax.swing.JTextField modelerecherche;
    private javax.swing.JTextField couleurrecherche;

    // End of variables declaration//GEN-END:variables
}
