package run;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

/**
 * 
 * 장기하랑 최다니엘이랑 섞어놓은거같은 친구나 도와줘볼라는 프로그램 만들기 
 * jar file 에서 exe 로 나중에 변환 함
 * 
 * 
 * Everything I learned here was from 
 * https://www3.ntu.edu.sg/home/ehchua/programming/java/j4a_gui.html 
 * Special thanks to this site creator.
 * 
 * @author CW
 *
 */
// An AWT program inherits from the top-level container java.awt.Frame
public class MatItNeunJamMukGoSipDa extends Frame implements ActionListener, WindowListener {
	
	private Label lblCount;    // Declare a Label component 
	private TextField tfCount; // Declare a TextField component 
	private Button btnCount;   // Declare a Button component
	private int count = 0;     // Counter's value

	// Constructor to setup GUI components and event handlers
	public MatItNeunJamMukGoSipDa () {
		setLayout(new FlowLayout());
		// "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
		// the components from left-to-right, and flow to next row from top-to-bottom.

		lblCount = new Label("Counter");  // construct the Label component
		add(lblCount);                    // "super" Frame container adds Label component

		tfCount = new TextField(count + "", 10); // construct the TextField component with initial text
		tfCount.setEditable(false);       // set to read-only
		add(tfCount);                     // "super" Frame container adds TextField component

		btnCount = new Button("Count");   // construct the Button component
		add(btnCount);                    // "super" Frame container adds Button component

		btnCount.addActionListener(this);
		// "btnCount" is the source object that fires an ActionEvent when clicked.
		// The source add "this" instance as an ActionEvent listener, which provides
		//   an ActionEvent handler called actionPerformed().
		// Clicking "btnCount" invokes actionPerformed().
		
		addWindowListener(this);

		setTitle("AWT Counter");  // "super" Frame sets its title
		setSize(250, 100);        // "super" Frame sets its initial window size

		// For inspecting the Container/Components objects
		// System.out.println(this);
		// System.out.println(lblCount);
		// System.out.println(tfCount);
		// System.out.println(btnCount);

		setVisible(true);         // "super" Frame shows



		// System.out.println(this);
		// System.out.println(lblCount);
		// System.out.println(tfCount);
		// System.out.println(btnCount);
	}

	// The entry main() method
	public static void main(String[] args) {
		// Invoke the constructor to setup the GUI, by allocating an instance
		MatItNeunJamMukGoSipDa app = new MatItNeunJamMukGoSipDa();
		// or simply "new AWTCounter();" for an anonymous instance
	}

	// ActionEvent handler - Called back upon button-click.
	@Override
	public void actionPerformed(ActionEvent evt) {
		++count; // Increase the counter value
		// Display the counter value on the TextField tfCount
		tfCount.setText(count + ""); // Convert int to String
	}

	// Window Listener interface
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	
	/* WindowEvent handlers */
	// Called back upon clicking close-window button
	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0);

	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}
}