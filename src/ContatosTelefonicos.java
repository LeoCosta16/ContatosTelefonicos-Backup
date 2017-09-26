import java.awt.Color;
import java.awt.MouseInfo;
import javax.swing.DefaultListModel;
import javax.swing.DefaultComboBoxModel;



public class ContatosTelefonicos extends javax.swing.JFrame {

    NovoContato contatos[] = new NovoContato[10];
    DefaultListModel<String> modelContatos = new DefaultListModel<>();
    DefaultListModel<String> modelGrupos = new DefaultListModel<>();
    DefaultComboBoxModel modelCBGrupos = new DefaultComboBoxModel<>();
    boolean editOn = false;
    int contatoSelecionado = 0;
    int i = -1;
   
    public ContatosTelefonicos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenuMais = new javax.swing.JPopupMenu();
        menuItemApagar = new javax.swing.JMenuItem();
        menuItemCompartilhar = new javax.swing.JMenuItem();
        menuItemConfiguracoes = new javax.swing.JMenuItem();
        panelPrincipal = new javax.swing.JPanel();
        panelSuperior = new javax.swing.JPanel();
        buttonMais = new javax.swing.JButton();
        buttonGrupos = new javax.swing.JButton();
        labelContatos = new javax.swing.JLabel();
        textFieldPesquisar = new javax.swing.JTextField();
        buttonAdd = new javax.swing.JButton();
        buttonNovoContato = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listPrincipal = new javax.swing.JList<>(modelContatos);
        panelAddContato = new javax.swing.JPanel();
        panelAddContatoSuperior = new javax.swing.JPanel();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        textFieldNome = new javax.swing.JTextField();
        textFieldNumero = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        textFieldEmail = new javax.swing.JTextField();
        comboBoxGrupos = new javax.swing.JComboBox<>();
        panelContato = new javax.swing.JPanel();
        panelSuperior1 = new javax.swing.JPanel();
        labelContatoContato = new javax.swing.JLabel();
        buttonVoltarPrincipal = new javax.swing.JButton();
        buttonContatoMais = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();
        panelDesign1 = new javax.swing.JPanel();
        labelNumero = new javax.swing.JLabel();
        labelNumeroContato = new javax.swing.JLabel();
        panelEmailContato = new javax.swing.JPanel();
        labelNumero1 = new javax.swing.JLabel();
        labelDesign3 = new javax.swing.JLabel();
        labelNumero2 = new javax.swing.JLabel();
        labelGrupoContato = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        panelGrupos = new javax.swing.JPanel();
        panelSuperior2 = new javax.swing.JPanel();
        labelContatos1 = new javax.swing.JLabel();
        buttonVoltarPrincipal1 = new javax.swing.JButton();
        panelDesign2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        buttonAddGrupo = new javax.swing.JButton();
        buttonApagarGrupo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listGrupos = new javax.swing.JList<>();
        panelAddGrupo = new javax.swing.JPanel();
        panelAddContato1 = new javax.swing.JPanel();
        panelAddContatoSuperior1 = new javax.swing.JPanel();
        buttonCancelarGrupo = new javax.swing.JButton();
        buttonSalvarGrupo = new javax.swing.JButton();
        textFieldNomeGrupo = new javax.swing.JTextField();

        popupMenuMais.setBackground(Color.WHITE);
        popupMenuMais.setForeground(new java.awt.Color(255, 255, 255));
        popupMenuMais.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        popupMenuMais.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        popupMenuMais.setInvoker(buttonMais);
        popupMenuMais.setRequestFocusEnabled(false);

