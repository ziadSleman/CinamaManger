import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame {

    private ImageIcon getScaledInstance(ImageIcon image,int width,int height) {
        Image scaledImage = image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(scaledImage);
    }
    private void updateProductDetails(int index)
    {
        productImage.setIcon(getScaledInstance(images[index],600,600));
        productImage.setText("");
        productPrice.setText("Price: $" + "100  ");
        productPrice.setFont(new Font("Arial", Font.BOLD, 14));
        dateLabel1.setText("first time : 12:30");
        dateLabel1.setFont(new Font("Arial", Font.BOLD, 14));
        dateLabel2.setText("second time : 3:30");
        dateLabel2.setFont(new Font("Arial", Font.BOLD, 14));
        dateLabel3.setText("third time : 8:30");
        dateLabel3.setFont(new Font("Arial", Font.BOLD, 14));
        typeLabel.setText("Genre: Action, Adventure");
        typeLabel.setFont(new Font("Arial", Font.BOLD, 14));
    }
    private final JList<String> productList;
    private final JLabel productImage,productPrice,dateLabel1,dateLabel2,dateLabel3,typeLabel;
    private final ImageIcon[] images;
    HomeScreen() {
        super("Product Display");
        String[] productNames = {"Avengers: Endgame 2019", "Avengers: infinity war 2018", "Avengers: age of ultron 2015"};
        images = new ImageIcon[3];
        // Add images for each product
        images[0] = new ImageIcon("C:/Users/Zaid/Desktop/OIP.jpg");
        images[1] = new ImageIcon("C:/Users/Zaid/Desktop/OIP (1).jpg");
        images[2] = new ImageIcon("C:/Users/Zaid/Desktop/R.jpg");
        productList = new JList<>(productNames);
        productList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int index = productList.getSelectedIndex();
                //if (index >= 0) {
                updateProductDetails(index);
                //}
            }
        });
        JPanel mainPanel = new JPanel(new BorderLayout());
        productImage = new JLabel("No product selected",JLabel.CENTER);
        productPrice = new JLabel("",JLabel.CENTER);
        dateLabel1 = new JLabel("",JLabel.CENTER);
        dateLabel2 = new JLabel("",JLabel.CENTER);
        dateLabel3 = new JLabel("",JLabel.CENTER);
        typeLabel = new JLabel("",JLabel.CENTER);
        JPanel leftPanel = new JPanel();
        leftPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
        centerPanel.add(new JScrollPane(productList), BorderLayout.CENTER);
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
        JPanel firstLeftPanel = new JPanel();
        firstLeftPanel.setLayout(new BoxLayout(firstLeftPanel, BoxLayout.Y_AXIS));
        firstLeftPanel.add(productImage);
        firstLeftPanel.add(productPrice);
        firstLeftPanel.add(typeLabel);
        firstLeftPanel.add(dateLabel1);
        firstLeftPanel.add(dateLabel2);
        firstLeftPanel.add(dateLabel3);
        leftPanel.add(firstLeftPanel);
        JPanel firstRightPanel = new JPanel();
        JPanel buttonRightPanel = new JPanel();
        firstRightPanel.setLayout(new BoxLayout(firstRightPanel, BoxLayout.Y_AXIS));
        buttonRightPanel.setLayout(new BoxLayout(buttonRightPanel,BoxLayout.Y_AXIS));
        JButton userAccount = new JButton();
        userAccount.setText("User Account       ");
        userAccount.setFont(new Font("Arial ", Font.BOLD, 12));
        userAccount.setSize(60,60);
        userAccount.setIcon( getScaledInstance(new ImageIcon("C:/Users/Zaid/Desktop/OIP (2).jpg"),26,27));
        firstRightPanel.add(userAccount);
        JButton moviesStatistics = new JButton();
        moviesStatistics.setText("Movies Statistics");
        moviesStatistics.setFont(new Font("Arial", Font.BOLD, 12));
        moviesStatistics.setSize(50,50);
        moviesStatistics.setIcon( getScaledInstance(new ImageIcon("C:/Users/Zaid/Desktop/R (1).jpg"),26,27));
        firstRightPanel.add(moviesStatistics);
        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 12));
        exitButton.setAlignmentY(Component.BOTTOM_ALIGNMENT);
        exitButton.setIcon( getScaledInstance(new ImageIcon("C:/Users/Zaid/Desktop/R.png"),26,27));
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonRightPanel.add(exitButton);
        rightPanel.add(firstRightPanel);
        rightPanel.add(Box.createVerticalGlue());
        rightPanel.add(buttonRightPanel);
        mainPanel.add(leftPanel, BorderLayout.WEST);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(rightPanel, BorderLayout.EAST);
        add(mainPanel);
        setSize(1200, 800);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
