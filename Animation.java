package dev.aniket.music;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Animation 
{
	JFrame frmAnimate;
	ImageIcon iconAnimateMusic, iconMusicIntro;
	JLabel lblMusicIntro;
	
	int width = 350;
	int height = 250;
	
	public void animate()
	{
		
		frmAnimate = new JFrame();
		frmAnimate.setSize(width, height);
		frmAnimate.setUndecorated(true);
		frmAnimate.setLayout(null);
		frmAnimate.setLocationRelativeTo(null);
		
		iconAnimateMusic  = new ImageIcon("src/assets/src/assets/1.png");
		Image imageAnimateMusic = iconAnimateMusic.getImage();
		iconAnimateMusic.setImage(imageAnimateMusic);
		frmAnimate.setIconImage(imageAnimateMusic);
		
		iconMusicIntro = new ImageIcon("src/assets/logo.png");
		Image imgMusicAnimateIntro = iconMusicIntro.getImage();
		imgMusicAnimateIntro = imgMusicAnimateIntro.getScaledInstance(width, height, Image.SCALE_DEFAULT);
		iconMusicIntro.setImage(imgMusicAnimateIntro);
		
		lblMusicIntro = new JLabel(iconMusicIntro);
		lblMusicIntro.setBounds(0, 0, width, height);
		lblMusicIntro.setLayout(null);
		frmAnimate.getContentPane().add(lblMusicIntro);
		frmAnimate.setBackground(Color.black);
		
		frmAnimate.setVisible(true);
		
		new Thread()
		{
			public void run()
			{
				try
				{
					Music objMusic = new Music();
			
					sleep(1500);
					objMusic.init();
					frmAnimate.dispose();
				}
				catch (Exception e) {}
			}
		}.start();
	}//function animate() closed here
}
