import javax.swing.JOptionPane;

public class Adventure {
public static void main(String[] args) {
	
	
	String cat =  JOptionPane.showInputDialog("There was a cat what do want the cats name to be");
	JOptionPane.showOptionDialog(null, "Do you want the " + cat + " to go outside,inside,up,or down", cat, 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "outside", "inside", "up","down" }, null);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
