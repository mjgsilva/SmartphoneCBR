/*
 * Copyright (c) 2010, Oracle. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * * Redistributions of source code must retain the above copyright notice,
 *   this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * * Neither the name of Oracle nor the names of its contributors
 *   may be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */

package smartCBR;

import de.dfki.mycbr.core.model.AttributeDesc;
import de.dfki.mycbr.core.model.SymbolDesc;
import de.dfki.mycbr.core.similarity.AmalgamationFct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SmartFrame extends javax.swing.JFrame {
    
    CBREngine cbr;
    QueryManager queryManager;
    List<AmalgamationFct> amalgamationFcts;
    HashMap<String, AttributeDesc> attributes;   
    
    /**
     * Creates new form ContactEditor
     */
    public SmartFrame() {
        initComponents();
        
        cbr = new CBREngine();
        queryManager = new QueryManager(cbr.getConcept(),cbr.getCaseBase());
        amalgamationFcts = cbr.getConcept().getAvailableAmalgamFcts();
        attributes = cbr.getConcept().getAllAttributeDescs();
        fillComboBoxes(amalgamationFcts, attributes);
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jpProfile = new javax.swing.JPanel();
        jcbProfile = new javax.swing.JComboBox();
        jpOptions = new javax.swing.JPanel();
        jlCpuCores = new javax.swing.JLabel();
        jtCpuCores = new javax.swing.JTextField();
        jlCpuFreq = new javax.swing.JLabel();
        jtCpuFreq = new javax.swing.JTextField();
        jtGpuGflops = new javax.swing.JTextField();
        jlGpuGflops = new javax.swing.JLabel();
        jlDisplaySize = new javax.swing.JLabel();
        jtDisplaySize = new javax.swing.JTextField();
        jlRam = new javax.swing.JLabel();
        jtRam = new javax.swing.JTextField();
        jlCameraPx = new javax.swing.JLabel();
        jtCameraPx = new javax.swing.JTextField();
        jlIntStorage = new javax.swing.JLabel();
        jtIntStorage = new javax.swing.JTextField();
        jlStylus = new javax.swing.JLabel();
        jcbStylus = new javax.swing.JComboBox();
        jlSdCard = new javax.swing.JLabel();
        jcbSdCard = new javax.swing.JComboBox();
        jtTalkTime = new javax.swing.JTextField();
        jlTalkTime = new javax.swing.JLabel();
        jlStandbyTime = new javax.swing.JLabel();
        jtStandbyTime = new javax.swing.JTextField();
        jlOS = new javax.swing.JLabel();
        jcbOS = new javax.swing.JComboBox();
        jcbVendor = new javax.swing.JComboBox();
        jlVendor = new javax.swing.JLabel();
        jlPrice = new javax.swing.JLabel();
        jtPrice = new javax.swing.JTextField();
        jlResult = new javax.swing.JLabel();
        btnRetrieval = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Smartphone CBR");

        jpProfile.setBorder(javax.swing.BorderFactory.createTitledBorder("Profile"));
        jpProfile.setToolTipText("");
        jpProfile.setName("Profile"); // NOI18N

        org.jdesktop.layout.GroupLayout jpProfileLayout = new org.jdesktop.layout.GroupLayout(jpProfile);
        jpProfile.setLayout(jpProfileLayout);
        jpProfileLayout.setHorizontalGroup(
            jpProfileLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpProfileLayout.createSequentialGroup()
                .addContainerGap()
                .add(jcbProfile, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpProfileLayout.setVerticalGroup(
            jpProfileLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpProfileLayout.createSequentialGroup()
                .add(jcbProfile, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpOptions.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));

        jlCpuCores.setText("CPU (No. Cores)");

        jlCpuFreq.setText("CPU (Freq)");

        jlGpuGflops.setText("GPU (Gflops)");

        jlDisplaySize.setText("Display Size");

        jlRam.setText("RAM");

        jlCameraPx.setText("Camera (px)");

        jlIntStorage.setText("Int. Storage");

        jlStylus.setText("Stylus");

        jcbStylus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlSdCard.setText("SD Card");

        jcbSdCard.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlTalkTime.setText("Talk Time");

        jlStandbyTime.setText("Standby Time");

        jlOS.setText("OS");

        jcbOS.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jcbVendor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlVendor.setText("Vendor");

        jlPrice.setText("Price");

        org.jdesktop.layout.GroupLayout jpOptionsLayout = new org.jdesktop.layout.GroupLayout(jpOptions);
        jpOptions.setLayout(jpOptionsLayout);
        jpOptionsLayout.setHorizontalGroup(
            jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpOptionsLayout.createSequentialGroup()
                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jpOptionsLayout.createSequentialGroup()
                        .add(14, 14, 14)
                        .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jpOptionsLayout.createSequentialGroup()
                                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jlStandbyTime)
                                    .add(jlTalkTime)
                                    .add(jlIntStorage)
                                    .add(jlRam)
                                    .add(jlCpuFreq)
                                    .add(jlCpuCores))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(jtCpuFreq, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                    .add(jtRam)
                                    .add(jtIntStorage)
                                    .add(jtTalkTime)
                                    .add(jtStandbyTime)
                                    .add(jtCpuCores))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jlGpuGflops)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jlDisplaySize)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jpOptionsLayout.createSequentialGroup()
                                        .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                            .add(jlStylus)
                                            .add(jlCameraPx)
                                            .add(jlSdCard))
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jcbStylus, 0, 130, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jtGpuGflops)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jtDisplaySize)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jcbSdCard, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jtCameraPx)))
                            .add(jpOptionsLayout.createSequentialGroup()
                                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(jlPrice)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jpOptionsLayout.createSequentialGroup()
                                        .add(jlOS)
                                        .add(13, 13, 13)))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(jtPrice)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jcbOS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 75, Short.MAX_VALUE)
                                .add(jlVendor)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jcbVendor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(jpOptionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(jlResult, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpOptionsLayout.setVerticalGroup(
            jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jpOptionsLayout.createSequentialGroup()
                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlCpuCores)
                    .add(jtCpuCores, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jlGpuGflops)
                    .add(jtGpuGflops, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlCpuFreq)
                    .add(jtCpuFreq, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jlDisplaySize)
                    .add(jtDisplaySize, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlRam)
                    .add(jtRam, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jlCameraPx)
                    .add(jtCameraPx, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlIntStorage)
                    .add(jtIntStorage, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jlStylus)
                    .add(jcbStylus, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlSdCard)
                    .add(jcbSdCard, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jlTalkTime)
                    .add(jtTalkTime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlStandbyTime)
                    .add(jtStandbyTime, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlOS)
                    .add(jcbOS, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jlVendor)
                    .add(jcbVendor, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpOptionsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jlPrice)
                    .add(jtPrice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(29, 29, 29)
                .add(jlResult, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnRetrieval.setLabel("Start Retrieval");
        btnRetrieval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetrievalActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jpProfile, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jpOptions, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(btnRetrieval)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jpProfile, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jpOptions, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnRetrieval)
                .addContainerGap())
        );

        jpProfile.getAccessibleContext().setAccessibleName("Profile");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRetrievalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetrievalActionPerformed
        applyQuery();
    }//GEN-LAST:event_btnRetrievalActionPerformed
    
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
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();
            for (int idx=0; idx<installedLookAndFeels.length; idx++)
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());
                    break;
                }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SmartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SmartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SmartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SmartFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SmartFrame().setVisible(true);
            }
        });        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRetrieval;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox jcbOS;
    private javax.swing.JComboBox jcbProfile;
    private javax.swing.JComboBox jcbSdCard;
    private javax.swing.JComboBox jcbStylus;
    private javax.swing.JComboBox jcbVendor;
    private javax.swing.JLabel jlCameraPx;
    private javax.swing.JLabel jlCpuCores;
    private javax.swing.JLabel jlCpuFreq;
    private javax.swing.JLabel jlDisplaySize;
    private javax.swing.JLabel jlGpuGflops;
    private javax.swing.JLabel jlIntStorage;
    private javax.swing.JLabel jlOS;
    private javax.swing.JLabel jlPrice;
    private javax.swing.JLabel jlRam;
    private javax.swing.JLabel jlResult;
    private javax.swing.JLabel jlSdCard;
    private javax.swing.JLabel jlStandbyTime;
    private javax.swing.JLabel jlStylus;
    private javax.swing.JLabel jlTalkTime;
    private javax.swing.JLabel jlVendor;
    private javax.swing.JPanel jpOptions;
    private javax.swing.JPanel jpProfile;
    private javax.swing.JTextField jtCameraPx;
    private javax.swing.JTextField jtCpuCores;
    private javax.swing.JTextField jtCpuFreq;
    private javax.swing.JTextField jtDisplaySize;
    private javax.swing.JTextField jtGpuGflops;
    private javax.swing.JTextField jtIntStorage;
    private javax.swing.JTextField jtPrice;
    private javax.swing.JTextField jtRam;
    private javax.swing.JTextField jtStandbyTime;
    private javax.swing.JTextField jtTalkTime;
    // End of variables declaration//GEN-END:variables
  
    private void fillComboBoxes(List<AmalgamationFct> amalgamationFcts, HashMap<String,AttributeDesc> attributes){
        jcbProfile.setModel(new javax.swing.DefaultComboBoxModel(getAmalgamationFctsAsArray(amalgamationFcts)));
        jcbStylus.setModel(new javax.swing.DefaultComboBoxModel(getAttributesAsArray(attributes,"Stylus")));
        jcbSdCard.setModel(new javax.swing.DefaultComboBoxModel(getAttributesAsArray(attributes,"SDCard")));
        jcbOS.setModel(new javax.swing.DefaultComboBoxModel(getAttributesAsArray(attributes,"OS")));
        jcbVendor.setModel(new javax.swing.DefaultComboBoxModel(getAttributesAsArray(attributes,"Vendor")));
    }
    
    private String[] getAmalgamationFctsAsArray(List<AmalgamationFct> amalgamationFcts) {
        int size = amalgamationFcts.size();
        String[] amalgationFctsAsArray = new String[size];
        
        for(int i=0; i<size; i++) {
            amalgationFctsAsArray[i] = amalgamationFcts.get(i).getName();
        }
        return amalgationFctsAsArray;
    }
    
    private String[] getAttributesAsArray(HashMap<String,AttributeDesc> attributes, String attrName) {
        String[] valuesArray = null;
        
        for (Map.Entry<String, AttributeDesc> entry : attributes.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();

            if(key.equals(attrName)) {
                SymbolDesc symbol = (SymbolDesc)value;
                List<String> values = new ArrayList<String>();
                values.add("");
                values.addAll(symbol.getAllowedValues());
                valuesArray = Arrays.copyOf(values.toArray(),values.toArray().length,String[].class);
            }
        }
        
        return valuesArray;
        
    }

    private void applyQuery() {
        String OS, vendor, sdCard, stylus;
        float cpuFreq, gpuGflops, displaySize, cameraPx;
        int cpuCores, ram, intStorage, talkTime, standbyTime, price;
        AmalgamationFct profile = null;
        
        OS = jcbOS.getSelectedItem().toString();
        vendor = jcbVendor.getSelectedItem().toString();
        sdCard = jcbSdCard.getSelectedItem().toString();
        stylus = jcbStylus.getSelectedItem().toString();
        
        
        try {
            cpuFreq = Float.parseFloat(jtCpuFreq.getText());
        } catch (NumberFormatException e) {
            cpuFreq = 0f;
        }
        
        try {
            gpuGflops = Float.parseFloat(jtGpuGflops.getText());
        } catch (NumberFormatException e) {
            gpuGflops = 0f;
        }
        
        try {
            displaySize = Float.parseFloat(jtDisplaySize.getText());
        } catch (NumberFormatException e) {
            displaySize = 0f;
        }
        
        try {
            cameraPx = Float.parseFloat(jtCameraPx.getText());
        } catch (NumberFormatException e) {
            cameraPx = 0f;
        }
        
        try {
            cpuCores = Integer.parseInt(jtCpuCores.getText());
        } catch (NumberFormatException e) {
            cpuCores = 0;
        }
        
        try {
            ram = Integer.parseInt(jtRam.getText());
        } catch (NumberFormatException e) {
            ram = 0;
        }
        
        try {
            intStorage = Integer.parseInt(jtIntStorage.getText());
        } catch (NumberFormatException e) {
            intStorage = 0;
        }
        
        try {
            talkTime = Integer.parseInt(jtTalkTime.getText());
        } catch (NumberFormatException e) {
            talkTime = 0;
        }
                
        try {
            standbyTime = Integer.parseInt(jtStandbyTime.getText());
        } catch (NumberFormatException e) {
            standbyTime = 0;
        }
                        
        try {
            price = Integer.parseInt(jtPrice.getText());
        } catch (NumberFormatException e) {
            price = 0;
        }
        
        for(AmalgamationFct it : amalgamationFcts) {
            if(it.getName().equals(jcbProfile.getSelectedItem().toString())) {
                profile = it;
            }
        }
        
        String result = queryManager.doQuery(OS, 
                vendor, 
                sdCard, 
                stylus, 
                cpuFreq, 
                gpuGflops, 
                displaySize, 
                cameraPx,
                cpuCores,
                ram,
                intStorage,
                talkTime,
                standbyTime,
                price,
                profile
        );
        jlResult.setText(result);

    }
    
}

