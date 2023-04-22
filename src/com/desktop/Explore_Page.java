package com.desktop;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JDesktopPane;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.Icon;

import java.awt.BorderLayout;
import javax.swing.JTextPane;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;

import javax.swing.Box;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.Button;
import java.awt.ScrollPane;
import javax.swing.JScrollBar;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Scrollbar;

public class Explore_Page extends JFrame
{

	private JPanel contentPane;
	
//	add(scrPane); //

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Explore_Page frame = new Explore_Page();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Explore_Page()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1472, 991);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
			contentPane.setLayout(new CardLayout(0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			contentPane.add(scrollPane, "name_1197588305332000");
			
			JDesktopPane desktopPane = new JDesktopPane();
			desktopPane.setBackground(Color.WHITE);
			scrollPane.setColumnHeaderView(desktopPane);
			
			JDesktopPane desktopPane_1 = new JDesktopPane();
			desktopPane_1.setBackground(Color.WHITE);
			
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(Explore_Page.class.getResource("/com/desktop/dt_logo_new.png")));
			lblNewLabel.setBounds(41, 10, 54, 70);
			desktopPane_1.add(lblNewLabel);
			
			JLabel lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(Explore_Page.class.getResource("/com/desktop/Deep_thought_new.png")));
			lblNewLabel_1.setBounds(91, 10, 251, 70);
			desktopPane_1.add(lblNewLabel_1);
			
			JDesktopPane desktopPane_1_1 = new JDesktopPane();
			desktopPane_1_1.setBackground(Color.WHITE);
			
			JLabel lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setIcon(new ImageIcon(Explore_Page.class.getResource("/com/desktop/favorite_product.png")));
			lblNewLabel_2.setBounds(3, 25, 199, 193);
			desktopPane_1_1.add(lblNewLabel_2);
			
			JTextPane txtpnWhatsYourFavorite = new JTextPane();
			txtpnWhatsYourFavorite.setText("What’s your favorite Product? ");
			txtpnWhatsYourFavorite.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnWhatsYourFavorite.setBounds(212, 25, 315, 38);
			desktopPane_1_1.add(txtpnWhatsYourFavorite);
			
			JTextArea txtrThisProjectWill = new JTextArea();
			txtrThisProjectWill.setText("This project will test the candidates’ product knowledge (both software and hardware) and their prioritization skills. There can be \r\nhundreds of product which a candidate may use. We are testing if the candidates are able to pick up minute & important details\r\n of the product they are currently using and its importance.");
			txtrThisProjectWill.setFont(new Font("SansSerif", Font.PLAIN, 13));
			txtrThisProjectWill.setBounds(210, 60, 739, 60);
			desktopPane_1_1.add(txtrThisProjectWill);
			
			JTextPane txtpnLearningOutcome = new JTextPane();
			txtpnLearningOutcome.setText("Learning Outcome");
			txtpnLearningOutcome.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnLearningOutcome.setBounds(212, 122, 315, 28);
			desktopPane_1_1.add(txtpnLearningOutcome);
			
			JTextArea txtrPrioritizationSkillsAbout = new JTextArea();
			txtrPrioritizationSkillsAbout.setText("Prioritization skills, About Product knowledge, clear and concise understanding of product");
			txtrPrioritizationSkillsAbout.setFont(new Font("SansSerif", Font.PLAIN, 13));
			txtrPrioritizationSkillsAbout.setBounds(212, 149, 777, 28);
			desktopPane_1_1.add(txtrPrioritizationSkillsAbout);
			
			JTextPane txtpnPrerequisites = new JTextPane();
			txtpnPrerequisites.setText("Pre-requisites");
			txtpnPrerequisites.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnPrerequisites.setBounds(210, 175, 315, 28);
			desktopPane_1_1.add(txtpnPrerequisites);
			
			Component verticalStrut = Box.createVerticalStrut(20);
			verticalStrut.setBounds(995, 10, 1, 225);
			desktopPane_1_1.add(verticalStrut);
			
			Component verticalGlue = Box.createVerticalGlue();
			verticalGlue.setBackground(Color.BLACK);
			verticalGlue.setBounds(959, 0, 12, 245);
			desktopPane_1_1.add(verticalGlue);
			
			JTextPane txtpnSelectionBy = new JTextPane();
			txtpnSelectionBy.setText("Selection by");
			txtpnSelectionBy.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnSelectionBy.setBounds(1023, 35, 134, 28);
			desktopPane_1_1.add(txtpnSelectionBy);
			
			JLabel lblNewLabel_3 = new JLabel("");
			lblNewLabel_3.setIcon(new ImageIcon(Explore_Page.class.getResource("/com/desktop/dt_logo_new.png")));
			lblNewLabel_3.setBounds(1023, 69, 54, 70);
			desktopPane_1_1.add(lblNewLabel_3);
			
			JTextArea txtrSuraj = new JTextArea();
			txtrSuraj.setText("SURAJ");
			txtrSuraj.setFont(new Font("SansSerif", Font.PLAIN, 15));
			txtrSuraj.setBounds(1087, 80, 63, 28);
			desktopPane_1_1.add(txtrSuraj);
			
			JTextArea txtrDeepthought = new JTextArea();
			txtrDeepthought.setText("DEEPTHOUGHT");
			txtrDeepthought.setForeground(Color.BLUE);
			txtrDeepthought.setFont(new Font("SansSerif", Font.BOLD, 14));
			txtrDeepthought.setBounds(1087, 101, 115, 28);
			desktopPane_1_1.add(txtrDeepthought);
			
			JTextArea txtrExplore = new JTextArea();
			txtrExplore.setText("   Explore");
			txtrExplore.setForeground(Color.WHITE);
			txtrExplore.setFont(new Font("SansSerif", Font.BOLD, 17));
			txtrExplore.setBackground(Color.BLUE);
			txtrExplore.setBounds(1122, 175, 92, 28);
			desktopPane_1_1.add(txtrExplore);
			
			JDesktopPane desktopPane_1_1_1 = new JDesktopPane();
			desktopPane_1_1_1.setBackground(Color.WHITE);
			
			JLabel lblNewLabel_2_1 = new JLabel("");
			lblNewLabel_2_1.setIcon(new ImageIcon(Explore_Page.class.getResource("/com/desktop/favorite_product.png")));
			lblNewLabel_2_1.setBounds(3, 25, 199, 193);
			desktopPane_1_1_1.add(lblNewLabel_2_1);
			
			JTextPane txtpnWhatsYourFavorite_1 = new JTextPane();
			txtpnWhatsYourFavorite_1.setText("What’s your favorite Product? ");
			txtpnWhatsYourFavorite_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnWhatsYourFavorite_1.setBounds(212, 25, 315, 38);
			desktopPane_1_1_1.add(txtpnWhatsYourFavorite_1);
			
			JTextArea txtrThisProjectWill_1 = new JTextArea();
			txtrThisProjectWill_1.setText("This project will test the candidates’ product knowledge (both software and hardware) and their prioritization skills. There can be \r\nhundreds of product which a candidate may use. We are testing if the candidates are able to pick up minute & important details\r\n of the product they are currently using and its importance.");
			txtrThisProjectWill_1.setFont(new Font("SansSerif", Font.PLAIN, 13));
			txtrThisProjectWill_1.setBounds(210, 60, 739, 60);
			desktopPane_1_1_1.add(txtrThisProjectWill_1);
			
			JTextPane txtpnLearningOutcome_1 = new JTextPane();
			txtpnLearningOutcome_1.setText("Learning Outcome");
			txtpnLearningOutcome_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnLearningOutcome_1.setBounds(212, 122, 315, 28);
			desktopPane_1_1_1.add(txtpnLearningOutcome_1);
			
			JTextArea txtrPrioritizationSkillsAbout_1 = new JTextArea();
			txtrPrioritizationSkillsAbout_1.setText("Prioritization skills, About Product knowledge, clear and concise understanding of product");
			txtrPrioritizationSkillsAbout_1.setFont(new Font("SansSerif", Font.PLAIN, 13));
			txtrPrioritizationSkillsAbout_1.setBounds(212, 149, 777, 28);
			desktopPane_1_1_1.add(txtrPrioritizationSkillsAbout_1);
			
			JTextPane txtpnPrerequisites_1 = new JTextPane();
			txtpnPrerequisites_1.setText("Pre-requisites");
			txtpnPrerequisites_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnPrerequisites_1.setBounds(210, 175, 315, 28);
			desktopPane_1_1_1.add(txtpnPrerequisites_1);
			
			Component verticalStrut_1 = Box.createVerticalStrut(20);
			verticalStrut_1.setBounds(995, 10, 1, 225);
			desktopPane_1_1_1.add(verticalStrut_1);
			
			Component verticalGlue_1 = Box.createVerticalGlue();
			verticalGlue_1.setBackground(Color.BLACK);
			verticalGlue_1.setBounds(959, 0, 12, 245);
			desktopPane_1_1_1.add(verticalGlue_1);
			
			JTextPane txtpnSelectionBy_1 = new JTextPane();
			txtpnSelectionBy_1.setText("Selection by");
			txtpnSelectionBy_1.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnSelectionBy_1.setBounds(1023, 35, 134, 28);
			desktopPane_1_1_1.add(txtpnSelectionBy_1);
			
			JLabel lblNewLabel_3_1 = new JLabel("");
			lblNewLabel_3_1.setIcon(new ImageIcon(Explore_Page.class.getResource("/com/desktop/dt_logo_new.png")));
			lblNewLabel_3_1.setBounds(1023, 69, 54, 70);
			desktopPane_1_1_1.add(lblNewLabel_3_1);
			
			JTextArea txtrSuraj_1 = new JTextArea();
			txtrSuraj_1.setText("SURAJ");
			txtrSuraj_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
			txtrSuraj_1.setBounds(1087, 80, 63, 28);
			desktopPane_1_1_1.add(txtrSuraj_1);
			
			JTextArea txtrDeepthought_1 = new JTextArea();
			txtrDeepthought_1.setText("DEEPTHOUGHT");
			txtrDeepthought_1.setForeground(Color.BLUE);
			txtrDeepthought_1.setFont(new Font("SansSerif", Font.BOLD, 14));
			txtrDeepthought_1.setBounds(1087, 101, 115, 28);
			desktopPane_1_1_1.add(txtrDeepthought_1);
			
			JTextArea txtrExplore_1 = new JTextArea();
			txtrExplore_1.setText("   Explore");
			txtrExplore_1.setForeground(Color.WHITE);
			txtrExplore_1.setFont(new Font("SansSerif", Font.BOLD, 17));
			txtrExplore_1.setBackground(Color.BLUE);
			txtrExplore_1.setBounds(1122, 175, 92, 28);
			desktopPane_1_1_1.add(txtrExplore_1);
			
			JDesktopPane desktopPane_1_1_2 = new JDesktopPane();
			desktopPane_1_1_2.setBackground(Color.WHITE);
			
			JLabel lblNewLabel_2_2 = new JLabel("");
			lblNewLabel_2_2.setIcon(new ImageIcon(Explore_Page.class.getResource("/com/desktop/favorite_product.png")));
			lblNewLabel_2_2.setBounds(3, 25, 199, 193);
			desktopPane_1_1_2.add(lblNewLabel_2_2);
			
			JTextPane txtpnWhatsYourFavorite_2 = new JTextPane();
			txtpnWhatsYourFavorite_2.setText("What’s your favorite Product? ");
			txtpnWhatsYourFavorite_2.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnWhatsYourFavorite_2.setBounds(212, 25, 315, 38);
			desktopPane_1_1_2.add(txtpnWhatsYourFavorite_2);
			
			JTextArea txtrThisProjectWill_2 = new JTextArea();
			txtrThisProjectWill_2.setText("This project will test the candidates’ product knowledge (both software and hardware) and their prioritization skills. There can be \r\nhundreds of product which a candidate may use. We are testing if the candidates are able to pick up minute & important details\r\n of the product they are currently using and its importance.");
			txtrThisProjectWill_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
			txtrThisProjectWill_2.setBounds(210, 60, 739, 60);
			desktopPane_1_1_2.add(txtrThisProjectWill_2);
			
			JTextPane txtpnLearningOutcome_2 = new JTextPane();
			txtpnLearningOutcome_2.setText("Learning Outcome");
			txtpnLearningOutcome_2.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnLearningOutcome_2.setBounds(212, 122, 315, 28);
			desktopPane_1_1_2.add(txtpnLearningOutcome_2);
			
			JTextArea txtrPrioritizationSkillsAbout_2 = new JTextArea();
			txtrPrioritizationSkillsAbout_2.setText("Prioritization skills, About Product knowledge, clear and concise understanding of product");
			txtrPrioritizationSkillsAbout_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
			txtrPrioritizationSkillsAbout_2.setBounds(212, 149, 777, 28);
			desktopPane_1_1_2.add(txtrPrioritizationSkillsAbout_2);
			
			JTextPane txtpnPrerequisites_2 = new JTextPane();
			txtpnPrerequisites_2.setText("Pre-requisites");
			txtpnPrerequisites_2.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnPrerequisites_2.setBounds(210, 175, 315, 28);
			desktopPane_1_1_2.add(txtpnPrerequisites_2);
			
			Component verticalStrut_2 = Box.createVerticalStrut(20);
			verticalStrut_2.setBounds(995, 10, 1, 225);
			desktopPane_1_1_2.add(verticalStrut_2);
			
			Component verticalGlue_2 = Box.createVerticalGlue();
			verticalGlue_2.setBackground(Color.BLACK);
			verticalGlue_2.setBounds(959, 0, 12, 245);
			desktopPane_1_1_2.add(verticalGlue_2);
			
			JTextPane txtpnSelectionBy_2 = new JTextPane();
			txtpnSelectionBy_2.setText("Selection by");
			txtpnSelectionBy_2.setFont(new Font("Tahoma", Font.BOLD, 18));
			txtpnSelectionBy_2.setBounds(1023, 35, 134, 28);
			desktopPane_1_1_2.add(txtpnSelectionBy_2);
			
			JLabel lblNewLabel_3_2 = new JLabel("");
			lblNewLabel_3_2.setIcon(new ImageIcon(Explore_Page.class.getResource("/com/desktop/dt_logo_new.png")));
			lblNewLabel_3_2.setBounds(1023, 69, 54, 70);
			desktopPane_1_1_2.add(lblNewLabel_3_2);
			
			JTextArea txtrSuraj_2 = new JTextArea();
			txtrSuraj_2.setText("SURAJ");
			txtrSuraj_2.setFont(new Font("SansSerif", Font.PLAIN, 15));
			txtrSuraj_2.setBounds(1087, 80, 63, 28);
			desktopPane_1_1_2.add(txtrSuraj_2);
			
			JTextArea txtrDeepthought_2 = new JTextArea();
			txtrDeepthought_2.setText("DEEPTHOUGHT");
			txtrDeepthought_2.setForeground(Color.BLUE);
			txtrDeepthought_2.setFont(new Font("SansSerif", Font.BOLD, 14));
			txtrDeepthought_2.setBounds(1087, 101, 115, 28);
			desktopPane_1_1_2.add(txtrDeepthought_2);
			
			JTextArea txtrExplore_2 = new JTextArea();
			txtrExplore_2.setText("   Explore");
			txtrExplore_2.setForeground(Color.WHITE);
			txtrExplore_2.setFont(new Font("SansSerif", Font.BOLD, 17));
			txtrExplore_2.setBackground(Color.BLUE);
			txtrExplore_2.setBounds(1122, 175, 92, 28);
			desktopPane_1_1_2.add(txtrExplore_2);
			GroupLayout gl_desktopPane = new GroupLayout(desktopPane);
			gl_desktopPane.setHorizontalGroup(
				gl_desktopPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_desktopPane.createSequentialGroup()
						.addGroup(gl_desktopPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_desktopPane.createSequentialGroup()
								.addGap(62)
								.addGroup(gl_desktopPane.createParallelGroup(Alignment.LEADING)
									.addComponent(desktopPane_1_1, GroupLayout.PREFERRED_SIZE, 1285, GroupLayout.PREFERRED_SIZE)
									.addComponent(desktopPane_1_1_1, GroupLayout.PREFERRED_SIZE, 1285, GroupLayout.PREFERRED_SIZE)
									.addComponent(desktopPane_1_1_2, GroupLayout.PREFERRED_SIZE, 1285, GroupLayout.PREFERRED_SIZE)))
							.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 1448, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(20, Short.MAX_VALUE))
			);
			gl_desktopPane.setVerticalGroup(
				gl_desktopPane.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_desktopPane.createSequentialGroup()
						.addComponent(desktopPane_1, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(desktopPane_1_1, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(desktopPane_1_1_1, GroupLayout.PREFERRED_SIZE, 245, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(desktopPane_1_1_2, GroupLayout.PREFERRED_SIZE, 228, GroupLayout.PREFERRED_SIZE)
						.addGap(200))
			);
			
			JLabel lblNewLabel_4 = new JLabel("");
			lblNewLabel_4.setForeground(new Color(0, 0, 255));
			lblNewLabel_4.setIcon(new ImageIcon(Explore_Page.class.getResource("/com/desktop/nav.png")));
			lblNewLabel_4.setBounds(1064, 10, 283, 70);
			desktopPane_1.add(lblNewLabel_4);
			desktopPane.setLayout(gl_desktopPane);
		Image img = new ImageIcon(this.getClass().getResource("/dt_logo.png")).getImage();
		
	}
}
