package main;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
        setLocationRelativeTo(null);
        ImageIcon img = new ImageIcon("/images/logo.png");
        setIconImage(img.getImage());
        barraIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        clientesIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessman.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
        saldoIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
        transIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/law.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
        DelClientesIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clipboard.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
        DelTransIcon.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unfollow.png")).getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanel = new javax.swing.JPanel();
        barraPanel = new javax.swing.JPanel();
        barraText = new javax.swing.JLabel();
        barraIcon = new javax.swing.JLabel();
        exitPanel = new javax.swing.JPanel();
        exitText = new javax.swing.JLabel();
        clientesPanel = new javax.swing.JPanel();
        clientesText = new javax.swing.JLabel();
        clientesIcon = new javax.swing.JLabel();
        transPanel = new javax.swing.JPanel();
        transText = new javax.swing.JLabel();
        transIcon = new javax.swing.JLabel();
        DelClientesPanel = new javax.swing.JPanel();
        DelClientesText = new javax.swing.JLabel();
        DelClientesIcon = new javax.swing.JLabel();
        DelTransPanel = new javax.swing.JPanel();
        DelTransText = new javax.swing.JLabel();
        DelTransIcon = new javax.swing.JLabel();
        saldoPanel = new javax.swing.JPanel();
        saldoText = new javax.swing.JLabel();
        saldoIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        fondoPanel.setBackground(new java.awt.Color(242, 240, 241));
        fondoPanel.setForeground(new java.awt.Color(200, 200, 200));
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
        barraText.setForeground(new java.awt.Color(253, 253, 253));
        barraText.setText("BANCO DEL CARIBE");
        barraPanel.add(barraText, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));
        barraPanel.add(barraIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 190, 140));

        fondoPanel.add(barraPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 240));

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
        exitText.setText("Salir");

        javax.swing.GroupLayout exitPanelLayout = new javax.swing.GroupLayout(exitPanel);
        exitPanel.setLayout(exitPanelLayout);
        exitPanelLayout.setHorizontalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(exitText)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        exitPanelLayout.setVerticalGroup(
            exitPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(exitText)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        fondoPanel.add(exitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 590, 140, 40));

        clientesPanel.setBackground(new java.awt.Color(253, 253, 253));
        clientesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientesPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientesPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clientesPanelMousePressed(evt);
            }
        });

        clientesText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clientesText.setForeground(new java.awt.Color(97, 109, 167));
        clientesText.setText("Clientes");

        javax.swing.GroupLayout clientesPanelLayout = new javax.swing.GroupLayout(clientesPanel);
        clientesPanel.setLayout(clientesPanelLayout);
        clientesPanelLayout.setHorizontalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesPanelLayout.createSequentialGroup()
                .addGroup(clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(clientesPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(clientesText))
                    .addGroup(clientesPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(clientesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        clientesPanelLayout.setVerticalGroup(
            clientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(clientesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clientesText)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        fondoPanel.add(clientesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 140, 120));

        transPanel.setBackground(new java.awt.Color(253, 253, 253));
        transPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                transPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                transPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                transPanelMousePressed(evt);
            }
        });

        transText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        transText.setForeground(new java.awt.Color(97, 109, 167));
        transText.setText("Transacciones");

        javax.swing.GroupLayout transPanelLayout = new javax.swing.GroupLayout(transPanel);
        transPanel.setLayout(transPanelLayout);
        transPanelLayout.setHorizontalGroup(
            transPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(transPanelLayout.createSequentialGroup()
                .addGroup(transPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(transPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(transText))
                    .addGroup(transPanelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(transIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        transPanelLayout.setVerticalGroup(
            transPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, transPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(transIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(transText)
                .addGap(14, 14, 14))
        );

        fondoPanel.add(transPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, 140, 120));

        DelClientesPanel.setBackground(new java.awt.Color(253, 253, 253));
        DelClientesPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DelClientesPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DelClientesPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DelClientesPanelMousePressed(evt);
            }
        });

        DelClientesText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DelClientesText.setForeground(new java.awt.Color(159, 101, 100));
        DelClientesText.setText("Eliminar cliente");

        javax.swing.GroupLayout DelClientesPanelLayout = new javax.swing.GroupLayout(DelClientesPanel);
        DelClientesPanel.setLayout(DelClientesPanelLayout);
        DelClientesPanelLayout.setHorizontalGroup(
            DelClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelClientesPanelLayout.createSequentialGroup()
                .addGroup(DelClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DelClientesPanelLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(DelClientesIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DelClientesPanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(DelClientesText)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        DelClientesPanelLayout.setVerticalGroup(
            DelClientesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DelClientesPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(DelClientesIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DelClientesText)
                .addGap(10, 10, 10))
        );

        fondoPanel.add(DelClientesPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 230, 120));

        DelTransPanel.setBackground(new java.awt.Color(253, 253, 253));
        DelTransPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DelTransPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DelTransPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DelTransPanelMousePressed(evt);
            }
        });

        DelTransText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        DelTransText.setForeground(new java.awt.Color(159, 101, 100));
        DelTransText.setText("Eliminar transacción");

        javax.swing.GroupLayout DelTransPanelLayout = new javax.swing.GroupLayout(DelTransPanel);
        DelTransPanel.setLayout(DelTransPanelLayout);
        DelTransPanelLayout.setHorizontalGroup(
            DelTransPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DelTransPanelLayout.createSequentialGroup()
                .addGroup(DelTransPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DelTransPanelLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(DelTransText))
                    .addGroup(DelTransPanelLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(DelTransIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        DelTransPanelLayout.setVerticalGroup(
            DelTransPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DelTransPanelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(DelTransIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DelTransText)
                .addGap(9, 9, 9))
        );

        fondoPanel.add(DelTransPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 220, 120));

        saldoPanel.setBackground(new java.awt.Color(253, 253, 253));
        saldoPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saldoPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saldoPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saldoPanelMousePressed(evt);
            }
        });

        saldoText.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        saldoText.setForeground(new java.awt.Color(97, 109, 167));
        saldoText.setText("Saldo");

        javax.swing.GroupLayout saldoPanelLayout = new javax.swing.GroupLayout(saldoPanel);
        saldoPanel.setLayout(saldoPanelLayout);
        saldoPanelLayout.setHorizontalGroup(
            saldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saldoPanelLayout.createSequentialGroup()
                .addGroup(saldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(saldoPanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(saldoText))
                    .addGroup(saldoPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(saldoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        saldoPanelLayout.setVerticalGroup(
            saldoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, saldoPanelLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(saldoIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(saldoText)
                .addGap(14, 14, 14))
        );

        fondoPanel.add(saldoPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 140, 120));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientesPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesPanelMouseEntered
        // TODO add your handling code here:
        setColor(clientesPanel);
    }//GEN-LAST:event_clientesPanelMouseEntered

    private void clientesPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesPanelMouseExited
        // TODO add your handling code here:
        resetColor(clientesPanel);
    }//GEN-LAST:event_clientesPanelMouseExited

    int xx, xy;
    private void barraPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPanelMousePressed
        // TODO add your handling code here:
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_barraPanelMousePressed

    private void barraPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraPanelMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_barraPanelMouseDragged

    private void transPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transPanelMouseEntered
        // TODO add your handling code here:
        setColor(transPanel);
    }//GEN-LAST:event_transPanelMouseEntered

    private void transPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transPanelMouseExited
        // TODO add your handling code here:
        resetColor(transPanel);
    }//GEN-LAST:event_transPanelMouseExited

    private void DelClientesPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelClientesPanelMouseEntered
        // TODO add your handling code here
        setColor(DelClientesPanel);
    }//GEN-LAST:event_DelClientesPanelMouseEntered

    private void DelClientesPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelClientesPanelMouseExited
        // TODO add your handling code here:
        resetColor(DelClientesPanel);
    }//GEN-LAST:event_DelClientesPanelMouseExited

    private void DelTransPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelTransPanelMouseEntered
        // TODO add your handling code here:
        setColor(DelTransPanel);
    }//GEN-LAST:event_DelTransPanelMouseEntered

    private void DelTransPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelTransPanelMouseExited
        // TODO add your handling code here:
        resetColor(DelTransPanel);

    }//GEN-LAST:event_DelTransPanelMouseExited

    private void saldoPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saldoPanelMouseEntered
        // TODO add your handling code here:
        setColor(saldoPanel);
    }//GEN-LAST:event_saldoPanelMouseEntered

    private void saldoPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saldoPanelMouseExited
        // TODO add your handling code here:
        resetColor(saldoPanel);
    }//GEN-LAST:event_saldoPanelMouseExited

    private void exitPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseEntered
        // TODO add your handling code here:
        setColor(exitPanel);
    }//GEN-LAST:event_exitPanelMouseEntered

    private void exitPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMouseExited
        // TODO add your handling code here:
        resetColor(exitPanel);
    }//GEN-LAST:event_exitPanelMouseExited

    private void clientesPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesPanelMousePressed
        new Clientes().show();
        this.hide();
    }//GEN-LAST:event_clientesPanelMousePressed

    private void transPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transPanelMousePressed
        new Transacciones().show();
        this.hide();

    }//GEN-LAST:event_transPanelMousePressed

    private void exitPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPanelMousePressed
        System.exit(0);
    }//GEN-LAST:event_exitPanelMousePressed

    private void DelClientesPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelClientesPanelMousePressed
        new EliminarCliente().show();
        this.hide();
    }//GEN-LAST:event_DelClientesPanelMousePressed

    private void DelTransPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelTransPanelMousePressed
        new EliminarTrans().show();
        this.hide();
    }//GEN-LAST:event_DelTransPanelMousePressed

    private void saldoPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saldoPanelMousePressed
        // TODO add your handling code here:
        new Saldo().show();
        this.hide();
    }//GEN-LAST:event_saldoPanelMousePressed
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DelClientesIcon;
    private javax.swing.JPanel DelClientesPanel;
    private javax.swing.JLabel DelClientesText;
    private javax.swing.JLabel DelTransIcon;
    private javax.swing.JPanel DelTransPanel;
    private javax.swing.JLabel DelTransText;
    private javax.swing.JLabel barraIcon;
    private javax.swing.JPanel barraPanel;
    private javax.swing.JLabel barraText;
    private javax.swing.JLabel clientesIcon;
    private javax.swing.JPanel clientesPanel;
    private javax.swing.JLabel clientesText;
    private javax.swing.JPanel exitPanel;
    private javax.swing.JLabel exitText;
    private javax.swing.JPanel fondoPanel;
    private javax.swing.JLabel saldoIcon;
    private javax.swing.JPanel saldoPanel;
    private javax.swing.JLabel saldoText;
    private javax.swing.JLabel transIcon;
    private javax.swing.JPanel transPanel;
    private javax.swing.JLabel transText;
    // End of variables declaration//GEN-END:variables
}
