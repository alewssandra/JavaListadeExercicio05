package exercicio2;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cadastro extends javax.swing.JFrame {
    ArrayList<Cliente> lista_clientes;
    
    public Cadastro() {
        initComponents();
        
        lista_clientes = new ArrayList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_idade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_telefone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rb_masculino = new javax.swing.JRadioButton();
        rb_feminino = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        cb_estado_civil = new javax.swing.JComboBox<>();
        bt_cadastrar = new javax.swing.JButton();
        bt_visualizar = new javax.swing.JButton();
        rb_comum = new javax.swing.JRadioButton();
        rb_vip = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Cadastro de Clientes");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nome:");

        tf_nome.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Idade:");

        tf_idade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_idade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_idadeKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Telefone:");

        tf_telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tf_telefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tf_telefoneKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Sexo:");

        buttonGroup1.add(rb_masculino);
        rb_masculino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_masculino.setText("Masculino");

        buttonGroup1.add(rb_feminino);
        rb_feminino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_feminino.setText("Feminino");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Estado Civil:");

        cb_estado_civil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cb_estado_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo" }));

        bt_cadastrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_cadastrar.setText("Cadastrar");
        bt_cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_cadastrarMouseClicked(evt);
            }
        });

        bt_visualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bt_visualizar.setText("Visualizar");
        bt_visualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_visualizarMouseClicked(evt);
            }
        });

        buttonGroup2.add(rb_comum);
        rb_comum.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_comum.setText("Comum");

        buttonGroup2.add(rb_vip);
        rb_vip.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        rb_vip.setText("VIP");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tf_idade, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(rb_masculino)
                        .addGap(28, 28, 28)
                        .addComponent(rb_feminino))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bt_cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)
                                    .addComponent(cb_estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(rb_comum, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rb_vip)
                            .addComponent(bt_visualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rb_masculino)
                        .addComponent(rb_feminino)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cb_estado_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_comum)
                    .addComponent(rb_vip))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cadastrar)
                    .addComponent(bt_visualizar))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cadastrarMouseClicked
        String nome="", telefone="", sexo="", estado_civil="";
        int idade = 0;
        
        nome = tf_nome.getText();
        
        if(!tf_idade.getText().equals("")){
            idade = Integer.parseInt(tf_idade.getText());
        }
        
        telefone = tf_telefone.getText();
        
        if(rb_masculino.isSelected()){
            sexo = "masculino";
        }
        else if(rb_feminino.isSelected()){
            sexo = "feminino";
        }
        
        estado_civil = cb_estado_civil.getSelectedItem().toString();
        
        if(!nome.equals("") && idade != 0 && !telefone.equals("") && !sexo.equals("") && !estado_civil.equals("")){
            if(rb_comum.isSelected()){
                Comum c = new Comum(nome, idade, telefone, sexo, estado_civil);
                lista_clientes.add(c);
            } else if(rb_vip.isSelected()){
                Vip p = new Vip(nome, idade, telefone, sexo, estado_civil, 20.0);
                lista_clientes.add(p);
            }
            
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "Você deve preencher todos os campos!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bt_cadastrarMouseClicked

    private void bt_visualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_visualizarMouseClicked
        if(lista_clientes.size() > 0){
            Visualizar v = new Visualizar(lista_clientes);
            v.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            v.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null, "Não existe nenhum cliente cadastrado!", "Erro!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bt_visualizarMouseClicked

    private void tf_idadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_idadeKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_tf_idadeKeyTyped

    private void tf_telefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_telefoneKeyTyped
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_tf_telefoneKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cadastrar;
    private javax.swing.JButton bt_visualizar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cb_estado_civil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rb_comum;
    private javax.swing.JRadioButton rb_feminino;
    private javax.swing.JRadioButton rb_masculino;
    private javax.swing.JRadioButton rb_vip;
    private javax.swing.JTextField tf_idade;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_telefone;
    // End of variables declaration//GEN-END:variables
}
