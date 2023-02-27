package main;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class Clientes extends javax.swing.JFrame {

    public Clientes() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new javax.swing.JPanel();
        barraPanel = new javax.swing.JPanel();
        barraText = new javax.swing.JLabel();
        exitPanel = new javax.swing.JPanel();
        exitText = new javax.swing.JLabel();
        separator1 = new javax.swing.JSeparator();
        separator2 = new javax.swing.JSeparator();
        separator3 = new javax.swing.JSeparator();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        Text3 = new javax.swing.JLabel();
        insertPanel = new javax.swing.JPanel();
        insertText = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        confirmRegistroText = new javax.swing.JLabel();
        confirmRegistroIcon = new javax.swing.JLabel();
        ErrorE = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        fondoPanel.setBackground(new java.awt.Color(242, 240, 241));
        fondoPanel.setMinimumSize(new java.awt.Dimension(860, 600));
        fondoPanel.setPreferredSize(new java.awt.Dimension(854, 600));
        fondoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        barraText.setText("CLIENTES");
        barraPanel.add(barraText, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 60));

        fondoPanel.add(barraPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 140));

        exitPanel.setBackground(new java.awt.Color(253, 253, 253));
        exitPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitPanelMousePressed(evt);
            }
        });

        exitText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitText.setForeground(new java.awt.Color(97, 109, 167));
        exitText.setText("Atrás");

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(exitText)
                .addGap(51, 51, 51))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitPanelLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(exitText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        fondoPanel.add(exitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 540, 140, 40));
        fondoPanel.add(separator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 348, -1));
        fondoPanel.add(separator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 348, -1));
        fondoPanel.add(separator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 348, -1));

        Text1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Text1.setForeground(new java.awt.Color(96, 107, 167));
        Text1.setText("Cédula:");
        fondoPanel.add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 70, 30));

        Text2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Text2.setForeground(new java.awt.Color(96, 107, 167));
        Text2.setText("Nombre:");
        fondoPanel.add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 70, 30));

        Text3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Text3.setForeground(new java.awt.Color(96, 107, 167));
        Text3.setText("Saldo:");
        fondoPanel.add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, 30));

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

        insertText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        insertText.setForeground(new java.awt.Color(97, 109, 167));
        insertText.setText("Ingresar");

        javax.swing.GroupLayout insertPanelLayout = new javax.swing.GroupLayout(insertPanel);
        insertPanel.setLayout(insertPanelLayout);
        insertPanelLayout.setHorizontalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(insertText)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        insertPanelLayout.setVerticalGroup(
            insertPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(insertText, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        fondoPanel.add(insertPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        name.setBackground(new java.awt.Color(242, 240, 241));
        name.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        name.setForeground(new java.awt.Color(98, 106, 163));
        name.setBorder(null);
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nameKeyTyped(evt);
            }
        });
        fondoPanel.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 334, 25));

        id.setBackground(new java.awt.Color(242, 240, 241));
        id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        id.setForeground(new java.awt.Color(98, 106, 163));
        id.setBorder(null);
        id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                idMouseClicked(evt);
            }
        });
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                idKeyTyped(evt);
            }
        });
        fondoPanel.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 334, 25));

        amount.setBackground(new java.awt.Color(242, 240, 241));
        amount.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        amount.setForeground(new java.awt.Color(98, 106, 163));
        amount.setBorder(null);
        amount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                amountMouseClicked(evt);
            }
        });
        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                amountKeyTyped(evt);
            }
        });
        fondoPanel.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 334, 25));

        confirmRegistroText.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        confirmRegistroText.setForeground(new java.awt.Color(96, 107, 167));
        confirmRegistroText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondoPanel.add(confirmRegistroText, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 340, 30));
        fondoPanel.add(confirmRegistroIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 240, 240));

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
        fondoPanel.add(ErrorE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 240, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xx, xy;
    private void barraPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPanelMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_barraPanelMouseDragged

    private void barraPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPanelMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_barraPanelMousePressed

    private void exitPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseEntered
        setColor(exitPanel);
    }//GEN-LAST:event_exitPanelMouseEntered

    private void exitPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseExited
        resetColor(exitPanel);
    }//GEN-LAST:event_exitPanelMouseExited

    private void exitPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMousePressed
        new Home().show();
        this.hide();
    }//GEN-LAST:event_exitPanelMousePressed

    private void insertPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPanelMouseEntered
        setColor(insertPanel);
    }//GEN-LAST:event_insertPanelMouseEntered

    private void insertPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPanelMouseExited
        resetColor(insertPanel);
    }//GEN-LAST:event_insertPanelMouseExited

    private void insertPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertPanelMousePressed
        if (name.getText().isEmpty() || id.getText().isEmpty() || amount.getText().isEmpty()) {
            ErrorE.setText("Digite todos los campos");
            confirmRegistroText.setForeground(new java.awt.Color(159, 101, 100));
            confirmRegistroText.setText("El cliente no se ha registrado");
            confirmRegistroIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrong.png")).getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH)));
        } else {
            confirmRegistroText.setText("");
            confirmRegistroIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Empty.png")).getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH)));
            String nameField = name.getText();
            nameField = nameToUpperCase(nameField);
            String idField = id.getText();
            int amountField = Integer.parseInt(amount.getText());
            float consignacion = 0;

            String fileName = "Clientes";
            File archiveName;
            FileWriter fileWriter = null;
            PrintWriter lineWriter;

            try {
                archiveName = new File(fileName + ".txt");
                if (!archiveName.exists()) {
                    archiveName.createNewFile();
                }
                // Nombre
                if (nameField.isEmpty()) {
                    name.setText("Nombre vacío");
                }

                // Cedula               
                if (idField.length() < 1) {
                    id.setText("Cedula incorrecta");
                }

                // Saldo
                if (amountField < 0) {
                    amount.setText("No se permiten saldos negativos");

                }

                fileWriter = new FileWriter(archiveName, true);
                lineWriter = new PrintWriter(fileWriter);

                // Escribe la información en el registro
                if (amountField >= 0 && idField.length() >= 1 && !nameField.isEmpty() && !(idField.isEmpty()) && !(Integer.parseInt(idField) == 0) && !Leer(fileName, idField)) {
                    ErrorE.setText(null);
                    confirmRegistroText.setForeground(new java.awt.Color(96, 107, 167));
                    confirmRegistroText.setText("El cliente ha sido ingresado correctamente");
                    confirmRegistroIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png")).getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH)));
                    lineWriter.println(nameField + ":" + idField + ":" + amountField);
                } else {
                    if (Leer(fileName, idField)) {
                        ErrorE.setText("La cédula ya ha sido registrada");
                    } else{
                        ErrorE.setText("La cédula no es válida");
                    }
                    confirmRegistroText.setForeground(new java.awt.Color(159, 101, 100));
                    confirmRegistroText.setText("El cliente no se ha registrado");
                    confirmRegistroIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrong.png")).getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH)));
                }

                lineWriter.close();
                fileWriter.close();
            } catch (IOException ex) {
                confirmRegistroText.setText("Error creando el archivo");
                confirmRegistroIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wrong.png")).getImage().getScaledInstance(240, 240, Image.SCALE_SMOOTH)));
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_insertPanelMousePressed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)) {
            evt.consume();
        }
    }//GEN-LAST:event_nameKeyTyped

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        
    }//GEN-LAST:event_idActionPerformed

    private void idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (id.getText().trim().length() == 4) {
            evt.consume();
        }
    }//GEN-LAST:event_idKeyTyped

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
        name.setText("");
    }//GEN-LAST:event_nameMouseClicked

    private void idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_idMouseClicked
        id.setText("");
    }//GEN-LAST:event_idMouseClicked

    private void amountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_amountMouseClicked
        // TODO add your handling code here:
        amount.setText("");
    }//GEN-LAST:event_amountMouseClicked

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountKeyTyped
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros) {
            evt.consume();
        }
        if (amount.getText().trim().length() == 9) {
            evt.consume();
        }
    }//GEN-LAST:event_amountKeyTyped

    private void ErrorEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ErrorEActionPerformed
        
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

    public void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(204, 204, 204));
    }

    public void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(253, 253, 253));
    }

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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ErrorE;
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JTextField amount;
    private javax.swing.JPanel barraPanel;
    private javax.swing.JLabel barraText;
    private javax.swing.JLabel confirmRegistroIcon;
    private javax.swing.JLabel confirmRegistroText;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JLabel exitText;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JTextField id;
    private javax.swing.JPanel insertPanel;
    private javax.swing.JLabel insertText;
    private javax.swing.JTextField name;
    private javax.swing.JSeparator separator1;
    private javax.swing.JSeparator separator2;
    private javax.swing.JSeparator separator3;
    // End of variables declaration//GEN-END:variables

    // Coloca la primera letra del nombre en Mayus en caso de no estarlo
    public static String nameToUpperCase(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        } else {
            return name.toUpperCase().charAt(0) + name.substring(1, name.length()).toLowerCase();
        }
    }

    // Recorre el archivo
    public static boolean Leer(String fileName, String id) {
        boolean hay = false;
        while (hay == false) {
            try {
                BufferedReader br = new BufferedReader(new FileReader(fileName + ".txt"));
                String line = null;
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
}
