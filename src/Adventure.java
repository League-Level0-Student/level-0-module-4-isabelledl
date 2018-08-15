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
		} else if (where == 1) {
			JOptionPane.showMessageDialog(null, cat + " walked inside and saw your owner looking at the TV");
			int something = JOptionPane.showOptionDialog(null,
					"Do you want " + cat + " to see what your owner is doing or go find something better to do? ", cat,
					0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "find something better to do I don't care what my owner dose",
							"see what my owner is doing" },
					null);
			if (something == 0) {
				JOptionPane.showMessageDialog(null, cat + " walked away and you saw the dog named Pi ");
				int dog = JOptionPane.showOptionDialog(null,
						"Do you want " + cat + " to go play with Pi or go find your cat friends?", cat, 0,
						JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "Eew I hate dogs I will go find my friends", "I love dogs I will go play with Pi" },
						null);
				if (dog == 0) {
					JOptionPane.showMessageDialog(null, cat
							+ " walked outsid and jumped on to the roof and found you cat friends Facebook,Twiter,and Instagram");
				} else if (dog == 1) {
					JOptionPane.showMessageDialog(null, cat + " played with Pi for the rest of the day");
				}
			}
			if (something == 1) {
				JOptionPane.showMessageDialog(null,
						cat + " looked at the TV to see what your owner is doing he was just watching a TV show " + cat
								+ "just walked away to go take a nap");
			}

			
		} else if (where == 3) {
			JOptionPane.showMessageDialog(null, cat
					+ " walked outside and saw a hole in the ground do you want to see what is in the hole or do something else?");
			int down = JOptionPane.showOptionDialog(null,
					"Do you want " + cat + " to see what is in the hole or do something else?", cat, 0,
					JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "see what is in the hole!", "or find something better to do!!!" }, null);
			{
				if (down == 0)
					JOptionPane.showMessageDialog(null, cat + " looked down in to the hole and saw something shiny");

				down = JOptionPane.showOptionDialog(null,
						"Do you want " + cat + " to go down and see what is or do something else?", cat, 0,
						JOptionPane.INFORMATION_MESSAGE, null,
						new String[] { "I will go see what is in the hole!!", "find somthing else this is boring!!!" },
						null);
				if (down == 0) {
					JOptionPane.showMessageDialog(null,
							cat + " jumped down into the hole and looked at the shiny thing it was a toaster" + cat
									+ " pet the toaster and jumped back up and went home");

				} else if (down == 1) {
					JOptionPane.showMessageDialog(null, cat + " walked back inside and ate some food");

				}

			}

		}

	}
}
