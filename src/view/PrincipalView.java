/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import model.FichaM;


public class PrincipalView extends javax.swing.JFrame {
    FichaM ficha = new FichaM();
    List<FichaM> f = new ArrayList<FichaM>();
    Document doc;
    
    public PrincipalView() {
        initComponents();
        this.setVisible(true);
       // this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        colocaDicas();
        preencheComboBox();
        pegaValores();
        preencheComboBox();
          //JOptionPane.showMessageDialog(null, cbxTrabalho.getSelectedItem());
          //JOptionPane.showMessageDialog(null, grupoBotao.getSelection());
          //JOptionPane.showMessageDialog(null, );
          //JOptionPane.showMessageDialog(null, rbnEspecializacao.getText());
       
    }
    
    
    public void colocaDicas(){
       //SetToolTipText em todos os campos para caso haja dúvidas (não deixei no painel para não deixar poluído)
       tfdNome.setToolTipText("Digite o nome do autor 1, Exemplo: Leopoldo Ferreira de");
       tfdSobrenome.setToolTipText("Digite o sobrenome do autor 1, Exemplo: Paula");
       tfdAutor2.setToolTipText("Digite o nome completo do autor 2.");
       tfdAutor2.setToolTipText("Digite o nome completo do autor 3.");
       ckxMaisAutores.setToolTipText("Caso haja mais autores, selecione esta opção.");
       tfdTitulo.setToolTipText("Digite o Título de seu trabalho, Exemplo: ASPECTOS QUE... Caixa Alta??" );
       tfdSubTitulo.setToolTipText("Digite o Título de seu trabalho, Exemplo: BlaBlá... Caixa Alta??" );
       tfdAno.setToolTipText("Informe o Ano");
       cbxCurso.setToolTipText("Selecione aqui sua graduação");
       tfdNumPaginas.setToolTipText("Numero de páginas em seu trabalho");
       cbxIlustracao.setToolTipText("Seu trabalho possui imagens?");
       
    }
    
    public void preencheComboBox(){
        //Preenche ComboBox de Curso
        cbxCurso.addItem("Selecione");
        cbxCurso.addItem("Curso de Administração");
        cbxCurso.addItem("Curso de Comunicação Social com Habilitação em Publicidade e Propaganda");
        cbxCurso.addItem("Curso de Comunicação Social com Habilitação em Jornalismo");
        cbxCurso.addItem("Curso de Direito");
        cbxCurso.addItem("Curso de Geografia");
        cbxCurso.addItem("Curso de Sistemas de Informação");
        cbxCurso.addItem("Curso de Sucroalcooleiro");
        cbxCurso.addItem("Pós Graduação em Agroecologia no Cerrado");
        cbxCurso.addItem("Pós Graduação Direito Civil e Processual Civil");
        
        
        //Prenche ComboBox Trabalho
        cbxTrabalho.addItem("Selecione");
        cbxTrabalho.addItem("Graduação");
        cbxTrabalho.addItem("Especialização");
        
    }
    
