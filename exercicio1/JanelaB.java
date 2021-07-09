package exercicio1;

public class JanelaB extends javax.swing.JFrame {
    Conta c;
    
    public JanelaB(Conta c) {
        initComponents();
        this.c = c;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tf_valor = new javax.swing.JTextField();
        bt_sacar = new javax.swing.JButton();
        bt_depositar = new javax.swing.JButton();
        bt_extrato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Valor:");

        tf_valor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bt_sacar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_sacar.setText("Sacar");
        bt_sacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_sacarMouseClicked(evt);
            }
        });

        bt_depositar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_depositar.setText("Depositar");
        bt_depositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_depositarMouseClicked(evt);
            }
        });

        bt_extrato.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_extrato.setText("Extrato");
        bt_extrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_extratoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bt_sacar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_depositar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_extrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bt_sacar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_depositar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_extrato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_sacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_sacarMouseClicked
        double valor = Double.parseDouble(tf_valor.getText());
        c.sacar(valor);
        tf_valor.setText("");
    }//GEN-LAST:event_bt_sacarMouseClicked

    private void bt_depositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_depositarMouseClicked
        double valor = Double.parseDouble(tf_valor.getText());
        c.depositar(valor);
        tf_valor.setText("");
    }//GEN-LAST:event_bt_depositarMouseClicked

    private void bt_extratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_extratoMouseClicked
        c.extrato();
    }//GEN-LAST:event_bt_extratoMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_depositar;
    private javax.swing.JButton bt_extrato;
    private javax.swing.JButton bt_sacar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tf_valor;
    // End of variables declaration//GEN-END:variables
}
