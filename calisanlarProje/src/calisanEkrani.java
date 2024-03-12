
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author burak
 */
public class calisanEkrani extends javax.swing.JDialog {
    
    DefaultTableModel model;
    calisanIslemleri islemler = new calisanIslemleri();

    /**
     * Creates new form calisanEkrani
     */
    public calisanEkrani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        model = (DefaultTableModel) calisanTable.getModel();
        calisanGoruntule();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        calisanTable = new javax.swing.JTable();
        arama_cubugu = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ad_yazma = new javax.swing.JTextField();
        soyad_yazma = new javax.swing.JTextField();
        departman_yazma = new javax.swing.JTextField();
        maas_yazma = new javax.swing.JTextField();
        yeni_calisan_ekle = new javax.swing.JButton();
        calisanSil = new javax.swing.JButton();
        mesaj_alani = new javax.swing.JLabel();
        calisanGuncelle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBounds(new java.awt.Rectangle(400, 100, 0, 0));

        calisanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id", "ad", "soyad", "departman", "maas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        calisanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calisanTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calisanTable);
        if (calisanTable.getColumnModel().getColumnCount() > 0) {
            calisanTable.getColumnModel().getColumn(0).setResizable(false);
            calisanTable.getColumnModel().getColumn(1).setResizable(false);
            calisanTable.getColumnModel().getColumn(2).setResizable(false);
            calisanTable.getColumnModel().getColumn(3).setResizable(false);
            calisanTable.getColumnModel().getColumn(4).setResizable(false);
        }

        arama_cubugu.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                arama_cubuguKeyReleased(evt);
            }
        });

        jLabel1.setText("Ad:");

        jLabel2.setText("Soyad: ");

        jLabel3.setText("Departman: ");

        jLabel4.setText("Maaş: ");

        yeni_calisan_ekle.setText("Yeni Çalışan Ekle");
        yeni_calisan_ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeni_calisan_ekleActionPerformed(evt);
            }
        });

        calisanSil.setText("Çalışan Sil");
        calisanSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calisanSilActionPerformed(evt);
            }
        });

        mesaj_alani.setForeground(new java.awt.Color(255, 0, 0));

        calisanGuncelle.setText("Çalışan Güncelle");
        calisanGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calisanGuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(arama_cubugu, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                                    .addComponent(jSeparator1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mesaj_alani, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ad_yazma)
                                            .addComponent(soyad_yazma)
                                            .addComponent(departman_yazma)
                                            .addComponent(maas_yazma, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))))
                                .addGap(181, 181, 181)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(yeni_calisan_ekle, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(calisanSil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calisanGuncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(arama_cubugu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ad_yazma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeni_calisan_ekle))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(soyad_yazma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calisanSil)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(departman_yazma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(calisanGuncelle))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maas_yazma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mesaj_alani, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void dinamikAra(String ara){
        
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        
        calisanTable.setRowSorter(tr);
        
        
        tr.setRowFilter(RowFilter.regexFilter("(?i)" + ara));
        
        
    }
    private void arama_cubuguKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_arama_cubuguKeyReleased
       String ara = arama_cubugu.getText();
       dinamikAra(ara);
    }//GEN-LAST:event_arama_cubuguKeyReleased

    private void yeni_calisan_ekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeni_calisan_ekleActionPerformed
        mesaj_alani.setText("");
        if(ad_yazma.getText().equals("")||  soyad_yazma.getText().equals("")|| departman_yazma.getText().equals("")||  maas_yazma.getText().equals("")){
            mesaj_alani.setText("Lütfen tüm alanları doldurduğunuzdan emin olun!");
        }else{
            String ad  =  ad_yazma.getText();
            String soyad = soyad_yazma.getText();
            String departman = departman_yazma.getText();
            String maas = maas_yazma.getText();
        
        
            try {
            islemler.calisanEkle(ad,soyad,departman,maas);
            } catch (SQLException ex) {
            Logger.getLogger(calisanEkrani.class.getName()).log(Level.SEVERE, null, ex);
            }
            mesaj_alani.setText("Çalışan Başarıyla Eklendi!");
        
            calisanGoruntule();
            
        }
        
        
        
        
        
    }//GEN-LAST:event_yeni_calisan_ekleActionPerformed

    private void calisanSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calisanSilActionPerformed
        mesaj_alani.setText("");
       
       
       int selectedrow = calisanTable.getSelectedRow();
       
       if (selectedrow == -1) {
           if (model.getRowCount() == 0 ) {
               mesaj_alani.setText("Çalışan tablosu şu anda boş...");
           }
           else {
               mesaj_alani.setText("Lütfen silinecek bir çalışan seçin...");
           }
      
       }
       else {
           int id = (int)model.getValueAt(selectedrow,0);
           
           islemler.calisanSil(id);
           
           calisanGoruntule();
           
           mesaj_alani.setText("Çalışan başarıyla silindi...");
           
           
           
           
       }
    }//GEN-LAST:event_calisanSilActionPerformed

    private void calisanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calisanTableMouseClicked
        int selected_row = calisanTable.getSelectedRow();
        ad_yazma.setText(model.getValueAt(selected_row, 1).toString());
        soyad_yazma.setText(model.getValueAt(selected_row, 2).toString());
        departman_yazma.setText(model.getValueAt(selected_row, 3).toString());
        maas_yazma.setText(model.getValueAt(selected_row, 4).toString());
        
    }//GEN-LAST:event_calisanTableMouseClicked

    private void calisanGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calisanGuncelleActionPerformed
        String ad = ad_yazma.getText();
        String soyad = soyad_yazma.getText();
        String departman = departman_yazma.getText();
        String maas = maas_yazma.getText();
        
        int selectedrow = calisanTable.getSelectedRow();
        
        if (selectedrow == -1) {
            
            if (model.getRowCount() == 0) {
                mesaj_alani.setText("Çalışanlar Tablosu şu anda boş. ");
            }
            else {
                mesaj_alani.setText("Lütfen güncellenecek bir çalışan seçin.");
            }
        }
        else {
            
            
            
            
            int id = (int)model.getValueAt(selectedrow,0);
            
            
            
            islemler.calisanGuncelle(id,ad,soyad,departman,maas);
            
            calisanGoruntule();
            
            mesaj_alani.setText("Çalışan başarıyla güncellendi...");
        }
       
    }//GEN-LAST:event_calisanGuncelleActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public void calisanGoruntule() {
        model.setRowCount(0);
        ArrayList<Calisan> calisanlar = new ArrayList<Calisan>();
        calisanlar = islemler.calisanlariGetir();
        if (calisanlar != null) {
            for (Calisan c : calisanlar) {
                Object[] row = {c.getId(), c.getAd(), c.getSoyad(), c.getDepartman(), c.getMaas()};
                model.addRow(row);
            }
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(calisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(calisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(calisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(calisanEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                calisanEkrani dialog = new calisanEkrani(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad_yazma;
    private javax.swing.JTextField arama_cubugu;
    private javax.swing.JButton calisanGuncelle;
    private javax.swing.JButton calisanSil;
    private javax.swing.JTable calisanTable;
    private javax.swing.JTextField departman_yazma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField maas_yazma;
    private javax.swing.JLabel mesaj_alani;
    private javax.swing.JTextField soyad_yazma;
    private javax.swing.JButton yeni_calisan_ekle;
    // End of variables declaration//GEN-END:variables
}
