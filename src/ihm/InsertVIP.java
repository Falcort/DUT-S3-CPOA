/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import java.time.DateTimeException;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import tables.VIP;

/**
 *
 * @author EtiX42
 */
public class InsertVIP extends javax.swing.JDialog {

    private final VIP vip;
    private boolean etatSortie;
    
    
    public InsertVIP(java.awt.Frame parent, VIP vip) {
        super(parent, true);
        initComponents();
        this.vip = vip;
        this.setLocation(parent.getLocation());
        etatSortie = false;
    }
    
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
     
    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdd = new javax.swing.JButton();
        DateBirth = new javax.swing.JTextField();
        lbLName1 = new javax.swing.JLabel();
        lbCivility = new javax.swing.JLabel();
        PlaceOfBirth = new javax.swing.JTextField();
        lbPlaceOfBirth = new javax.swing.JLabel();
        jCodeStatus = new javax.swing.JComboBox<>();
        lbCodeStatus = new javax.swing.JLabel();
        jCodeRole = new javax.swing.JComboBox<>();
        lbCodeRole = new javax.swing.JLabel();
        jCivility = new javax.swing.JComboBox<>();
        Title = new javax.swing.JLabel();
        FName = new javax.swing.JTextField();
        LName = new javax.swing.JTextField();
        lbFName = new javax.swing.JLabel();
        lbLName = new javax.swing.JLabel();
        lbNationality = new javax.swing.JLabel();
        Nationality = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 460));
        setResizable(false);

        btnAdd.setText("ADD");
        btnAdd.setMaximumSize(new java.awt.Dimension(77, 25));
        btnAdd.setMinimumSize(new java.awt.Dimension(77, 25));
        btnAdd.setPreferredSize(new java.awt.Dimension(77, 25));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        DateBirth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DateBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateBirthActionPerformed(evt);
            }
        });

        lbLName1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbLName1.setText("Date of birth (DD/MM/YYYY)");

        lbCivility.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCivility.setText("Civility");

        PlaceOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceOfBirthActionPerformed(evt);
            }
        });

        lbPlaceOfBirth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbPlaceOfBirth.setText("Place of birth");

        jCodeStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Maried", "Free" }));
        jCodeStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodeStatusActionPerformed(evt);
            }
        });

        lbCodeStatus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCodeStatus.setText("Code Status");

        jCodeRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Actor", "Director", "Actor - Director", "None" }));
        jCodeRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCodeRoleActionPerformed(evt);
            }
        });

        lbCodeRole.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbCodeRole.setText("Code Role");

        jCivility.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr", "Mrs" }));
        jCivility.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCivilityActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Title.setText("Insert VIP");

        FName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FNameActionPerformed(evt);
            }
        });

        LName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LNameActionPerformed(evt);
            }
        });

        lbFName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbFName.setText("First name");

        lbLName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbLName.setText("Last name");

        lbNationality.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbNationality.setText("Nationality");

        Nationality.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NationalityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbCodeStatus)
                                    .addComponent(lbCivility)
                                    .addComponent(lbCodeRole)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbLName)
                                .addComponent(lbFName)
                                .addComponent(lbLName1)
                                .addComponent(lbPlaceOfBirth)
                                .addComponent(lbNationality)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PlaceOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCodeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCivility, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCodeRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Title)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Title)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFName)
                    .addComponent(FName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLName)
                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLName1)
                    .addComponent(DateBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlaceOfBirth)
                    .addComponent(PlaceOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNationality)
                    .addComponent(Nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCivility)
                    .addComponent(jCivility, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodeStatus)
                    .addComponent(jCodeStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCodeRole)
                    .addComponent(jCodeRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DateBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateBirthActionPerformed

    private void PlaceOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlaceOfBirthActionPerformed

    private void jCodeStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodeStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodeStatusActionPerformed

    private void jCodeRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCodeRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCodeRoleActionPerformed

    private void jCivilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCivilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCivilityActionPerformed

    private void FNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FNameActionPerformed

    private void LNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            //Insertion of first name
            String FirstName = FName.getText();
             if (FirstName.isEmpty()) {
                throw new Exception("Field first name empty");
            }
             vip.setFirstName(FirstName);
             
             //Insertion of last name
            String LastName = LName.getText();
             if (LastName.isEmpty()) {
                throw new Exception("Field last name empty");
            }
             vip.setLastName(LastName);
             
            // vérification empty or not date of birth
            String laDate = DateBirth.getText();
            if (laDate.isEmpty()) {
                throw new Exception("champ date vide");
            }
           //Insertion date of birth  
              String[] champsDate = laDate.split("/");
            try {
                LocalDate dateBirth = LocalDate.of(
                        Integer.parseInt(champsDate[2]),
                        Integer.parseInt(champsDate[1]),
                        Integer.parseInt(champsDate[0])
                );
                LocalDate aujourdhui = LocalDate.now();
                if (dateBirth.isAfter(aujourdhui)) {
                    throw new Exception("date embauche postérieure à date aujour'hui");
                }
                vip.setBornDate(dateBirth);
            } catch (DateTimeException | NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                throw new Exception("format de date incorrect");
            }
            
             //Insertion of place of birth
            String placeBirth = PlaceOfBirth.getText();
             if (placeBirth.isEmpty()) {
                throw new Exception("Fieldplace of birth empty");
            }
             vip.setWhereBorn(placeBirth);
             
             //Insertion nationality
            String nationality = Nationality.getText();
             if (nationality.isEmpty()) {
                throw new Exception("Fieldplace of nationality empty");
            }
             vip.setNationality(nationality);
             
             
            //Insertion civility
            String civ = (String) jCivility.getSelectedItem();
            vip.setCivilite(civ);
            
            //Insertion code statut
            String codeStat = (String) jCodeStatus.getSelectedItem();
            vip.setCodeStatus(codeStat);
            
            //Insertion code role
            String codeRole = (String) jCodeRole.getSelectedItem();
            vip.setCodeRole(codeRole);
            
            
            
            
            etatSortie = true;
            this.dispose();
       } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void NationalityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NationalityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NationalityActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateBirth;
    private javax.swing.JTextField FName;
    private javax.swing.JTextField LName;
    private javax.swing.JTextField Nationality;
    private javax.swing.JTextField PlaceOfBirth;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnAdd;
    private javax.swing.JComboBox<String> jCivility;
    private javax.swing.JComboBox<String> jCodeRole;
    private javax.swing.JComboBox<String> jCodeStatus;
    private javax.swing.JLabel lbCivility;
    private javax.swing.JLabel lbCodeRole;
    private javax.swing.JLabel lbCodeStatus;
    private javax.swing.JLabel lbFName;
    private javax.swing.JLabel lbLName;
    private javax.swing.JLabel lbLName1;
    private javax.swing.JLabel lbNationality;
    private javax.swing.JLabel lbPlaceOfBirth;
    // End of variables declaration//GEN-END:variables
}
