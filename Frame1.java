import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.*;
import javax.swing.JFrame;

public class Frame1 {

	private JFrame frame;
	private JLabel g1;
	private JLabel g2;
	private JLabel g3;
	private JLabel g4;
	private JLabel g5;
	private JLabel g6;
	private JLabel g7;
	private JLabel l7;
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l;
	private JLabel l6;
	private JLabel l5;
	private JLabel hr1;
	private JLabel hr2;
	private JLabel hr3;
	private JLabel fin1;
	private JLabel cost1;
	private JLabel fin2;
	private JLabel cost2;
	private JLabel fin6;
	private JLabel cost6;
	private JLabel m;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Frame1() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JFrame f = new JFrame("Car Rentals");
		JButton b1 = new JButton("Exit");
		JButton b2 = new JButton("Submit");
		JTextField t1=new JTextField();
		JTextField t2=new JTextField();
		JTextField t3=new JTextField();
		JTextField t4=new JTextField();
		l1=new JLabel("NAME : ");
		l2=new JLabel("PAN NUMBER : ");
		l3=new JLabel("AADHAR NUMBER : ");
		l4=new JLabel("LICENSE NUMBER : ");
		l=new JLabel("",JLabel.CENTER);
		l.setText("CITY CARS");
		l.setBounds(250,25,300,75);
		l1.setBounds(50,100,200,50);
		t1.setBounds(300,100,200,50);
		l2.setBounds(50,200,200,50);
		t2.setBounds(300,200,200,50);
		l3.setBounds(50,300,200,50);
		t3.setBounds(300,300,200,50);
		l4.setBounds(50,400,200,50);
		t4.setBounds(300,400,200,50);
		b2.setBounds(50,500,200,45);
		b1.setBounds(300,500,200,45);
		l.setFont(new Font("Courier New", Font.BOLD, 34));
		l1.setFont(new Font("Courier New", Font.BOLD, 15));
		l2.setFont(new Font("Courier New", Font.BOLD, 15));
		l3.setFont(new Font("Courier New", Font.BOLD, 15));
		l4.setFont(new Font("Courier New", Font.BOLD, 15));
		b1.setFont(new Font("Courier New", Font.BOLD, 25));
		b2.setFont(new Font("Courier New", Font.BOLD, 25));
		f.add(b1);
		f.add(b2);
		f.add(l);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(t4);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(800,800);
		b1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		f.dispose();
		}
		});
		b2.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent e) 
		{
		//Pan check
		String str=t2.getText();
		int flag=1;
		if(str.matches("[a-z]{5}[0-9]{4}[a-z]{1}"))
		flag=0;
		if(flag==1)
		{
		l5=new JLabel("Please enter PAN number properly");
		f.add(l5);
		l5.setBounds(300,240,200,50);
		l5.setFont(new Font("Courier New", Font.BOLD, 10));
		}
		//Aadhar check
		String str1=t3.getText();
		int w=1;
		if(str1.matches("[0-9]{12}"))
		w=0;
		if(w==1)
		{
		l6=new JLabel("Please enter Aadhar number properly");
		f.add(l6);
		l6.setBounds(300,340,200,50);
		l6.setFont(new Font("Courier New", Font.BOLD, 10));
		}
		//Lisence check
		String str12=t4.getText();
		int l = 0;
		String cut = str12.substring(0, 2);
		if
		(cut.matches("AP||AR||AS||BR||CG||GA||GJ||HR||HP||JK||KA||KL||MP||MH||MN|ML||MZ||NL||OR||PB||RJ||SK||TN||TR||UK||UP||WB||TN||TR||AN||CH||DH||DD||DL||LD||PY"))
		{
		l++;
		}
		String cut1 = str12.substring(3, 15);
		if (cut1.matches("[0-9]{13}")) {
		l++;
		}
		l=0;
		if(l==2)
		{
		l7=new JLabel("INVALID LICENCE NO.");
		f.add(l7);
		l7.setBounds(300,440,200,50);
		l7.setFont(new Font("Courier New", Font.BOLD, 10));
		}
		if(flag==0 && w==0 && l==0)
		{
		JFrame q = new JFrame("AVAILABLE CAR'S");
		g1=new JLabel("1.HYUNDAI         240 per hour");
		g2=new JLabel("2.CRETA           280 per hour");
		g3=new JLabel("3.TOYOTA          400 per hour");
		g4=new JLabel("4.AUDI            650 per hour");
		g5=new JLabel("5.SKODA           720 per hour");
		g6=new JLabel("6.BENZ            800 per hour");
		g7=new JLabel("choice : ");
		JButton but1 = new JButton("Submit");
		m=new JLabel("",JLabel.CENTER);
		m.setText("AVAILABLE CAR'S");
		q.add(g1);
		q.add(m);
		q.add(but1);
		q.add(g2);
		q.add(g3);
		q.add(g4);
		q.add(g5);
		q.add(g6);
		q.add(g7);
		JTextField z4=new JTextField();
		q.setLayout(null);
		q.setVisible(true);
		q.setSize(800,800);
		q.add(z4);
		m.setBounds(250,25,300,75);
		g1.setBounds(200,50,400,100);
		g2.setBounds(200,150,400,100);
		g3.setBounds(200,250,400,100);
		g4.setBounds(200,350,400,100);
		g5.setBounds(200,450,400,100);
		g6.setBounds(200,550,400,100);
		g7.setBounds(70,650,200,40);
		z4.setBounds(170,650,200,20);
		but1.setBounds(450,650,200,20);
		m.setFont(new Font("Courier New", Font.BOLD, 30));
		g1.setFont(new Font("Courier New", Font.BOLD, 20));
		g2.setFont(new Font("Courier New", Font.BOLD, 20));
		g3.setFont(new Font("Courier New", Font.BOLD, 20));
		g4.setFont(new Font("Courier New", Font.BOLD, 20));
		g5.setFont(new Font("Courier New", Font.BOLD, 20));
		g6.setFont(new Font("Courier New", Font.BOLD, 20));
		but1.setFont(new Font("Courier New", Font.BOLD, 20));
		but1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		int choice = Integer.parseInt(z4.getText());
		switch(choice)
		{
		case 1 : JFrame f1 = new JFrame("SWIFT");
		JTextField sw1=new JTextField();
		sw1.setBounds(300,100,200,50);
		hr1=new JLabel("enter no of hrs");
		JButton jbut1 = new JButton("Submit");
		f1.add(jbut1);
		jbut1.setBounds(50,200,200,50);
		hr1.setBounds(100,50,200,50);
		f1.add(sw1);
		f1.add(hr1);
		f1.setLayout(null);
		f1.setVisible(true);
		f1.setSize(800,800);
		hr1.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut1.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		int p=Integer.parseInt(sw1.getText());
		int k=p*240;
		fin1=new JLabel("You'r car has been booked.");
		cost1=new JLabel("total cost = " +k);
		cost1.setBounds(200,350,400,100);
		fin1.setBounds(200,250,400,100);
		f1.add(fin1);
		f1.add(cost1);
		fin1.setFont(new Font("Courier New", Font.BOLD, 20));
		cost1.setFont(new Font("Courier New", Font.BOLD, 20));
		}
		});
		break;
		case 2 : JFrame f2 = new JFrame("CRETA");
		JTextField sw2=new JTextField();
		sw2.setBounds(300,100,200,50);
		hr2=new JLabel("enter no of hrs");
		JButton jbut2 = new JButton("Submit");
		f2.add(jbut2);
		jbut2.setBounds(50,200,200,50);
		hr2.setBounds(100,50,200,50);
		f2.add(sw2);
		f2.add(hr2);
		f2.setLayout(null);
		f2.setVisible(true);
		f2.setSize(800,800);
		hr2.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut2.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		int p=Integer.parseInt(sw2.getText());
		int k=p*280;
		JLabel fin2=new JLabel("You'r car has been booked.");
		JLabel cost2=new JLabel("total cost = " +k);
		cost2.setBounds(200,350,400,100);
		fin2.setBounds(200,250,400,100);
		f2.add(fin2);
		f2.add(cost2);
		fin2.setFont(new Font("Courier New", Font.BOLD, 20));
		cost2.setFont(new Font("Courier New", Font.BOLD, 20));
		}
		});
		break;
		case 3 : JFrame f3 = new JFrame("FORTUNER");
		JTextField sw3=new JTextField();
		sw3.setBounds(300,100,200,50);
		hr3=new JLabel("enter no of hrs");
		JButton jbut3 = new JButton("Submit");
		f3.add(jbut3);
		jbut3.setBounds(50,200,200,50);
		hr3.setBounds(100,50,200,50);
		f3.add(sw3);
		f3.add(hr3);
		f3.setLayout(null);
		f3.setVisible(true);
		f3.setSize(800,800);
		hr3.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut3.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		int p=Integer.parseInt(sw3.getText());
		int k=p*400;
		JLabel fin3=new JLabel("You'r car has been booked.");
		JLabel cost3=new JLabel("total cost = " +k);
		cost3.setBounds(200,350,400,100);
		fin3.setBounds(200,250,400,100);
		f3.add(fin3);
		f3.add(cost3);
		fin3.setFont(new Font("Courier New", Font.BOLD, 20));
		cost3.setFont(new Font("Courier New", Font.BOLD, 20));
		}
		});
		break;
		case 4 : JFrame f4 = new JFrame("AUDI");
		JTextField sw4=new JTextField();
		sw4.setBounds(300,100,200,50);
		JLabel hr4=new JLabel("enter no of hrs");
		JButton jbut4 = new JButton("Submit");
		f4.add(jbut4);
		jbut4.setBounds(50,200,200,50);
		hr4.setBounds(100,50,200,50);
		f4.add(sw4);
		f4.add(hr4);
		f4.setLayout(null);
		f4.setVisible(true);
		f4.setSize(800,800);
		hr4.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut4.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut4.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		int p=Integer.parseInt(sw4.getText());
		int k=p*780;
		JLabel fin4=new JLabel("You'r car has been booked.");
		JLabel cost4=new JLabel("total cost = " +k);
		cost4.setBounds(200,350,400,100);
		fin4.setBounds(200,250,400,100);
		f4.add(fin4);
		f4.add(cost4);
		fin4.setFont(new Font("Courier New", Font.BOLD, 20));
		cost4.setFont(new Font("Courier New", Font.BOLD, 20));
		}
		});
		break;
		case 5 : JFrame f5 = new JFrame("SAFARI");
		JTextField sw5=new JTextField();
		sw5.setBounds(300,100,200,50);
		JLabel hr5=new JLabel("enter no of hrs");
		JButton jbut5 = new JButton("Submit");
		f5.add(jbut5);
		jbut5.setBounds(50,200,200,50);
		hr5.setBounds(100,50,200,50);
		f5.add(sw5);
		f5.add(hr5);
		f5.setLayout(null);
		f5.setVisible(true);
		f5.setSize(800,800);
		hr5.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut5.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut5.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent e) 
		{
		int p=Integer.parseInt(sw5.getText());
		int k=p*650;
		JLabel fin5=new JLabel("You'r car has been booked.");
		JLabel cost5=new JLabel("total cost = " +k);
		cost5.setBounds(200,350,400,100);
		fin5.setBounds(200,250,400,100);
		f5.add(fin5);
		f5.add(cost5);
		fin5.setFont(new Font("Courier New", Font.BOLD, 20));
		cost5.setFont(new Font("Courier New", Font.BOLD, 20));
		}
		});
		break;
		case 6 : JFrame f6 = new JFrame("BENZ");
		JTextField sw6=new JTextField();
		sw6.setBounds(300,100,200,50);
		JLabel hr6=new JLabel("enter no of hrs");
		JButton jbut6 = new JButton("Submit");
		f6.add(jbut6);
		jbut6.setBounds(300,200,200,50);
		hr6.setBounds(100,50,200,50);
		f6.add(sw6);
		f6.add(hr6);
		f6.setLayout(null);
		f6.setVisible(true);
		f6.setSize(800,800);
		hr6.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut6.setFont(new Font("Courier New", Font.BOLD, 20));
		jbut6.addActionListener(new ActionListener() 
		{
		public void actionPerformed(ActionEvent e) 
		{
		int p=Integer.parseInt(sw6.getText());
		int k=p*835;
		fin6=new JLabel("You'r car has been booked.");
		cost6=new JLabel("total cost = " +k);
		cost6.setBounds(200,350,400,100);
		fin6.setBounds(200,250,400,100);
		f6.add(fin6);
		f6.add(cost6);
		fin6.setFont(new Font("Courier New", Font.BOLD, 20));
		cost6.setFont(new Font("Courier New", Font.BOLD, 20));
		}
		});
		break;
		default : JLabel fin7=new JLabel("Please enter valid option");
		f.add(fin7);
		fin7.setBounds(450,670,200,100);
		break;
		}
		}
		});
		}
		}
		});
	}

}
