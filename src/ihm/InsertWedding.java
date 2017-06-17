package ihm;

import application.Main;
import database.DaoFunction;
import database.DaoWedding;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import metier.Wedding;

public class InsertWedding extends javax.swing.JDialog {

    private final Wedding wedding;
    private boolean etatSortie;
    private DaoFunction daoFunction;

    public InsertWedding(java.awt.Frame parent, Wedding wedding) {
        super(parent, true);
        initComponents();
        this.wedding = wedding;
        this.setLocation(parent.getLocation());
        etatSortie = false;
        this.daoFunction = Main.getDaoFunction();
        add.setEnabled(true);
        update.setEnabled(false);
        DateDivorce.setEnabled(false);
    }

    public InsertWedding(java.awt.Frame parent, Wedding wedding, String numVIP1, String dateWedding, String numVIP2, String placeWedding, String dateDivorce) {
        super(parent, true);
        initComponents();
        this.setLocation(parent.getLocation());
        etatSortie = false;
        this.wedding = wedding;

        NumVIP1.setText(numVIP1 + "");
        NumVIP1.setEnabled(false);
        DateWedding.setText(dateWedding + "");
        DateWedding.setEnabled(false);
        NumVIP2.setText(numVIP2 + "");
        NumVIP2.setEnabled(false);
        PlaceWedding.setText(placeWedding + "");
        PlaceWedding.setEnabled(false);
        this.daoFunction = Main.getDaoFunction();
        add.setEnabled(false);
        update.setEnabled(true);
    }

