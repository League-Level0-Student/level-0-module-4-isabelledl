import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {

		String cat = JOptionPane.showInputDialog("There was a cat what do want the cats name to be");
		int where = JOptionPane.showOptionDialog(null, "Do you want " + cat + " to go outside,inside,up,or down", cat,
				0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "outside", "inside", "up", "down" }, null);
		if (where == 0) {
			JOptionPane.showMessageDialog(null, cat + " walked outside and saw a bird! ");

		}
		int chase = JOptionPane.showOptionDialog(null, "Do you want " + cat + " to go chase the bird or leave it??",
				cat, 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "leave it", "chase it!!" }, null);
		if (chase == 1) {
			JOptionPane.showMessageDialog(null, "Congratulations you got the bird!!");

		}
		if (chase == 0) {
			JOptionPane.showMessageDialog(null, cat
					+ " left the bird and jumped on to the roof there you saw your cat friends Facebook,Twiter,Snapchat,Instagram.");

		}
		if (where == 1) {
			JOptionPane.showMessageDialog(null, cat + " jumped on to a shelf ");

		}
		int jump = JOptionPane.showOptionDialog(null,
				"Do you want " + cat + " to knock down your owners favorite vase or eat some treats?", cat, 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "knock it down", "eat some cat treats!!" }, null);

	}
}
