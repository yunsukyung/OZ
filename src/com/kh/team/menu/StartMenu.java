package com.kh.team.menu;

import java.awt.Image;

import javax.swing.*;


public class StartMenu extends SuperMenu
{
	public StartMenu() {
		super();
	}
	public void StartView() {
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0 , 500, 500);
		Image background = new ImageIcon("C:\\Users\\tmddu\\git\\OZ\\src\\com\\kh\\team\\image\\start\\KakaoTalk_20200408_141935784.png").getImage().getScaledInstance(100, 100, 0);
		
		JLabel label = new JLabel(new ImageIcon(background));
		
		JPanel startPanel = new JPanel();
		ImageIcon start = new ImageIcon("C:\\Users\\tmddu\\git\\OZ\\src\\com\\kh\\team\\image\\start\\KakaoTalk_20200408_141320536.png");
		//JButton button = new JButton(start);
		//button.setBounds(0, 0, 30, 20);
		panel.add(label);
		//startPanel.add(button);
		//panel.add(startPanel);
		System.out.println(panel.getLocation());
		panel.revalidate();
		super.add(panel);
	}
	
	
}
