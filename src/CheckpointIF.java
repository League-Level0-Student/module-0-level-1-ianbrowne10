import javax.swing.JOptionPane;

public class CheckpointIF {
public static void main(String[] args) {
	
String yes =JOptionPane.showInputDialog("Enter Here");

if (yes.equalsIgnoreCase("yes")) {
	JOptionPane.showMessageDialog(null, "HAPPY!");
}

else {
	JOptionPane.showMessageDialog(null, "Sad");
	
}

JOptionPane.showMessageDialog(null, "Wednesday");


int age = 10;

if (20>age) {
	JOptionPane.showMessageDialog(null, "It's good to be young, because then you're not old.");
}

 if (20<age) {
	JOptionPane.showMessageDialog(null, "I wish I could go back in time, and be young AGAIN!");
}




String animal = JOptionPane.showInputDialog("What animal do you like?");

if (animal.equalsIgnoreCase("dog")) {
	JOptionPane.showMessageDialog(null, "The dog goes woof.");
}

else if (animal.equalsIgnoreCase("cat")) {
	JOptionPane.showMessageDialog(null, "The cat goes meow.");
}
else {
	JOptionPane.showMessageDialog(null, "Don't make up animals!");
}






}
}
