import javax.swing.*;

public class CreateUserAccount extends JFrame {
    private JLabel nameLable;
    private JLabel addressLable;
    private JLabel emailLabel;
    private JLabel contactLable;
    private JPanel rootPanel;
    private JTextField emailTextField;
    private JTextField nameTextField;
    private JTextField addressTextField;
    private JTextField contactNoTextField;
    private JButton submitNewUserInfo;
    private JButton cancelNewUser;


    public CreateUserAccount(){
        add(rootPanel);
        setTitle("Create User");
        setSize(600,600);
    }


}
