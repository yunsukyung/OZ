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
		Image background = new ImageIcon().getImage().getScaledInstance(100, 100, 0);
		
		JLabel label = new JLabel(new ImageIcon(background));
		
		JPanel startPanel = new JPanel();
		ImageIcon start = new ImageIcon();
		//JButton button = new JButton(start);
		//button.setBounds(0, 0, 30, 20);
		panel.add(label);
		
		
		
		
		
		
		
		
		
		
		
		//startPanel.add(button);
		//panel.add(startPanel);
		System.out.println(panel.getLocation());
		panel.revalidate();
		super.add(panel);
	}
	
	public void StartStoryView() {
		JPanel panel = new JPanel();
		panel.setSize(300, 200);
		
		Image background = new ImageIcon().getImage().getScaledInstance(100, 100, 0);
		
	}
	
	
}
