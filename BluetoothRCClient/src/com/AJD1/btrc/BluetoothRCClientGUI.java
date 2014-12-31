package com.AJD1.btrc;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//Created using WindowBuilder. Each button calls a method in BTRCClient. 
//If keyboard control button has focus then keyboard keys can be used to call these methods.
public class BluetoothRCClientGUI {

	private JFrame frame;
	private final JPanel panel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BluetoothRCClientGUI window = new BluetoothRCClientGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BluetoothRCClientGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		final BTRCClient btrc = new BTRCClient();

		frame = new JFrame();
		frame.setBounds(100, 100, 800, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		panel.setBounds(350, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnForward = new JButton("FORWARD");
		btnForward.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btrc.bluetoothForward();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		btnForward.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 11));
		btnForward.setBounds(109, 11, 100, 80);
		panel.add(btnForward);
		
		JButton btnReverse = new JButton("REVERSE\r\n");
		btnReverse.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 11));
		btnReverse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btrc.bluetoothReverse();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		btnReverse.setBounds(109, 169, 100, 80);
		panel.add(btnReverse);
		
		JButton btnNewButton = new JButton("RIGHT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btrc.bluetoothRight();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		btnNewButton.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 11));
		btnNewButton.setBounds(208, 90, 100, 80);
		panel.add(btnNewButton);
		
		JButton btnLeft = new JButton("LEFT");
		btnLeft.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 11));
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btrc.bluetoothLeft();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		btnLeft.setBounds(10, 90, 100, 80);
		panel.add(btnLeft);
		
		JButton btnStop = new JButton("STOP");
		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btrc.bluetoothStop();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		btnStop.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 11));
		btnStop.setBounds(109, 90, 100, 80);
		panel.add(btnStop);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btrc.bluetoothExit();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		btnExit.setFont(new Font("Lucida Sans Unicode", Font.BOLD | Font.ITALIC, 11));
		btnExit.setBounds(279, 227, 89, 23);
		panel.add(btnExit);
		
		final JButton btnKeyboardControl = new JButton("KEYBOARD CONTROL");
		btnKeyboardControl.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 11));
		btnKeyboardControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnKeyboardControl.setFocusable(true);
			}
		});
		btnKeyboardControl.addKeyListener(new KeyListener()
		{
			@Override
			public void keyTyped(KeyEvent e) {
				char keyChar = Character.toUpperCase(e.getKeyChar());
				if (keyChar == KeyEvent.VK_W) {
					try {
						btrc.bluetoothForward();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyChar == KeyEvent.VK_S) {
					try {
						btrc.bluetoothReverse();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyChar == KeyEvent.VK_D) {
					try {
						btrc.bluetoothRight();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyChar == KeyEvent.VK_A) {
					try {
						btrc.bluetoothLeft();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyChar == KeyEvent.VK_F) {
					try {
						btrc.bluetoothStop();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyChar == KeyEvent.VK_E) {
					try {
						btrc.bluetoothExit();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
			}

			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				if (keyCode == KeyEvent.VK_UP) {
					try {
						btrc.bluetoothForward();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyCode == KeyEvent.VK_DOWN) {
					try {
						btrc.bluetoothReverse();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyCode == KeyEvent.VK_RIGHT) {
					try {
						btrc.bluetoothRight();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyCode == KeyEvent.VK_LEFT) {
					try {
						btrc.bluetoothLeft();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyCode == KeyEvent.VK_NUMPAD0) {
					try {
						btrc.bluetoothStop();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyCode == KeyEvent.VK_END) {
					try {
						btrc.bluetoothExit();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyCode == KeyEvent.VK_SPACE) {
					try {
						btrc.bluetoothHonk();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
				if (keyCode == KeyEvent.VK_CONTROL) {
					try {
						btrc.bluetoothFire();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				int keyCode = e.getKeyCode();

				if (keyCode == KeyEvent.VK_CONTROL) {
					try {
						btrc.bluetoothStopFire();
					} catch (IOException e1) {
						System.out.println(e1.getMessage());
					}
				}
			}
		}
				);
		
		btnKeyboardControl.setBounds(219, 198, 205, 23);
		panel.add(btnKeyboardControl);
		
		JButton btnNewButton_1 = new JButton("HONK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					btrc.bluetoothHonk();
				} catch (IOException e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		btnNewButton_1.setFont(new Font("Lucida Sans Unicode", Font.BOLD, 11));
		btnNewButton_1.setBounds(219, 11, 80, 70);
		panel.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 70, 340, 191);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblDriveForward = new JLabel("Drive Forward -- Press W key or UP arrrow key");
		lblDriveForward.setBounds(12, 5, 318, 14);
		panel_1.add(lblDriveForward);
		
		JLabel lblDriveReverse = new JLabel("Drive Reverse -- Press S key or DOWN arrow key");
		lblDriveReverse.setBounds(12, 30, 318, 14);
		panel_1.add(lblDriveReverse);
		
		JLabel lblTurnRight = new JLabel("Turn Right -- Press D key or RIGHT arrow key");
		lblTurnRight.setBounds(12, 55, 318, 14);
		panel_1.add(lblTurnRight);
		
		JLabel lblTurnLeft = new JLabel("Turn Left -- Press A key or LEFT arrow key");
		lblTurnLeft.setBounds(12, 80, 318, 14);
		panel_1.add(lblTurnLeft);
		
		JLabel lblStopPress = new JLabel("Stop -- Press F key or 0 numpad key");
		lblStopPress.setBounds(12, 105, 318, 14);
		panel_1.add(lblStopPress);
		
		JLabel lblExitEvProgram = new JLabel("Exit EV3 Program -- Press E key or END key");
		lblExitEvProgram.setBounds(10, 133, 320, 14);
		panel_1.add(lblExitEvProgram);
		
		JLabel lblHonkPress = new JLabel("Honk -- Press Spacebar (DO NOT HOLD)");
		lblHonkPress.setBounds(12, 158, 328, 14);
		panel_1.add(lblHonkPress);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 11, 340, 48);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("To Control EV3 with Keyboard Click");
		lblNewLabel.setBounds(10, 2, 320, 14);
		panel_2.add(lblNewLabel);
		
		JLabel lblkeyboardControlButton = new JLabel("\"KEYBOARD CONTROL\" Button");
		lblkeyboardControlButton.setBounds(10, 15, 320, 14);
		panel_2.add(lblkeyboardControlButton);
		
		JLabel label = new JLabel("--------------------------------------------------------\r\n");
		label.setBounds(10, 34, 230, 14);
		panel_2.add(label);
	}
}
