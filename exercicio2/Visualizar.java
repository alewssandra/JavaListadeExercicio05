package exercicio2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Visualizar extends javax.swing.JFrame {
    ArrayList<Cliente> lista_clientes;
    
    public Visualizar(ArrayList<Cliente> lista) {
        initComponents();
        
        lista_clientes = lista;
        
        for(int i=0; i<lista_clientes.size(); i++){
            cb_clientes.addItem(lista_clientes.get(i).getNome());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cb_clientes = new javax.swing.JComboBox<>();
        bt_imprimir = new javax.swing.JButton();
        bt_remover = new javax.swing.JButton();
        bt_enviarMsg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Clientes");

        cb_clientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        bt_imprimir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_imprimir.setText("Imprimir");
        bt_imprimir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_imprimirMouseClicked(evt);
            }
        });

        bt_remover.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_remover.setText("Remover");
        bt_remover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_removerMouseClicked(evt);
            }
        });

        bt_enviarMsg.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_enviarMsg.setText("Enviar Msg");
        bt_enviarMsg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_enviarMsgMouseClicked(evt);
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
                                .addComponent(bt_imprimir)
                                .addGap(18, 18, 18)
                                .addComponent(bt_remover)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cb_clientes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(bt_enviarMsg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cb_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_imprimir)
                    .addComponent(bt_remover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_enviarMsg)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_imprimirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_imprimirMouseClicked
        String nome = cb_clientes.getSelectedItem().toString();
        
        for(int i=0; i<lista_clientes.size(); i++){
            if(lista_clientes.get(i).getNome().equals(nome)){
                lista_clientes.get(i).imprimir();
            }
        }
    }//GEN-LAST:event_bt_imprimirMouseClicked

    private void bt_removerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_removerMouseClicked
        switch(JOptionPane.showConfirmDialog(this, "Tem certeza disso?")){
            case 0: //sim
                String nome = cb_clientes.getSelectedItem().toString();
        
                for(int i=0; i<lista_clientes.size(); i++){
                    if(lista_clientes.get(i).getNome().equals(nome)){
                        lista_clientes.remove(i);
                        cb_clientes.removeItemAt(i);
                        
                        if(lista_clientes.size() == 0){
                            this.dispose();
                        }
                    }
                }
                break;
            case 1:
                break;
            case 2:
                break;
        }
    }//GEN-LAST:event_bt_removerMouseClicked

    private void bt_enviarMsgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_enviarMsgMouseClicked
        for(int i=0; i<lista_clientes.size(); i++){
            if(lista_clientes.get(i) instanceof Vip){
                Vip v = (Vip) lista_clientes.get(i);
                v.enviarMsg();
            }
        }
    }//GEN-LAST:event_bt_enviarMsgMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_enviarMsg;
    private javax.swing.JButton bt_imprimir;
    private javax.swing.JButton bt_remover;
    private javax.swing.JComboBox<String> cb_clientes;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
