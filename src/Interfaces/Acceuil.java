package Interfaces;

import java.beans.PropertyVetoException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Acceuil extends javax.swing.JFrame {

    public Acceuil() {
        initComponents();
        datecourante() ;
        this.setIconImage(new ImageIcon(getClass().getResource("/images/logocar.png")).getImage());
    }
    public void datecourante() {
        Thread clock = new Thread() {
            public void run() {
                for (;;) {
                    Calendar Cal = new GregorianCalendar();

                    int sconde = Cal.get(Calendar.SECOND);
                    int minute = Cal.get(Calendar.MINUTE);
                    int heure = Cal.get(Calendar.HOUR);
                    int AM_PM = Cal.get(Calendar.AM_PM);  
                    String pa;
                    if(AM_PM==1){
                        pa="PM";
                    }else{
                        pa="AM";
                    }
                    
                         
                    labDate.setText( + heure + ":" + (minute) + ":" + sconde +" "+pa  );
                    
                 int mois = Cal.get(Calendar.MONTH);
                    int annee = Cal.get(Calendar.YEAR);
                    int jour = Cal.get(Calendar.DAY_OF_MONTH);

                    labdate2.setText( + jour + "/" + (mois+1) + "/" + annee);              
                    
                    
                    try {
                        sleep(1000);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(Calendar.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }

        };
        
        clock.start();
    }
    
   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        labDate = new javax.swing.JLabel();
        labdate2 = new javax.swing.JLabel();
        logomax = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menublanc = new javax.swing.JLabel();
        menublue = new javax.swing.JLabel();
        desk = new javax.swing.JDesktopPane();
        type = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lnom = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
      
        vehVentBtn = new javax.swing.JButton();
        vehiculebtn = new javax.swing.JButton();
        
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1024, 380));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        labDate.setFont(new java.awt.Font("DS-Digital", 1, 24)); 
        labDate.setForeground(new java.awt.Color(255, 255, 255));
        labDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labDate.setText("10:15:30 PM");
        getContentPane().add(labDate);
        labDate.setBounds(570, 30, 180, 30);

       

        labdate2.setFont(new java.awt.Font("FreeSerif", 0, 14)); 
        labdate2.setForeground(new java.awt.Color(255, 255, 255));
        labdate2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labdate2.setText("12/02/2016");
        getContentPane().add(labdate2);
        labdate2.setBounds(730, 30, 140, 30);

        logomax.setFont(new java.awt.Font("Trajan Pro 3", 1, 24)); 
        logomax.setForeground(new java.awt.Color(0, 0, 153));
        logomax.setText("EL BAROUDI Marouane - IATIC3 : Mini Projet JAVA");
        getContentPane().add(logomax);
        logomax.setBounds(10, 0, 800, 20);

        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Gestion de collection");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(10, 20, 140, 10);

        menublanc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); 
        getContentPane().add(menublanc);
        menublanc.setBounds(0, 0, 1370, 30);

        menublue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu2.png"))); 
        getContentPane().add(menublue);
        menublue.setBounds(0, 30, 1370, 30);

        desk.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1010, Short.MAX_VALUE)
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(desk);
        desk.setBounds(190, 90, 1810, 620);

        type.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        type.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(type);
        type.setBounds(520, 70, 140, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); 
        jLabel1.setText(":");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(660, 70, 10, 17);

        lnom.setFont(new java.awt.Font("Tahoma", 1, 11)); 
        lnom.setForeground(new java.awt.Color(0, 0, 204));
        getContentPane().add(lnom);
        lnom.setBounds(670, 70, 320, 20);

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Times New Roman", 3, 18))); 

        vehVentBtn.setBackground(new java.awt.Color(225, 225, 225));
        vehVentBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); 
        vehVentBtn.setForeground(new java.awt.Color(0, 0, 0));
        vehVentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Mtr_vente.png"))); 
        vehVentBtn.setText("Vehicule en vente");
        vehVentBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 1, new java.awt.Color(51, 153, 0)));
        vehVentBtn.setContentAreaFilled(false);
        vehVentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vehVentBtn.setOpaque(true);
        vehVentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
            	vehVentBtnMouseReleased(evt);
            }
        });
        vehVentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehenventebtnActionPerformed(evt);
            }
        });

        vehiculebtn.setBackground(new java.awt.Color(255,153,0));
        vehiculebtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        vehiculebtn.setForeground(new java.awt.Color(0, 0, 0));
        vehiculebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car.png"))); 
        vehiculebtn.setText("Vehicule");
        vehiculebtn.setToolTipText("");
        vehiculebtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 1, new java.awt.Color(204, 102, 0)));
        vehiculebtn.setContentAreaFilled(false);
        vehiculebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vehiculebtn.setOpaque(true);
        vehiculebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                vehiculebtnMouseReleased(evt);
            }
        });
        vehiculebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehiculebtnActionPerformed(evt);
            }
        });
     
        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vehiculebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehVentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vehiculebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(vehVentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jDesktopPane1.setLayer(vehVentBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(vehiculebtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(10, 240, 164, 125);

        setSize(new java.awt.Dimension(1382, 759));
        setLocationRelativeTo(null);
        
       
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    	Vehicule_Interface ex = new Vehicule_Interface();
        this.desk.add(ex);
        try {
            ex.setMaximum(true);
        } catch (PropertyVetoException ex1) {
            Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex1);
        }
        ex.show();
        //
    }


    private void vehiculebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehiculebtnActionPerformed
       this.desk.removeAll();
        this.desk.repaint();
        
        Vehicule_Interface ex = new Vehicule_Interface();
        this.desk.add(ex);
        try {
            ex.setMaximum(true);
        } catch (PropertyVetoException ex1) {
            Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex1);
        }
        ex.show();
    }

    private void vehenventebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehenventebtnActionPerformed
         this.desk.removeAll();
        this.desk.repaint();
        
        Vehicule_enVente_Interface ex = new Vehicule_enVente_Interface();
        this.desk.add(ex);
        try {
            ex.setMaximum(true);
        } catch (PropertyVetoException ex1) {
            Logger.getLogger(Acceuil.class.getName()).log(Level.SEVERE, null, ex1);
        }
        ex.show();
    }

    private void vehiculebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehiculebtnMouseReleased
       vehiculebtn.setBackground(new java.awt.Color(255,153,0));
       vehVentBtn.setBackground(new java.awt.Color(225,225,225));
    }

    private void vehVentBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehenventebtnMouseReleased
       vehiculebtn.setBackground(new java.awt.Color(225,225,225));
       vehVentBtn.setBackground(new java.awt.Color(51,204,0));
    }
    
    public static void main(String args[]) {
    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton vehVentBtn;
    private javax.swing.JDesktopPane desk;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labDate;
    private javax.swing.JLabel labdate2;
    private javax.swing.JLabel lnom;
    private javax.swing.JLabel logomax;
    private javax.swing.JLabel menublanc;
    private javax.swing.JLabel menublue;
    private javax.swing.JLabel type;
    private javax.swing.JButton vehiculebtn;
    
    
    // End of variables declaration//GEN-END:variables
}
