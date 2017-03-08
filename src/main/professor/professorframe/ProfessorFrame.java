package main.professor.professorframe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import main.professor.professor.Professor;
import main.student.studentCourseOutline.StudentCourseOutline;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Dimension;
import java.awt.CardLayout;

public class ProfessorFrame extends JFrame {

	private JPanel contentPane;

	
	public ProfessorFrame(Professor prof) {
		setTitle("Professor Panel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0, 1366, 730);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelTop = new JPanel();
		contentPane.add(panelTop, BorderLayout.NORTH);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 22));
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 22));
		
		JLabel lblEmail = new JLabel("Email :");
		lblEmail.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 22));
		
		JLabel lblNameField = new JLabel(prof.toString());
		lblNameField.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 22));
		
		JLabel lblUserfield = new JLabel(prof.getUsername());
		lblUserfield.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 22));
		
		Container lblEmailfield = new JLabel(prof.getEmail());
		lblEmailfield.setFont(new Font("Segoe UI Symbol", Font.PLAIN, 22));
		GroupLayout gl_panelTop = new GroupLayout(panelTop);
		gl_panelTop.setHorizontalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTop.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblName)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNameField)
					.addGap(318)
					.addComponent(lblUsername)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblUserfield)
					.addGap(264)
					.addComponent(lblEmail)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblEmailfield)
					.addContainerGap(248, Short.MAX_VALUE))
		);
		gl_panelTop.setVerticalGroup(
			gl_panelTop.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelTop.createSequentialGroup()
					.addGroup(gl_panelTop.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(lblUsername)
						.addComponent(lblEmail)
						.addComponent(lblNameField)
						.addComponent(lblUserfield)
						.addComponent(lblEmailfield))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelTop.setLayout(gl_panelTop);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel settingsPanel = new JPanel();
		contentPane.add(settingsPanel, BorderLayout.SOUTH);
		
		JButton settingsButton = new JButton("Settings");
		settingsPanel.add(settingsButton);
		
		JButton logoutButton = new JButton("Logout");
		logoutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			int response = JOptionPane.showConfirmDialog(ProfessorFrame.this, "Are U Sure U Want to Logout?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(response == JOptionPane.YES_OPTION){
					System.exit(0);
				}
			}
		});
		settingsPanel.add(logoutButton);
		
	}
}