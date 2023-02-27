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
import static main.Clientes.Leer;
import static main.EliminarCliente.Leer;
import static main.EliminarCliente.rehacer;

public class Transacciones extends javax.swing.JFrame {

    public Transacciones() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        barraPanel = new javax.swing.JPanel();
        barraText = new javax.swing.JLabel();
        atrasPanel = new javax.swing.JPanel();
        atrasText = new javax.swing.JLabel();
        ErrorE = new javax.swing.JTextField();
        separator1 = new javax.swing.JSeparator();
        separator2 = new javax.swing.JSeparator();
        idT = new javax.swing.JTextField();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        insertT = new javax.swing.JPanel();
        inserText = new javax.swing.JLabel();
        retiro = new javax.swing.JRadioButton();
        consignacion = new javax.swing.JRadioButton();
        value = new javax.swing.JTextField();
        confirmRegistroText = new javax.swing.JLabel();
        confirmRegistroIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Fondo.setBackground(new java.awt.Color(242, 240, 241));
        Fondo.setForeground(new java.awt.Color(242, 240, 241));
        Fondo.setMinimumSize(new java.awt.Dimension(860, 600));
        Fondo.setPreferredSize(new java.awt.Dimension(854, 600));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        barraText.setText("TRANSACCIONES");
        barraPanel.add(barraText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 60));

        Fondo.add(barraPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 140));

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

        atrasText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        atrasText.setForeground(new java.awt.Color(97, 109, 167));
        atrasText.setText("Atrás");

        javax.swing.GroupLayout atrasPanelLayout = new javax.swing.GroupLayout(atrasPanel);
        atrasPanel.setLayout(atrasPanelLayout);
        atrasPanelLayout.setHorizontalGroup(
            atrasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atrasPanelLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(atrasText)
                .addGap(51, 51, 51))
        );
        atrasPanelLayout.setVerticalGroup(
            atrasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, atrasPanelLayout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(atrasText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Fondo.add(atrasPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 140, 40));

        ErrorE.setEditable(false);
        ErrorE.setBackground(new java.awt.Color(242, 240, 241));
        ErrorE.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        ErrorE.setForeground(new java.awt.Color(255, 102, 102));
        ErrorE.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ErrorE.setBorder(null);
        ErrorE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ErrorEActionPerformed(evt);
            }
        });
        ErrorE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ErrorEKeyTyped(evt);
            }
        });
        Fondo.add(ErrorE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 240, 25));
        Fondo.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 348, -1));
        Fondo.add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 348, -1));

        idT.setBackground(new java.awt.Color(242, 240, 241));
        idT.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        idT.setForeground(new java.awt.Color(92, 112, 167));
        idT.setBorder(null);
        idT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTActionPerformed(evt);
            }
        });
        idT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idTKeyTyped(evt);
            }
        });
        Fondo.add(idT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 334, 25));

        Text1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Text1.setForeground(new java.awt.Color(96, 107, 167));
        Text1.setText("Cédula:");
        Fondo.add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, 30));

        Text2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Text2.setForeground(new java.awt.Color(96, 107, 167));
        Text2.setText("Tipo de Movimiento:");
        Fondo.add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 180, 30));

        Text3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Text3.setForeground(new java.awt.Color(96, 107, 167));
        Text3.setText("Valor:");
        Fondo.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, 30));

        insertT.setBackground(new java.awt.Color(253, 253, 253));
        insertT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertTMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                insertTMousePressed(evt);
            }
        });

        inserText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        inserText.setForeground(new java.awt.Color(97, 109, 167));
        inserText.setText("Ingresar");

        javax.swing.GroupLayout insertTLayout = new javax.swing.GroupLayout(insertT);
        insertT.setLayout(insertTLayout);
        insertTLayout.setHorizontalGroup(
            insertTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertTLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(inserText)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insertTLayout.setVerticalGroup(
            insertTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inserText, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        Fondo.add(insertT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 150, -1));

        retiro.setText("Retiro");
        retiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retiroActionPerformed(evt);
            }
        });
        retiro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                retiroKeyPressed(evt);
            }
        });
        Fondo.add(retiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        consignacion.setText("Consignación");
        consignacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consignacionActionPerformed(evt);
            }
        });
        consignacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                consignacionKeyPressed(evt);
            }
        });
        Fondo.add(consignacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, -1, -1));

        value.setBackground(new java.awt.Color(242, 240, 241));
        value.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        value.setForeground(new java.awt.Color(92, 112, 167));
        value.setBorder(null);
        value.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valueActionPerformed(evt);
            }
        });
        value.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                valueKeyTyped(evt);
            }
        });
        Fondo.add(value, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 334, 25));

        confirmRegistroText.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        confirmRegistroText.setForeground(new java.awt.Color(96, 107, 167));
        confirmRegistroText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.add(confirmRegistroText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 340, 30));
        Fondo.add(confirmRegistroIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 240, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void atrasPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasPanelMouseEntered
        // TODO add your handling code here:
        setColor(atrasPanel);
    }//GEN-LAST:event_atrasPanelMouseEntered

    private void atrasPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasPanelMouseExited
        // TODO add your handling code here:
        resetColor(atrasPanel);
    }//GEN-LAST:event_atrasPanelMouseExited

    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(204, 204, 204));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(253, 253, 253));
    }
    private void atrasPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_atrasPanelMousePressed
        // TODO add your handling code here:
        new Home().show();
        this.hide();
    }//GEN-LAST:event_atrasPanelMousePressed

    private void ErrorEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErrorEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorEActionPerformed

    private void ErrorEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ErrorEKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (ErrorE.getText().trim().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_ErrorEKeyTyped

    private void idTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTActionPerformed
        
    }//GEN-LAST:event_idTActionPerformed

    private void idTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idTKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (idT.getText().trim().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_idTKeyTyped

    private void insertTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertTMouseEntered
        setColor(insertT);
    }//GEN-LAST:event_insertTMouseEntered

    private void insertTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertTMouseExited
        resetColor(insertT);
    }//GEN-LAST:event_insertTMouseExited

    private void insertTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertTMousePressed
        if (idT.getText().isEmpty() || (!retiro.isSelected() && !consignacion.isSelected()) || value.getText().isEmpty()) {
            ErrorE.setText("Digite todos los campos");
            confirmRegistroText.setForeground(new java.awt.Color(159, 101, 100));
            confirmRegistroText.setText("No se ha realizado la transacción");
            confirmRegistroIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrong.png")).getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH)));
        } else {
            ErrorE.setText("");
            int valueField = Integer.parseInt(value.getText());
            String idTField = idT.getText();

            String fileName = "Clientes";
            String fileNameNew = fileName + "New";
            File archiveName = new File(fileName + ".txt");
            File archiveNameNew = new File(fileNameNew + ".txt");

            String fileTName = "Transacciones";
            String fileTNameNew = fileTName + "New";
            File archiveTName = new File(fileTName + ".txt");
            File archiveTNameNew = new File(fileTNameNew + ".txt");

            FileWriter fileWriter = null;
            PrintWriter lineWriter;

            try {
                archiveTName = new File(fileTName + ".txt");
                if (!archiveTName.exists()) {
                    archiveTName.createNewFile();
                }
                
                // Cedula               
                if (idTField.length() < 1) {
                    idT.setText("Cedula incorrecta");
                    ErrorE.setText("Digite los campos correctamente");
                }

                // Tipo de Transacciones
                String tipoTrans = "";
                if (retiro.isSelected()) {
                    tipoTrans = "Retiro";
                } else if (consignacion.isSelected()) {
                    tipoTrans = "Consignación";
                }

                // Revisa si está la cedula y asigna la actualización
                if (Leer(fileName, idTField) && valueField > 0) {
                    fileWriter = new FileWriter(archiveTName, true);
                    lineWriter = new PrintWriter(fileWriter);
                    
                    // Llena el archivo Transacciones
                    if (!idT.getText().isEmpty() && (retiro.isSelected() || consignacion.isSelected()) && !value.getText().isEmpty()) {
                        lineWriter.println(idTField + ":" + tipoTrans + ":" + valueField);
                        confirmRegistroText.setForeground(new java.awt.Color(96, 107, 167));
                        confirmRegistroText.setText("La transacción se ha sido realizado correctamente");
                        confirmRegistroIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png")).getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH)));
                    }
                    lineWriter.close();
                    fileWriter.close();
                    if (retiro.isSelected()) {
                        valueField = -valueField;
                        actualizarSaldo(fileName, idTField, fileNameNew, valueField);
                    } else if (consignacion.isSelected()) {
                        if (valueField > 500000) {
                            valueField += 20000;
                            new Bono().show();
                        }
                        actualizarSaldo(fileName, idTField, fileNameNew, valueField);
                    }
                    archiveName.delete();
                    lineWriter = null;
                    File NewFile = new File("Clientes.txt");
                    lineWriter = new PrintWriter(NewFile);
                    try {
                        BufferedReader bro = new BufferedReader(new FileReader(fileNameNew + ".txt"));
                        String line = null;
                        while ((line = bro.readLine()) != null) {
                            String temp[] = line.split(":");
                            lineWriter.println(temp[0] + ":" + temp[1] + ":" + temp[2]);
                        }
                        bro.close();
                        lineWriter.close();
                    } catch (IOException ex) {
                        System.out.println("No se encontro archivo");
                    }
                    archiveNameNew.delete();
                } else {
                    if (valueField < 1) {
                        ErrorE.setText("El valor debe ser positivo");
                    } else {
                        ErrorE.setText("La cédula no está registrada");
                    }
                    confirmRegistroText.setForeground(new java.awt.Color(159, 101, 100));
                    confirmRegistroText.setText("no se ha realizado la transacción");
                    confirmRegistroIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrong.png")).getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH)));
                }
            } catch (IOException ex) {
                ErrorE.setText("Error creando el archivo");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_insertTMousePressed

    private void retiroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_retiroKeyPressed

    }//GEN-LAST:event_retiroKeyPressed

    private void retiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retiroActionPerformed
        consignacion.setSelected(false);
    }//GEN-LAST:event_retiroActionPerformed

    private void consignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consignacionActionPerformed
        retiro.setSelected(false);
    }//GEN-LAST:event_consignacionActionPerformed

    private void consignacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consignacionKeyPressed

    }//GEN-LAST:event_consignacionKeyPressed

    private void valueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valueActionPerformed
        
    }//GEN-LAST:event_valueActionPerformed

    private void valueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_valueKeyTyped
        
    }//GEN-LAST:event_valueKeyTyped

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
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transacciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ErrorE;
    private javax.swing.JPanel Fondo;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JPanel atrasPanel;
    private javax.swing.JLabel atrasText;
    private javax.swing.JPanel barraPanel;
    private javax.swing.JLabel barraText;
    private javax.swing.JLabel confirmRegistroIcon;
    private javax.swing.JLabel confirmRegistroText;
    private javax.swing.JRadioButton consignacion;
    private javax.swing.JTextField idT;
    private javax.swing.JLabel inserText;
    private javax.swing.JPanel insertT;
    private javax.swing.JRadioButton retiro;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JTextField value;
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

    public static void actualizarSaldo(String fileName, String id, String fileNameNew, int value) {
        boolean hay = false;
        // Nuevo archivo
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
            System.out.println("Error creando el archivo");
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
                    } else if (id.equals(temp[1])) {
                        if ((Integer.parseInt(temp[2])) + value < 0) {
                            temp[2] = "0";
                        } else {
                            temp[2] = Integer.toString(Integer.parseInt(temp[2]) + value);
                        }
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
