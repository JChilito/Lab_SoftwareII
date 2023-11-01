package com.mycompany.is2laboratorio7;

import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }
    public static Client client;
    public static IPackage packCountry;
    public static IPackage packContinent;
    
    public static int i = 0;
    public static int login = 0;
    public static boolean validPackage =false;
    public static boolean reset =false;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblInfoClient = new javax.swing.JLabel();
        lblClientName = new javax.swing.JLabel();
        lblClientId = new javax.swing.JLabel();
        txtClientName = new javax.swing.JTextField();
        txtClientId = new javax.swing.JTextField();
        lblInfoPackage = new javax.swing.JLabel();
        lblContinent = new javax.swing.JLabel();
        cbxContinents = new javax.swing.JComboBox<>();
        lblCountry = new javax.swing.JLabel();
        cbxCountry = new javax.swing.JComboBox<>();
        lblCity = new javax.swing.JLabel();
        cbxCity = new javax.swing.JComboBox<>();
        btnAddCity = new javax.swing.JButton();
        btnAddCountry = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInformation = new javax.swing.JTextArea();
        btnInfoPackage = new javax.swing.JButton();
        btnInfoCityTour = new javax.swing.JButton();
        btnPayPackage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblInfoClient.setText("Datos Cliente:");

        lblClientName.setText("Nombre:");

        lblClientId.setText("Id:");

        lblInfoPackage.setText("Arma Tu Paquete:");

        lblContinent.setText("Continente:");

        cbxContinents.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "America del Sur", "Europa" }));
        cbxContinents.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxContinentsItemStateChanged(evt);
            }
        });

        lblCountry.setText("Pais:");

        cbxCountry.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCountryItemStateChanged(evt);
            }
        });
        cbxCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCountryActionPerformed(evt);
            }
        });

        lblCity.setText("Ciudad:");

        btnAddCity.setText("Agregar Ciudad");
        btnAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCityActionPerformed(evt);
            }
        });

        btnAddCountry.setText("Agregar Pais");
        btnAddCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCountryActionPerformed(evt);
            }
        });

        txtInformation.setColumns(20);
        txtInformation.setRows(5);
        txtInformation.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInformation.setEnabled(false);
        jScrollPane1.setViewportView(txtInformation);

        btnInfoPackage.setText("Informacion del Paquete");
        btnInfoPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoPackageActionPerformed(evt);
            }
        });

        btnInfoCityTour.setText("Informacion del CityTour");
        btnInfoCityTour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoCityTourActionPerformed(evt);
            }
        });

        btnPayPackage.setText("Pagar Paquete");
        btnPayPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayPackageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInfoClient)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblClientId)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtClientId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblClientName)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCity)
                                    .addComponent(cbxCity, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCountry)
                                    .addComponent(cbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblContinent)
                                    .addComponent(lblInfoPackage)
                                    .addComponent(cbxContinents, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnInfoPackage)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInfoCityTour))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnPayPackage)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnAddCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInfoClient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClientName)
                            .addComponent(txtClientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblClientId)
                            .addComponent(txtClientId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInfoPackage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblContinent)
                        .addGap(9, 9, 9)
                        .addComponent(cbxContinents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCountry)
                        .addGap(6, 6, 6)
                        .addComponent(cbxCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCity)
                .addGap(6, 6, 6)
                .addComponent(cbxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCity)
                    .addComponent(btnAddCountry))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfoPackage)
                    .addComponent(btnInfoCityTour))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPayPackage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCountryActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbxCountryActionPerformed

    private void cbxCountryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCountryItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            cbxCity.removeAllItems();
        if(this.cbxCountry.getSelectedItem().toString().equals("Colombia")==true){
            
            this.cbxCity.addItem("Bogota");
            this.cbxCity.addItem("Cali");
            this.cbxCity.addItem("Medellin");
        }else if (this.cbxCountry.getSelectedItem().toString().equals("Argentina")==true){
            
            this.cbxCity.addItem("Buenos Aires");
            this.cbxCity.addItem("Cordoba");
            this.cbxCity.addItem("Murcia");
        }else if (this.cbxCountry.getSelectedItem().toString().equals("España")==true){
            
            this.cbxCity.addItem("Madrid");
            this.cbxCity.addItem("Barcelona");
            this.cbxCity.addItem("Sevilla");
        }else if (this.cbxCountry.getSelectedItem().toString().equals("Francia")==true){
            
            this.cbxCity.addItem("Paris");
            this.cbxCity.addItem("Lyon");
            this.cbxCity.addItem("Marsella");
        }}
    }//GEN-LAST:event_cbxCountryItemStateChanged

    private void cbxContinentsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxContinentsItemStateChanged
        // TODO add your handling code here:
        if(!reset){
            if(clientDataValidation()){
                String clientName = txtClientName.getText();
                int clientId = Integer.parseInt(txtClientId.getText());
                packContinent = new ContinentPackage(cbxContinents.getSelectedItem().toString());
                client = new Client(clientName,clientId,packContinent);
                if (evt.getStateChange() == ItemEvent.SELECTED) {
                    cbxCountry.removeAllItems();
                    if(this.cbxContinents.getSelectedItem().toString().equals("America del Sur")==true){
                        this.cbxCountry.addItem("Colombia");
                        this.cbxCountry.addItem("Argentina");
                    }else if (this.cbxContinents.getSelectedItem().toString().equals("Europa")==true){
                        this.cbxCountry.addItem("España");
                        this.cbxCountry.addItem("Francia");
                    }
                }
            }
        }else{
            reset = false;
        }
    }//GEN-LAST:event_cbxContinentsItemStateChanged

    private void btnAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCityActionPerformed
        try {
            if(clientDataValidation()){
                boolean flag = false; 
                Random random = new Random();

                String nameCity = cbxCity.getSelectedItem().toString();
                String nameCountry = cbxCountry.getSelectedItem().toString();

                String nameTour = "Tour de " + nameCity;
                String descriptionTour = "Disfruta de una gran experiencia en "+nameCity;
                CityTour tour = new CityTour(++i, nameTour, descriptionTour, "5", 3);

                for(int i = 0; i < client.getPack().getPacks().size() ;i++){
                    if(client.getPack().getPacks().get(i).getName().equals(nameCountry)){
                        IPackage cityPack = new CityPackage(nameCity,"CX 715", "Trivago", tour, "Completo", random.nextInt(1500001) + 500000,new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2022"),new SimpleDateFormat("dd/MM/yyyy").parse("09/07/2022"));
                        client.getPack().getPacks().get(i).getPacks().add(cityPack);
                        JOptionPane.showMessageDialog(null, "¡Se ha grabado la ciudad con exito!");
                        flag = true;
                        validPackage = true;
                    }
                }
                if(!flag){
                    JOptionPane.showMessageDialog(this, "¡El pais no ha sido registrado en el paquete!");
                }
            }
        } catch (ParseException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnAddCityActionPerformed

    private void btnAddCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCountryActionPerformed
        //packContinent.getPacks().clear();
        if(clientDataValidation()){
            String nameCountry = cbxCountry.getSelectedItem().toString();
            boolean countryAlreadyExist = false;
            for(int i = 0; i < client.getPack().getPacks().size() ;i++){
                if(client.getPack().getPacks().get(i).getName().equals(nameCountry)){
                    countryAlreadyExist = true;
                    
                }
            }
            if(!countryAlreadyExist){
                packCountry = new CountryPackage(nameCountry);
                client.getPack().getPacks().add(packCountry); 
            }
            JOptionPane.showMessageDialog(this, "¡Se ha grabado el pais con exito!");
        }
    }//GEN-LAST:event_btnAddCountryActionPerformed

    private void btnInfoPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoPackageActionPerformed
        // TODO add your handling code here:
        txtInformation.setText("Nombre Cliente: " + client.getName() + "\n"
                + "Id Cliente: " + client.getId() + "\n"
                + client.getPack().getDetails());
        
    }//GEN-LAST:event_btnInfoPackageActionPerformed

    private void btnInfoCityTourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoCityTourActionPerformed
        // TODO add your handling code here:
        int countryNumber = client.getPack().getPacks().size();
        txtInformation.setText(client.getPack().getTourDetails());
    }//GEN-LAST:event_btnInfoCityTourActionPerformed

    private void btnPayPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayPackageActionPerformed
        // TODO add your handling code here:
        if(validPackage){
            reset = true;
            JOptionPane.showMessageDialog(this, "El paquete ha sido comprado.");
            cbxCountry.removeAllItems();
            cbxCity.removeAllItems();
            cbxContinents.setSelectedIndex(0);
            txtClientId.setText("");
            txtClientName.setText("");
            txtInformation.setText("");
            validPackage = false;
        }else{
            JOptionPane.showMessageDialog(this, "Paquete NO valido (Recuerde asignar Contiente, pais y ciudad)");
        }
    }//GEN-LAST:event_btnPayPackageActionPerformed

    
    private boolean clientDataValidation(){
        String clientName = txtClientName.getText();
        String clientId = txtClientId.getText();
        if(clientName.isEmpty() || clientId.isEmpty() || cbxContinents.getSelectedIndex() == 0){
           JOptionPane.showMessageDialog(this, "Recuerde llenar primero los campos de cliente y luego seleccionar un continente.");
           //cbxContinents.setSelectedIndex(0);
           
           return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCity;
    private javax.swing.JButton btnAddCountry;
    private javax.swing.JButton btnInfoCityTour;
    private javax.swing.JButton btnInfoPackage;
    private javax.swing.JButton btnPayPackage;
    private javax.swing.JComboBox<String> cbxCity;
    private javax.swing.JComboBox<String> cbxContinents;
    private javax.swing.JComboBox<String> cbxCountry;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblClientId;
    private javax.swing.JLabel lblClientName;
    private javax.swing.JLabel lblContinent;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblInfoClient;
    private javax.swing.JLabel lblInfoPackage;
    private javax.swing.JTextField txtClientId;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextArea txtInformation;
    // End of variables declaration//GEN-END:variables
}