   public List<FichaM> pegaValores(){
      f.add(new FichaM(tfdNome.getText(),
      tfdSobrenome.getText(),
      tfdAutor2.getText(),
      tfdAutor3.getText(),
      ckxMaisAutores.isSelected(),
      tfdTitulo.getText(),
      tfdSubTitulo.getText(),
      Integer.parseInt(tfdAno.getText()),
      tfdCodigoCutter.getText(),
      tfdOrientador.getText(),
      ckxOrientadora.isSelected(),
      tfdCoorientador.getText(),
      ckxCoorientadora.isSelected(),
      cbxTrabalho.getSelectedItem().toString(),
      cbxCurso.getSelectedItem().toString(),
      Integer.parseInt(tfdNumPaginas.getText()),
      cbxIlustracao.getSelectedItem().toString(),
      tfdPalavra1.getText(),
      tfdPalavra2.getText(),
      tfdPalavra3.getText(),
      Integer.parseInt(cbxTamanhoFonte.getSelectedItem().toString())                               
      ));
      /*
      f.setSobrenome(tfdSobrenome.getText());
      f.setAutor2(tfdAutor2.getText());
      f.setAutor3(tfdAutor3.getText());
      f.setMaisAutores(ckxMaisAutores.isSelected());
      //titulo
      //subtitulo
      f.setAno(Integer.parseInt(tfdAno.getText()));
      f.setCodigoCutter(tfdCodigoCutter.getText());
      f.setOrientador(tfdOrientador.getText());
      f.setOrientadora(ckxOrientadora.isSelected());
      f.setCoorientador(tfdCoOrientador.getText());
      f.setCoorientadora(ckxCoorientadora.isSelected());
      f.setTrabalho(cbxTrabalho.getSelectedItem().toString());
      f.setCurso(cbxCurso.getSelectedItem().toString());
      f.setNumPaginas(Integer.parseInt(tfdNumPaginas.getText()));
      f.setIlutrações(cbxIlustracao.getSelectedItem().toString());
      f.setPalavra1(tfdPalavra1.getText());
      f.setPalavra2(tfdPalavra2.getText());
      f.setPalavra3(tfdPalavra3.getText());
      f.setTamanhoFonte(Integer.parseInt(cbxTamanhoFonte.getSelectedItem().toString()));
      */
      return f;
   }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotao = new javax.swing.ButtonGroup();
        pnlComGuia = new javax.swing.JTabbedPane();
        pnlFichaCalatografica = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfdNome = new javax.swing.JTextField();
        tfdSobrenome = new javax.swing.JTextField();
        tfdTitulo = new javax.swing.JTextField();
        tfdSubTitulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfdAno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxCurso = new javax.swing.JComboBox<>();
        tfdNumPaginas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cbxIlustracao = new javax.swing.JComboBox<>();
        tfdPalavra1 = new javax.swing.JTextField();
        tfdPalavra2 = new javax.swing.JTextField();
        cbxTamanhoFonte = new javax.swing.JComboBox<>();
        tfdPalavra3 = new javax.swing.JTextField();
        btnGerarFicha = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tfdOrientador = new javax.swing.JTextField();
        ckxCoorientadora = new javax.swing.JCheckBox();
        tfdCoorientador = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ckxOrientadora = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfdAutor2 = new javax.swing.JTextField();
        tfdAutor3 = new javax.swing.JTextField();
        ckxMaisAutores = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        tfdCodigoCutter = new javax.swing.JTextField();
        btnCodigoCutter = new javax.swing.JButton();
        cbxTrabalho = new javax.swing.JComboBox<>();
        pnlSobre = new javax.swing.JPanel();
        imgSobre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFichaCalatografica.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Módulo de Ficha Catalográfica", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Nome Autor 1:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Sobrenome do Autor 1:");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Título do Trabalho:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Sub-Título do Trabalho:");

        tfdNome.setText("Leopoldo");

        tfdSobrenome.setText("Paula");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Ano:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Trabalho:");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Curso:");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Ilustrações:");

        jLabel13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel13.setText("Numero em arábico:");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("Palavras-Chave:");

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setText("Tamanho da Fonte:");

        cbxIlustracao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não Possui", "Preto e Branco", "Coloridas" }));

        cbxTamanhoFonte.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "9", "10", "11" }));

        btnGerarFicha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnGerarFicha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/Files-Pdf-icon (1).png"))); // NOI18N
        btnGerarFicha.setText("Gerar");
        btnGerarFicha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarFichaActionPerformed(evt);
            }
        });

        jLabel8.setText("Não consegue visualizar o arquivo gerado? abra o LEIA-ME na pasta de instalação.");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.black, java.awt.Color.black, null, null));

        jLabel22.setText("Dúvidas? Mantenha o mouse sobre");

        jLabel23.setText("o campo a ser preenchido para dicas.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(jLabel22))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        tfdOrientador.setPreferredSize(new java.awt.Dimension(223, 20));

        ckxCoorientadora.setText("Coorientador");

        tfdCoorientador.setPreferredSize(new java.awt.Dimension(223, 20));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("Nome completo do orientador*:");

        jLabel21.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel21.setText("Nome completo do coorientador:");

        ckxOrientadora.setText("Orietadora");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Nome Completo do Autor 2:");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Nome Completo do Autor 3:");

        ckxMaisAutores.setText("Mais de 3 Autores");

        jLabel16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel16.setText("Código Cutter:");

        btnCodigoCutter.setText("Saiba Mais");
        btnCodigoCutter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCodigoCutterActionPerformed(evt);
            }
        });

        cbxTrabalho.setPreferredSize(new java.awt.Dimension(56, 23));

        javax.swing.GroupLayout pnlFichaCalatograficaLayout = new javax.swing.GroupLayout(pnlFichaCalatografica);
        pnlFichaCalatografica.setLayout(pnlFichaCalatograficaLayout);
        pnlFichaCalatograficaLayout.setHorizontalGroup(
            pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfdSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(tfdNome)
                                    .addComponent(tfdAutor2)
                                    .addComponent(tfdAutor3)))
                            .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfdSubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ckxMaisAutores)))
                            .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfdCoorientador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tfdOrientador, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ckxOrientadora)
                                            .addComponent(ckxCoorientadora)))
                                    .addComponent(tfdAno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdNumPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxIlustracao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdPalavra2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdPalavra1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfdPalavra3, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbxTamanhoFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                                        .addComponent(tfdCodigoCutter, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCodigoCutter))
                                    .addComponent(cbxTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(32, 32, 32)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btnGerarFicha, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(455, Short.MAX_VALUE))
        );
        pnlFichaCalatograficaLayout.setVerticalGroup(
            pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tfdAutor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tfdAutor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ckxMaisAutores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfdSubTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tfdAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(tfdCodigoCutter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCodigoCutter))
                        .addGap(6, 6, 6)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(tfdOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckxOrientadora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(tfdCoorientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ckxCoorientadora))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbxTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbxCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(tfdNumPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cbxIlustracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(pnlFichaCalatograficaLayout.createSequentialGroup()
                        .addComponent(tfdPalavra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfdPalavra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(tfdPalavra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(pnlFichaCalatograficaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(cbxTamanhoFonte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGerarFicha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(49, 49, 49))
        );

        pnlComGuia.addTab("MFC", pnlFichaCalatografica);

        imgSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagens/LogoSobre.png"))); // NOI18N

        javax.swing.GroupLayout pnlSobreLayout = new javax.swing.GroupLayout(pnlSobre);
        pnlSobre.setLayout(pnlSobreLayout);
        pnlSobreLayout.setHorizontalGroup(
            pnlSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSobreLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(imgSobre)
                .addContainerGap(545, Short.MAX_VALUE))
        );
        pnlSobreLayout.setVerticalGroup(
            pnlSobreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgSobre, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pnlComGuia.addTab("Sobre", pnlSobre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlComGuia)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlComGuia, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCodigoCutterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCodigoCutterActionPerformed
        JOptionPane.showMessageDialog(null,"Abra o arquivo LEIA-ME na pasta do programa");    
    }//GEN-LAST:event_btnCodigoCutterActionPerformed

    private void btnGerarFichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarFichaActionPerformed

        String nomediretorio = null;
        String nomepasta = "RelatoriosAgenda"; // Informe o nome da pasta que armazenará o relatório
        String separador = java.io.File.separator;
        try {
            nomediretorio = "C:" + separador + nomepasta;
            if (!new File(nomediretorio).exists()) {
                (new File(nomediretorio)).mkdir();
            }
           gerarDocumento();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
       /* try {
            Desktop.getDesktop().open(new File("ficha.pdf"));
        } catch (IOException ex) {
            System.out.println("Erro");
        }
        */
    }//GEN-LAST:event_btnGerarFichaActionPerformed
     public void gerarDocumento() throws IOException, DocumentException{
        
         
         doc = new Document(PageSize.A4.rotate());
             
            String caminho = "C:/RelatoriosAgenda/Ficha.pdf";
            PdfWriter.getInstance(doc, new FileOutputStream(caminho));
            doc.open();
            
            PdfPTable tabela = new PdfPTable(1);
            
            tabela.setHorizontalAlignment(Element.ALIGN_RIGHT);
            tabela.setWidthPercentage(100f);
            tabela.setTotalWidth(472);
            
            tabela.setLockedWidth(true);

                Paragraph pNome = new Paragraph(""+tfdNome.getText()+"\n"+tfdSobrenome.getText()+"\n \n");
                pNome.setAlignment(Element.ALIGN_JUSTIFIED);
                PdfPCell colNome = new PdfPCell(pNome);
                tabela.addCell(colNome);
            
            doc.add(tabela);
            
            JOptionPane.showMessageDialog(null, "Relatório de Funcionários salvo com sucesso em C:/RelatoriosAgenda/");
            Desktop.getDesktop().open(new File(caminho));
            doc.close();
     }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCodigoCutter;
    private javax.swing.JToggleButton btnGerarFicha;
    private javax.swing.JComboBox<String> cbxCurso;
    private javax.swing.JComboBox<String> cbxIlustracao;
    private javax.swing.JComboBox<String> cbxTamanhoFonte;
    private javax.swing.JComboBox<String> cbxTrabalho;
    private javax.swing.JCheckBox ckxCoorientadora;
    private javax.swing.JCheckBox ckxMaisAutores;
    private javax.swing.JCheckBox ckxOrientadora;
    private javax.swing.ButtonGroup grupoBotao;
    private javax.swing.JLabel imgSobre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane pnlComGuia;
    private javax.swing.JPanel pnlFichaCalatografica;
    private javax.swing.JPanel pnlSobre;
    private javax.swing.JTextField tfdAno;
    private javax.swing.JTextField tfdAutor2;
    private javax.swing.JTextField tfdAutor3;
    private javax.swing.JTextField tfdCodigoCutter;
    private javax.swing.JTextField tfdCoorientador;
    private javax.swing.JTextField tfdNome;
    private javax.swing.JTextField tfdNumPaginas;
    private javax.swing.JTextField tfdOrientador;
    private javax.swing.JTextField tfdPalavra1;
    private javax.swing.JTextField tfdPalavra2;
    private javax.swing.JTextField tfdPalavra3;
    private javax.swing.JTextField tfdSobrenome;
    private javax.swing.JTextField tfdSubTitulo;
    private javax.swing.JTextField tfdTitulo;
    // End of variables declaration//GEN-END:variables
}
