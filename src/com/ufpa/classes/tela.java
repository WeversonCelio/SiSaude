
package com.ufpa.classes;

import java.text.DecimalFormat;

/**
 *
 * @author Tiago Lima, Suze Lima, weverson Lima 
 */
public class tela extends javax.swing.JFrame {
    public tela() {
        initComponents();
       
    }

        private void diag(float n1, float n2, float n3,  float rqc ) {
                     ////////////////// n1  < 0,83       0,83 a  n2 0,88      0,89 a n3 0,94     > 0,94
             if(rqc<=n1){
                 diag2.setText("Risco: BAIXO");
             }
             else if( rqc>n1 && rqc<=n2) {
                  diag2.setText("Risco: MODERADO");
                 
             }  else if (rqc>n2 && rqc <=n3)       {
                    diag2.setText("Risco: ALTO");
                 
             }else if(rqc>n3){
                    diag2.setText("Risco: MUITO ALTO");
                 
             }
         } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabelaPerc = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        compoundBorder1 = javax.swing.BorderFactory.createCompoundBorder();
        tabelaGrau = new javax.swing.JFrame();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        quadril = new javax.swing.JFrame();
        jLabel4 = new javax.swing.JLabel();
        quadroMedir = new javax.swing.JFrame();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        alturaImc = new javax.swing.JTextField();
        calcularImc1 = new javax.swing.JButton();
        pesoImc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        imc1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoImc = new javax.swing.JTextArea();
        tabelaImc = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        iacresultado = new javax.swing.JTextField();
        alturaIac = new javax.swing.JTextField();
        calcularImc3 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        cirQuadril = new javax.swing.JTextField();
        iacImagem = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        textoIac = new javax.swing.JTextArea();
        sexo1 = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        percetual = new javax.swing.JButton();
        diag1 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        barraPeso = new javax.swing.JSlider();
        barraTempo = new javax.swing.JSlider();
        jLabel16 = new javax.swing.JLabel();
        gastoCal = new javax.swing.JTextField();
        sexo = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        mostrarBP = new javax.swing.JTextField();
        mostrarBT = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        caloria = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sexo2 = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rqcCG = new javax.swing.JTextField();
        rqcCC = new javax.swing.JTextField();
        rcqCalc = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        rqcTexto = new javax.swing.JTextArea();
        rqcValor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        rqcIdade = new javax.swing.JTextField();
        medir = new javax.swing.JButton();
        diag2 = new javax.swing.JTextField();
        logoUFPA = new javax.swing.JLabel();
        tituloPrograma = new javax.swing.JLabel();

        tabelaPerc.setResizable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufpa/imagem/percentual-de-gordura-corporal-corpos.jpg"))); // NOI18N

        javax.swing.GroupLayout tabelaPercLayout = new javax.swing.GroupLayout(tabelaPerc.getContentPane());
        tabelaPerc.getContentPane().setLayout(tabelaPercLayout);
        tabelaPercLayout.setHorizontalGroup(
            tabelaPercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabelaPercLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabelaPercLayout.setVerticalGroup(
            tabelaPercLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabelaPercLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 448, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabelaGrau.setResizable(false);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufpa/imagem/IMCindices.jpg"))); // NOI18N

        javax.swing.GroupLayout tabelaGrauLayout = new javax.swing.GroupLayout(tabelaGrau.getContentPane());
        tabelaGrau.getContentPane().setLayout(tabelaGrauLayout);
        tabelaGrauLayout.setHorizontalGroup(
            tabelaGrauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabelaGrauLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabelaGrauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel20))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tabelaGrauLayout.setVerticalGroup(
            tabelaGrauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabelaGrauLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap())
        );

        quadril.setResizable(false);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufpa/imagem/yake4pkw9se55ri0yxhln3qq4sv7uv4ag8rxvdbooj0bqinvce.jpg"))); // NOI18N

