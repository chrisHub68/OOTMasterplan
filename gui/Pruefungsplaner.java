package anmeldung.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pruefungsplaner extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pruefungsplaner frame = new Pruefungsplaner();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Pruefungsplaner() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 132);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNeuenPlanErstellen = new JButton("Neuen Plan erstellen");
		btnNeuenPlanErstellen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Benutzeroberflaeche b = new Benutzeroberflaeche();
				
			}
		});
		contentPane.add(btnNeuenPlanErstellen, BorderLayout.NORTH);
		
		JButton btnPlanffnen = new JButton("Plan \u00F6ffnen");
		contentPane.add(btnPlanffnen, BorderLayout.SOUTH);
	}

}
