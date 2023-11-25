package gui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Hamdanah Norsipa
 */
public class BukuAlamat extends javax.swing.JFrame {

    /**
     * Creates new form BukuAlamat
     */
    
     
    DefaultTableModel model; 
    // Model tabel default untuk menyimpan dan menampilkan data pada tabel
    
     
    private int SelectedRow; 
    private int selectedRow; 
    // Variabel untuk menyimpan baris yang dipilih pada tabel
   
    private boolean isEditMode;
     // Menandakan apakah aplikasi yang dibuat sedang dalam mode pengeditan
    
    public BukuAlamat() {
        initComponents();
        // Inisialisasi kolom dan data awal pada tabel
        Object kolom [] = {"Nama","Jenis Kelamin","Alamat","Kode Pos","No Telepon","Email"};
        Object data [][] = {{"Argantara","Laki-Laki","Komplek Cendrawasih No 8","70245","082436789087","argaatar@gmail.com"}};
        
        model = new DefaultTableModel(data, kolom);
        tblBukuAlamat.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNama = new javax.swing.JLabel();
        lbljk = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAlamat = new javax.swing.JLabel();
        lblKodePos = new javax.swing.JLabel();
        lblTelepon = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        tfAlamat = new javax.swing.JTextField();
        cbKodePos = new javax.swing.JComboBox<>();
        tfNoTelepon = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblBukuAlamat = new javax.swing.JTable();
        cbjenisKelamin = new javax.swing.JComboBox<>();
        btnKeluar = new javax.swing.JButton();
        btnImport = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnEksport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Aplikasi Buku Alamat"));

        lblNama.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNama.setText("Nama ");

        lbljk.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbljk.setText("Jenis Kelamin ");

        lblAlamat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAlamat.setText("Alamat");

        lblKodePos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblKodePos.setText("Kode Pos");

        lblTelepon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTelepon.setText("No Telepon");

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmail.setText("Email");

        tfNama.setBackground(new java.awt.Color(204, 204, 255));
        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });

        tfAlamat.setBackground(new java.awt.Color(204, 204, 255));

        cbKodePos.setBackground(new java.awt.Color(204, 204, 255));
        cbKodePos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "70245", "70248", "70122", "70121" }));

        tfNoTelepon.setBackground(new java.awt.Color(204, 204, 255));

        tfEmail.setBackground(new java.awt.Color(204, 204, 255));
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(102, 153, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnUbah.setBackground(new java.awt.Color(102, 153, 255));
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setBackground(new java.awt.Color(102, 153, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblBukuAlamat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Jenis Kelamin", "Alamat", "Kode Pos", "No Telepon", "Email"
            }
        ));
        tblBukuAlamat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBukuAlamatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblBukuAlamat);

        cbjenisKelamin.setBackground(new java.awt.Color(204, 204, 255));
        cbjenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));

        btnKeluar.setBackground(new java.awt.Color(102, 153, 255));
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        btnImport.setBackground(new java.awt.Color(102, 153, 255));
        btnImport.setText("Import");
        btnImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportActionPerformed(evt);
            }
        });

        btnBatal.setBackground(new java.awt.Color(102, 153, 255));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnEksport.setBackground(new java.awt.Color(102, 153, 255));
        btnEksport.setText("Eksport");
        btnEksport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEksportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(btnUbah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTambah))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnBatal)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEksport)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnImport))
                            .addComponent(btnKeluar))
                        .addContainerGap(110, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(lblNama)
                            .addGap(104, 104, 104)
                            .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(391, 391, 391))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbljk)
                                    .addGap(58, 58, 58)
                                    .addComponent(cbjenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblAlamat, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblKodePos, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblTelepon, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(73, 73, 73)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbKodePos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addContainerGap()))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNama)
                            .addComponent(tfNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbljk)
                            .addComponent(cbjenisKelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAlamat))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbKodePos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblKodePos))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNoTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelepon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmail))
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(btnImport)
                                .addGap(18, 18, 18)
                                .addComponent(btnEksport)
                                .addGap(18, 18, 18)
                                .addComponent(btnKeluar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnTambah)
                                    .addComponent(btnUbah))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnBatal)
                                    .addComponent(btnHapus))))
                        .addGap(13, 13, 13)))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
     // Mendapatkan nilai dari input pengguna
     String nama = tfNama.getText();
     String jenisKelamin = cbjenisKelamin.getSelectedItem().toString();
     String alamat = tfAlamat.getText();
     String kodePos = cbKodePos.getSelectedItem().toString();
     String noTelepon = tfNoTelepon.getText();
     String email = tfEmail.getText();
     
     //Mengecek nilai yang diinput
     if (tfNama.getText().equals("") || tfAlamat.getText().equals("") || tfNoTelepon.getText().equals("") || tfEmail.getText().equals("")) {
         JOptionPane.showMessageDialog(null, "Lengkapi Data Yang Kosong..!",
                    "Error",JOptionPane.WARNING_MESSAGE);
     }else{
     //Menambahkan data ke dalam row tabel
        DefaultTableModel model = (DefaultTableModel) tblBukuAlamat.getModel();
         model.addRow(new Object[] {nama, jenisKelamin, alamat, kodePos, noTelepon, email});
         JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
              
     // Mengosongkan field setelah data berhasil terinput
        tfNama.setText("");
        cbjenisKelamin.setSelectedIndex(0);
        tfAlamat.setText("");
        cbKodePos.setSelectedIndex(0);
        tfNoTelepon.setText("");
        tfEmail.setText("");
     } 
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
      // Silahkan mengecek apakah ada baris yang dipilih
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang mau diubah", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Mengambil data dari field
        String nama= tfNama.getText();
        String jenisKelamin = cbjenisKelamin.getSelectedItem().toString();
        String alamat = tfAlamat.getText();
        String kodePos = cbKodePos.getSelectedItem().toString();
        String noTelepon = tfNoTelepon.getText();
        String email = tfEmail.getText();

        // Memvalidasi inputan yang tidak ada
        if (nama.isEmpty() || alamat.isEmpty() || noTelepon.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "DiHarapkan lengkapi semua field", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Melakukan Update data pada baris yang dipilih
        tblBukuAlamat.setValueAt(nama, selectedRow, 0);
        tblBukuAlamat.setValueAt(jenisKelamin, selectedRow, 1);
        tblBukuAlamat.setValueAt(alamat, selectedRow, 2);
        tblBukuAlamat.setValueAt(kodePos, selectedRow, 3);
        tblBukuAlamat.setValueAt(noTelepon, selectedRow, 4);
        tblBukuAlamat.setValueAt(email, selectedRow, 5);

        // Mengosongkan input field sesudah data diubah
        tfNama.setText("");
        cbjenisKelamin.setSelectedItem("");
        tfAlamat.setText("");
        cbKodePos.setSelectedItem("");
        tfNoTelepon.setText("");
        tfEmail.setText("");

        // Melakukan reset pemilihan baris pada tabel
        tblBukuAlamat.clearSelection();
        
        // Untuk mengembalikan ke mode tambah dan mengaktifkan kembali tombol tambah
        isEditMode = false;
        btnTambah.setEnabled(true);
        
        // Menampilkan JOptionPane untuk memberi pesan bahwa data sudah berhasil diubah
        JOptionPane.showMessageDialog(this, "Data Berhasil Diubah", "Berhasil", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
          // Menghapus Data yang sudah dinputkan pada Tabel
          if(tblBukuAlamat.getSelectedRowCount() == 1){
              // Jika satu baris sudah dipilih, maka akan terhapus
              model.removeRow(tblBukuAlamat.getSelectedRow());
              
              JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
          }else{
              if(tblBukuAlamat.getRowCount() == 0){
                  
                  // Jika data kosong, tampilkan pesan 
                  JOptionPane.showMessageDialog(this, "Tabel Datanya Kosong");
              }else{
                  
                  // Jika tidak kosong tetapi tidak ada baris yang dipilih, tampilkan pesan
                  JOptionPane.showMessageDialog(this, "Silahkan Pilih Data Yang Mau Dihapus");
              }
          }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // Memiliki fungsi untuk mengosongkan text field pada form
        tfNama.setText("");
        cbjenisKelamin.setSelectedIndex(0);
        tfAlamat.setText("");
        cbKodePos.setSelectedIndex(0);
        tfNoTelepon.setText("");
        tfEmail.setText("");
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        String tanya = "Apakah Anda Yakin Ingin Keluar Dari Aplikasi?";
        boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya) == 
                JOptionPane.YES_OPTION;
        if(yakin){
            System.exit(0);
        }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportActionPerformed
        // Melakukan import File
        String filePath = "bukuAlamat.text";
        File file = new File(filePath);
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
        DefaultTableModel model = (DefaultTableModel) tblBukuAlamat.getModel(); 
        Object[] lines = br.lines().toArray();
        
        for(int i = 0; i < lines.length; i++ ){
            String[] row = lines[i].toString().split("/ ");
            model.addRow(row);
        }            
        JOptionPane.showMessageDialog(null, "Berhasil Mengimport Data");
            
        }catch (Exception e){
            System.err.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnImportActionPerformed

    private void btnEksportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEksportActionPerformed
        // Melakukan eksport File kedalam bentuk text
        try{
            BufferedWriter out = new BufferedWriter (new FileWriter("bukuAlamat.text"));
            
            for(int i = 0; i < tblBukuAlamat.getRowCount(); i++){ // rows
                for (int j = 0; j < tblBukuAlamat.getColumnCount(); j++){ // columns
                    out.write(tblBukuAlamat.getValueAt(i, j).toString()+"/ ");
                }
                out.newLine();
            }            
            JOptionPane.showMessageDialog(null, "Berhasil Diexport Kedalam File");
            
            out.close();
        }catch (Exception e){
            System.err.println("Error: "+e.getMessage());
        }
    }//GEN-LAST:event_btnEksportActionPerformed

    private void tblBukuAlamatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBukuAlamatMouseClicked
        // Untuk mendapatkan baris yang dipilih saat mouse diklik pada tabel
         selectedRow = tblBukuAlamat.getSelectedRow();

        // Untuk menampilkan data dari baris yang dipilih pada TextField
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tblBukuAlamat.getModel();
            tfNama.setText(model.getValueAt(selectedRow, 0).toString());
            cbjenisKelamin.setSelectedItem(model.getValueAt(selectedRow, 1).toString());
            tfAlamat.setText(model.getValueAt(selectedRow, 2).toString());
            cbKodePos.setSelectedItem(model.getValueAt(selectedRow, 3).toString());
            tfNoTelepon.setText(model.getValueAt(selectedRow, 4).toString());
            tfEmail.setText(model.getValueAt(selectedRow, 5).toString());
        }
    }//GEN-LAST:event_tblBukuAlamatMouseClicked

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
            java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BukuAlamat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BukuAlamat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnEksport;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbKodePos;
    private javax.swing.JComboBox<String> cbjenisKelamin;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblKodePos;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblTelepon;
    private javax.swing.JLabel lbljk;
    private javax.swing.JTable tblBukuAlamat;
    private javax.swing.JTextField tfAlamat;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNoTelepon;
    // End of variables declaration//GEN-END:variables
}
