package sistema_estacionamento;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;  
import java.util.Date;
public final class Principal extends javax.swing.JFrame {
    ArrayList<Veiculo> ListaVec;
    String modoVec,modoVag;
    SimpleDateFormat formatter;
    
    public void LoadTableVec(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Modelo","Placa","Categoria","Horario"},0){
            @Override
            public boolean isCellEditable(int row, int column){
                //all cells false
                return false;
            }
        };
        for(int i=0;i<ListaVec.size();i++){
            Object linha[] = new Object[]{ListaVec.get(i).getModelo(),
                                          ListaVec.get(i).getPlaca(),
                                          ListaVec.get(i).getCategoria(),
                                          ListaVec.get(i).getHorario()};
            modelo.addRow(linha);
        }
        tbl_veiculos.setModel(modelo);
        tbl_veiculos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_veiculos.getColumnModel().getColumn(1).setPreferredWidth(50);
        tbl_veiculos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbl_veiculos.getColumnModel().getColumn(3).setPreferredWidth(100);
    }
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        ListaVec = new ArrayList();
        formatter = new SimpleDateFormat("dd/MM HH:mm:ss");
        modoVec="Inicio";
        rb_carro.setSelected(true);
        manipularInterfaceVec();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgroup_veiculos = new javax.swing.ButtonGroup();
        rbgroup_vagas = new javax.swing.ButtonGroup();
        Abas_estacionamento = new javax.swing.JTabbedPane();
        panel_estacionamento = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_veiculos = new javax.swing.JTable();
        btn_alterar = new javax.swing.JButton();
        btn_adicionar = new javax.swing.JButton();
        btn_liberar = new javax.swing.JButton();
        panel_dados_vec = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        c_txt_placa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_txt_modelo = new javax.swing.JTextField();
        btn_salvar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        rb_carro = new javax.swing.JRadioButton();
        rb_moto = new javax.swing.JRadioButton();
        panel_vagas = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_vagas = new javax.swing.JTable();
        btn_vagas_adicionar = new javax.swing.JButton();
        btn_vagas_alterar = new javax.swing.JButton();
        btn_vagas_excluir = new javax.swing.JButton();
        panel_dado_vaga = new javax.swing.JPanel();
        btn_vagas_salvar = new javax.swing.JButton();
        btn_vagas_cancelar = new javax.swing.JButton();
        rb_vagas_carro = new javax.swing.JRadioButton();
        rb_vagas_moto = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_veiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Placa", "Categoria", "Horario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_veiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_veiculosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_veiculos);
        if (tbl_veiculos.getColumnModel().getColumnCount() > 0) {
            tbl_veiculos.getColumnModel().getColumn(0).setResizable(false);
            tbl_veiculos.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_veiculos.getColumnModel().getColumn(1).setResizable(false);
            tbl_veiculos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbl_veiculos.getColumnModel().getColumn(1).setHeaderValue("Placa");
            tbl_veiculos.getColumnModel().getColumn(2).setResizable(false);
            tbl_veiculos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbl_veiculos.getColumnModel().getColumn(2).setHeaderValue("Categoria");
            tbl_veiculos.getColumnModel().getColumn(3).setResizable(false);
            tbl_veiculos.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbl_veiculos.getColumnModel().getColumn(3).setHeaderValue("Horario");
        }

        btn_alterar.setText("Alterar");
        btn_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarActionPerformed(evt);
            }
        });

        btn_adicionar.setText("Adicionar");
        btn_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarActionPerformed(evt);
            }
        });

        btn_liberar.setText("Liberar");
        btn_liberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_liberarActionPerformed(evt);
            }
        });

        panel_dados_vec.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do Veículo"));

        jLabel1.setText("Modelo");

        c_txt_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_txt_placaActionPerformed(evt);
            }
        });

        jLabel2.setText("Placa");

        c_txt_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_txt_modeloActionPerformed(evt);
            }
        });

        btn_salvar.setText("Salvar");
        btn_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salvarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        rbgroup_veiculos.add(rb_carro);
        rb_carro.setText("Carro");

        rbgroup_veiculos.add(rb_moto);
        rb_moto.setText("Moto");

        javax.swing.GroupLayout panel_dados_vecLayout = new javax.swing.GroupLayout(panel_dados_vec);
        panel_dados_vec.setLayout(panel_dados_vecLayout);
        panel_dados_vecLayout.setHorizontalGroup(
            panel_dados_vecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_vecLayout.createSequentialGroup()
                .addGroup(panel_dados_vecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_dados_vecLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c_txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rb_carro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb_moto))
                    .addGroup(panel_dados_vecLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btn_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_dados_vecLayout.setVerticalGroup(
            panel_dados_vecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dados_vecLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_dados_vecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(c_txt_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_txt_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(rb_carro)
                    .addComponent(rb_moto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panel_dados_vecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_salvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_estacionamentoLayout = new javax.swing.GroupLayout(panel_estacionamento);
        panel_estacionamento.setLayout(panel_estacionamentoLayout);
        panel_estacionamentoLayout.setHorizontalGroup(
            panel_estacionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_estacionamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_estacionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_estacionamentoLayout.createSequentialGroup()
                        .addComponent(panel_dados_vec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_estacionamentoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_liberar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_estacionamentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_estacionamentoLayout.setVerticalGroup(
            panel_estacionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_estacionamentoLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_estacionamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adicionar)
                    .addComponent(btn_alterar)
                    .addComponent(btn_liberar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_dados_vec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Abas_estacionamento.addTab("Estacionamento", panel_estacionamento);

        tbl_vagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Categoria", "Situação", "Placa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_vagas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_vagasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_vagas);
        if (tbl_vagas.getColumnModel().getColumnCount() > 0) {
            tbl_vagas.getColumnModel().getColumn(0).setResizable(false);
            tbl_vagas.getColumnModel().getColumn(0).setPreferredWidth(100);
            tbl_vagas.getColumnModel().getColumn(1).setResizable(false);
            tbl_vagas.getColumnModel().getColumn(2).setResizable(false);
            tbl_vagas.getColumnModel().getColumn(3).setResizable(false);
            tbl_vagas.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        btn_vagas_adicionar.setText("Adicionar");
        btn_vagas_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vagas_adicionarActionPerformed(evt);
            }
        });

        btn_vagas_alterar.setText("Alterar");
        btn_vagas_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vagas_alterarActionPerformed(evt);
            }
        });

        btn_vagas_excluir.setText("Excluir");
        btn_vagas_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vagas_excluirActionPerformed(evt);
            }
        });

        panel_dado_vaga.setBorder(javax.swing.BorderFactory.createTitledBorder("Categoria da Vaga"));

        btn_vagas_salvar.setText("Salvar");
        btn_vagas_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vagas_salvarActionPerformed(evt);
            }
        });

        btn_vagas_cancelar.setText("Cancelar");
        btn_vagas_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vagas_cancelarActionPerformed(evt);
            }
        });

        rbgroup_vagas.add(rb_vagas_carro);
        rb_vagas_carro.setText("Carro");

        rbgroup_vagas.add(rb_vagas_moto);
        rb_vagas_moto.setText("Moto");

        javax.swing.GroupLayout panel_dado_vagaLayout = new javax.swing.GroupLayout(panel_dado_vaga);
        panel_dado_vaga.setLayout(panel_dado_vagaLayout);
        panel_dado_vagaLayout.setHorizontalGroup(
            panel_dado_vagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dado_vagaLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(panel_dado_vagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_vagas_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rb_vagas_carro))
                .addGap(18, 18, 18)
                .addGroup(panel_dado_vagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_vagas_moto)
                    .addComponent(btn_vagas_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_dado_vagaLayout.setVerticalGroup(
            panel_dado_vagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dado_vagaLayout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addGroup(panel_dado_vagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_vagas_carro)
                    .addComponent(rb_vagas_moto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_dado_vagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_vagas_cancelar)
                    .addComponent(btn_vagas_salvar))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_vagasLayout = new javax.swing.GroupLayout(panel_vagas);
        panel_vagas.setLayout(panel_vagasLayout);
        panel_vagasLayout.setHorizontalGroup(
            panel_vagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vagasLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btn_vagas_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_vagas_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_vagas_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(panel_vagasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_vagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(panel_dado_vaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panel_vagasLayout.setVerticalGroup(
            panel_vagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_vagasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panel_vagasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_vagas_adicionar)
                    .addComponent(btn_vagas_alterar)
                    .addComponent(btn_vagas_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_dado_vaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        Abas_estacionamento.addTab("Configuração de Vagas", panel_vagas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Abas_estacionamento)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Abas_estacionamento)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_vagas_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vagas_excluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vagas_excluirActionPerformed

    private void btn_vagas_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vagas_alterarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vagas_alterarActionPerformed

    private void btn_vagas_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vagas_adicionarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vagas_adicionarActionPerformed

    private void tbl_vagasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_vagasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_vagasMouseClicked

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        modoVec="Inicio";
        manipularInterfaceVec();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salvarActionPerformed
        if(modoVec.equals("Adicionar")){
            Date date = new Date();
            String categoria = "";
            if(rb_carro.isSelected()) categoria = "Carro";
            else if(rb_moto.isSelected()) categoria = "Moto";
            Veiculo ve = new Veiculo(c_txt_modelo.getText(),c_txt_placa.getText(),categoria,formatter.format(date));
            ListaVec.add(ve);
        }else if(modoVec.equals("Alterar")){
            int index = tbl_veiculos.getSelectedRow();
            ListaVec.get(index).setModelo(c_txt_modelo.getText());
            ListaVec.get(index).setPlaca(c_txt_placa.getText());
            String categoria="";
            if(rb_carro.isSelected()) categoria="Carro";
            else if(rb_moto.isSelected()) categoria="Moto";
            ListaVec.get(index).setCategoria(categoria);
        }
        LoadTableVec();
        modoVec="Inicio";
        manipularInterfaceVec();
    }//GEN-LAST:event_btn_salvarActionPerformed

    private void c_txt_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_txt_modeloActionPerformed

    }//GEN-LAST:event_c_txt_modeloActionPerformed

    private void c_txt_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_txt_placaActionPerformed

    }//GEN-LAST:event_c_txt_placaActionPerformed

    private void btn_liberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_liberarActionPerformed
        int index = tbl_veiculos.getSelectedRow();
        if(index>=0 && index<ListaVec.size()){
            ListaVec.remove(index);
        }
        LoadTableVec();
        modoVec="Inicio";
        manipularInterfaceVec();
    }//GEN-LAST:event_btn_liberarActionPerformed

    private void btn_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarActionPerformed
        modoVec="Adicionar";
        manipularInterfaceVec();
    }//GEN-LAST:event_btn_adicionarActionPerformed

    private void btn_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarActionPerformed
        modoVec="Alterar";
        manipularInterfaceVec();
    }//GEN-LAST:event_btn_alterarActionPerformed

    private void tbl_veiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_veiculosMouseClicked
        int index = tbl_veiculos.getSelectedRow();
        if(index>=0 && index<ListaVec.size()){
            Veiculo V = ListaVec.get(index);
            c_txt_modelo.setText(V.getModelo());
            c_txt_placa.setText(V.getPlaca());
            if("Carro".equals(V.getCategoria())) rb_carro.setSelected(true);
            else if("Moto".equals(V.getCategoria())) rb_moto.setSelected(true);
            modoVec="Selecao";
            manipularInterfaceVec();
        }
    }//GEN-LAST:event_tbl_veiculosMouseClicked

    private void btn_vagas_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vagas_salvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vagas_salvarActionPerformed

    private void btn_vagas_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vagas_cancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vagas_cancelarActionPerformed
    
    public void manipularInterfaceVec(){
        switch(modoVec){
            case "Inicio"->{
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                btn_adicionar.setEnabled(true);
                btn_alterar.setEnabled(false);
                btn_liberar.setEnabled(false);
                c_txt_modelo.setEnabled(false);
                c_txt_placa.setEnabled(false);
                c_txt_modelo.setText("");
                c_txt_placa.setText("");
                rb_carro.setEnabled(false);
                rb_moto.setEnabled(false);
            }
            case "Adicionar"->{
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                btn_adicionar.setEnabled(false);
                btn_alterar.setEnabled(false);
                btn_liberar.setEnabled(false);
                c_txt_modelo.setEnabled(true);
                c_txt_placa.setEnabled(true);
                c_txt_modelo.setText("");
                c_txt_placa.setText("");
                rb_carro.setEnabled(true);
                rb_moto.setEnabled(true);
            }
            case "Alterar"->{
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                btn_adicionar.setEnabled(true);
                btn_alterar.setEnabled(false);
                btn_liberar.setEnabled(false);
                c_txt_modelo.setEnabled(true);
                c_txt_placa.setEnabled(true);
                rb_carro.setEnabled(true);
                rb_moto.setEnabled(true);
            }
            case "Selecao"->{
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                btn_adicionar.setEnabled(true);
                btn_alterar.setEnabled(true);
                btn_liberar.setEnabled(true);
                c_txt_modelo.setEnabled(false);
                c_txt_placa.setEnabled(false);
                rb_carro.setEnabled(false);
                rb_moto.setEnabled(false);
            }
            default->{
                JOptionPane.showMessageDialog(null, "modo invalido");
            }
        }
    }
    public void manipularInterfaceVagas(){
        switch(modoVag){
            case "Inicio"->{
                btn_vagas_salvar.setEnabled(false);
                btn_vagas_cancelar.setEnabled(false);
                btn_vagas_adicionar.setEnabled(true);
                btn_vagas_alterar.setEnabled(false);
                btn_vagas_excluir.setEnabled(false);
                rb_vagas_carro.setEnabled(false);
                rb_vagas_moto.setEnabled(false);
            }
            case "Adicionar"->{
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                btn_adicionar.setEnabled(false);
                btn_alterar.setEnabled(false);
                btn_liberar.setEnabled(false);
                c_txt_modelo.setEnabled(true);
                c_txt_placa.setEnabled(true);
                c_txt_modelo.setText("");
                c_txt_placa.setText("");
                rb_carro.setEnabled(true);
                rb_moto.setEnabled(true);
            }
            case "Alterar"->{
                btn_salvar.setEnabled(true);
                btn_cancelar.setEnabled(true);
                btn_adicionar.setEnabled(true);
                btn_alterar.setEnabled(false);
                btn_liberar.setEnabled(false);
                c_txt_modelo.setEnabled(true);
                c_txt_placa.setEnabled(true);
                rb_carro.setEnabled(true);
                rb_moto.setEnabled(true);
            }
            case "Selecao"->{
                btn_salvar.setEnabled(false);
                btn_cancelar.setEnabled(false);
                btn_adicionar.setEnabled(true);
                btn_alterar.setEnabled(true);
                btn_liberar.setEnabled(true);
                c_txt_modelo.setEnabled(false);
                c_txt_placa.setEnabled(false);
                rb_carro.setEnabled(false);
                rb_moto.setEnabled(false);
            }
            default->{
                JOptionPane.showMessageDialog(null, "modo invalido");
            }
        }
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Abas_estacionamento;
    private javax.swing.JButton btn_adicionar;
    private javax.swing.JButton btn_alterar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_liberar;
    private javax.swing.JButton btn_salvar;
    private javax.swing.JButton btn_vagas_adicionar;
    private javax.swing.JButton btn_vagas_alterar;
    private javax.swing.JButton btn_vagas_cancelar;
    private javax.swing.JButton btn_vagas_excluir;
    private javax.swing.JButton btn_vagas_salvar;
    private javax.swing.JTextField c_txt_modelo;
    private javax.swing.JTextField c_txt_placa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel_dado_vaga;
    private javax.swing.JPanel panel_dados_vec;
    private javax.swing.JPanel panel_estacionamento;
    private javax.swing.JPanel panel_vagas;
    private javax.swing.JRadioButton rb_carro;
    private javax.swing.JRadioButton rb_moto;
    private javax.swing.JRadioButton rb_vagas_carro;
    private javax.swing.JRadioButton rb_vagas_moto;
    private javax.swing.ButtonGroup rbgroup_vagas;
    private javax.swing.ButtonGroup rbgroup_veiculos;
    private javax.swing.JTable tbl_vagas;
    private javax.swing.JTable tbl_veiculos;
    // End of variables declaration//GEN-END:variables
}
