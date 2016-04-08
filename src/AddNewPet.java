
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Justin
 */
public class AddNewPet extends javax.swing.JDialog {
    
    /* Declare new pet object without any constructor */
    /* This object will be added to the Vet Clinic's collection of pet objects */
    Pet newPet; 
    /* Set button flag to indicate which button is clicked before the dialog box is disposed.
    Set the flag to 0 if it the user clicks the exit button, 1 if the user clicks the register pet button 
    */
    int btnflag = 0;

    /**
     * Creates new form AddNewPet
     */
    public AddNewPet(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        lblPetType = new javax.swing.JLabel();
        rbtnDog = new javax.swing.JRadioButton();
        rbtnCat = new javax.swing.JRadioButton();
        lblDogBreed = new javax.swing.JLabel();
        txtDogBreed = new javax.swing.JTextField();
        lblAllergy = new javax.swing.JLabel();
        chkboxYes = new javax.swing.JCheckBox();
        lblPetName = new javax.swing.JLabel();
        txtPetName = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblDateofBirth = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        DatePicker = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register new pet");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        lblPetType.setText("Type of pet:");

        buttonGroup1.add(rbtnDog);
        rbtnDog.setSelected(true);
        rbtnDog.setText("Dog");
        rbtnDog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnDogMouseClicked(evt);
            }
        });

        buttonGroup1.add(rbtnCat);
        rbtnCat.setText("Cat");
        rbtnCat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnCatMouseClicked(evt);
            }
        });

        lblDogBreed.setText("Dog breed:");

        lblAllergy.setText("Presence of allergy:");

        chkboxYes.setText("Yes");
        chkboxYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkboxYesActionPerformed(evt);
            }
        });

        lblPetName.setText("Pet Name:");

        lblWeight.setText("Weight(kg):");

        lblDateofBirth.setText("Date of birth:");

        btnRegister.setText("Register pet");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnReset.setText("Reset fields");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDateofBirth)
                            .addComponent(lblWeight)
                            .addComponent(lblPetName)
                            .addComponent(lblAllergy)
                            .addComponent(lblDogBreed)
                            .addComponent(lblPetType))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(rbtnDog)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnCat))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(chkboxYes)
                                        .addComponent(txtDogBreed)
                                        .addComponent(txtPetName, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(txtWeight)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReset)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPetType)
                    .addComponent(rbtnDog)
                    .addComponent(rbtnCat))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPetName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDogBreed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDogBreed))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkboxYes)
                    .addComponent(lblAllergy))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDateofBirth)
                    .addComponent(DatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegister)
                    .addComponent(btnExit)
                    .addComponent(btnReset))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void chkboxYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkboxYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkboxYesActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        /* Make the allergy section and dog breed section invisible until user selects pet type */
        this.setBreedVisible();
    }//GEN-LAST:event_formWindowActivated

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // set button flag to 0, which indicates that user presses the exit button.
        btnflag = 0;
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void rbtnDogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnDogMouseClicked
        // If the pet type is dog, set only the breed field as visible 
        this.setBreedVisible();
        
    }//GEN-LAST:event_rbtnDogMouseClicked

    private void rbtnCatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnCatMouseClicked
        // If the pet type is cat, set only the allergy field as visible 
        this.setAllergyVisible();
    }//GEN-LAST:event_rbtnCatMouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        // Reset all input fields 
        this.resetFields();
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        //  Create a new subclass of pet object based on the pet type selcected by the radio button. 
        this.registerPet();
        // set button flag to 1, which indicates that user presses the register pet button.
        btnflag = 1;
    }//GEN-LAST:event_btnRegisterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddNewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddNewPet dialog = new AddNewPet(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    /**
     * Method to only set the breed field visible if the pet type is dog
     */
    public void setBreedVisible()
    {
        lblDogBreed.setEnabled(true);
        txtDogBreed.setEnabled(true);
        // Set allergy field as invisible 
        lblAllergy.setEnabled(false);
        chkboxYes.setEnabled(false);
    }
    
    /**
     * Method to only set the allergy field visible if the pet type is cat
     */
    public void setAllergyVisible()
    {
        lblAllergy.setEnabled(true);
        chkboxYes.setEnabled(true);
        // Set breed field as invisible 
        lblDogBreed.setEnabled(false);
        txtDogBreed.setEnabled(false);
    }
    /**
     * Method to reset all input fields
     */
    public void resetFields()
    {
       txtPetName.setText("");
       txtDogBreed.setText("");
       chkboxYes.setSelected(false);
       txtWeight.setText("");
       DatePicker.setDate(null);
    }
    
    /**
     * Method to create a new subclass of pet object based on the pet type selected by the radio button. 
     */
    public void registerPet()
    {
        /* boolean flag for indicating the presence of exception. If exception is thrown, the flag is set to true. The
        Default boolean value is false. Else, if the flag is false, the pet object is created and saved to the collection.
        */
        boolean flag = false;
        if(rbtnDog.isSelected())
        {
            /* Create a dog object */
            Dog newDog =  new Dog();
            try
            {
                /* Assign text box values to the dog attributes */
                newDog.setName(txtPetName.getText());
                newDog.setBreed(txtDogBreed.getText());
                double weight = Double.parseDouble(txtWeight.getText());
                /* if weight is negative number, set exception flag to true */
                if(weight <= 0)
                {
                    flag = true;
                    JOptionPane.showMessageDialog(null, "Input weight must be a positive value only");
                }
                newDog.setWeight(weight);
                newDog.setDob(DatePicker.getDate());
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Input weight must be in variables only");
                /* Set exception flag to true */
                flag = true;
            }
            finally
            {
                /* If no flags are set, assign the cat object to the pet reference object */
                 if(flag == false)
                 {
                     newPet = newDog;
                     /* Display the attributes of the newly created cat object */
                     JOptionPane.showMessageDialog(null, newDog.toString());
                     dispose();
                 }
            }
            
        }
        else if(rbtnCat.isSelected())
        { 
            /* Create a cat object */
            Cat newCat =  new Cat();
            try
            {
                /* Assign text box values to the dog attributes */
                newCat.setName(txtPetName.getText());
                /* Set the allergy attribute based on the checkbox */
                if(chkboxYes.isSelected())
                {
                    newCat.setAllergic(true);
                }
                else
                {
                    newCat.setAllergic(false);
                }
                double weight = Double.parseDouble(txtWeight.getText());
                /* if weight is negative number, set exception flag to true */
                if(weight <= 0)
                {
                    flag = true;
                    /* display error message */
                    JOptionPane.showMessageDialog(null, "Input weight must be a positive value only");
                }
                newCat.setWeight(weight);
                newCat.setDob(DatePicker.getDate());
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null, "Input weight must be a positive value only");
                flag = true;
            }
            finally
            {
                 /* If no flags are set, assign the cat object to the pet reference object */
                 if(flag == false)
                 {
                     newPet = newCat;
                     /* Display the attributes of the newly created cat object */
                     JOptionPane.showMessageDialog(null, newCat.toString());
                     dispose();
                 }
            }
        }
        
        else
        {
            /* Display error warning if no radio button is selected */
            JOptionPane.showMessageDialog(null, "Pet type is not specified");
            
        }
      
    }
    /**
     * Method to return pet object created by the dialog box 
     * @return Pet object
     */
    public Pet getPet()
    {
        return newPet;
    }
    
    /**
     * Method to return what button is clicked when the dialog box is disposed
     * @return the button flag to indicate which button is clicked. 0 for exit button, 1 for register pet button 
     */
    public int getButton()
    {
        return btnflag;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DatePicker;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRegister;
    private javax.swing.JButton btnReset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox chkboxYes;
    private javax.swing.JLabel lblAllergy;
    private javax.swing.JLabel lblDateofBirth;
    private javax.swing.JLabel lblDogBreed;
    private javax.swing.JLabel lblPetName;
    private javax.swing.JLabel lblPetType;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JRadioButton rbtnCat;
    private javax.swing.JRadioButton rbtnDog;
    private javax.swing.JTextField txtDogBreed;
    private javax.swing.JTextField txtPetName;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}