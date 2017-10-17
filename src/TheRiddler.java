import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer = JOptionPane.showInputDialog("Joe's height is six feet. He works at a butchers shop. His shoe size is nine. What does he weigh?");
String answertwo = JOptionPane.showInputDialog("What travels the world but stays in a corner?");
// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (answer.equalsIgnoreCase("Meat")) {
score +=1;	JOptionPane.showMessageDialog(null, "Correct!");
}
if (answertwo.equalsIgnoreCase("stamps")) {
 score +=1;   JOptionPane.showMessageDialog(null, "Correct!");	
}
		// 5. Otherwise, say "wrong" and tell them the answer
else {
JOptionPane.showMessageDialog(null, "You're wrong!");		
	
}
		
		JOptionPane.showMessageDialog(null, "Score: " +score);
	
		 answertwo = JOptionPane.showInputDialog("What travels the world but stays in a corner?");
	
		if (answertwo !=("a stamp")) {
			
			 JOptionPane.showMessageDialog(null, "You're wrong!");
			}
if (answertwo.equalsIgnoreCase("a stamp")) {
JOptionPane.showMessageDialog(null, "Correct!");	
	
	
	
}
	
	
	}
}

