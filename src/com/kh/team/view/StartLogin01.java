package com.kh.team.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class StartLogin01 extends JFrame{

	
	
	public void StartLogin01() {
	JFrame oz = new JFrame("OZ");
	oz.setSize(360, 640);

	JPanel panel = new JPanel();
	
	//Æë±Ï µÞ¹è°æ
	Image icon1 = new ImageIcon("C:\\Users\\jino0\\git\\OZ\\src\\com\\kh\\team\\image").getImage().getScaledInstance(360, 640, 0);
	//³ª¹«ÆÇÀÚ ¹è°æ
	Image icon2 = new ImageIcon("C:\\Users\\jino0\\git\\OZ\\src\\com\\kh\\team\\image\\Lovepik_com-401634782-winter-wood-plank-border.png").getImage().getScaledInstance(360, 468, 0);
	
	JLabel labe1 = new JLabel(new ImageIcon(icon1));
	JLabel labe2 = new JLabel(new ImageIcon(icon2));

	panel.add(labe1,"Center");
	panel.add(labe2,"Center");
	
	oz.add(panel);
	
	oz.setVisible(true);
	oz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}