        javax.swing.GroupLayout quadrilLayout = new javax.swing.GroupLayout(quadril.getContentPane());
        quadril.getContentPane().setLayout(quadrilLayout);
        quadrilLayout.setHorizontalGroup(
            quadrilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadrilLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quadrilLayout.setVerticalGroup(
            quadrilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quadrilLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        quadroMedir.setResizable(false);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufpa/imagem/relacao-cintura-quadril_16946_l.jpg"))); // NOI18N

        javax.swing.GroupLayout quadroMedirLayout = new javax.swing.GroupLayout(quadroMedir.getContentPane());
        quadroMedir.getContentPane().setLayout(quadroMedirLayout);
        quadroMedirLayout.setHorizontalGroup(
            quadroMedirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroMedirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        quadroMedirLayout.setVerticalGroup(
            quadroMedirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quadroMedirLayout.createSequentialGroup()
                .addComponent(jLabel15)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SiSaude");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setText("I.M.C");

        alturaImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaImcActionPerformed(evt);
            }
        });
        alturaImc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                alturaImcKeyTyped(evt);
            }
        });

        calcularImc1.setBackground(new java.awt.Color(255, 204, 204));
        calcularImc1.setText("calcular");
        calcularImc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularImc1ActionPerformed(evt);
            }
        });

        pesoImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoImcActionPerformed(evt);
            }
        });
        pesoImc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoImcKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Peso (Kg)");

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Altura (m)");

        jLabel9.setText("<html>IMC é a sigla para Índice de Massa Corporal. Esse cálculo, de Quetelet, indica se uma pessoa está com o peso excessivo em relação à sua altura. O IMC tem o reconhecimento da Organização Mundial de Saúde, e seu valor é expresso em kg/m².</html>");

        jLabel10.setText("Seu IMC é");

        imc1.setEditable(false);
        imc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imc1ActionPerformed(evt);
            }
        });

        textoImc.setEditable(false);
        textoImc.setColumns(20);
        textoImc.setLineWrap(true);
        textoImc.setRows(5);
        textoImc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        textoImc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textoImcKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(textoImc);

        tabelaImc.setText("tabela IMC");
        tabelaImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabelaImcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2)
                                .addGap(27, 27, 27)
                                .addComponent(pesoImc, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imc1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                                .addComponent(tabelaImc))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(alturaImc, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(calcularImc1)))))
                .addGap(20, 20, 20))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(pesoImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alturaImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularImc1))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imc1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(tabelaImc)))
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4);

        jPanel2.add(jPanel3);

        jTabbedPane2.addTab("IMC", jPanel2);

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel22.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel22.setText("indice de adiposidade corporal");

        jLabel23.setText("seu IAC é");

        iacresultado.setEditable(false);
        iacresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iacresultadoActionPerformed(evt);
            }
        });

        alturaIac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaIacActionPerformed(evt);
            }
        });
        alturaIac.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                alturaIacKeyTyped(evt);
            }
        });

        calcularImc3.setBackground(new java.awt.Color(153, 255, 255));
        calcularImc3.setText("calcular");
        calcularImc3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        calcularImc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularImc3ActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setText("Altura (m)");

        jLabel26.setText("<html>O Índice de Adiposidade Corporal, mais conhecido como IAC, serve para medir a gordura do corpo.</html>");

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setText("circunferência do quadril(cm)");

        cirQuadril.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cirQuadrilActionPerformed(evt);
            }
        });
        cirQuadril.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cirQuadrilKeyTyped(evt);
            }
        });

        iacImagem.setText("circunferência do quadril");
        iacImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iacImagemActionPerformed(evt);
            }
        });

        textoIac.setEditable(false);
        textoIac.setColumns(20);
        textoIac.setRows(5);
        jScrollPane3.setViewportView(textoIac);

        sexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel24.setText("SEXO");

        percetual.setText("percentual");
        percetual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percetualActionPerformed(evt);
            }
        });

        diag1.setEditable(false);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iacresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(alturaIac, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(cirQuadril, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(calcularImc3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(iacImagem)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(diag1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(percetual))
                            .addComponent(jScrollPane3))
                        .addGap(53, 53, 53))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iacImagem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alturaIac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cirQuadril, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcularImc3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(percetual)
                    .addComponent(iacresultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(diag1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel9);

        jTabbedPane2.addTab("IAC", jPanel8);

        jPanel10.setBackground(new java.awt.Color(51, 51, 255));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel7.setText("Calorias Gastas exercicios");

        barraPeso.setMaximum(160);
        barraPeso.setValue(0);
        barraPeso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraPesoStateChanged(evt);
            }
        });

        barraTempo.setMaximum(120);
        barraTempo.setValue(0);
        barraTempo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                barraTempoStateChanged(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel16.setText("SEXO");

        gastoCal.setEditable(false);
        gastoCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gastoCalActionPerformed(evt);
            }
        });

        sexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));

        jLabel17.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel17.setText("Seu Peso (kg)");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel18.setText("tempo de exercicio (min)");

        mostrarBP.setEditable(false);
        mostrarBP.setText("0");
        mostrarBP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBPActionPerformed(evt);
            }
        });

        mostrarBT.setEditable(false);
        mostrarBT.setText("0");
        mostrarBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarBTActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel19.setText("Gasto de Calorias");

        caloria.setText("Calcular");
        caloria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caloriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(caloria)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(gastoCal, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(barraPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(mostrarBP, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createSequentialGroup()
                                        .addComponent(barraTempo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mostrarBT, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barraPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel11Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(mostrarBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(mostrarBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(barraTempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(caloria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gastoCal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.add(jPanel11);

        jTabbedPane2.addTab("Caloria", jPanel10);

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel11.setText("Relação cintura-quadril");

        jLabel5.setText("<html>O RCQ é excelente para identificar doenças cardiovasculares e hipertensão arterial, pois leva em consideração a localização da gordura no corpo, as gorduras localizadas principalmente na região abdominal ao redor da cintura fazem com que a pessoa seja mais propensa a desenvolver problemas de saúde do que se a maior parte da gordura estivesse localizada nas coxas e quadris. </html>");

        sexo2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "Masculino", "Feminino" }));
        sexo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sexo2ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel28.setText("SEXO");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("circ. da cintura(cm)");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("  circ. do quadril (cm)");

        rqcCG.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rqcCGKeyTyped(evt);
            }
        });

        rqcCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rqcCCKeyTyped(evt);
            }
        });

        rcqCalc.setBackground(new java.awt.Color(255, 255, 153));
        rcqCalc.setText("Calcular");
        rcqCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcqCalcActionPerformed(evt);
            }
        });

        rqcTexto.setEditable(false);
        rqcTexto.setColumns(20);
        rqcTexto.setLineWrap(true);
        rqcTexto.setRows(5);
        jScrollPane2.setViewportView(rqcTexto);

        rqcValor.setEditable(false);
        rqcValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rqcValorActionPerformed(evt);
            }
        });

        jLabel13.setText("seu RQC é");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("idade");

        rqcIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rqcIdadeKeyTyped(evt);
            }
        });

        medir.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        medir.setText("Como Medir?");
        medir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medirActionPerformed(evt);
            }
        });

        diag2.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(rcqCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(sexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(rqcCC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(medir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rqcCG, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel14))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rqcIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(29, 29, 29))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rqcValor, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diag2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel11)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6)
                    .addComponent(jLabel28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rqcIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rqcCG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rqcCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rqcValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(diag2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rcqCalc)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 483, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("RCQ", jPanel5);

        logoUFPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/ufpa/imagem/sisaude2.png"))); // NOI18N

        tituloPrograma.setBackground(new java.awt.Color(255, 255, 255));
        tituloPrograma.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        tituloPrograma.setForeground(new java.awt.Color(255, 255, 255));
        tituloPrograma.setText("SiSaude");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(tituloPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoUFPA)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloPrograma)
                    .addComponent(logoUFPA, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caloriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caloriaActionPerformed
        DecimalFormat df= new DecimalFormat("0.00");

        int m = sexo.getSelectedIndex();
        switch (m) {
            case 0:
            gastoCal.setText("escolha um sexo");
            break;
            case 1:
            {
                int peso=  barraPeso.getValue();
                int tempo = barraTempo.getValue();

                float gasto= 0.11f *peso *tempo;
                gastoCal.setText("Masc: "+df.format(gasto) +" kcal ");
                break;
            }

            case 2:
            {
                int peso=  barraPeso.getValue();
                int tempo = barraTempo.getValue();

                float gasto= 0.1f *peso *tempo;
                gastoCal.setText("Fem: "+df.format(gasto) +" kcal ");
                break;
            }
            default:
            break;
        }
    }//GEN-LAST:event_caloriaActionPerformed

    private void mostrarBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarBTActionPerformed

    private void mostrarBPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarBPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarBPActionPerformed

    private void gastoCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gastoCalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gastoCalActionPerformed

    private void barraTempoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraTempoStateChanged
        mostrarBT.setText(""+barraTempo.getValue());
    }//GEN-LAST:event_barraTempoStateChanged

    private void barraPesoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_barraPesoStateChanged
        mostrarBP.setText(""+barraPeso.getValue());
    }//GEN-LAST:event_barraPesoStateChanged

    private void percetualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percetualActionPerformed
        tabelaPerc.pack();
        tabelaPerc.setVisible(true);
    }//GEN-LAST:event_percetualActionPerformed

    private void iacImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iacImagemActionPerformed
        quadril.pack();
        quadril.setVisible(true);
    }//GEN-LAST:event_iacImagemActionPerformed

    private void cirQuadrilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cirQuadrilKeyTyped
        String caractere = ".0123456789";
        if(! caractere.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_cirQuadrilKeyTyped

    private void cirQuadrilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cirQuadrilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cirQuadrilActionPerformed

    private void calcularImc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularImc3ActionPerformed
        //(cirquadril/(altura*raiz(altura(m))-18
            DecimalFormat df= new DecimalFormat("0.00");

              if (cirQuadril.getText().length() > 0 && alturaIac.getText().length()>0) {
               
            int m = sexo1.getSelectedIndex();
            
            switch (m) {
                case 0:
                textoIac.setText("escolha um sexo");
                break;
                /////masculino
                case 1:
                {
                    float cirQua = Float.parseFloat(cirQuadril.getText());
                    float altura= Float.parseFloat(alturaIac.getText());
                   double iac = (cirQua /(altura * Math.sqrt(altura)))-18;
                    iacresultado.setText("" + df.format(iac));

                    textoIac.setText("MASCULINO:\n 8 a 20: adiposidade normal \n"
                        + "21 a 25: sobrepreso \n acima de 25: obesidade");
   
                    ////////diagnos
            if(iac>=8 &&  iac<=20){
                diag1.setText("Adiposidade Normal ");
         
            }else if(iac>20 &&  iac<=25){
                  diag1.setText(" Sobrepreso ");
                  
              }else if(iac>25){
                    diag1.setText(" obesidade");
                  
              }
              break;
        } 
     
////////feminino
                case 2:
                {
                    float cirQua = Float.parseFloat(cirQuadril.getText());
                    float altura= Float.parseFloat(alturaIac.getText());
                 double iac = (cirQua /(altura * Math.sqrt(altura)))-18;
                    iacresultado.setText("" + df.format(iac));
                    textoIac.setText("FEMININO:\n 21 a 32: adiposidade normal\n"
                        +   "F: 33 a 38: sobrepreso  \n acima de 38: obesidade " );
        ///////diag
         if(iac>=21 &&  iac<=32){
                diag1.setText("Adiposidade Normal ");
         
            }else if(iac>32 &&  iac<=38){
                  diag1.setText(" Sobrepreso ");
                  
              }else if(iac>38){
                    diag1.setText(" obesidade");
                  
              }
              
                    break;
                }
                
                default:
                break;
            }
   
              }    else {
               textoIac.setText(" Você não preencheu todas unformações acima!"
                        + "\n (Informações necessárias: Circ. do quadril e altura) ");
        }
            
    }//GEN-LAST:event_calcularImc3ActionPerformed

    private void alturaIacKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alturaIacKeyTyped
        String caractere = ".0123456789";
        if(! caractere.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_alturaIacKeyTyped

    private void alturaIacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaIacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaIacActionPerformed

    private void iacresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iacresultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iacresultadoActionPerformed

    private void tabelaImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabelaImcActionPerformed
        tabelaGrau.pack();
        tabelaGrau.setVisible(true);
    }//GEN-LAST:event_tabelaImcActionPerformed

    private void imc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imc1ActionPerformed

    private void pesoImcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoImcKeyTyped
        String caractere = ".0123456789";
        if(! caractere.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_pesoImcKeyTyped

    private void pesoImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoImcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoImcActionPerformed

    private void calcularImc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularImc1ActionPerformed
  
          DecimalFormat df = new DecimalFormat("0.00");
        if (pesoImc.getText().length() > 0 && alturaImc.getText().length()>0)       {

////// IMC tela 1
      
        double altura = Float.parseFloat(alturaImc.getText());
        float peso = Float.parseFloat(pesoImc.getText());
        //////imc = peso/(altura)^2
        altura= Math.pow(altura, 2);

        double imc  = (peso/ altura);

        imc1.setText(df.format(imc)+" kg/m²");
        textoImc.setLineWrap(true);
        //IMC abaixo de 18,5 kg/m²
        if(imc<18.5){
            textoImc.setText("É um número que mostra que a pessoa está "
                + "ABAIXO DO PESO NORMAL . Poderá estar ocorrendo um quadro de"
                + " desnutrição, bulimia, anorexia. É preciso estar atento.");

        }//IMC entre 18,5 a 25 kg/m²
        else if(imc<=25){
            textoImc.setText("Essa é a faixa de peso considerada NORMAL."
                + " As pessoas que atingiram esses valores deverão mantê-los.");

        }//IMC entre 25,1 a 29,9 kg/m²
        else if(imc<=29.9){
            textoImc.setText("Aqui, as pessoas se encontram ACIMA DO PESO. "
                + "É um sinal para começar a mudar hábitos,"
                + " e avaliar o que deve ser mantido ou excluído da dieta.");

        }//IMC entre 30 a 34,9 kg/m²
        else if(imc<=35.9){
            textoImc.setText("As pessoas que atingirem esses números,"
                + " se situam na faixa de obesidade grau I,"
                + " devendo iniciar uma dieta urgente,"
                + " e uma rotina de exercícios diários."
                + " Se ainda não desenvolveram hipertensão e/ou diabetes,"
                + " estão bastante próximos disso.");
        }//IMC entre 35 a 39,9 kg/m²
        else if(imc<=39.9){
            textoImc.setText("Essa é faixa de obesidade grau II, "
                + "considerada severa, e bem preocupante,"
                + " pois está bastante próxima da morbidez. "
                + "As doenças provocadas pelo peso excessivo, "
                + "provavelmente já acometeram essas pessoas.");
        }//IMC acima de 40 kg/m²
        else if(39.9<imc){
            textoImc.setText("Registra um quadro de obesidade mórbida."
                + " Nessa faixa, há grandes riscos para a saúde."
                + " Muito provavelmente, quem atinge esse índice já deverá"
                + " apresentar sintomas como dores articulares, "
                + "cansaço, dificuldade para algumas tarefas simples do "
                + "dia a dia, respiração ofegante com pouca atividade, etc."
                + " É um alerta vermelho.");
        }
        }else{
            textoImc.setText(" Você não preencheu todas unformações acima!"
                        + "\n (Informações necessárias: Peso e altura) ");
        }
    }//GEN-LAST:event_calcularImc1ActionPerformed

    private void alturaImcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alturaImcKeyTyped

        String caractere = ".0123456789";
        if(! caractere.contains(evt.getKeyChar()+"")){
            evt.consume();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_alturaImcKeyTyped

    private void alturaImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaImcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaImcActionPerformed

    private void rqcValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rqcValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rqcValorActionPerformed

    private void rqcCCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rqcCCKeyTyped
        String caractere = ".0123456789";
        if(! caractere.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_rqcCCKeyTyped

    private void rqcCGKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rqcCGKeyTyped
   String caractere = ".0123456789";
        if(! caractere.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_rqcCGKeyTyped

    private void rcqCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcqCalcActionPerformed

        if (rqcCC.getText().length() > 0 && rqcCG.getText().length()>0 && rqcIdade.getText().length()>0) {

        //circunferência da cintura / circunferência do quadril
        float cintura= Float.parseFloat(rqcCC.getText());
       float quadril= Float.parseFloat(rqcCG.getText());
       float rqc = cintura/quadril;
       
       
         int m = sexo2.getSelectedIndex();
         int i = Integer.parseInt(rqcIdade.getText());
         DecimalFormat df = new DecimalFormat("0.00");
         
         switch(m){
         ////////////////////////////////////homens//////////////////////    
             case 1:{
                 rqcValor.setText(df.format(rqc)+"");
                 //////////////////20 a 29   < 0,83       0,83 a 0,88      0,89 a 0,94     > 0,94
                 if(i>=20 && i<=29){
                      rqcTexto.setText("CLASSIFICAÇÃO DE RISCOS PARA HOMENS:\n"
                              + " BAIXO:   < 0,83 \n MODERADO: 0,83 a 0,88 \n ALTO: 0,89 a 0,94 \n MUITO ALTO: > 0,94");
                      diag(0.83f, 0.88f, 0.94f, rqc);
                      
                 }
                 /////////////////////< 0,84       0,84 a 0,91      0,92 a 0,96     > 0,96
                 else if(i>=30 && i<=39){
                     rqcTexto.setText("CLASSIFICAÇÃO DE RISCOS PARA HOMENS:\n"
                              + " BAIXO:   < 0,84 \n MODERADO: 0,84 a 0,91 \n ALTO: 0,92 a 0,96 \n MUITO ALTO: > 0,96"); 
                      diag(0.84f, 0.91f, 0.96f, rqc);
                 }
                 /////////////////////40 a 49   < 0,88       0,88 a 0,95      0,96 a 1,00     > 1,00
                 else if(i>=40 && i<=49){
                    rqcTexto.setText("CLASSIFICAÇÃO DE RISCOS PARA HOMENS:\n"
                              + " BAIXO:   < 0,88 \n MODERADO: 0,88 a 0,95 \n ALTO: 0,96 a 1,00 \n MUITO ALTO: > 1,00"); 
                     diag(0.88f, 0.95f, 1.00f, rqc);
                 }
                 /////////////////////50 a 59   < 0,90       0,90 a 0,96      0,97 a 1,02      > 1,02
                 else if(i>=50 && i<=59){
                      rqcTexto.setText("CLASSIFICAÇÃO DE RISCOS PARA HOMENS:\n"
                              + " BAIXO:   < 0,90 \n MODERADO: 0,90 a 0,96 \n ALTO: 0,97 a 1,02 \n MUITO ALTO: > 1,02"); 
                       diag(0.90f, 0.96f, 1.02f, rqc);
                 }
                 ///////////////////// 60 a 69   < 0,91       0,91 a 0,98      0,99 a 1,03      > 1,03
                 else if(i>=60 && i<=99){
                     rqcTexto.setText("CLASSIFICAÇÃO DE RISCOS PARA HOMENS:\n"
                              + " BAIXO:   < 0,91 \n MODERADO: 0,91 a 0,98 \n ALTO: 0,99 a 1,03 \n MUITO ALTO: > 1,03"); 
                        diag(0.91f, 0.98f, 1.03f, rqc);
                 }
                 /////////////////////
                 else {
                    rqcTexto.setText(" obs: idade abaixo de 20: não é possivel classificar! \n "
                            + "escolha uma idade na faixa de 20 a 90");
                    diag2.setText("");
                    
                 }
                 /////////////////////
                 
                 break;
             }
             /////////////////////////////////mulheres////////////////////////////
             case 2:{
                     rqcValor.setText(df.format(rqc)+"");
                    //////////////////20 a 29   < 0,71   0,71 a 0,77    0,78 a 0,82       > 0,82
                 if(i>=20 && i<=29){
                      rqcTexto.setText("CLASSIFICAÇÃO DE RISCOS PARA MULHERES:\n"
                                + " BAIXO:   < 0,71 \n MODERADO: 0,71 a 0,77 \n ALTO: 0,78 a 0,82 \n MUITO ALTO: > 0,82");
                       diag(0.71f, 0.77f, 0.82f, rqc);
                 }
                 /////////////////////30 a 39   < 0,72   0,72 a 0,78    0,79 a 0,84       > 0,84
                 else if(i>=30 && i<=39){
                      rqcTexto.setText("CLASSIFICAÇÃO DE RISCOS PARA MULHERES:\n"
                                + " BAIXO:   < 0,72 \n MODERADO: 0,72 a 0,78 \n ALTO: 0,79 a 0,84 \n MUITO ALTO: > 0,84");
                         diag(0.72f, 0.78f, 0.84f, rqc);
                 }
                 /////////////////////40 a 49   < 0,73   0,73 a 0,79    0,80 a 0, 87      > 0,87
                 else if(i>=40 && i<=49){
                     rqcTexto.setText("CLASSIFICAÇÃO DE RISCOS PARA MULHERES:\n"
                                + " BAIXO:   < 0,73 \n MODERADO: 0,73 a 0,79 \n ALTO: 0,80 a 0,87 \n MUITO ALTO: > 0,87");
                       diag(0.73f, 0.79f, 0.87f, rqc);
                 }
                 /////////////////////50 a 59   < 0,74   0,74 a 0,81    0,82 a 0,88       > 0,88
                 else if(i>=50 && i<=59){
                     rqcTexto.setText("CLASSIFICAÇÃO DE RISCOS PARA MULHERES:\n"
                                + " BAIXO:   < 0,74 \n MODERADO: 0,74 a 0,81 \n ALTO: 0,82 a 0,88 \n MUITO ALTO: > 0,88");
                       diag(0.74f, 0.81f, 0.88f, rqc);
                 }
                 /////////////////////60 a 69   < 0,76   0,76 a 0,83    0,84 a 0,90        > 0,90
                 else if(i>=60 && i<=99){
                     rqcTexto.setText("CLASSIFICAÇÃO DE RISCOS PARA MULHERES:\n"
                                + " BAIXO:   < 0,76 \n MODERADO: 0,76 a 0,83 \n ALTO: 0,84 a 0,90 \n MUITO ALTO: > 0,90");
                          diag(0.76f, 0.84f, 0.90f, rqc);
                 }
                 /////////////////////
                 else {
                    rqcTexto.setText(" obs: idade abaixo de 20: não é possivel classificar! \n "
                            + "escolha uma idade na faixa de 20 a 90");
                    diag2.setText("");
                    
                 }

                 break;
             }
             default:
             {
                 rqcTexto.setText("Selecione um sexo");
             }
             
         }
         
            }else{
                rqcTexto.setText(" Você não preencheu todas unformações acima!"
                        + "\n (Informações necessárias: Circ. do quadril, circ. da cintura e idade) ");
                
            }
            
    }//GEN-LAST:event_rcqCalcActionPerformed

    private void rqcIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rqcIdadeKeyTyped
           String caractere = "0123456789";
        if(! caractere.contains(evt.getKeyChar()+"")){
            evt.consume();
        }
    }//GEN-LAST:event_rqcIdadeKeyTyped

    private void medirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medirActionPerformed
       quadroMedir.pack();
        quadroMedir.setVisible(true);
    }//GEN-LAST:event_medirActionPerformed

    private void textoImcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoImcKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textoImcKeyTyped

    private void sexo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sexo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sexo2ActionPerformed

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
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alturaIac;
    private javax.swing.JTextField alturaImc;
    private javax.swing.JSlider barraPeso;
    private javax.swing.JSlider barraTempo;
    private javax.swing.JButton calcularImc1;
    private javax.swing.JButton calcularImc3;
    private javax.swing.JButton caloria;
    private javax.swing.JTextField cirQuadril;
    private javax.swing.border.CompoundBorder compoundBorder1;
    private javax.swing.JTextField diag1;
    private javax.swing.JTextField diag2;
    private javax.swing.JTextField gastoCal;
    private javax.swing.JButton iacImagem;
    private javax.swing.JTextField iacresultado;
    private javax.swing.JTextField imc1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel logoUFPA;
    private javax.swing.JButton medir;
    private javax.swing.JTextField mostrarBP;
    private javax.swing.JTextField mostrarBT;
    private javax.swing.JButton percetual;
    private javax.swing.JTextField pesoImc;
    private javax.swing.JFrame quadril;
    private javax.swing.JFrame quadroMedir;
    private javax.swing.JButton rcqCalc;
    private javax.swing.JTextField rqcCC;
    private javax.swing.JTextField rqcCG;
    private javax.swing.JTextField rqcIdade;
    private javax.swing.JTextArea rqcTexto;
    private javax.swing.JTextField rqcValor;
    private javax.swing.JComboBox<String> sexo;
    private javax.swing.JComboBox<String> sexo1;
    private javax.swing.JComboBox<String> sexo2;
    private javax.swing.JFrame tabelaGrau;
    private javax.swing.JButton tabelaImc;
    private javax.swing.JFrame tabelaPerc;
    private javax.swing.JTextArea textoIac;
    private javax.swing.JTextArea textoImc;
    private javax.swing.JLabel tituloPrograma;
    // End of variables declaration//GEN-END:variables
}
