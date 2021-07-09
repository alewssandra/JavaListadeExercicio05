package exercicio1;

import javax.swing.JFrame;

public class JanelaA extends javax.swing.JFrame {
    public JanelaA() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        tf_titular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tf_numero = new javax.swing.JTextField();
        rb_corrente = new javax.swing.JRadioButton();
        rb_poupanca = new javax.swing.JRadioButton();
        bt_criar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Titular:");

        tf_titular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Número:");

        tf_numero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        buttonGroup1.add(rb_corrente);
        rb_corrente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_corrente.setText("Corrente");

        buttonGroup1.add(rb_poupanca);
        rb_poupanca.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_poupanca.setText("Poupança");

        bt_criar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bt_criar.setText("Criar Conta");
        bt_criar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_criarMouseClicked(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(tf_titular))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(rb_corrente)
                                .addGap(18, 18, 18)
                                .addComponent(rb_poupanca)
                                .addGap(0, 23, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tf_numero))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(bt_criar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_titular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_corrente)
                    .addComponent(rb_poupanca))
                .addGap(18, 18, 18)
                .addComponent(bt_criar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_criarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_criarMouseClicked
        String titular, numero;
        
        titular = tf_titular.getText();
        numero = tf_numero.getText();
        
        if(rb_corrente.isSelected()){
            Corrente c = new Corrente(titular, numero, 0.0);
            JanelaB janelaB = new JanelaB(c);
            janelaB.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            janelaB.setVisible(true);
        } else if(rb_poupanca.isSelected()){
            Poupanca p = new Poupanca(titular, numero, 0.0, 0.0);
            JanelaB janelaB = new JanelaB(p);
            janelaB.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            janelaB.setVisible(true);
        }
    }//GEN-LAST:event_bt_criarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_criar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rb_corrente;
    private javax.swing.JRadioButton rb_poupanca;
    private javax.swing.JTextField tf_numero;
    private javax.swing.JTextField tf_titular;
    // End of variables declaration//GEN-END:variables
}
