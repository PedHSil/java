import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class MinhaJanela extends JFrame {
    
    private JButton botaoA;
    private JButton botaoB;
    private JButton botaoC;
    private JButton botaoD;
    private JButton botaoE;

    private JLabel label = new JLabel("Contador: 0");

    public MinhaJanela() {
        super("Minha Janela"); // título da janela

        // Layout simples
        setLayout(new FlowLayout());

        // Criar botões
        botaoA = new JButton("Aperte A");
        botaoB = new JButton("Aperte B");
        botaoC = new JButton("Aperte C");
        botaoD = new JButton("Aperte D");
        botaoE = new JButton("Aperte E");

        // Adicionar os botões na janela
        add(botaoA);
        add(botaoB);
        add(botaoC);
        add(botaoD);
        add(botaoE);
        add(label);

        // Ações dos botões
        botaoA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão A foi apertado!");
            }
        });

        botaoB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // fecha a janela
            }
        });
        // Usando Lambda nos listeners
        botaoC.addActionListener(e -> System.out.println("Botão C foi apertado"));

        botaoD.addActionListener(e -> System.out.println("Botão C foi apertado"));
        
        botaoE.addActionListener(new ActionListener() {
            int i = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = ("o botão foi apertado " + i++ + " vezes");
                System.out.println(s);
                label.setText(s);
            }
        });

        // Configurações básicas
        pack(); // ajusta ao tamanho dos componentes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centraliza a janela na tela
    }
}
