package main;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class EliminarCliente extends javax.swing.JFrame {

    public EliminarCliente() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        FondoPanel = new javax.swing.JPanel();
        barraPanel = new javax.swing.JPanel();
        barraText = new javax.swing.JLabel();
        atrasPanel = new javax.swing.JPanel();
        atrasLabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        idToDeleteField = new javax.swing.JTextField();
        Text1 = new javax.swing.JLabel();
        insertPanel = new javax.swing.JPanel();
        insertLabel = new javax.swing.JLabel();
        ErrorLabel = new javax.swing.JTextField();
        confirmRegistroText = new javax.swing.JLabel();
        confirmRegistroIcon = new javax.swing.JLabel();

        jPanel4.setBackground(new java.awt.Color(253, 253, 253));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(97, 109, 167));
        jLabel2.setText("Atrás");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(51, 51, 51))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        FondoPanel.setBackground(new java.awt.Color(242, 240, 241));
        FondoPanel.setMinimumSize(new java.awt.Dimension(860, 600));
        FondoPanel.setPreferredSize(new java.awt.Dimension(854, 600));
        FondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraPanel.setBackground(new java.awt.Color(97, 109, 167));
        barraPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraPanelMouseDragged(evt);
            }
        });
        barraPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraPanelMousePressed(evt);
            }
        });
        barraPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barraText.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        barraText.setForeground(new java.awt.Color(255, 255, 255));
        barraText.setText("ELIMINA CLIENTES");
        barraPanel.add(barraText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 60));

        FondoPanel.add(barraPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 140));

        atrasPanel.setBackground(new java.awt.Color(253, 253, 253));
        atrasPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                atrasPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                atrasPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                atrasPanelMousePressed(evt);
            }
        });

        atrasLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        atrasLabel.setForeground(new java.awt.Color(97, 109, 167));
        atrasLabel.setText("Atrás");

        javax.swing.GroupLayout atrasPanelLayout = new javax.swing.GroupLayout(atrasPanel);
        atrasPanel.setLayout(atrasPanelLayout);
        atrasPanelLayout.setHorizontalGroup(
            atrasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atrasPanelLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(atrasLabel)
                .addGap(51, 51, 51))
        );
        atrasPanelLayout.setVerticalGroup(
            atrasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atrasPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(atrasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        FondoPanel.add(atrasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 140, 40));
        FondoPanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 348, -1));

        idToDeleteField.setBackground(new java.awt.Color(242, 240, 241));
        idToDeleteField.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        idToDeleteField.setForeground(new java.awt.Color(98, 106, 163));
        idToDeleteField.setBorder(null);
        idToDeleteField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idToDeleteFieldMouseClicked(evt);
            }
        });
        idToDeleteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idToDeleteFieldActionPerformed(evt);
            }
        });
        idToDeleteField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idToDeleteFieldKeyTyped(evt);
            }
        });
        FondoPanel.add(idToDeleteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 334, 25));

        Text1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Text1.setForeground(new java.awt.Color(96, 107, 167));
        Text1.setText("Cédula a eliminar:");
        FondoPanel.add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 170, 30));

        insertPanel.setBackground(new java.awt.Color(253, 253, 253));
        insertPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertPanelMousePressed(evt);
            }
        });

        insertLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertLabel.setForeground(new java.awt.Color(97, 109, 167));
        insertLabel.setText("Ingresar");

        javax.swing.GroupLayout insertPanelLayout = new javax.swing.GroupLayout(insertPanel);
        insertPanel.setLayout(insertPanelLayout);
        insertPanelLayout.setHorizontalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(insertLabel)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        insertPanelLayout.setVerticalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        FondoPanel.add(insertPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        ErrorLabel.setEditable(false);
        ErrorLabel.setBackground(new java.awt.Color(242, 240, 241));
        ErrorLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ErrorLabel.setForeground(new java.awt.Color(255, 102, 102));
        ErrorLabel.setBorder(null);
        ErrorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ErrorLabelMouseClicked(evt);
            }
        });
        ErrorLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErrorLabelActionPerformed(evt);
            }
        });
        ErrorLabel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ErrorLabelKeyTyped(evt);
            }
        });
        FondoPanel.add(ErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 320, 25));

        confirmRegistroText.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        confirmRegistroText.setForeground(new java.awt.Color(96, 107, 167));
        confirmRegistroText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FondoPanel.add(confirmRegistroText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 340, 30));
        FondoPanel.add(confirmRegistroIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 240, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xx, xy;
    private void barraPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPanelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_barraPanelMouseDragged

    private void barraPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPanelMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_barraPanelMousePressed

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_jPanel4MousePressed

    private void atrasPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasPanelMouseEntered
        // TODO add your handling code here:
        setColor(atrasPanel);
    }//GEN-LAST:event_atrasPanelMouseEntered

    private void atrasPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasPanelMouseExited
        // TODO add your handling code here:
        resetColor(atrasPanel);
    }//GEN-LAST:event_atrasPanelMouseExited

    private void atrasPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasPanelMousePressed
        // TODO add your handling code here:
        new Home().show();
        this.hide();
    }//GEN-LAST:event_atrasPanelMousePressed

    private void idToDeleteFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idToDeleteFieldMouseClicked
        idToDeleteField.setText("");
    }//GEN-LAST:event_idToDeleteFieldMouseClicked

    private void idToDeleteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idToDeleteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idToDeleteFieldActionPerformed

    private void idToDeleteFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idToDeleteFieldKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (idToDeleteField.getText().trim().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_idToDeleteFieldKeyTyped

    private void insertPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPanelMouseEntered
        // TODO add your handling code here:
        setColor(insertPanel);
    }//GEN-LAST:event_insertPanelMouseEntered

    private void insertPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPanelMouseExited
        resetColor(insertPanel);
    }//GEN-LAST:event_insertPanelMouseExited

    private void insertPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPanelMousePressed
        if (idToDeleteField.getText().isEmpty()) {
            ErrorLabel.setText("Digite todos los campos");
            confirmRegistroText.setForeground(new java.awt.Color(159, 101, 100));
            confirmRegistroText.setText("El cliente no se ha eliminado");
            confirmRegistroIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrong.png")).getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH)));
        } else {
            ErrorLabel.setText("");
            String idFieldToDelete = idToDeleteField.getText();
            String fileName = "Clientes";
            String fileNameNew = fileName + "New";
            File archiveName = new File(fileName + ".txt");
            File archiveNameNew = new File(fileNameNew + ".txt");
            PrintWriter lineWriter;
            try {

                if (!archiveName.exists()) {
                    archiveName.createNewFile();
                }

                // Cedula               
                if (idFieldToDelete.length() < 1) {
                    idToDeleteField.setText("Cédula incorrecta");
                    ErrorLabel.setText("Digite la cédula correctamente");
                }

                // Verifica si está
                if (Leer(fileName, idFieldToDelete)) {
                    confirmRegistroText.setForeground(new java.awt.Color(96, 107, 167));
                    confirmRegistroText.setText("El cliente se ha eliminado correctamente");
                    confirmRegistroIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png")).getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH)));
                    rehacer(fileName, idFieldToDelete, fileNameNew);
                    archiveName.delete();
                    lineWriter = null;
                    File NewFile = new File("Clientes.txt");
                    lineWriter = new PrintWriter(NewFile);
                    try {
                        BufferedReader bro = new BufferedReader(new FileReader(fileNameNew + ".txt"));
                        String line = null; //definición de line
                        while ((line = bro.readLine()) != null) {
                            String temp[] = line.split(":");
                            lineWriter.println(temp[0] + ":" + temp[1] + ":" + temp[2]);
                        }
                        bro.close();
                        lineWriter.close();
                        archiveNameNew.delete();
                    } catch (IOException ex) {
                        System.out.println("No se encontro archivo");
                    }
                } else {
                    ErrorLabel.setText("La cédula no está registrada");
                    confirmRegistroText.setForeground(new java.awt.Color(159, 101, 100));
                    confirmRegistroText.setText("El cliente no se ha eliminado");
                    confirmRegistroIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrong.png")).getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH)));
                }
            } catch (IOException ex) {
                ErrorLabel.setText("Error creando el archivo");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_insertPanelMousePressed

    private void ErrorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ErrorLabelMouseClicked

    }//GEN-LAST:event_ErrorLabelMouseClicked

    private void ErrorLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErrorLabelActionPerformed

    }//GEN-LAST:event_ErrorLabelActionPerformed

    private void ErrorLabelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ErrorLabelKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (ErrorLabel.getText().trim().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_ErrorLabelKeyTyped

    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(204, 204, 204));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(253, 253, 253));
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
            java.util.logging.Logger.getLogger(EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ErrorLabel;
    private javax.swing.JPanel FondoPanel;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel atrasLabel;
    private javax.swing.JPanel atrasPanel;
    private javax.swing.JPanel barraPanel;
    private javax.swing.JLabel barraText;
    private javax.swing.JLabel confirmRegistroIcon;
    private javax.swing.JLabel confirmRegistroText;
    private javax.swing.JTextField idToDeleteField;
    private javax.swing.JLabel insertLabel;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables

    // Recorre el archivo
    public static boolean Leer(String fileName, String id) {
        boolean hay = false;
        while (hay == false) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(fileName + ".txt"));
                String line = null; //definición de line
                while ((line = br.readLine()) != null) {
                    String temp[] = line.split(":");
                    if (id.equals(temp[1])) {
                        return true;
                    }
                }
                br.close();
                hay = true;
            } catch (IOException ex) {
                System.out.println("No se encontro archivo");
                hay = false;
            }
        }
        return false;
    }

    public static void rehacer(String fileName, String id, String fileNameNew) {
        boolean hay = false;
        // nuevo archivo
        FileWriter fileWriter = null;
        PrintWriter lineWriter = null;
        File archiveNameNew = new File(fileNameNew + ".txt");

        try {
            if (!archiveNameNew.exists()) {
                archiveNameNew.createNewFile();
            }
            fileWriter = new FileWriter(archiveNameNew, true);
            lineWriter = new PrintWriter(fileWriter);
        } catch (IOException ex) {
            //ErrorD.setText("Error creando el archivo");
            ex.printStackTrace();
        }

        while (hay == false) {
            try {
                BufferedReader br2 = new BufferedReader(new FileReader(fileName + ".txt"));
                String line = null; //definición de line
                while ((line = br2.readLine()) != null) {
                    String temp[] = line.split(":");
                    if (!id.equals(temp[1])) {
                        lineWriter.println(temp[0] + ":" + temp[1] + ":" + temp[2]);
                    }
                }
                br2.close();
                hay = true;
                lineWriter.close();
                fileWriter.close();
            } catch (IOException ex) {
                System.out.println("No se encontro archivo");
                hay = false;
            }
        }
    }
}
