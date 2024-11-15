/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Putra
 */
public class AplikasiPenghitunganKataFramea extends javax.swing.JFrame {

    /**
     * Creates new form AplikasiPenghitunganKataFramea
     */
    public AplikasiPenghitunganKataFramea() {
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

        jPanel1 = new javax.swing.JPanel();
        buttonHitung = new javax.swing.JButton();
        labelWordCount = new javax.swing.JLabel();
        labelCharCount = new javax.swing.JLabel();
        labelSentenceCount = new javax.swing.JLabel();
        labelParagraphCount = new javax.swing.JLabel();
        textFieldCariKata = new javax.swing.JTextField();
        buttonCariKata = new javax.swing.JButton();
        labelHasilCariKata = new javax.swing.JLabel();
        buttonSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaInput = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonHitung.setText("Hitung");
        buttonHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHitungActionPerformed(evt);
            }
        });

        labelWordCount.setText("Jumlah Kata :");

        labelCharCount.setText("Jumlah Karakter :");

        labelSentenceCount.setText("Jumlah Kalimat :");

        labelParagraphCount.setText("Jumlah Paragraf :");

        buttonCariKata.setText("Cari");
        buttonCariKata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCariKataActionPerformed(evt);
            }
        });

        labelHasilCariKata.setText("Hasil Pencarian");

        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        textAreaInput.setColumns(20);
        textAreaInput.setRows(5);
        jScrollPane1.setViewportView(textAreaInput);

        jLabel1.setText("Kata Yang Ingin di Cari :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Aplikasi Penghitung Kata");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelWordCount)
                            .addComponent(labelCharCount)
                            .addComponent(labelSentenceCount)
                            .addComponent(labelParagraphCount)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(buttonHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelHasilCariKata)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(textFieldCariKata, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonCariKata)))))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(labelWordCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCharCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelSentenceCount)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelParagraphCount)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHitung)
                    .addComponent(buttonSimpan))
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldCariKata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCariKata))
                .addGap(18, 18, 18)
                .addComponent(labelHasilCariKata)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHitungActionPerformed
        // Mengambil teks dari JTextArea
    String text = textAreaInput.getText();

    // Menghitung jumlah kata
    String[] words = text.trim().split("\\s+");
    int wordCount = words.length;

    // Menghitung jumlah karakter (termasuk spasi)
    int charCount = text.length();

    // Menghitung jumlah kalimat
    String[] sentences = text.split("[.!?]\\s*");
    int sentenceCount = sentences.length;

    // Menghitung jumlah paragraf
    String[] paragraphs = text.split("\\n+");
    int paragraphCount = paragraphs.length;

    // Menampilkan hasil perhitungan
    labelWordCount.setText("Jumlah Kata: " + wordCount);
    labelCharCount.setText("Jumlah Karakter: " + charCount);
    labelSentenceCount.setText("Jumlah Kalimat: " + sentenceCount);
    labelParagraphCount.setText("Jumlah Paragraf: " + paragraphCount);
    }//GEN-LAST:event_buttonHitungActionPerformed

    private void buttonCariKataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCariKataActionPerformed
        String text = textAreaInput.getText().toLowerCase();
    String searchTerm = textFieldCariKata.getText().toLowerCase();
    int occurrences = 0;

    if (!searchTerm.isEmpty()) {
        int index = 0;
        while ((index = text.indexOf(searchTerm, index)) != -1) {
            occurrences++;
            index += searchTerm.length();
        }
    }

    labelHasilCariKata.setText("Kata '" + searchTerm + "' ditemukan: " + occurrences + " kali");
    }//GEN-LAST:event_buttonCariKataActionPerformed

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
         String hasil = "Jumlah Kata: " + labelWordCount.getText() + "\n" +
                   "Jumlah Karakter: " + labelCharCount.getText() + "\n" +
                   "Jumlah Kalimat: " + labelSentenceCount.getText() + "\n" +
                   "Jumlah Paragraf: " + labelParagraphCount.getText();

    try (java.io.FileWriter writer = new java.io.FileWriter("hasil_perhitungan.txt")) {
        writer.write(hasil);
        javax.swing.JOptionPane.showMessageDialog(this, "Hasil berhasil disimpan ke file.");
    } catch (java.io.IOException e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan file.");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_buttonSimpanActionPerformed

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
            java.util.logging.Logger.getLogger(AplikasiPenghitunganKataFramea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitunganKataFramea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitunganKataFramea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AplikasiPenghitunganKataFramea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AplikasiPenghitunganKataFramea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCariKata;
    private javax.swing.JButton buttonHitung;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCharCount;
    private javax.swing.JLabel labelHasilCariKata;
    private javax.swing.JLabel labelParagraphCount;
    private javax.swing.JLabel labelSentenceCount;
    private javax.swing.JLabel labelWordCount;
    private javax.swing.JTextArea textAreaInput;
    private javax.swing.JTextField textFieldCariKata;
    // End of variables declaration//GEN-END:variables
}