    public boolean doModal() {
        setVisible(true);
        return etatSortie;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        lbVIP1 = new javax.swing.JLabel();
        lbDateWedding = new javax.swing.JLabel();
        lbVIP2 = new javax.swing.JLabel();
        lbPlaceWedding = new javax.swing.JLabel();
        lbDateDivorce = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        DateDivorce = new javax.swing.JTextField();
        DateWedding = new javax.swing.JTextField();
        NumVIP1 = new javax.swing.JTextField();
        PlaceWedding = new javax.swing.JTextField();
        NumVIP2 = new javax.swing.JTextField();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 485));
        setResizable(false);

        title.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        title.setText("Insert Wedding / Divorce");

        lbVIP1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbVIP1.setText("VIP1");

        lbDateWedding.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDateWedding.setText("Date of Wedding (DD/MM/AAAA)");

        lbVIP2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbVIP2.setText("VIP2");

        lbPlaceWedding.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbPlaceWedding.setText("Place of Wedding");

        lbDateDivorce.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbDateDivorce.setText("Date of Divorce (DD/MM/AAAA)");

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        NumVIP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumVIP1ActionPerformed(evt);
            }
        });

        PlaceWedding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlaceWeddingActionPerformed(evt);
            }
        });

        NumVIP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumVIP2ActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(title)
                        .addGap(0, 146, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbVIP1)
                                        .addComponent(lbDateWedding)
                                        .addComponent(lbVIP2))
                                    .addComponent(lbDateDivorce, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbPlaceWedding, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DateWedding)
                                    .addComponent(NumVIP1)
                                    .addComponent(PlaceWedding)
                                    .addComponent(NumVIP2)
                                    .addComponent(DateDivorce)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(title)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumVIP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVIP1))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbDateWedding)
                    .addComponent(DateWedding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVIP2)
                    .addComponent(NumVIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPlaceWedding)
                    .addComponent(PlaceWedding, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDateDivorce)
                    .addComponent(DateDivorce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlaceWeddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlaceWeddingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PlaceWeddingActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try {
            //Insertion of numVIP1
            int numVip1 = Integer.parseInt(NumVIP1.getText());
            String VIP1Helper = NumVIP1.getText();
            if (VIP1Helper.isEmpty()) {
                throw new Exception("VIP1 field is empty");
            }
            String etatVIP1 = daoFunction.verifyCodeStatus(numVip1);
            if (!etatVIP1.equals("Free")) {
                throw new Exception("VIP 1 is married");
            }
            wedding.setNumVIP1(numVip1);

            // vérification empty or not date of release
            String dateWedding = DateWedding.getText();
            if (dateWedding.isEmpty()) {
                throw new Exception("Date field is empty");
            }
            //Insertion date of wedding  
            String[] champsDate = dateWedding.split("/");
            try {
                LocalDate dateOut = LocalDate.of(
                        Integer.parseInt(champsDate[2]),
                        Integer.parseInt(champsDate[1]),
                        Integer.parseInt(champsDate[0])
                );
                LocalDate aujourdhui = LocalDate.now();
                if (dateOut.isAfter(aujourdhui)) {
                    throw new Exception("Wedding date is incorrect");
                }
                wedding.setWeddingDate(dateOut);
            } catch (DateTimeException | NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                throw new Exception("Date format is incorrect");
            }

            //Insertion of numVIP2
            int numVip2 = Integer.parseInt(NumVIP2.getText());
            String VIP2Helper = NumVIP2.getText();
            if (VIP2Helper.isEmpty()) {
                throw new Exception("Field vip1 empty");
            }
            String etatVIP2 = daoFunction.verifyCodeStatus(numVip2);
            if (!etatVIP2.equals("Free")) {
                throw new Exception("VIP 2 is married");
            }
            wedding.setNumVIP2(numVip2);

            //Insertion place of wedding
            String placeWedding = PlaceWedding.getText();
            if (placeWedding.isEmpty()) {
                throw new Exception("Field title empty");
            }
            wedding.setPlaceWedding(placeWedding);

            // vérification empty or not date of divorce
            String dateDivorce;
            dateDivorce = DateDivorce.getText();
            if (dateDivorce.isEmpty()) {
                wedding.setDivorceDate(LocalDate.parse("0001-01-01"));
            } else {
                //Insertion date of divorce
                String[] champsDivorceDate = dateDivorce.split("/");
                try {
                    LocalDate dateDivorceOut = LocalDate.of(
                            Integer.parseInt(champsDivorceDate[2]),
                            Integer.parseInt(champsDivorceDate[1]),
                            Integer.parseInt(champsDivorceDate[0])
                    );
                    LocalDate aujourdhuiDivorce = LocalDate.now();
                    if (dateDivorceOut.isAfter(aujourdhuiDivorce)) {
                        throw new Exception("Wrong date input (prob too early in calendar)");
                    }
                    wedding.setDivorceDate(dateDivorceOut);
                } catch (DateTimeException | NumberFormatException | ArrayIndexOutOfBoundsException ex) {
                    throw new Exception("Divorce date format incorrect");
                }
            }
            etatSortie = true;
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_addActionPerformed

    private void NumVIP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumVIP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumVIP1ActionPerformed

    private void NumVIP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumVIP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumVIP2ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try {
            int numVip1 = Integer.parseInt(NumVIP1.getText());
            String VIP1Helper = NumVIP1.getText();
            wedding.setNumVIP1(numVip1);

            String dateWedding = DateWedding.getText();
            String[] champsDate = dateWedding.split("/");
            LocalDate dateOut = LocalDate.of(
                    Integer.parseInt(champsDate[2]),
                    Integer.parseInt(champsDate[1]),
                    Integer.parseInt(champsDate[0])
            );
            wedding.setWeddingDate(dateOut);

            //verification of divorce date
            int numVip2 = Integer.parseInt(NumVIP2.getText());
            String VIP2Helper = NumVIP2.getText();
            wedding.setNumVIP2(numVip2);
            String placeWedding = PlaceWedding.getText();
            wedding.setPlaceWedding(placeWedding);
            
            
            String dateDivorce;
            dateDivorce = DateDivorce.getText();
            String[] champsDivorceDate = dateDivorce.split("/");
            LocalDate dateDivorceOut = LocalDate.of(
                    Integer.parseInt(champsDivorceDate[2]),
                    Integer.parseInt(champsDivorceDate[1]),
                    Integer.parseInt(champsDivorceDate[0])
            );
            if (dateOut.isAfter(dateDivorceOut)) {
                throw new Exception("Divorce date is before the wedding date");
                
            }
            wedding.setDivorceDate(dateDivorceOut);

            etatSortie = true;
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erreur", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_updateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DateDivorce;
    private javax.swing.JTextField DateWedding;
    private javax.swing.JTextField NumVIP1;
    private javax.swing.JTextField NumVIP2;
    private javax.swing.JTextField PlaceWedding;
    private javax.swing.JButton add;
    private javax.swing.JLabel lbDateDivorce;
    private javax.swing.JLabel lbDateWedding;
    private javax.swing.JLabel lbPlaceWedding;
    private javax.swing.JLabel lbVIP1;
    private javax.swing.JLabel lbVIP2;
    private javax.swing.JLabel title;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
