import classes.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        submitNewUserInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(rootPanel, "User Created");
                User user = new User();
                user.setFirstName(nameTextField.getText());
                user.setAddress(addressTextField.getText());
                user.setEmail(emailTextField.getText());
                user.se
            }
        });
    }


}
