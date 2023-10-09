package thi;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainView extends JFrame {
	
	public MainView(String title) {
		super(title);
		setLayout(new CardLayout());
		getContentPane().add(new JPanel());
		getContentPane().add(new FavoritePanel());
		createMenu();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(600, 400);
		
	}

	private void createMenu() {
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		
		JMenu file = new JMenu("File");
		bar.add(file);
		JMenuItem item1 = new JMenuItem("Trac Nghiem So Thich");
		item1.addActionListener(e -> {
			setContentPane(new FavoritePanel());
			revalidate();
		});
		JMenuItem item2 = new JMenuItem("Exit");
		file.add(item1);
		file.add(item2);
		item2.addActionListener(e -> {
			System.exit(0);
		});
	}

	class FavoritePanel extends JPanel {
		JTextField textName;
		JCheckBox criket, badminton, golf;
		JRadioButton rdMale, rdFemale;
		JTextArea cmt;
		JTextArea result;
		JButton btnSubmit, btnReset;
		
		JPanel topPanel = new JPanel(new BorderLayout());
		JPanel centerPanel = new JPanel(new BorderLayout());
		
		String res = "";
		
		public FavoritePanel() {
			setLayout(new BorderLayout());
			this.add(topPanel, BorderLayout.NORTH);
			this.add(centerPanel);
			createTopPanel();
			createCenterPanel();
			JPanel southPanel = new JPanel(new BorderLayout());
			southPanel.setBorder(BorderFactory.createTitledBorder("Hien thi ket qua"));
			southPanel.add(result = new JTextArea());
			result.setEditable(false);
			this.add(southPanel, BorderLayout.SOUTH);
			
		}

		private void createCenterPanel() {
			JPanel panel3 = new JPanel(new BorderLayout());
			JPanel panel3b = new JPanel();
			JPanel panel3a = new JPanel();
			panel3.add(panel3a, BorderLayout.NORTH);
			panel3.add(panel3b, BorderLayout.SOUTH);
			panel3b.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "Gender (*)"));
			JPanel panel4 = new JPanel();
			panel4.setLayout(new BorderLayout());
			panel4.setBorder(BorderFactory.createTitledBorder("Comments (tuy y)"));
			JPanel panel5 = new JPanel();
			rdMale = new JRadioButton("Male");
			rdMale.setHorizontalAlignment(JRadioButton.LEFT);
			panel3a.add(rdMale);
			rdFemale = new JRadioButton("Male");
			rdFemale.setHorizontalAlignment(JRadioButton.LEFT);
			panel3b.add(rdFemale);
			ButtonGroup bg = new ButtonGroup();
			bg.add(rdFemale);
			bg.add(rdMale);
			panel4.add(cmt = new JTextArea());
			panel5.add(btnSubmit = new JButton("Submit"));
			btnSubmit.addActionListener(listener);
			btnSubmit.setActionCommand("SUBMIT");
			panel5.add(btnReset = new JButton("Reset"));
			btnReset.addActionListener(listener);
			btnReset.setActionCommand("RESET");
			centerPanel.add(panel3, BorderLayout.NORTH);
			centerPanel.add(panel4);
			centerPanel.add(panel5, BorderLayout.SOUTH);
		}

		private void createTopPanel() {
			JPanel panel1 = new JPanel();
			JPanel panel2 = new JPanel();
			panel2.setBorder(BorderFactory.createTitledBorder("Favorite Sports (*)"));
			JLabel label;
			panel1.add(label = new JLabel("Name(*)"));
			panel1.add(textName = new JTextField(25));
			panel2.add(criket = new JCheckBox("Criket"));
			panel2.add(badminton = new JCheckBox("Badminton"));
			panel2.add(golf = new JCheckBox("Golf"));
			topPanel.add(panel1, BorderLayout.NORTH);
			topPanel.add(panel2, BorderLayout.SOUTH);		
		}
		
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				switch(e.getActionCommand()) {
				case "SUBMIT":
					createSubmit();
					break;
				case "RESET":
					createReset();
					break;
				}
				
			}

			private void createReset() {
				textName.setText("");
				criket.setSelected(false);
				badminton.setSelected(false);
				golf.setSelected(false);
				rdFemale.setSelected(false);
				rdMale.setSelected(false);
				cmt.setText("");
				result.setText("");
				res = "";
			}

			private void createSubmit() {
				String text = textName.getText().trim();
				if(!text.equals("")) {
					res += text + "\t";
					if(criket.isSelected()) {
						res += criket.getText() + "\t";
					}
					if(badminton.isSelected()) {
						res += badminton.getText() + "\t";
					}
					if(golf.isSelected()) {
						res += golf.getText() + "\t";
					}
					if(rdMale.isSelected()) {
						res += rdMale.getText()  + "\n";
					}
					if(rdFemale.isSelected()) {
						res += rdFemale.getText()  + "\n";
					}
					String comments = cmt.getText().trim();
					if(!comments.equals("")) {
						res += comments;
					}
					if(!rdFemale.isSelected() && !rdMale.isSelected()) {
						res = "";
						result.setText("Dien du thong tin vao truong dau *");
					}
					if(!golf.isSelected() && !badminton.isSelected() && !criket.isSelected()) {
						res = "";
						result.setText("Dien du thong tin vao truong dau *");
					}
					result.setText(res);
				} else {
					res = "";
					result.setText("Dien du thong tin vao truong dau *");
				}
				
			}
		};
		
		}
	
	public static void main(String[] args) {
		new MainView("Khao Sat So Thich The Thao ");

	}

}



