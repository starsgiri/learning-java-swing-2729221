import javax.swing.*;
import java.awt.*;

public class MovieInfoUI extends JFrame {
    private JPanel contentPanel;
    private JPanel buttonPanel;
    private JLabel lblPageTitle;
    private JLabel lblMovieTitle;
    private JTextField txtMovieTitle;
    private  JLabel lblRating;
    private JTextField txtReating;
    private JLabel lblYear;
    private JTextField txtYear;
    private JButton btnSubmit;


    public MovieInfoUI() {
        initComponents();
    }
    public void initComponents() {
        contentPanel = new JPanel(new GridLayout(3,2));
        buttonPanel = new JPanel(new GridLayout(1,4));
        lblPageTitle = new JLabel("My Favorite Movies");
        lblMovieTitle = new JLabel(" Movie Title: ");
        txtMovieTitle = new JTextField("enter movie name");
        lblRating = new JLabel("    Rating(1-5) ");
        txtReating = new JTextField();
        lblYear = new JLabel("    Year:  ");
        txtYear = new JTextField();
        btnSubmit = new JButton("Submit");
        contentPanel.add(lblMovieTitle);
        contentPanel.add(txtMovieTitle);
        contentPanel.add(lblRating);
        contentPanel.add(txtReating);
        contentPanel.add(lblYear);
        contentPanel.add(txtYear);
        buttonPanel.add(btnSubmit);


        this.setSize(300,300);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(lblPageTitle);
        this.getContentPane().add(contentPanel,BorderLayout.CENTER);
        this.getContentPane().add(buttonPanel,BorderLayout.SOUTH);
     }

}
