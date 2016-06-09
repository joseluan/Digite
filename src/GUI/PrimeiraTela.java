package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JViewport;

public final class PrimeiraTela extends javax.swing.JFrame{

    public PrimeiraTela() {
            
        initComponents();
        String[] fontes; // nomes das fontes
        fontes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        cbfonte.removeAllItems();
        for (String fonte : fontes) {
            cbfonte.addItem(fonte);
        }
        tatexto.setLineWrap(true);
        Jarea().setLineWrap(true);
    }
    Image PrIcon = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("logo.png"));
    @SuppressWarnings("unchecked")
    boolean negrito = false;
    boolean italico = false;
    JScrollPane comp;
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabbedpane = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tatexto = new javax.swing.JTextArea();
        Painel = new javax.swing.JPanel();
        btnsalvar = new javax.swing.JButton();
        btnabrir = new javax.swing.JButton();
        btnitalico = new javax.swing.JToggleButton();
        btnnegrito = new javax.swing.JToggleButton();
        btnlimpar = new javax.swing.JButton();
        btncorfonte = new javax.swing.JButton();
        btnadicionar = new javax.swing.JButton();
        btncopiar = new javax.swing.JButton();
        btncolar = new javax.swing.JButton();
        btnfecharaba = new javax.swing.JButton();
        btnfontemenos = new javax.swing.JButton();
        btnfontemais = new javax.swing.JButton();
        cbtamanho = new javax.swing.JComboBox();
        jltamanho = new javax.swing.JLabel();
        cbfonte = new javax.swing.JComboBox();
        jlfonte = new javax.swing.JLabel();
        jmBarra = new javax.swing.JMenuBar();
        Arquivo = new javax.swing.JMenu();
        jmabrir = new javax.swing.JMenuItem();
        jmsalvar = new javax.swing.JMenuItem();
        jmsair = new javax.swing.JMenuItem();
        Editar = new javax.swing.JMenu();
        jmfonte = new javax.swing.JMenuItem();
        jmtamanho = new javax.swing.JMenuItem();
        jmcopiar = new javax.swing.JMenuItem();
        jmcolar = new javax.swing.JMenuItem();
        jmitalico = new javax.swing.JMenuItem();
        jmnegrito = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmfecharaba = new javax.swing.JMenuItem();
        jmespacos = new javax.swing.JMenuItem();
        jmmenusculo = new javax.swing.JMenuItem();
        jmmaiusculo = new javax.swing.JMenuItem();
        jmcomparar = new javax.swing.JMenuItem();
        jmcor = new javax.swing.JMenu();
        jmCortexto = new javax.swing.JMenuItem();
        jmcorferramentas = new javax.swing.JMenuItem();
        jmCorfundo = new javax.swing.JMenuItem();
        jmcorbotão = new javax.swing.JMenuItem();
        jmcorselecao = new javax.swing.JMenu();
        jmcortextoselecionado = new javax.swing.JMenuItem();
        jmcorfundoselecionado = new javax.swing.JMenuItem();
        corredefinir = new javax.swing.JMenuItem();
        jmajuda = new javax.swing.JMenu();
        jmSobre = new javax.swing.JMenuItem();
        jmversao = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DIGITE");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.red);
        setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("logo.png")) );
        setLocation(new java.awt.Point(250, 250));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setMinimumSize(new java.awt.Dimension(925, 510));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setName("DIGITE"); // NOI18N
        setPreferredSize(new java.awt.Dimension(850, 500));
        setSize(new java.awt.Dimension(850, 500));

        tabbedpane.setBackground(new java.awt.Color(255, 0, 0));
        tabbedpane.setToolTipText("");
        tabbedpane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabbedpane.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        tabbedpane.setMinimumSize(new java.awt.Dimension(850, 400));
        tabbedpane.setName(""); // NOI18N
        tabbedpane.setPreferredSize(new java.awt.Dimension(106, 75));
        tabbedpane.setRequestFocusEnabled(false);
        tabbedpane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabbedpaneMouseClicked(evt);
            }
        });

        tatexto.setBackground(new java.awt.Color(254, 254, 254));
        tatexto.setColumns(20);
        tatexto.setFont(new java.awt.Font("Ubuntu", 0, 30)); // NOI18N
        tatexto.setForeground(new java.awt.Color(1, 1, 1));
        tatexto.setRows(5);
        tatexto.setWrapStyleWord(true);
        tatexto.setAutoscrolls(false);
        tatexto.setCaretColor(new java.awt.Color(1, 1, 1));
        tatexto.setMinimumSize(new java.awt.Dimension(100, 100));
        tatexto.setSelectionColor(new java.awt.Color(70, 145, 240));
        jScrollPane2.setViewportView(tatexto);

        tabbedpane.addTab("tab1", jScrollPane2);

        btnsalvar.setBackground(new java.awt.Color(254, 254, 254));
        btnsalvar.setForeground(new java.awt.Color(0, 27, 255));
        btnsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        btnsalvar.setToolTipText("");
        btnsalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnsalvar.setIconTextGap(6);
        btnsalvar.setPreferredSize(new java.awt.Dimension(32, 32));
        btnsalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsalvarMouseExited(evt);
            }
        });
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });

        btnabrir.setBackground(new java.awt.Color(254, 254, 254));
        btnabrir.setForeground(new java.awt.Color(0, 27, 255));
        btnabrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/abrir.png"))); // NOI18N
        btnabrir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnabrir.setIconTextGap(6);
        btnabrir.setPreferredSize(new java.awt.Dimension(32, 32));
        btnabrir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnabrirMouseExited(evt);
            }
        });
        btnabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnabrirActionPerformed(evt);
            }
        });

        btnitalico.setBackground(new java.awt.Color(254, 254, 254));
        btnitalico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/italico.png"))); // NOI18N
        btnitalico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnitalico.setPreferredSize(new java.awt.Dimension(32, 32));
        btnitalico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnitalicoMouseExited(evt);
            }
        });
        btnitalico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnitalicoActionPerformed(evt);
            }
        });

        btnnegrito.setBackground(new java.awt.Color(254, 254, 254));
        btnnegrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/negrito.png"))); // NOI18N
        btnnegrito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnnegrito.setPreferredSize(new java.awt.Dimension(32, 32));
        btnnegrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnnegritoMouseExited(evt);
            }
        });
        btnnegrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnegritoActionPerformed(evt);
            }
        });

        btnlimpar.setBackground(new java.awt.Color(254, 254, 254));
        btnlimpar.setForeground(new java.awt.Color(0, 27, 255));
        btnlimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/limpar.png"))); // NOI18N
        btnlimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnlimpar.setIconTextGap(6);
        btnlimpar.setPreferredSize(new java.awt.Dimension(32, 32));
        btnlimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlimparMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlimparMouseExited(evt);
            }
        });
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });

        btncorfonte.setBackground(new java.awt.Color(254, 254, 254));
        btncorfonte.setForeground(new java.awt.Color(0, 27, 255));
        btncorfonte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/corFonte.png"))); // NOI18N
        btncorfonte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncorfonte.setIconTextGap(6);
        btncorfonte.setPreferredSize(new java.awt.Dimension(32, 32));
        btncorfonte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncorfonteMouseExited(evt);
            }
        });
        btncorfonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncorfonteActionPerformed(evt);
            }
        });

        btnadicionar.setBackground(new java.awt.Color(254, 254, 254));
        btnadicionar.setForeground(new java.awt.Color(0, 27, 255));
        btnadicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar.png"))); // NOI18N
        btnadicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnadicionar.setIconTextGap(6);
        btnadicionar.setPreferredSize(new java.awt.Dimension(32, 32));
        btnadicionar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btnadicionarMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnadicionarMouseMoved(evt);
            }
        });
        btnadicionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnadicionarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnadicionarMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnadicionarMouseReleased(evt);
            }
        });
        btnadicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnadicionarActionPerformed(evt);
            }
        });

        btncopiar.setBackground(new java.awt.Color(254, 254, 254));
        btncopiar.setForeground(new java.awt.Color(0, 27, 255));
        btncopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/copiar.png"))); // NOI18N
        btncopiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncopiar.setIconTextGap(6);
        btncopiar.setPreferredSize(new java.awt.Dimension(32, 32));
        btncopiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncopiarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncopiarMouseExited(evt);
            }
        });
        btncopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncopiarActionPerformed(evt);
            }
        });

        btncolar.setBackground(new java.awt.Color(254, 254, 254));
        btncolar.setForeground(new java.awt.Color(0, 27, 255));
        btncolar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/colar.png"))); // NOI18N
        btncolar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btncolar.setIconTextGap(6);
        btncolar.setPreferredSize(new java.awt.Dimension(32, 32));
        btncolar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncolarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btncolarMouseExited(evt);
            }
        });
        btncolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncolarActionPerformed(evt);
            }
        });

        btnfecharaba.setBackground(new java.awt.Color(254, 254, 254));
        btnfecharaba.setForeground(new java.awt.Color(0, 27, 255));
        btnfecharaba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fecharaba.png"))); // NOI18N
        btnfecharaba.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnfecharaba.setIconTextGap(6);
        btnfecharaba.setPreferredSize(new java.awt.Dimension(32, 32));
        btnfecharaba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnfecharabaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnfecharabaMouseExited(evt);
            }
        });
        btnfecharaba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfecharabaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(btnabrir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnadicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btncorfonte, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnnegrito, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnitalico, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btnlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btnfecharaba, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(btncopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(btncolar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnfecharaba, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncolar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncopiar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnsalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnabrir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btncorfonte, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnadicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnnegrito, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnitalico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, 0))
        );

        btnfontemenos.setBackground(new java.awt.Color(254, 254, 254));
        btnfontemenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fonte-.png"))); // NOI18N
        btnfontemenos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnfontemenos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnfontemenosMouseExited(evt);
            }
        });
        btnfontemenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfontemenosActionPerformed(evt);
            }
        });

        btnfontemais.setBackground(new java.awt.Color(254, 254, 254));
        btnfontemais.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fonte+.png"))); // NOI18N
        btnfontemais.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnfontemais.setPreferredSize(new java.awt.Dimension(32, 32));
        btnfontemais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnfontemaisMouseExited(evt);
            }
        });
        btnfontemais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfontemaisActionPerformed(evt);
            }
        });

        cbtamanho.setBackground(new java.awt.Color(237, 252, 255));
        cbtamanho.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        cbtamanho.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "18", "20", "22", "24", "26", "28", "30", "32", "36", "40", "44", "48", "54", "60", "66", "72", "80", "88", "96" }));
        cbtamanho.setSelectedIndex(17);
        cbtamanho.setSelectedItem("30");
        cbtamanho.setBorder(null);
        cbtamanho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbtamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbtamanhoActionPerformed(evt);
            }
        });

        jltamanho.setBackground(new java.awt.Color(237, 252, 255));
        jltamanho.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 17)); // NOI18N
        jltamanho.setText("Tamanho");

        cbfonte.setBackground(new java.awt.Color(237, 252, 255));
        cbfonte.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        cbfonte.setBorder(null);
        cbfonte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbfonte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbfonteMousePressed(evt);
            }
        });
        cbfonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbfonteActionPerformed(evt);
            }
        });

        jlfonte.setBackground(new java.awt.Color(237, 252, 255));
        jlfonte.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 17)); // NOI18N
        jlfonte.setText("Fonte");

        jmBarra.setBackground(new java.awt.Color(1, 1, 1));
        jmBarra.setBorder(null);
        jmBarra.setForeground(new java.awt.Color(1, 1, 1));
        jmBarra.setAutoscrolls(true);
        jmBarra.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmBarra.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jmBarra.setDoubleBuffered(true);
        jmBarra.setPreferredSize(new java.awt.Dimension(180, 21));

        Arquivo.setText("Arquivo");
        Arquivo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Arquivo.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N

        jmabrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jmabrir.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmabrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/abrir copy.png"))); // NOI18N
        jmabrir.setText("Abrir");
        jmabrir.setBorder(null);
        jmabrir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmabrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmabrirActionPerformed(evt);
            }
        });
        Arquivo.add(jmabrir);

        jmsalvar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmsalvar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmsalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar copy.png"))); // NOI18N
        jmsalvar.setText("Salvar");
        jmsalvar.setBorder(null);
        jmsalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmsalvarActionPerformed(evt);
            }
        });
        Arquivo.add(jmsalvar);

        jmsair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jmsair.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        jmsair.setText("Sair");
        jmsair.setBorder(null);
        jmsair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmsairActionPerformed(evt);
            }
        });
        Arquivo.add(jmsair);

        jmBarra.add(Arquivo);

        Editar.setText("Editar");
        Editar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Editar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N

        jmfonte.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jmfonte.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmfonte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fonte.png"))); // NOI18N
        jmfonte.setText("Fonte");
        jmfonte.setBorder(null);
        jmfonte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmfonte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmfonteActionPerformed(evt);
            }
        });
        Editar.add(jmfonte);

        jmtamanho.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jmtamanho.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmtamanho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/tamanho.png"))); // NOI18N
        jmtamanho.setText("Tamanho");
        jmtamanho.setBorder(null);
        jmtamanho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmtamanho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmtamanhoActionPerformed(evt);
            }
        });
        Editar.add(jmtamanho);

        jmcopiar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmcopiar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmcopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/copiar copy.png"))); // NOI18N
        jmcopiar.setText("Copiar");
        jmcopiar.setBorder(null);
        jmcopiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmcopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcopiarActionPerformed(evt);
            }
        });
        Editar.add(jmcopiar);

        jmcolar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmcolar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmcolar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/colar copy.png"))); // NOI18N
        jmcolar.setText("Colar");
        jmcolar.setBorder(null);
        jmcolar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmcolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcolarActionPerformed(evt);
            }
        });
        Editar.add(jmcolar);

        jmitalico.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jmitalico.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmitalico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/italico copy.png"))); // NOI18N
        jmitalico.setText("Italico");
        jmitalico.setBorder(null);
        jmitalico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmitalico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmitalicoActionPerformed(evt);
            }
        });
        Editar.add(jmitalico);

        jmnegrito.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jmnegrito.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmnegrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/negrito copy.png"))); // NOI18N
        jmnegrito.setText("Negrito");
        jmnegrito.setBorder(null);
        jmnegrito.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmnegrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnegritoActionPerformed(evt);
            }
        });
        Editar.add(jmnegrito);

        jmBarra.add(Editar);

        jMenu1.setText("Ferramentas");
        jMenu1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N

        jmfecharaba.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jmfecharaba.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmfecharaba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/fecharaba copy.png"))); // NOI18N
        jmfecharaba.setText("Fechar aba");
        jmfecharaba.setBorder(null);
        jmfecharaba.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmfecharaba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmfecharabaActionPerformed(evt);
            }
        });
        jMenu1.add(jmfecharaba);

        jmespacos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmespacos.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmespacos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/espacos.png"))); // NOI18N
        jmespacos.setText("Retirar espaços");
        jmespacos.setBorder(null);
        jmespacos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmespacos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmespacosActionPerformed(evt);
            }
        });
        jMenu1.add(jmespacos);

        jmmenusculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_0, java.awt.event.InputEvent.CTRL_MASK));
        jmmenusculo.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmmenusculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/menusculo.png"))); // NOI18N
        jmmenusculo.setText("menusculo");
        jmmenusculo.setBorder(null);
        jmmenusculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmmenusculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmmenusculoActionPerformed(evt);
            }
        });
        jMenu1.add(jmmenusculo);

        jmmaiusculo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        jmmaiusculo.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmmaiusculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/maisusculo.png"))); // NOI18N
        jmmaiusculo.setText("MAIUSCULO");
        jmmaiusculo.setBorder(null);
        jmmaiusculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmmaiusculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmmaiusculoActionPerformed(evt);
            }
        });
        jMenu1.add(jmmaiusculo);

        jmcomparar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        jmcomparar.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmcomparar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/comparacao.png"))); // NOI18N
        jmcomparar.setText("Comparar");
        jmcomparar.setBorder(null);
        jmcomparar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmcomparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcompararActionPerformed(evt);
            }
        });
        jMenu1.add(jmcomparar);

        jmBarra.add(jMenu1);

        jmcor.setText("Cores");
        jmcor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmcor.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N

        jmCortexto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jmCortexto.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmCortexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/corestexto.png"))); // NOI18N
        jmCortexto.setText("Texto");
        jmCortexto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmCortexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCortextoActionPerformed(evt);
            }
        });
        jmcor.add(jmCortexto);

        jmcorferramentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        jmcorferramentas.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmcorferramentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/corFerramentas.png"))); // NOI18N
        jmcorferramentas.setText("Ferramentas");
        jmcorferramentas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmcorferramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcorferramentasActionPerformed(evt);
            }
        });
        jmcor.add(jmcorferramentas);

        jmCorfundo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_MASK));
        jmCorfundo.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmCorfundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/coresfonte copy.png"))); // NOI18N
        jmCorfundo.setText("Fundo");
        jmCorfundo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmCorfundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCorfundoActionPerformed(evt);
            }
        });
        jmcor.add(jmCorfundo);

        jmcorbotão.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jmcorbotão.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmcorbotão.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/coresbotao.png"))); // NOI18N
        jmcorbotão.setText("Botão");
        jmcorbotão.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmcorbotão.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcorbotãoActionPerformed(evt);
            }
        });
        jmcor.add(jmcorbotão);

        jmcorselecao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/corselecao.png"))); // NOI18N
        jmcorselecao.setText("Seleção");
        jmcorselecao.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N

        jmcortextoselecionado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jmcortextoselecionado.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmcortextoselecionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/corestexto.png"))); // NOI18N
        jmcortextoselecionado.setText("Texto");
        jmcortextoselecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcortextoselecionadoActionPerformed(evt);
            }
        });
        jmcorselecao.add(jmcortextoselecionado);

        jmcorfundoselecionado.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jmcorfundoselecionado.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmcorfundoselecionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/coresfonte copy.png"))); // NOI18N
        jmcorfundoselecionado.setText("Fundo");
        jmcorfundoselecionado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmcorfundoselecionadoActionPerformed(evt);
            }
        });
        jmcorselecao.add(jmcorfundoselecionado);

        jmcor.add(jmcorselecao);

        corredefinir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        corredefinir.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        corredefinir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/redifinir.png"))); // NOI18N
        corredefinir.setText("Redefinir");
        corredefinir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        corredefinir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                corredefinirActionPerformed(evt);
            }
        });
        jmcor.add(corredefinir);

        jmBarra.add(jmcor);

        jmajuda.setText("Ajuda");
        jmajuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmajuda.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N

        jmSobre.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jmSobre.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sobre.png"))); // NOI18N
        jmSobre.setText("Sobre");
        jmSobre.setBorder(null);
        jmSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSobreActionPerformed(evt);
            }
        });
        jmajuda.add(jmSobre);

        jmversao.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmversao.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 15)); // NOI18N
        jmversao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/colar copy.png"))); // NOI18N
        jmversao.setText("Versão");
        jmversao.setBorder(null);
        jmversao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jmversao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmversaoActionPerformed(evt);
            }
        });
        jmajuda.add(jmversao);

        jmBarra.add(jmajuda);

        setJMenuBar(jmBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jlfonte)
                .addGap(5, 5, 5)
                .addComponent(cbfonte, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jltamanho)
                .addGap(5, 5, 5)
                .addComponent(cbtamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfontemais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnfontemenos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
            .addComponent(tabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Painel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnfontemais, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnfontemenos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbfonte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlfonte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jltamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbtamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabbedpane, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        tabbedpane.getAccessibleContext().setAccessibleName("Arquivo1");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int contador = 2;
    String Stexto;
    String ctrl = "";
    String textofonte = "";
    String textotamanho = "";
    private void cbfonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbfonteActionPerformed
        mudartamanho(Jarea());  
    }//GEN-LAST:event_cbfonteActionPerformed

    private void cbfonteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbfonteMousePressed
        
    }//GEN-LAST:event_cbfonteMousePressed

    private void jmsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmsairActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_jmsairActionPerformed
    
    private void jmabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmabrirActionPerformed
        JFileChooser fc = new JFileChooser();     
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }    
        try {
            FileReader fr = new FileReader(fc.getSelectedFile());
            BufferedReader br = new BufferedReader(fr);
            String linha;
            StringBuilder mensagem = new StringBuilder();
            while((linha = br.readLine()) != null) {
                mensagem.append(linha).append("\n");
            }
            Jarea().setText(mensagem.toString());
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Exeção(FileNotFoundException) ao ler o arquivo - "
                    +ex.getMessage(), "___Exeção___", WIDTH);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Exeção(IOException) ao ler o arquivo - "
                    +ex.getMessage(), "___Exeção___", WIDTH);
        }
    }//GEN-LAST:event_jmabrirActionPerformed

    private void jmsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmsalvarActionPerformed
        JScrollPane JP;
        //salvando o texto do JTextArea da aba selecionada
        try (PrintWriter arq = new PrintWriter(JOptionPane.showInputDialog(rootPane,
                                 "Digite o nome do seu arquivo:\n","___Nome___", WIDTH)+".txt")) {

            arq.println(Jarea().getText());

            //mensagem de confirmacao 
            JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!!!","___Salvo___", WIDTH);
            arq.close();
                
        }catch (Exception ex) { 
            //mensagem de execao
            JOptionPane.showMessageDialog(rootPane, "Exeção "+ex.getMessage(),"___Exeção___", WIDTH);
        }
    }//GEN-LAST:event_jmsalvarActionPerformed

    private void cbtamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbtamanhoActionPerformed
        if (negrito == true && italico == true) {
            Jarea().setFont( new Font((String) cbfonte.getSelectedItem(),Font.BOLD + Font.ITALIC,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        }else if (negrito == true){
            Jarea().setFont( new Font((String) cbfonte.getSelectedItem(),Font.BOLD,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        }else if (italico == true){
            Jarea().setFont( new Font((String) cbfonte.getSelectedItem(),Font.ITALIC,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        }else{
            Jarea().setFont(new Font((String) cbfonte.getSelectedItem(),0,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        }
    }//GEN-LAST:event_cbtamanhoActionPerformed

    private void btncorfonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncorfonteActionPerformed
        java.awt.Color nova_cor = JColorChooser.showDialog(null, "Selecione uma cor para o texto", java.awt.Color.BLACK); 
        Jarea().setForeground(nova_cor);
    }//GEN-LAST:event_btncorfonteActionPerformed

    private void jmCortextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCortextoActionPerformed
        java.awt.Color nova_cor = JColorChooser.showDialog(null, "Selecione uma cor para o texto", java.awt.Color.BLACK); 
        Jarea().setForeground(nova_cor);
    }//GEN-LAST:event_jmCortextoActionPerformed

    private void jmitalicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmitalicoActionPerformed
        if (italico == false) {
            italico = true;
            if (negrito == true) {
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),3,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }else{
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),2,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }
        
        }else{
            italico = false;
            if (italico == true) {
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),2,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }else{
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),0,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }
        }
    }//GEN-LAST:event_jmitalicoActionPerformed

    private void jmnegritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnegritoActionPerformed
        if (negrito == false) {
            negrito = true;
            if (italico == true) {
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),3,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }else{
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),1,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }
        
        }else{
            negrito = false;
            if (italico == true) {
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),2,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }else{
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),0,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }
        }
    }//GEN-LAST:event_jmnegritoActionPerformed

    private void jmfonteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmfonteActionPerformed
        String mensagem = JOptionPane.showInputDialog(rootPane, "Digite a fonte: ", "___Fonte___", WIDTH);
        try{
            //selecionando a fonte nojtFonte
            cbfonte.setSelectedItem(mensagem);
            //metodo para mudar de fonte
            mudarfonte(mensagem);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Exceção não foi possivel mudar a fonte para "
                    +mensagem+e.getMessage(), "___Exceção___", WIDTH);
        }
    }//GEN-LAST:event_jmfonteActionPerformed

    private void jmversaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmversaoActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Versão do programa é  1.0.0", "___Versão___",WIDTH);
    }//GEN-LAST:event_jmversaoActionPerformed

    private void jmSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSobreActionPerformed
        JOptionPane.showMessageDialog(rootPane, "    DIGITE é um editor de textos dsenvolvido por José Luan Silva do Nascimento,\n"
                + " a idéia é de ter um programa simples e rapido que seja pratico e leve e sem intalações,\n\n"
                + "    O mesmo é resultado de um trabalho individual da disciplina de POO,\n"
                + "com o auxilio do professor Diego para completar a nota do 3° bimetre.\n"
                + "Este programa é gratuito e pode ser instalado em qualquer computador, pode\n"
                + "tambem ser melhorado, para o bem de todos os que usam junto com esse editor vem junto\n"
                + "o código fonte em java 8.0\n"
                + "Para mandar uma atualização do editor ou sugestões enviar um email para \n"
                + "joseluansilva@outlook.com", "___Sobre___", WIDTH);              
    }//GEN-LAST:event_jmSobreActionPerformed

    private void btnadicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnadicionarActionPerformed
        JScrollPane scrollpane = new javax.swing.JScrollPane();
        JTextArea textarea = new javax.swing.JTextArea();
        mudartamanho(textarea);
        textarea.setLineWrap(true);
        scrollpane.setViewportView(textarea);
        tabbedpane.addTab(JOptionPane.showInputDialog(rootPane, "Digite o nome da nova aba","Nova aba", WIDTH),scrollpane);

        tabbedpane.setSelectedComponent(scrollpane);
        
    }//GEN-LAST:event_btnadicionarActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        Jarea().setText("");   
    }//GEN-LAST:event_btnlimparActionPerformed

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        
        //salvando o texto do JTextArea da aba selecionada
        try (PrintWriter arq = new PrintWriter(JOptionPane.showInputDialog(rootPane,
                                 "Digite o nome do seu arquivo:\n","___Nome___", WIDTH)+".txt")) {
            //salvando o texto no arquivo
            arq.println(Jarea().getText());
            //mensagem de confirmacao 
            JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!!!","___Salvo___", WIDTH);
            arq.close();
                
        }catch (Exception ex) { 
            //mensagem de execao
            JOptionPane.showMessageDialog(rootPane, "Exeção "+ex.getMessage(),"___Exeção___", WIDTH);
        }
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnabrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnabrirActionPerformed
        JFileChooser fc = new JFileChooser();     
        if (fc.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
            return;
        }    
        try {
            FileReader fr = new FileReader(fc.getSelectedFile());
            BufferedReader br = new BufferedReader(fr);
            String linha;
            StringBuilder mensagem = new StringBuilder();
            while((linha = br.readLine()) != null) {
                mensagem.append(linha).append("\n");
            }
            Jarea().setText(mensagem.toString());
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(rootPane, "Exeção(FileNotFoundException) ao ler o arquivo - "
                    +ex.getMessage(), "___Exeção___", WIDTH);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, "Exeção(IOException) ao ler o arquivo - "
                    +ex.getMessage(), "___Exeção___", WIDTH);
        }
    }//GEN-LAST:event_btnabrirActionPerformed

    private void btnnegritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnegritoActionPerformed
        
        if (negrito == false) {
            negrito = true;
            if (italico == true) {
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),3,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }else{
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),1,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }
        
        }else{
            negrito = false;
            if (italico == true) {
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),2,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }else{
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),0,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }
        }
    }//GEN-LAST:event_btnnegritoActionPerformed

    private void btnitalicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnitalicoActionPerformed
         if (italico == false) {
            italico = true;
            if (negrito == true) {
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),3,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }else{
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),2,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }
        
        }else{
            italico = false;
            if (italico == true) {
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),2,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }else{
                Jarea().setFont(new Font( (String) cbfonte.getSelectedItem(),0,Integer.parseInt((String) cbtamanho.getSelectedItem())));
            }
        }
    }//GEN-LAST:event_btnitalicoActionPerformed

    private void jmCorfundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCorfundoActionPerformed
        java.awt.Color nova_cor = JColorChooser.showDialog(null, "Selecione uma cor para o fundo", java.awt.Color.BLACK); 
        Jarea().setBackground(nova_cor);
        
    }//GEN-LAST:event_jmCorfundoActionPerformed

    private void jmcorbotãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcorbotãoActionPerformed
              corbutao();
    }//GEN-LAST:event_jmcorbotãoActionPerformed

    private void btnfontemaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfontemaisActionPerformed
        if (cbtamanho.getSelectedIndex() == 0 || cbtamanho.getSelectedIndex() <= 28) {
            cbtamanho.setSelectedIndex(cbtamanho.getSelectedIndex()+1);
            mudartamanho(Jarea());
        }
    }//GEN-LAST:event_btnfontemaisActionPerformed

    private void btnadicionarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadicionarMouseMoved
        
    }//GEN-LAST:event_btnadicionarMouseMoved

    private void btnadicionarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadicionarMouseDragged
         
    }//GEN-LAST:event_btnadicionarMouseDragged

    private void btnadicionarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadicionarMouseReleased
       
    }//GEN-LAST:event_btnadicionarMouseReleased

    private void btnadicionarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadicionarMouseEntered
        
    }//GEN-LAST:event_btnadicionarMouseEntered

    private void btnadicionarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadicionarMouseExited
        btnadicionar.setToolTipText("Adicionar um aba");
    }//GEN-LAST:event_btnadicionarMouseExited

    private void btnlimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlimparMouseClicked
    
    }//GEN-LAST:event_btnlimparMouseClicked

    private void btnlimparMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlimparMouseExited
        btnlimpar.setToolTipText("Zerar o texto");
    }//GEN-LAST:event_btnlimparMouseExited

    private void btnitalicoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnitalicoMouseExited
        btnitalico.setToolTipText("Deixar o texto em Italico");
    }//GEN-LAST:event_btnitalicoMouseExited

    private void btnnegritoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnnegritoMouseExited
        btnnegrito.setToolTipText("Deixar o texto em Negrito");
    }//GEN-LAST:event_btnnegritoMouseExited

    private void btnsalvarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsalvarMouseExited
        btnsalvar.setToolTipText("Salvar o texto");
    }//GEN-LAST:event_btnsalvarMouseExited

    private void btnabrirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnabrirMouseExited
        btnabrir.setToolTipText("Abrir um arquivo .txt");
    }//GEN-LAST:event_btnabrirMouseExited

    private void btncorfonteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncorfonteMouseExited
        btncorfonte.setToolTipText("Mudar a cor do texto");
    }//GEN-LAST:event_btncorfonteMouseExited

    private void btnfontemaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfontemaisMouseExited
        btnfontemais.setToolTipText("Aumentar o tamanho da Fonte");
    }//GEN-LAST:event_btnfontemaisMouseExited

    private void btnfontemenosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfontemenosMouseExited
        btnfontemenos.setToolTipText("Diminuir o tamanho da Fonte");
    }//GEN-LAST:event_btnfontemenosMouseExited

    private void jmcorferramentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcorferramentasActionPerformed
        java.awt.Color nova_cor = JColorChooser.showDialog(null, "Selecione uma cor para o fundo", java.awt.Color.BLACK); 
        Painel.setBackground(nova_cor);
    }//GEN-LAST:event_jmcorferramentasActionPerformed

    private void btnfontemenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfontemenosActionPerformed
        if (cbtamanho.getSelectedIndex() >= 0 && cbtamanho.getSelectedIndex() <= 29) {
            if (cbtamanho.getSelectedIndex() > 0 || cbtamanho.getSelectedIndex() == 29) {
                cbtamanho.setSelectedIndex(cbtamanho.getSelectedIndex()-1);
            }
            mudartamanho(Jarea());
        }
    }//GEN-LAST:event_btnfontemenosActionPerformed

    private void corredefinirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_corredefinirActionPerformed
        btnabrir.setBackground(null);
        btnadicionar.setBackground(null);
        btncorfonte.setBackground(null);
        btnitalico.setBackground(null);
        btnnegrito.setBackground(null);
        btnsalvar.setBackground(null);
        btnfontemais.setBackground(null);
        btnfontemenos.setBackground(null);
        btnlimpar.setBackground(null);
        cbfonte.setBackground(null);
        cbtamanho.setBackground(null);
        Painel.setBackground(null);
        tatexto.setBackground(null);
        btnfecharaba.setBackground(null);
        btncopiar.setBackground(null);
        btncolar.setBackground(null);
    }//GEN-LAST:event_corredefinirActionPerformed

    private void jmtamanhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmtamanhoActionPerformed
        String tamanho = "";
        try{
            tamanho = JOptionPane.showInputDialog(rootPane, "Digite o Tamanho: ", "___Tamanho___", WIDTH);
            
            //metodo para mudar o tamanho

            mudartamanho(Integer.parseInt(tamanho));
            cbtamanho.setSelectedItem(tamanho);
            
            
        }catch(HeadlessException | NumberFormatException e){
            JOptionPane.showMessageDialog(rootPane, "Exceção não foi possivel mudar o tamanho para "
                    +tamanho+e.getMessage(), "___Exceção___", WIDTH);
        }
    }//GEN-LAST:event_jmtamanhoActionPerformed

    private void btncopiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncopiarMouseClicked
    }//GEN-LAST:event_btncopiarMouseClicked

    private void btncopiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncopiarMouseExited
        btncopiar.setToolTipText("Copiar o texto selecionado");
    }//GEN-LAST:event_btncopiarMouseExited

    private void btncopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncopiarActionPerformed
        ctrl = Jarea().getSelectedText();          
    }//GEN-LAST:event_btncopiarActionPerformed

    private void btncolarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncolarMouseClicked
    }//GEN-LAST:event_btncolarMouseClicked

    private void btncolarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncolarMouseExited
        btncolar.setToolTipText("Colar o texto copiado");
    }//GEN-LAST:event_btncolarMouseExited

    private void btncolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncolarActionPerformed
        if (!"".equals(ctrl)) {
            Jarea().replaceSelection(ctrl);
        }
    }//GEN-LAST:event_btncolarActionPerformed

    private void jmcopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcopiarActionPerformed
        ctrl = Jarea().getSelectedText(); 
    }//GEN-LAST:event_jmcopiarActionPerformed

    private void jmcolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcolarActionPerformed
        if (!"".equals(ctrl)) {
            Jarea().replaceSelection(ctrl);
        }
    }//GEN-LAST:event_jmcolarActionPerformed

    private void btnfecharabaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfecharabaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnfecharabaMouseClicked

    private void btnfecharabaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnfecharabaMouseExited
        btnfecharaba.setToolTipText("Fechar a aba selecionada");
    }//GEN-LAST:event_btnfecharabaMouseExited

    private void btnfecharabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfecharabaActionPerformed
        tabbedpane.remove(tabbedpane.getSelectedComponent());    
    }//GEN-LAST:event_btnfecharabaActionPerformed

    private void jmfecharabaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmfecharabaActionPerformed
        tabbedpane.remove(tabbedpane.getSelectedComponent());
    }//GEN-LAST:event_jmfecharabaActionPerformed

    private void jmcorfundoselecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcorfundoselecionadoActionPerformed
        java.awt.Color novacor = JColorChooser.showDialog(null, "Selecione uma cor para o texto", java.awt.Color.BLACK); 
        Jarea().setSelectionColor(novacor);
    }//GEN-LAST:event_jmcorfundoselecionadoActionPerformed

    private void jmcortextoselecionadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcortextoselecionadoActionPerformed
        java.awt.Color novacor = JColorChooser.showDialog(null, "Selecione uma cor para o texto", java.awt.Color.BLACK); 
        Jarea().setSelectedTextColor(novacor);
    }//GEN-LAST:event_jmcortextoselecionadoActionPerformed

    private void jmespacosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmespacosActionPerformed
        String texto = "";
        for (String letra : Jarea().getText().split(" ")) {
                texto += letra;
        }
        Jarea().setText(texto);
    }//GEN-LAST:event_jmespacosActionPerformed

    private void jmmenusculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmmenusculoActionPerformed
        Jarea().setText(Jarea().getText().toLowerCase());
    }//GEN-LAST:event_jmmenusculoActionPerformed

    private void jmmaiusculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmmaiusculoActionPerformed
        Jarea().setText(Jarea().getText().toUpperCase());
    }//GEN-LAST:event_jmmaiusculoActionPerformed

    private void jmcompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmcompararActionPerformed
        if (Jarea().getText().contains(JOptionPane.showInputDialog(rootPane,"Digite a String que voçê quer\n"
                + "se o texto contêm ela: ","___Comparação___", WIDTH))) {
            JOptionPane.showMessageDialog(rootPane,"A String está contida no texto!!!","___Comparação___", WIDTH);
        }else{
            JOptionPane.showMessageDialog(rootPane,"A String não está contida no texto!!!","___Comparação___", WIDTH);
        }
    }//GEN-LAST:event_jmcompararActionPerformed

    private void tabbedpaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabbedpaneMouseClicked
        
    }//GEN-LAST:event_tabbedpaneMouseClicked
    
    public static void main(String args[]) {
        
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimeiraTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>     
        //</editor-fold>
        java.awt.EventQueue.invokeLater(() -> {
            new PrimeiraTela().setVisible(true);
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Arquivo;
    private javax.swing.JMenu Editar;
    private javax.swing.JPanel Painel;
    private javax.swing.JButton btnabrir;
    private javax.swing.JButton btnadicionar;
    private javax.swing.JButton btncolar;
    private javax.swing.JButton btncopiar;
    private javax.swing.JButton btncorfonte;
    private javax.swing.JButton btnfecharaba;
    private javax.swing.JButton btnfontemais;
    private javax.swing.JButton btnfontemenos;
    private javax.swing.JToggleButton btnitalico;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JToggleButton btnnegrito;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JComboBox cbfonte;
    private javax.swing.JComboBox cbtamanho;
    private javax.swing.JMenuItem corredefinir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jlfonte;
    private javax.swing.JLabel jltamanho;
    private javax.swing.JMenuBar jmBarra;
    private javax.swing.JMenuItem jmCorfundo;
    private javax.swing.JMenuItem jmCortexto;
    private javax.swing.JMenuItem jmSobre;
    private javax.swing.JMenuItem jmabrir;
    private javax.swing.JMenu jmajuda;
    private javax.swing.JMenuItem jmcolar;
    private javax.swing.JMenuItem jmcomparar;
    private javax.swing.JMenuItem jmcopiar;
    private javax.swing.JMenu jmcor;
    private javax.swing.JMenuItem jmcorbotão;
    private javax.swing.JMenuItem jmcorferramentas;
    private javax.swing.JMenuItem jmcorfundoselecionado;
    private javax.swing.JMenu jmcorselecao;
    private javax.swing.JMenuItem jmcortextoselecionado;
    private javax.swing.JMenuItem jmespacos;
    private javax.swing.JMenuItem jmfecharaba;
    private javax.swing.JMenuItem jmfonte;
    private javax.swing.JMenuItem jmitalico;
    private javax.swing.JMenuItem jmmaiusculo;
    private javax.swing.JMenuItem jmmenusculo;
    private javax.swing.JMenuItem jmnegrito;
    private javax.swing.JMenuItem jmsair;
    private javax.swing.JMenuItem jmsalvar;
    private javax.swing.JMenuItem jmtamanho;
    private javax.swing.JMenuItem jmversao;
    private javax.swing.JTabbedPane tabbedpane;
    private javax.swing.JTextArea tatexto;
    // End of variables declaration//GEN-END:variables
    
    public  void mudartamanho(JTextArea area){
        if (negrito == true && italico == true) {
            area.setFont(new Font((String) cbfonte.getSelectedItem(),Font.BOLD + Font.ITALIC,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        }else if (negrito == true){
            area.setFont(new Font((String) cbfonte.getSelectedItem(),Font.BOLD,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        }else if (italico == true){
            area.setFont(new Font((String) cbfonte.getSelectedItem(),Font.ITALIC,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        }else{
            area.setFont(new Font((String) cbfonte.getSelectedItem(),0,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        }
    }
    public  void mudartamanho(int tamanho){
        if (negrito == true && italico == true) {
            Jarea().setFont(new Font((String) cbfonte.getSelectedItem(),Font.BOLD + Font.ITALIC,tamanho));
        }else if (negrito == true){
            Jarea().setFont(new Font((String) cbfonte.getSelectedItem(),Font.BOLD,tamanho));
        }else if (italico == true){
            Jarea().setFont(new Font((String) cbfonte.getSelectedItem(),Font.ITALIC,tamanho));
        }else{
            Jarea().setFont(new Font((String) cbfonte.getSelectedItem(),0,tamanho));
        }
    }

    public  void mudarfonte(String fonte){ 
        if (negrito == true && italico == true) {
            Jarea().setFont(new Font(fonte,Font.BOLD + Font.ITALIC,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        }else if (negrito == true){
            Jarea().setFont(new Font(fonte,Font.BOLD,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        }else if (italico == true){
            Jarea().setFont(new Font(fonte,Font.ITALIC,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        }else{
            Jarea().setFont(new Font(fonte,0,Integer.parseInt((String)cbtamanho.getSelectedItem())));
        } 
   }
    public JTextArea Jarea(){
        if (tabbedpane.getSelectedComponent() instanceof JScrollPane) {
            JScrollPane JS = (JScrollPane) tabbedpane.getSelectedComponent();
            JViewport JV = JS.getViewport();
            for(Component componente : JV.getComponents()){  
                if(componente instanceof JTextArea){  
                    return (JTextArea) componente;      
                }     
            }
        }
        return null;
    }
    public void corbutao(){
        java.awt.Color nova_cor = JColorChooser.showDialog(null, "Selecione uma cor para os botões", java.awt.Color.BLACK);
        btnabrir.setBackground(nova_cor);
        btnadicionar.setBackground(nova_cor);
        btncorfonte.setBackground(nova_cor);
        btnitalico.setBackground(nova_cor);
        btnnegrito.setBackground(nova_cor);
        btnsalvar.setBackground(nova_cor);
        btnfontemais.setBackground(nova_cor);
        btnfontemenos.setBackground(nova_cor);
        btnlimpar.setBackground(nova_cor);
        cbfonte.setBackground(nova_cor);
        cbtamanho.setBackground(nova_cor);
        btnfecharaba.setBackground(nova_cor);
        btncopiar.setBackground(nova_cor);
        btncolar.setBackground(nova_cor);
        
    }
}
