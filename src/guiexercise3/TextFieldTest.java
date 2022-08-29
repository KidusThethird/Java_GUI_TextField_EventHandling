package guiexercise3; 


import java.awt.FlowLayout;
 import java.awt.event.ActionListener;
 import java.awt.event.ActionEvent;
 import javax.swing.JFrame;
 import javax.swing.JTextField;
 import javax.swing.JPasswordField;
 import javax.swing.JOptionPane;

 public class TextFieldTest extends JFrame
 {
 private final JTextField textField1; // text field with set size
 private final JTextField textField2; // text field with text
 private final JTextField textField3; // text field with text and size
 private final JPasswordField passwordField; // password field with text

 // TextFieldFrame constructor adds JTextFields to JFrame
 public TextFieldTest()
 {
 super("Testing JTextField and JPasswordField");
 setLayout(new FlowLayout());
textField1 = new JTextField(10);
add(textField1);
textField2 = new JTextField("Enter text here");
add(textField2);
textField3 = new JTextField("Uneditable text field", 21);
textField3.setEditable(false); // disable editing
add(textField3);

passwordField = new JPasswordField("Hidden text");
add(passwordField);

TextFieldHandler handler = new TextFieldHandler();

textField1.addActionListener(handler);
textField2.addActionListener(handler);
textField3.addActionListener(handler);
passwordField.addActionListener(handler);
}
private class TextFieldHandler implements ActionListener
{
@Override
public void actionPerformed(ActionEvent event)
{
String string = "";

 // user pressed Enter in JTextField textField1
 if (event.getSource() == textField1)
string = String.format("textField1: %s",event.getActionCommand());
// user pressed Enter in JTextField textField2
 else if (event.getSource() == textField2)
string = String.format("textField2: %s", event.getActionCommand());
else if (event.getSource() == textField3)
string = String.format("textField3: %s", event.getActionCommand());  
else if (event.getSource() == passwordField)
string = String.format("passwordField: %s", event.getActionCommand()); 
// display JTextField content
 JOptionPane.showMessageDialog(null, string);
 }
 } // end private inner class TextFieldHandler
 } // end class TextFieldFrame