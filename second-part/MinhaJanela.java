import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class MinhaJanela extends JFrame {
    
    private JButton botaoA;
    private JButton botaoB;
    private JButton botaoC;

    public MinhaJanela() {
        super("Minha Janela"); // título da janela

        // Layout simples
        setLayout(new FlowLayout());

        // Criar botões
        botaoA = new JButton("Aperte A");
        botaoB = new JButton("Aperte B");
        botaoC = new JButton("Aperte C");

        // Adicionar os botões na janela
        add(botaoA);
        add(botaoB);
        add(botaoC);

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

        botaoC.addActionListener(e -> System.out.println("Botão C foi apertado"));

        // Configurações básicas
        pack(); // ajusta ao tamanho dos componentes
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // centraliza a janela na tela
    }
}
