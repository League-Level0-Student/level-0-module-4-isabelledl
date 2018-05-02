import javax.swing.JOptionPane;

public class testScores {
public static void main(String[] args) {
String test = 	JOptionPane.showInputDialog("What test score did you get?");
double test2 = Double.parseDouble(test );
if (test2==(100)) {JOptionPane.showMessageDialog(null, "Wow you must have studied so hard!!");
}

if (test2<51) {JOptionPane.showMessageDialog(null, "disappointed in you!!!!!");

}

}
}
