import javax.swing.*;

public class TicTacToeUI extends JFrame{
    private JPanel contentPanel;
    private JPanel C1R1;
    private JPanel C1R2;
    private JPanel C1R3;
    private JPanel C2R1;

    public TicTacToeUI() {
        setTitle("Let's Play Tic Tac Toe");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPanel);
        setVisible(true);
    }
}
