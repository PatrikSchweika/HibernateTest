package forms;

import javax.swing.*;

public class App {
    private JButton loginButton;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JTextField textField1;

    private DefaultListModel<String> model = new DefaultListModel<>();
    private JList<String> list1;
    private JButton button_delete;

    public JComponent getMainComponent()
    {
        return this.panel1;
    }

    public App() {

        this.list1.setModel(model);

        loginButton.addActionListener(e -> this.model.addElement("Test"));

        button_delete.addActionListener(e ->
        {
            for (String index : this.list1.getSelectedValuesList())
            {
                this.model.removeElement(index);
            }
        });
    }
}
