package sistema_estacionamento;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;  
import java.util.Date;
import java.util.concurrent.TimeUnit;
public final class Principal extends javax.swing.JFrame {
    ArrayList<Veiculo> ListaVec;
    ArrayList<Vaga> ListaVagas;
    ArrayList<Registro> ListaRegistro;
    String modoVec,modoVagas;
    SimpleDateFormat formatter;
    
    public void LoadTableVec(){
        DefaultTableModel modelo_vec = new DefaultTableModel(new Object[]{"Modelo","Placa","Categoria","Data / Horario"},0){
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
            modelo_vec.addRow(linha);
        }
        tbl_veiculos.setModel(modelo_vec);
        tbl_veiculos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tbl_veiculos.getColumnModel().getColumn(1).setPreferredWidth(50);
        tbl_veiculos.getColumnModel().getColumn(2).setPreferredWidth(100);
        tbl_veiculos.getColumnModel().getColumn(3).setPreferredWidth(100);
    }
    public void LoadTableVagas(){
        DefaultTableModel modelo_vagas = new DefaultTableModel(new Object[]{"ID","Categoria","Situação","Placa"},0){
            @Override
            public boolean isCellEditable(int row, int column){
                //all cells false
                return false;
            }
        };
        String placa="";
        for(int i=0;i<ListaVagas.size();i++){
            if(ListaVagas.get(i).getSituacao().equals("Ocupada")) placa=ListaVagas.get(i).getPlaca();
            else if(ListaVagas.get(i).getSituacao().equals("Disponivel")) placa= " - ";
            Object linha[] = new Object[]{ListaVagas.get(i).getId(),
                                          ListaVagas.get(i).getCategoria(),
                                          ListaVagas.get(i).getSituacao(),
                                          placa};
            modelo_vagas.addRow(linha);
        }
        tbl_vagas.setModel(modelo_vagas);
        tbl_vagas.getColumnModel().getColumn(0).setPreferredWidth(100);
    }
    public void LoadTableReg(){
        DefaultTableModel modelo_reg = new DefaultTableModel(new Object[]{"Preco","Data / Horario"},0){
            @Override
            public boolean isCellEditable(int row, int column){
                //all cells false
                return false;
            }
        };
        for(int i=0;i<ListaVagas.size();i++){
            Object linha[] = new Object[]{ListaRegistro.get(i).getPreco(),
                                          ListaRegistro.get(i).getStringHorario(),
                                          };
            modelo_reg.addRow(linha);
        }
        tbl_registros.setModel(modelo_reg);
    }
    
    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        ListaVec = new ArrayList();
        ListaVagas = new ArrayList();
        ListaRegistro = new ArrayList();
        modoVec="Inicio";
        modoVagas="Inicio";
        rb_vec_carro.setSelected(true);
        rb_vagas_carro.setSelected(true);
        manipularInterfaceVec();
        manipularInterfaceVagas();
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
        btn_vec_alterar = new javax.swing.JButton();
        btn_vec_adicionar = new javax.swing.JButton();
        btn_vec_liberar = new javax.swing.JButton();
        panel_dados_vec = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        c_txt_placa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        c_txt_modelo = new javax.swing.JTextField();
        btn_vec_salvar = new javax.swing.JButton();
        btn_vec_cancelar = new javax.swing.JButton();
        rb_vec_carro = new javax.swing.JRadioButton();
        rb_vec_moto = new javax.swing.JRadioButton();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_registros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl_veiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Modelo", "Placa", "Categoria", "Data / Horario"
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
            tbl_veiculos.getColumnModel().getColumn(2).setResizable(false);
            tbl_veiculos.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbl_veiculos.getColumnModel().getColumn(3).setResizable(false);
            tbl_veiculos.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        btn_vec_alterar.setText("Alterar");
        btn_vec_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vec_alterarActionPerformed(evt);
            }
        });

        btn_vec_adicionar.setText("Adicionar");
        btn_vec_adicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vec_adicionarActionPerformed(evt);
            }
        });

        btn_vec_liberar.setText("Liberar");
        btn_vec_liberar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vec_liberarActionPerformed(evt);
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

        btn_vec_salvar.setText("Salvar");
        btn_vec_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vec_salvarActionPerformed(evt);
            }
        });

        btn_vec_cancelar.setText("Cancelar");
        btn_vec_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vec_cancelarActionPerformed(evt);
            }
        });

        rbgroup_veiculos.add(rb_vec_carro);
        rb_vec_carro.setText("Carro");

        rbgroup_veiculos.add(rb_vec_moto);
        rb_vec_moto.setText("Moto");

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
                        .addComponent(rb_vec_carro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rb_vec_moto))
                    .addGroup(panel_dados_vecLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btn_vec_salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_vec_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(rb_vec_carro)
                    .addComponent(rb_vec_moto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(panel_dados_vecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_vec_cancelar)
                    .addComponent(btn_vec_salvar))
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
                        .addComponent(btn_vec_adicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_vec_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_vec_liberar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btn_vec_adicionar)
                    .addComponent(btn_vec_alterar)
                    .addComponent(btn_vec_liberar))
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
                .addContainerGap(48, Short.MAX_VALUE))
        );

        Abas_estacionamento.addTab("Configuração de Vagas", panel_vagas);

        tbl_registros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Valor", "Data / Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Float.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbl_registros);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Abas_estacionamento.addTab("Relatório", jPanel1);

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
        int index = tbl_vagas.getSelectedRow();
        if(ListaVagas.get(index).getSituacao().equals("Ocupada")){
            JOptionPane.showMessageDialog(null,"Libere o carro alocado a esta vaga antes de exlui-la");
        }else{
            if(index>=0 && index<ListaVagas.size()) ListaVagas.remove(index);
            LoadTableVagas();
            modoVagas="Inicio";
            manipularInterfaceVagas();
        }
    }//GEN-LAST:event_btn_vagas_excluirActionPerformed

    private void btn_vagas_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vagas_alterarActionPerformed
        int index = tbl_vagas.getSelectedRow();
        if(ListaVagas.get(index).getSituacao().equals("Ocupada")){
            JOptionPane.showMessageDialog(null,"Libere o carro alocado a esta vaga antes de altera-la");
        }else{
            modoVagas="Alterar";
            manipularInterfaceVagas();
        }
    }//GEN-LAST:event_btn_vagas_alterarActionPerformed

    private void btn_vagas_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vagas_adicionarActionPerformed
        modoVagas="Adicionar";
        manipularInterfaceVagas();
    }//GEN-LAST:event_btn_vagas_adicionarActionPerformed

    private void tbl_vagasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_vagasMouseClicked
        int index = tbl_vagas.getSelectedRow();
        if(index>=0 && index<ListaVagas.size()){
            Vaga vg = ListaVagas.get(index);
            if("Carro".equals(vg.getCategoria())) rb_vagas_carro.setSelected(true);
            else if("Moto".equals(vg.getCategoria())) rb_vagas_moto.setSelected(true);
            modoVagas="Selecao";
            manipularInterfaceVagas();
        }
    }//GEN-LAST:event_tbl_vagasMouseClicked

    private void btn_vec_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vec_cancelarActionPerformed
        modoVec="Inicio";
        manipularInterfaceVec();
    }//GEN-LAST:event_btn_vec_cancelarActionPerformed

    private void btn_vec_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vec_salvarActionPerformed
        if(modoVec.equals("Adicionar")){
            String categoria = "";
            if(rb_vec_carro.isSelected()) categoria = "Carro";
            else if(rb_vec_moto.isSelected()) categoria = "Moto";
            Veiculo ve = new Veiculo(c_txt_modelo.getText(),c_txt_placa.getText(),categoria,new Date());
            int i;
            for(i=0;i<ListaVagas.size();i++){
                if(ListaVagas.get(i).getSituacao().equals("Disponivel") && 
                   ListaVagas.get(i).getCategoria().equals(categoria)){
                    ListaVagas.get(i).setVec(ve);
                    break;
                }
            }
            if(i==ListaVagas.size()) JOptionPane.showMessageDialog(null,"Não há vaga para essa categoria de veículo");
            else ListaVec.add(ve);
        }else if(modoVec.equals("Alterar")){
            int index = tbl_veiculos.getSelectedRow();
            ListaVec.get(index).setModelo(c_txt_modelo.getText());
            ListaVec.get(index).setPlaca(c_txt_placa.getText());
            String categoria="";
            if(rb_vec_carro.isSelected()) categoria="Carro";
            else if(rb_vec_moto.isSelected()) categoria="Moto";
            ListaVec.get(index).setCategoria(categoria);
        }
        LoadTableVec();
        LoadTableVagas();
        modoVec="Inicio";
        manipularInterfaceVec();
    }//GEN-LAST:event_btn_vec_salvarActionPerformed

    private void c_txt_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_txt_modeloActionPerformed

    }//GEN-LAST:event_c_txt_modeloActionPerformed

    private void c_txt_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_txt_placaActionPerformed

    }//GEN-LAST:event_c_txt_placaActionPerformed

    private void btn_vec_liberarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vec_liberarActionPerformed
        int index = tbl_veiculos.getSelectedRow();
        for(int i=0;i<ListaVagas.size();i++){
           if(ListaVagas.get(i).getPlaca().equals(ListaVec.get(index).getPlaca())){
               ListaVagas.get(i).setSituacao("Disponivel");
               break;
           }
        }
        float preco = calcularValor(index);
        DecimalFormat formato = new DecimalFormat("#.##"); 
        JOptionPane.showMessageDialog(null,"O dono deste veiculo pargará: R$"+formato.format(preco));
        Date dt = new Date();
        Registro rg = new Registro(preco,dt);
        ListaRegistro.add(rg);
        if(index>=0 && index<ListaVec.size()){
            ListaVec.remove(index);
        }
        LoadTableVec();
        LoadTableVagas();
        LoadTableReg();
        modoVec="Inicio";
        manipularInterfaceVec();
    }//GEN-LAST:event_btn_vec_liberarActionPerformed
    public float calcularValor(int i){
        Date dt = new Date();
        long diffMilSegs = dt.getTime()-ListaVec.get(i).getDHorario().getTime();
        long diff = TimeUnit.SECONDS.convert(diffMilSegs, TimeUnit.MILLISECONDS);
        JOptionPane.showMessageDialog(null,"O veiculo ficou no estacionamento por "+diff+" segundo(s)");
        float resultado = diff;
        return resultado*0.01f;
    }
    
    private void btn_vec_adicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vec_adicionarActionPerformed
        if(ListaVagas.isEmpty()) JOptionPane.showMessageDialog(null,"Não há nenhuma vaga para poder alocar um veiculo!");
        else{
            int i;
            for(i=0;i<ListaVagas.size();i++){ 
                if(ListaVagas.get(i).getSituacao().equals("Disponivel")) break;
            }
            if(i==ListaVagas.size()) JOptionPane.showMessageDialog(null,"Todas as vagas estão ocupadas");
            else{
                modoVec="Adicionar";
                manipularInterfaceVec();
            }
        }
    }//GEN-LAST:event_btn_vec_adicionarActionPerformed

    private void btn_vec_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vec_alterarActionPerformed
        modoVec="Alterar";
        manipularInterfaceVec();
    }//GEN-LAST:event_btn_vec_alterarActionPerformed

    private void tbl_veiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_veiculosMouseClicked
        int index = tbl_veiculos.getSelectedRow();
        if(index>=0 && index<ListaVec.size()){
            Veiculo V = ListaVec.get(index);
            c_txt_modelo.setText(V.getModelo());
            c_txt_placa.setText(V.getPlaca());
            if("Carro".equals(V.getCategoria())) rb_vec_carro.setSelected(true);
            else if("Moto".equals(V.getCategoria())) rb_vec_moto.setSelected(true);
            modoVec="Selecao";
            manipularInterfaceVec();
        }
    }//GEN-LAST:event_tbl_veiculosMouseClicked

    private void btn_vagas_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vagas_salvarActionPerformed
        if(modoVagas.equals("Adicionar")){
            String categoria = "";
            if(rb_vagas_carro.isSelected()) categoria = "Carro";
            else if(rb_vagas_moto.isSelected()) categoria = "Moto";
            int id; 
            for(id=0;id<(ListaVagas.size());id++);
            if(id!=0) id = ListaVagas.get(id-1).getId();
            Vaga vg = new Vaga(id+1,categoria);
            ListaVagas.add(vg);
            LoadTableVagas();
        }else if(modoVagas.equals("Alterar")){
            int index = tbl_vagas.getSelectedRow();
            String categoria="";
            if(rb_vagas_carro.isSelected()) categoria="Carro";
            else if(rb_vagas_moto.isSelected()) categoria="Moto";
            ListaVagas.get(index).setCategoria(categoria);
        }
        LoadTableVagas();
        modoVagas="Inicio";
        manipularInterfaceVagas();
    }//GEN-LAST:event_btn_vagas_salvarActionPerformed

    private void btn_vagas_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vagas_cancelarActionPerformed
        modoVagas="Inicio";
        manipularInterfaceVagas();
    }//GEN-LAST:event_btn_vagas_cancelarActionPerformed
    
    public void manipularInterfaceVec(){
        switch(modoVec){
            case "Inicio"->{
                btn_vec_salvar.setEnabled(false);
                btn_vec_cancelar.setEnabled(false);
                btn_vec_adicionar.setEnabled(true);
                btn_vec_alterar.setEnabled(false);
                btn_vec_liberar.setEnabled(false);
                c_txt_modelo.setEnabled(false);
                c_txt_placa.setEnabled(false);
                c_txt_modelo.setText("");
                c_txt_placa.setText("");
                rb_vec_carro.setEnabled(false);
                rb_vec_moto.setEnabled(false);
            }
            case "Adicionar"->{
                btn_vec_salvar.setEnabled(true);
                btn_vec_cancelar.setEnabled(true);
                btn_vec_adicionar.setEnabled(false);
                btn_vec_alterar.setEnabled(false);
                btn_vec_liberar.setEnabled(false);
                c_txt_modelo.setEnabled(true);
                c_txt_placa.setEnabled(true);
                c_txt_modelo.setText("");
                c_txt_placa.setText("");
                rb_vec_carro.setEnabled(true);
                rb_vec_moto.setEnabled(true);
            }
            case "Alterar"->{
                btn_vec_salvar.setEnabled(true);
                btn_vec_cancelar.setEnabled(true);
                btn_vec_adicionar.setEnabled(true);
                btn_vec_alterar.setEnabled(false);
                btn_vec_liberar.setEnabled(false);
                c_txt_modelo.setEnabled(true);
                c_txt_placa.setEnabled(true);
                rb_vec_carro.setEnabled(true);
                rb_vec_moto.setEnabled(true);
            }
            case "Selecao"->{
                btn_vec_salvar.setEnabled(false);
                btn_vec_cancelar.setEnabled(false);
                btn_vec_adicionar.setEnabled(true);
                btn_vec_alterar.setEnabled(true);
                btn_vec_liberar.setEnabled(true);
                c_txt_modelo.setEnabled(false);
                c_txt_placa.setEnabled(false);
                rb_vec_carro.setEnabled(false);
                rb_vec_moto.setEnabled(false);
            }
            default->{
                JOptionPane.showMessageDialog(null, "modo invalido");
            }
        }
    }
    public void manipularInterfaceVagas(){
        switch(modoVagas){
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
                btn_vagas_salvar.setEnabled(true);
                btn_vagas_cancelar.setEnabled(true);
                btn_vagas_adicionar.setEnabled(false);
                btn_vagas_alterar.setEnabled(false);
                btn_vagas_excluir.setEnabled(false);
                rb_vagas_carro.setEnabled(true);
                rb_vagas_moto.setEnabled(true);
            }
            case "Alterar"->{
                btn_vagas_salvar.setEnabled(true);
                btn_vagas_cancelar.setEnabled(true);
                btn_vagas_adicionar.setEnabled(true);
                btn_vagas_alterar.setEnabled(false);
                btn_vagas_excluir.setEnabled(false);
                rb_vagas_carro.setEnabled(true);
                rb_vagas_moto.setEnabled(true);
            }
            case "Selecao"->{
                btn_vagas_salvar.setEnabled(false);
                btn_vagas_cancelar.setEnabled(false);
                btn_vagas_adicionar.setEnabled(true);
                btn_vagas_alterar.setEnabled(true);
                btn_vagas_excluir.setEnabled(true);
                rb_vagas_carro.setEnabled(false);
                rb_vagas_moto.setEnabled(false);
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
    private javax.swing.JButton btn_vagas_adicionar;
    private javax.swing.JButton btn_vagas_alterar;
    private javax.swing.JButton btn_vagas_cancelar;
    private javax.swing.JButton btn_vagas_excluir;
    private javax.swing.JButton btn_vagas_salvar;
    private javax.swing.JButton btn_vec_adicionar;
    private javax.swing.JButton btn_vec_alterar;
    private javax.swing.JButton btn_vec_cancelar;
    private javax.swing.JButton btn_vec_liberar;
    private javax.swing.JButton btn_vec_salvar;
    private javax.swing.JTextField c_txt_modelo;
    private javax.swing.JTextField c_txt_placa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel panel_dado_vaga;
    private javax.swing.JPanel panel_dados_vec;
    private javax.swing.JPanel panel_estacionamento;
    private javax.swing.JPanel panel_vagas;
    private javax.swing.JRadioButton rb_vagas_carro;
    private javax.swing.JRadioButton rb_vagas_moto;
    private javax.swing.JRadioButton rb_vec_carro;
    private javax.swing.JRadioButton rb_vec_moto;
    private javax.swing.ButtonGroup rbgroup_vagas;
    private javax.swing.ButtonGroup rbgroup_veiculos;
    private javax.swing.JTable tbl_registros;
    private javax.swing.JTable tbl_vagas;
    private javax.swing.JTable tbl_veiculos;
    // End of variables declaration//GEN-END:variables
}
