package com.baselevel.highlevel;

import java.awt.*;

import javax.swing.*;

import com.baselevel.factories.ControllerFactory;
import com.baselevel.factories.FatControllerFactory;

public class NiceBrain implements Brain {

	public NiceBrain() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void think() {
		System.out.println("I'm thinking about puppies");
	}

	@Override
	public void sleep() {
		System.out.println("Sleep? Yes Please!");
		
	}

	@Override
	public void speak() {
		
		class LoveFrame {
			
			public void run() {
			EventQueue.invokeLater(new Runnable(){
			
					public void run() {
					LoveYouFrame frame = new LoveYouFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					}
				});
			}
					class LoveYouFrame extends JFrame{
			
							public LoveYouFrame(){
								setTitle("Love you");
								setSize(600,400);
								// setBackground(Color.BLUE);
								LoveYouComponent wuv = new LoveYouComponent();
								add(wuv);
					}
				
							class LoveYouComponent extends JComponent{	
								public void paintComponent(Graphics g)
								{
									g.setFont(new Font("SansSerif",Font.BOLD,28));
									g.drawString("YOU'RE AMAZING THORRUN GOVIND!", 50, 150);
									g.setColor(Color.BLUE);	
								}
							}
					}
			}
		LoveFrame loveframe = new LoveFrame();
		loveframe.run();
	}

	@Override
	public ControllerFactory generateFactory() {
		return FatControllerFactory.returnInstance();
		
	}
	
}