        menuItemApagar.setText("Apagar");
        menuItemApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuItemApagarMouseEntered(evt);
            }
        });
        menuItemApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemApagarActionPerformed(evt);
            }
        });
        popupMenuMais.add(menuItemApagar);

        menuItemCompartilhar.setText("Compartilhar");
        popupMenuMais.add(menuItemCompartilhar);

        menuItemConfiguracoes.setText("Configurações");
        popupMenuMais.add(menuItemConfiguracoes);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contatos");
        setName("framePrincipal"); // NOI18N

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(255, 385));

        panelSuperior.setBackground(new java.awt.Color(0, 204, 153));

        buttonMais.setBackground(new java.awt.Color(0, 154, 115));
        buttonMais.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonMais.setForeground(new java.awt.Color(0, 102, 102));
        buttonMais.setText("Mais");
        buttonMais.setAlignmentX(MouseInfo.getPointerInfo().getLocation().x);
        buttonMais.setAlignmentY(MouseInfo.getPointerInfo().getLocation().y);
        buttonMais.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        buttonMais.setBorderPainted(false);
        buttonMais.setComponentPopupMenu(popupMenuMais);
        buttonMais.setContentAreaFilled(false);
        buttonMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonMaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonMaisMouseExited(evt);
            }
        });
        buttonMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMaisActionPerformed(evt);
            }
        });

        buttonGrupos.setBackground(new java.awt.Color(0, 154, 115));
        buttonGrupos.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonGrupos.setForeground(new java.awt.Color(0, 102, 102));
        buttonGrupos.setText("Grupos");
        buttonGrupos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonGrupos.setBorderPainted(false
        );
        buttonGrupos.setContentAreaFilled(false);
        buttonGrupos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonGruposMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonGruposMouseExited(evt);
            }
        });
        buttonGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGruposActionPerformed(evt);
            }
        });

        labelContatos.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        labelContatos.setForeground(new java.awt.Color(255, 255, 255));
        labelContatos.setText("Contatos");

        javax.swing.GroupLayout panelSuperiorLayout = new javax.swing.GroupLayout(panelSuperior);
        panelSuperior.setLayout(panelSuperiorLayout);
        panelSuperiorLayout.setHorizontalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelContatos)
                .addGap(62, 62, 62)
                .addComponent(buttonGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonMais, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelSuperiorLayout.setVerticalGroup(
            panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(buttonGrupos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonMais)
                    .addComponent(labelContatos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        textFieldPesquisar.setForeground(new java.awt.Color(153, 153, 153));
        textFieldPesquisar.setText("Pesquisar");
        textFieldPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textFieldPesquisar.setSelectionColor(Color.WHITE);
        textFieldPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldPesquisarMouseClicked(evt);
            }
        });
        textFieldPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPesquisarActionPerformed(evt);
            }
        });

        buttonAdd.setBackground(new java.awt.Color(255, 255, 255));
        buttonAdd.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        buttonAdd.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdd.setBorder(null);
        buttonAdd.setContentAreaFilled(false);

        buttonNovoContato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.jpg"))); // NOI18N
        buttonNovoContato.setContentAreaFilled(false);
        buttonNovoContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNovoContatoActionPerformed(evt);
            }
        });

        listPrincipal.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        listPrincipal.setSelectionBackground(new java.awt.Color(255, 255, 255));
        listPrincipal.setSelectionForeground(new java.awt.Color(0, 0, 0));
        listPrincipal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listPrincipalFocusGained(evt);
            }
        });
        listPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPrincipalMouseClicked(evt);
            }
        });
        listPrincipal.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listPrincipalValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listPrincipal);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(buttonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(buttonNovoContato, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textFieldPesquisar)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addComponent(panelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonNovoContato, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        panelAddContato.setBackground(new java.awt.Color(255, 255, 255));
        panelAddContato.setPreferredSize(new java.awt.Dimension(255, 385));
        panelAddContato.setVisible(false);

        panelAddContatoSuperior.setBackground(new java.awt.Color(0, 204, 153));

        buttonCancelar.setBackground(new java.awt.Color(0, 204, 153));
        buttonCancelar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(0, 102, 102));
        buttonCancelar.setText("CANCELAR");
        buttonCancelar.setContentAreaFilled(false);
        buttonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCancelarMouseExited(evt);
            }
        });
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonSalvar.setBackground(new java.awt.Color(0, 204, 153));
        buttonSalvar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        buttonSalvar.setForeground(new java.awt.Color(0, 102, 102));
        buttonSalvar.setText("SALVAR");
        buttonSalvar.setContentAreaFilled(false);
        buttonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSalvarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSalvarMouseExited(evt);
            }
        });
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddContatoSuperiorLayout = new javax.swing.GroupLayout(panelAddContatoSuperior);
        panelAddContatoSuperior.setLayout(panelAddContatoSuperiorLayout);
        panelAddContatoSuperiorLayout.setHorizontalGroup(
            panelAddContatoSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContatoSuperiorLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(buttonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSalvar)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelAddContatoSuperiorLayout.setVerticalGroup(
            panelAddContatoSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContatoSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddContatoSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonSalvar))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        textFieldNome.setForeground(new java.awt.Color(153, 153, 153));
        textFieldNome.setText("Nome");
        textFieldNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNomeMouseClicked(evt);
            }
        });
        textFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeActionPerformed(evt);
            }
        });

        textFieldNumero.setForeground(new java.awt.Color(153, 153, 153));
        textFieldNumero.setText("Número");
        textFieldNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNumeroMouseClicked(evt);
            }
        });
        textFieldNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNumeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 46, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        textFieldEmail.setForeground(new java.awt.Color(153, 153, 153));
        textFieldEmail.setText("E-mail");
        textFieldEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldEmailMouseClicked(evt);
            }
        });
        textFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmailActionPerformed(evt);
            }
        });

        comboBoxGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxGruposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddContatoLayout = new javax.swing.GroupLayout(panelAddContato);
        panelAddContato.setLayout(panelAddContatoLayout);
        panelAddContatoLayout.setHorizontalGroup(
            panelAddContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddContatoSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelAddContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddContatoLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(textFieldNome))
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textFieldNumero)
                    .addComponent(comboBoxGrupos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelAddContatoLayout.setVerticalGroup(
            panelAddContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContatoLayout.createSequentialGroup()
                .addComponent(panelAddContatoSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textFieldNome, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboBoxGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        panelContato.setBackground(new java.awt.Color(255, 255, 255));
        panelContato.setPreferredSize(new java.awt.Dimension(255, 385));
        panelContato.setVisible(false);

        panelSuperior1.setBackground(new java.awt.Color(0, 102, 102));

        labelContatoContato.setBackground(new java.awt.Color(255, 255, 255));
        labelContatoContato.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        labelContatoContato.setForeground(new java.awt.Color(238, 242, 241));
        labelContatoContato.setText("Contato Teste");

        buttonVoltarPrincipal.setBackground(new java.awt.Color(0, 102, 102));
        buttonVoltarPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LeftArrow.png"))); // NOI18N
        buttonVoltarPrincipal.setToolTipText("");
        buttonVoltarPrincipal.setBorder(null);
        buttonVoltarPrincipal.setContentAreaFilled(false);
        buttonVoltarPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarPrincipalActionPerformed(evt);
            }
        });

        buttonContatoMais.setBackground(new java.awt.Color(0, 102, 102));
        buttonContatoMais.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonContatoMais.setForeground(new java.awt.Color(255, 255, 255));
        buttonContatoMais.setText("Mais");
        buttonContatoMais.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonContatoMais.setBorderPainted(false
        );
        buttonContatoMais.setContentAreaFilled(false);
        buttonContatoMais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonContatoMaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonContatoMaisMouseExited(evt);
            }
        });
        buttonContatoMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonContatoMaisActionPerformed(evt);
            }
        });

        buttonEditar.setBackground(new java.awt.Color(0, 102, 102));
        buttonEditar.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonEditar.setForeground(new java.awt.Color(255, 255, 255));
        buttonEditar.setText("Editar");
        buttonEditar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonEditar.setBorderPainted(false
        );
        buttonEditar.setContentAreaFilled(false);
        buttonEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonEditarMouseExited(evt);
            }
        });
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSuperior1Layout = new javax.swing.GroupLayout(panelSuperior1);
        panelSuperior1.setLayout(panelSuperior1Layout);
        panelSuperior1Layout.setHorizontalGroup(
            panelSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperior1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelContatoContato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelSuperior1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonVoltarPrincipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonContatoMais, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelSuperior1Layout.setVerticalGroup(
            panelSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperior1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonVoltarPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonContatoMais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(labelContatoContato)
                .addContainerGap())
        );

        panelDesign1.setBackground(new java.awt.Color(234, 234, 234));

        labelNumero.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 10)); // NOI18N
        labelNumero.setForeground(new java.awt.Color(34, 34, 34));
        labelNumero.setText("Nº de telefone");

        labelNumeroContato.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        labelNumeroContato.setText("Numero Contato Teste");

        javax.swing.GroupLayout panelDesign1Layout = new javax.swing.GroupLayout(panelDesign1);
        panelDesign1.setLayout(panelDesign1Layout);
        panelDesign1Layout.setHorizontalGroup(
            panelDesign1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesign1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDesign1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDesign1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(labelNumeroContato, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(labelNumero))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDesign1Layout.setVerticalGroup(
            panelDesign1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesign1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNumero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelNumeroContato)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelEmailContato.setBackground(new java.awt.Color(234, 234, 234));

        labelNumero1.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 10)); // NOI18N
        labelNumero1.setForeground(new java.awt.Color(34, 34, 34));
        labelNumero1.setText("E-mail");

        labelDesign3.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        labelDesign3.setText("Email teste");

        labelNumero2.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 10)); // NOI18N
        labelNumero2.setForeground(new java.awt.Color(34, 34, 34));
        labelNumero2.setText("Grupo");

        labelGrupoContato.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        labelGrupoContato.setText("Grupo Teste");

        javax.swing.GroupLayout panelEmailContatoLayout = new javax.swing.GroupLayout(panelEmailContato);
        panelEmailContato.setLayout(panelEmailContatoLayout);
        panelEmailContatoLayout.setHorizontalGroup(
            panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEmailContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelEmailContatoLayout.createSequentialGroup()
                        .addGroup(panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNumero1)
                            .addComponent(labelNumero2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDesign3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelEmailContatoLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(labelGrupoContato)))
                        .addGap(35, 35, 35))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmailContatoLayout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
        );
        panelEmailContatoLayout.setVerticalGroup(
            panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEmailContatoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDesign3)
                    .addComponent(labelNumero1))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEmailContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNumero2)
                    .addComponent(labelGrupoContato))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout panelContatoLayout = new javax.swing.GroupLayout(panelContato);
        panelContato.setLayout(panelContatoLayout);
        panelContatoLayout.setHorizontalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDesign1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelEmailContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelContatoLayout.setVerticalGroup(
            panelContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContatoLayout.createSequentialGroup()
                .addComponent(panelSuperior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDesign1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEmailContato, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        panelGrupos.setBackground(new java.awt.Color(255, 255, 255));
        panelGrupos.setPreferredSize(new java.awt.Dimension(255, 385));
        panelGrupos.setVisible(false);

        panelSuperior2.setBackground(new java.awt.Color(0, 204, 153));

        labelContatos1.setFont(new java.awt.Font("Utsaah", 1, 24)); // NOI18N
        labelContatos1.setForeground(new java.awt.Color(255, 255, 255));
        labelContatos1.setText("Grupos");

        buttonVoltarPrincipal1.setBackground(new java.awt.Color(0, 102, 102));
        buttonVoltarPrincipal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LeftArrow.png"))); // NOI18N
        buttonVoltarPrincipal1.setToolTipText("");
        buttonVoltarPrincipal1.setBorder(null);
        buttonVoltarPrincipal1.setContentAreaFilled(false);
        buttonVoltarPrincipal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVoltarPrincipal1ActionPerformed(evt);
            }
        });

        panelDesign2.setBackground(new java.awt.Color(234, 234, 234));
        panelDesign2.setPreferredSize(new java.awt.Dimension(255, 40));

        jLabel1.setBackground(new java.awt.Color(102, 102, 102));
        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 10)); // NOI18N
        jLabel1.setText("Grupos integrados");

        javax.swing.GroupLayout panelDesign2Layout = new javax.swing.GroupLayout(panelDesign2);
        panelDesign2.setLayout(panelDesign2Layout);
        panelDesign2Layout.setHorizontalGroup(
            panelDesign2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesign2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(147, Short.MAX_VALUE))
        );
        panelDesign2Layout.setVerticalGroup(
            panelDesign2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDesign2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonAddGrupo.setBackground(new java.awt.Color(0, 154, 115));
        buttonAddGrupo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonAddGrupo.setForeground(new java.awt.Color(0, 102, 102));
        buttonAddGrupo.setText("Adicionar");
        buttonAddGrupo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonAddGrupo.setBorderPainted(false
        );
        buttonAddGrupo.setContentAreaFilled(false);
        buttonAddGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonAddGrupoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonAddGrupoMouseExited(evt);
            }
        });
        buttonAddGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddGrupoActionPerformed(evt);
            }
        });

        buttonApagarGrupo.setBackground(new java.awt.Color(0, 154, 115));
        buttonApagarGrupo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 11)); // NOI18N
        buttonApagarGrupo.setForeground(new java.awt.Color(0, 102, 102));
        buttonApagarGrupo.setText("Apagar");
        buttonApagarGrupo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonApagarGrupo.setBorderPainted(false
        );
        buttonApagarGrupo.setContentAreaFilled(false);
        buttonApagarGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonApagarGrupoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonApagarGrupoMouseExited(evt);
            }
        });
        buttonApagarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonApagarGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSuperior2Layout = new javax.swing.GroupLayout(panelSuperior2);
        panelSuperior2.setLayout(panelSuperior2Layout);
        panelSuperior2Layout.setHorizontalGroup(
            panelSuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSuperior2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonVoltarPrincipal1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelContatos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonAddGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonApagarGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(panelDesign2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelSuperior2Layout.setVerticalGroup(
            panelSuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSuperior2Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(panelSuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonVoltarPrincipal1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelSuperior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelContatos1)
                        .addComponent(buttonAddGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonApagarGrupo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelDesign2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        listGrupos.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 16)); // NOI18N
        listGrupos.setModel(modelGrupos);
        modelGrupos.addElement(" Meus Contatos");
        modelGrupos.addElement(" Contatos de emergência");
        modelGrupos.addElement(" Colegas de trabalho");
        modelGrupos.addElement(" Família");
        modelGrupos.addElement(" Amigos");
        jScrollPane2.setViewportView(listGrupos);

        javax.swing.GroupLayout panelGruposLayout = new javax.swing.GroupLayout(panelGrupos);
        panelGrupos.setLayout(panelGruposLayout);
        panelGruposLayout.setHorizontalGroup(
            panelGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSuperior2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelGruposLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelGruposLayout.setVerticalGroup(
            panelGruposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGruposLayout.createSequentialGroup()
                .addComponent(panelSuperior2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelAddGrupo.setPreferredSize(new java.awt.Dimension(255, 385));
        panelAddGrupo.setVisible(false);

        panelAddContato1.setBackground(new java.awt.Color(255, 255, 255));
        panelAddContato1.setPreferredSize(new java.awt.Dimension(255, 385));
        panelAddContato.setVisible(false);

        panelAddContatoSuperior1.setBackground(new java.awt.Color(0, 204, 153));

        buttonCancelarGrupo.setBackground(new java.awt.Color(0, 204, 153));
        buttonCancelarGrupo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        buttonCancelarGrupo.setForeground(new java.awt.Color(0, 102, 102));
        buttonCancelarGrupo.setText("CANCELAR");
        buttonCancelarGrupo.setContentAreaFilled(false);
        buttonCancelarGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonCancelarGrupoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonCancelarGrupoMouseExited(evt);
            }
        });
        buttonCancelarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarGrupoActionPerformed(evt);
            }
        });

        buttonSalvarGrupo.setBackground(new java.awt.Color(0, 204, 153));
        buttonSalvarGrupo.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 12)); // NOI18N
        buttonSalvarGrupo.setForeground(new java.awt.Color(0, 102, 102));
        buttonSalvarGrupo.setText("SALVAR");
        buttonSalvarGrupo.setContentAreaFilled(false);
        buttonSalvarGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonSalvarGrupoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonSalvarGrupoMouseExited(evt);
            }
        });
        buttonSalvarGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddContatoSuperior1Layout = new javax.swing.GroupLayout(panelAddContatoSuperior1);
        panelAddContatoSuperior1.setLayout(panelAddContatoSuperior1Layout);
        panelAddContatoSuperior1Layout.setHorizontalGroup(
            panelAddContatoSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContatoSuperior1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(buttonCancelarGrupo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonSalvarGrupo)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        panelAddContatoSuperior1Layout.setVerticalGroup(
            panelAddContatoSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContatoSuperior1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddContatoSuperior1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelarGrupo)
                    .addComponent(buttonSalvarGrupo))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        textFieldNomeGrupo.setForeground(new java.awt.Color(153, 153, 153));
        textFieldNomeGrupo.setText("Nome do grupo");
        textFieldNomeGrupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textFieldNomeGrupoMouseClicked(evt);
            }
        });
        textFieldNomeGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldNomeGrupoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddContato1Layout = new javax.swing.GroupLayout(panelAddContato1);
        panelAddContato1.setLayout(panelAddContato1Layout);
        panelAddContato1Layout.setHorizontalGroup(
            panelAddContato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddContatoSuperior1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddContato1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textFieldNomeGrupo)
                .addContainerGap())
        );
        panelAddContato1Layout.setVerticalGroup(
            panelAddContato1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddContato1Layout.createSequentialGroup()
                .addComponent(panelAddContatoSuperior1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textFieldNomeGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(287, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelAddGrupoLayout = new javax.swing.GroupLayout(panelAddGrupo);
        panelAddGrupo.setLayout(panelAddGrupoLayout);
        panelAddGrupoLayout.setHorizontalGroup(
            panelAddGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddGrupoLayout.createSequentialGroup()
                .addComponent(panelAddContato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelAddGrupoLayout.setVerticalGroup(
            panelAddGrupoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddGrupoLayout.createSequentialGroup()
                .addComponent(panelAddContato1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelAddContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelAddGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelAddContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelAddGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelAddContatoDefault() {
        textFieldNome.setText("Nome");
        textFieldNumero.setText("Numero");
        textFieldEmail.setText("Email");
        comboBoxGrupos.removeAllItems();
        textFieldNome.setForeground(new Color(153,153,153));
        textFieldNumero.setForeground(new Color(153,153,153));
        textFieldEmail.setForeground(new Color(153,153,153));
    }
    /*
    private void setContatoSelecionado(int contatoSelecionado) {
        this.contatoSelecionado = contatoSelecionado;
    }
    
    private int getContatoSelecionado() {
        return contatoSelecionado;
    }
    */
    private void menuItemApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemApagarActionPerformed
        // TODO add your handling code here:
        labelContatos.setText("Selecionar contatos");
        buttonGrupos.setVisible(false);
        buttonMais.setVisible(false);
    }//GEN-LAST:event_menuItemApagarActionPerformed

    private void menuItemApagarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemApagarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemApagarMouseEntered

    private void textFieldPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPesquisarActionPerformed

    private void textFieldPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldPesquisarMouseClicked
        // TODO add your handling code here:
        textFieldPesquisar.setText(" ");
        textFieldPesquisar.setForeground(Color.BLACK);
    }//GEN-LAST:event_textFieldPesquisarMouseClicked

    private void buttonGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGruposActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(false);
        panelGrupos.setVisible(true);
    }//GEN-LAST:event_buttonGruposActionPerformed

    private void buttonGruposMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGruposMouseExited
        // TODO add your handling code here:
        buttonGrupos.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonGruposMouseExited

    private void buttonGruposMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonGruposMouseEntered
        // TODO add your handling code here:
        buttonGrupos.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonGruposMouseEntered

    private void buttonMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMaisActionPerformed
        // TODO add your handling code here:
        int mouseY = MouseInfo.getPointerInfo().getLocation().y;
        int mouseX = MouseInfo.getPointerInfo().getLocation().x;

        popupMenuMais.setVisible(true);
        popupMenuMais.setLocation(mouseX, mouseY);
    }//GEN-LAST:event_buttonMaisActionPerformed

    private void buttonMaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMaisMouseExited
        // TODO add your handling code here:
        buttonMais.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonMaisMouseExited

    private void buttonMaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMaisMouseEntered
        // TODO add your handling code here:
        buttonMais.setForeground(Color.WHITE);

    }//GEN-LAST:event_buttonMaisMouseEntered

    private void buttonNovoContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNovoContatoActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(false);
        panelAddContato.setVisible(true);
        
        comboBoxGrupos.setModel(modelCBGrupos);
        for(int j = 0; j < modelGrupos.getSize(); j++) {
            modelCBGrupos.addElement(modelGrupos.getElementAt(j));
        }
        
        i++;
        //System.out.println("I = " + i);
    }//GEN-LAST:event_buttonNovoContatoActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
        if(editOn) {
            contatos[contatoSelecionado].setNome(textFieldNome.getText()); 
            contatos[contatoSelecionado].setNumero(textFieldNumero.getText());
            contatos[contatoSelecionado].setEmail(textFieldEmail.getText()); 
            contatos[contatoSelecionado].setGrupo(comboBoxGrupos.getSelectedItem().toString());
            
            modelContatos.setElementAt(textFieldNome.getText(), contatoSelecionado);
            labelContatoContato.setText(contatos[contatoSelecionado].getNome());
            labelNumeroContato.setText(contatos[contatoSelecionado].getNumero());
            labelDesign3.setText(contatos[contatoSelecionado].getEmail());
            labelGrupoContato.setText(contatos[contatoSelecionado].getGrupo());
            
        }
        else {
            contatos[i] = new NovoContato();
            contatos[i].setNome(textFieldNome.getText()); 
            contatos[i].setNumero(textFieldNumero.getText());
            contatos[i].setEmail(textFieldEmail.getText()); 
            contatos[i].setGrupo(comboBoxGrupos.getSelectedItem().toString());
        
            modelContatos.addElement(contatos[i].getNome());
            labelContatoContato.setText(contatos[i].getNome());
            labelNumeroContato.setText(contatos[i].getNumero());
            labelDesign3.setText(contatos[i].getEmail());
            labelGrupoContato.setText(contatos[i].getGrupo());
        }

        panelAddContatoDefault();
        editOn = false;
        
        panelAddContato.setVisible(false);
        panelContato.setVisible(true);
        System.out.println("I = " + i);
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarMouseEntered
        // TODO add your handling code here:
        buttonCancelar.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonCancelarMouseEntered

    private void buttonSalvarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarMouseEntered
        // TODO add your handling code here:
        buttonSalvar.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonSalvarMouseEntered

    private void buttonCancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarMouseExited
        // TODO add your handling code here:
        buttonCancelar.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonCancelarMouseExited

    private void buttonSalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarMouseExited
        // TODO add your handling code here:
        buttonSalvar.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonSalvarMouseExited

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
        if(!editOn)
            i--;
        
        panelPrincipal.setVisible(true);
        panelAddContato.setVisible(false);
        
        panelAddContatoDefault();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeActionPerformed

    private void textFieldNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNomeMouseClicked
        // TODO add your handling code here:
        textFieldNome.setText(" ");
        textFieldNome.setForeground(Color.BLACK);
    }//GEN-LAST:event_textFieldNomeMouseClicked

    private void textFieldNumeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNumeroMouseClicked
        // TODO add your handling code here:
        textFieldNumero.setText(" ");
        textFieldNumero.setForeground(Color.BLACK);
    }//GEN-LAST:event_textFieldNumeroMouseClicked

    private void buttonVoltarPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarPrincipalActionPerformed
        // TODO add your handling code here:
        panelPrincipal.setVisible(true);
        panelContato.setVisible(false);
    }//GEN-LAST:event_buttonVoltarPrincipalActionPerformed

    private void buttonContatoMaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonContatoMaisMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonContatoMaisMouseEntered

    private void buttonContatoMaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonContatoMaisMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonContatoMaisMouseExited

    private void buttonContatoMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonContatoMaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonContatoMaisActionPerformed

    private void buttonEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarMouseEntered

    private void buttonEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonEditarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonEditarMouseExited

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
        // TODO add your handling code here:
        editOn = true;
        
        textFieldNome.setForeground(Color.BLACK);
        textFieldNumero.setForeground(Color.BLACK);
        textFieldEmail.setForeground(Color.BLACK);
        
        textFieldNome.setText(contatos[contatoSelecionado].getNome());
        textFieldNumero.setText(contatos[contatoSelecionado].getNumero());
        textFieldEmail.setText(contatos[contatoSelecionado].getEmail());
        comboBoxGrupos.setSelectedItem(contatos[contatoSelecionado].getGrupo());
        
        panelContato.setVisible(false);
        panelAddContato.setVisible(true);
    }//GEN-LAST:event_buttonEditarActionPerformed

    private void textFieldNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNumeroActionPerformed

    private void listPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPrincipalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listPrincipalMouseClicked

    private void listPrincipalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listPrincipalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_listPrincipalFocusGained

    private void listPrincipalValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listPrincipalValueChanged
        // TODO add your handling code here:
        
        panelPrincipal.setVisible(false);
        panelContato.setVisible(true);
        
        contatoSelecionado = listPrincipal.getSelectedIndex();
        
        labelContatoContato.setText(contatos[listPrincipal.getSelectedIndex()].getNome());
        labelNumeroContato.setText(contatos[listPrincipal.getSelectedIndex()].getNumero());       
    }//GEN-LAST:event_listPrincipalValueChanged

    private void buttonVoltarPrincipal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVoltarPrincipal1ActionPerformed
        // TODO add your handling code here:
        panelGrupos.setVisible(false);
        panelPrincipal.setVisible(true);
    }//GEN-LAST:event_buttonVoltarPrincipal1ActionPerformed

    private void textFieldEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldEmailMouseClicked
        // TODO add your handling code here:
        textFieldEmail.setText(" ");
        textFieldEmail.setForeground(Color.BLACK);
    }//GEN-LAST:event_textFieldEmailMouseClicked

    private void textFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldEmailActionPerformed

    private void comboBoxGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxGruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxGruposActionPerformed

    private void buttonAddGrupoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddGrupoMouseEntered
        // TODO add your handling code here:
        buttonAddGrupo.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonAddGrupoMouseEntered

    private void buttonAddGrupoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonAddGrupoMouseExited
        // TODO add your handling code here:
        buttonAddGrupo.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonAddGrupoMouseExited

    private void buttonAddGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddGrupoActionPerformed
        // TODO add your handling code here:
        panelGrupos.setVisible(false);
        panelAddGrupo.setVisible(true);
        
    }//GEN-LAST:event_buttonAddGrupoActionPerformed

    private void buttonApagarGrupoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonApagarGrupoMouseEntered
        // TODO add your handling code here:
        buttonApagarGrupo.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonApagarGrupoMouseEntered

    private void buttonApagarGrupoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonApagarGrupoMouseExited
        // TODO add your handling code here:
        buttonApagarGrupo.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonApagarGrupoMouseExited

    private void buttonApagarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonApagarGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonApagarGrupoActionPerformed

    private void buttonCancelarGrupoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarGrupoMouseEntered
        // TODO add your handling code here:
        buttonCancelarGrupo.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonCancelarGrupoMouseEntered

    private void buttonCancelarGrupoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCancelarGrupoMouseExited
        // TODO add your handling code here:
        buttonCancelarGrupo.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonCancelarGrupoMouseExited

    private void buttonCancelarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarGrupoActionPerformed
        // TODO add your handling code here:
        panelAddGrupo.setVisible(false);
        panelGrupos.setVisible(true);
        
        textFieldNomeGrupo.setText("Nome do grupo");
        textFieldNomeGrupo.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_buttonCancelarGrupoActionPerformed

    private void buttonSalvarGrupoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarGrupoMouseEntered
        // TODO add your handling code here:
        buttonSalvarGrupo.setForeground(Color.WHITE);
    }//GEN-LAST:event_buttonSalvarGrupoMouseEntered

    private void buttonSalvarGrupoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSalvarGrupoMouseExited
        // TODO add your handling code here:
        buttonSalvarGrupo.setForeground(new Color(0,102,102));
    }//GEN-LAST:event_buttonSalvarGrupoMouseExited

    private void buttonSalvarGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarGrupoActionPerformed
        // TODO add your handling code here:
        modelGrupos.addElement(textFieldNomeGrupo.getText());
        
        panelAddGrupo.setVisible(false);
        panelGrupos.setVisible(true);
        
        textFieldNomeGrupo.setText("Nome do grupo");
        textFieldNomeGrupo.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_buttonSalvarGrupoActionPerformed

    private void textFieldNomeGrupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textFieldNomeGrupoMouseClicked
        // TODO add your handling code here:
        textFieldNomeGrupo.setText(" ");
        textFieldNomeGrupo.setForeground(Color.BLACK);
    }//GEN-LAST:event_textFieldNomeGrupoMouseClicked

    private void textFieldNomeGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldNomeGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldNomeGrupoActionPerformed

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
            java.util.logging.Logger.getLogger(ContatosTelefonicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContatosTelefonicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContatosTelefonicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContatosTelefonicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContatosTelefonicos().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JButton buttonAddGrupo;
    private javax.swing.JButton buttonApagarGrupo;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonCancelarGrupo;
    private javax.swing.JButton buttonContatoMais;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JButton buttonGrupos;
    private javax.swing.JButton buttonMais;
    private javax.swing.JButton buttonNovoContato;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JButton buttonSalvarGrupo;
    private javax.swing.JButton buttonVoltarPrincipal;
    private javax.swing.JButton buttonVoltarPrincipal1;
    private javax.swing.JComboBox<String> comboBoxGrupos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelContatoContato;
    private javax.swing.JLabel labelContatos;
    private javax.swing.JLabel labelContatos1;
    private javax.swing.JLabel labelDesign3;
    private javax.swing.JLabel labelGrupoContato;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelNumero1;
    private javax.swing.JLabel labelNumero2;
    private javax.swing.JLabel labelNumeroContato;
    private javax.swing.JList<String> listGrupos;
    private javax.swing.JList<String> listPrincipal;
    private javax.swing.JMenuItem menuItemApagar;
    private javax.swing.JMenuItem menuItemCompartilhar;
    private javax.swing.JMenuItem menuItemConfiguracoes;
    private javax.swing.JPanel panelAddContato;
    private javax.swing.JPanel panelAddContato1;
    private javax.swing.JPanel panelAddContatoSuperior;
    private javax.swing.JPanel panelAddContatoSuperior1;
    private javax.swing.JPanel panelAddGrupo;
    private javax.swing.JPanel panelContato;
    private javax.swing.JPanel panelDesign1;
    private javax.swing.JPanel panelDesign2;
    private javax.swing.JPanel panelEmailContato;
    private javax.swing.JPanel panelGrupos;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelSuperior;
    private javax.swing.JPanel panelSuperior1;
    private javax.swing.JPanel panelSuperior2;
    private javax.swing.JPopupMenu popupMenuMais;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldNome;
    private javax.swing.JTextField textFieldNomeGrupo;
    private javax.swing.JTextField textFieldNumero;
    private javax.swing.JTextField textFieldPesquisar;
    // End of variables declaration//GEN-END:variables
}
