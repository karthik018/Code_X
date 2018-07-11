import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class DocumentOpener implements ActionListener {
	static JFrame jf;
	static JLabel jl, je;
	JTextField jt = new JTextField(50);
	JButton jb = new JButton("Submit");
	static String str = "";
	DocumentOpener(){
		jf = new JFrame("My first Application");
		jf.setLayout(new FlowLayout());
		jf.setSize(600, 120);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jl = new JLabel("Enter Document name with Extension");
		//jt.addActionListener((ae) -> str = jt.getText());
		jt.addActionListener(this);
		jb.addActionListener(this);
		jf.add(jl);
		jf.add(jt);
		jf.add(jb);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == jb){
			String str = jt.getText();
			try{
				openDocument(str);
			}catch(Exception x){
				System.out.println(x);
			}
		}
	}

	static void openDocument(String str) throws Exception{
		String path = "/home/karthikkumar/Documents/" + str;
		File file = new File(path);
		if(!Desktop.isDesktopSupported()){
			System.out.println("Desktop not Supported");
			return ;
		}
		Desktop desk = Desktop.getDesktop();
		if(file.exists())
			desk.open(file);
		else{
			je = new JLabel("Cannot find the file");
			jf.add(je);
			jf.setVisible(true);
		}
			//System.out.println("Cannot find the file: ");

	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new DocumentOpener();
			}
		});
	}
}