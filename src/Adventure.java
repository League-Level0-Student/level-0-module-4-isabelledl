import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {

		String cat = JOptionPane.showInputDialog("There was a cat what do want the cats name to be");
		int where = JOptionPane.showOptionDialog(null, "Do you want " + cat + " to go outside,inside,up,or down", cat,
				0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "outside", "inside", "up", "down" }, null);
		if (where == 0) {
			JOptionPane.showMessageDialog(null, cat + " walked outside and saw a bird! ");

			int chase = JOptionPane.showOptionDialog(null, "Do you want " + cat + " to go chase the bird or leave it??",
					cat, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "leave it I don't like killing birds", "chase it!!" }, null);
			if (chase == 1) {
				JOptionPane.showMessageDialog(null, "Congratulations you got the bird!!");

			} else if (chase == 0) {
				JOptionPane.showMessageDialog(null, cat
						+ " left the bird and jumped on to the roof there you saw your cat friends Facebook,Twiter, and Instagram.");

			}
		} else if (where == 2) {
			JOptionPane.showMessageDialog(null, cat + " jumped on to a shelf ");

			int jump = JOptionPane.showOptionDialog(null,
					"Do you want " + cat + " to knock down your owners favorite vase or eat some treats?", cat, 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "knock it down", "eat some cat treats!!" },
					null);
			if (jump == 1) {
				JOptionPane.showMessageDialog(null, " After you ate the treats you took a nap on your bed");

			} else if (jump == 0) {
				JOptionPane.showMessageDialog(null,
						"Ooh when your owner named Ray came home he was so mad that he put out side for 1 day did you really have to do that.");

			}
			if (where == 2) {

			}

		}

	}
}
