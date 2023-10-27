package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class MainFrame {
	
	
	public static final Color clrBtnIdle = new Color(69, 129, 142);
	public static final Color clrOpsBg = new Color(118,165,175);
	public static final Color clrTheme = new Color(254,250,224);
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
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
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel pnlNavBar = new JPanel();
		pnlNavBar.setBackground(new Color(58,90,64));
		pnlNavBar.setBorder(new EmptyBorder(12, 12, 12, 12));
		frame.getContentPane().add(pnlNavBar, BorderLayout.WEST);
		pnlNavBar.setLayout(new BorderLayout(0, 0));
		
		
		JPanel pnlLogo = new JPanel();
		pnlLogo.setBorder(new EmptyBorder(0, 0, 16, 0));
		pnlLogo.setPreferredSize(new Dimension(173, 64));
		pnlNavBar.add(pnlLogo,BorderLayout.NORTH);
		
		ImageIcon logo = new ImageIcon(MainFrame.class.getResource("/view/icon/logo.png"));
		JLabel lblLogo = new JLabel(logo,JLabel.CENTER);
		pnlLogo.add(lblLogo, BorderLayout.NORTH);
		
		
		JPanel pnlNavLists = new JPanel();
		pnlNavLists.setBackground(new Color(58,90,64));
		pnlNavLists.setBorder(new EmptyBorder(16, 0, 0, 0));
		pnlNavBar.add(pnlNavLists, BorderLayout.CENTER);
		pnlNavLists.setLayout(new GridLayout(9, 1, 0, 15));
		
		JPanel pnlBanHang = new JPanel();
		pnlBanHang.setBackground(clrTheme);
		pnlNavLists.add(pnlBanHang);
		pnlBanHang.setLayout(new BorderLayout(0, 0));
		
		JLabel lblBanHang = new JLabel("Bán Hàng");
		lblBanHang.setHorizontalAlignment(SwingConstants.CENTER);
		lblBanHang.setIcon(new ImageIcon(MainFrame.class.getResource("/view/icon/cart_icon.png")));
		lblBanHang.setForeground(Color.DARK_GRAY);
		lblBanHang.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlBanHang.add(lblBanHang);
		
		JPanel pnlKhachHang = new JPanel();
		pnlKhachHang.setBackground(clrTheme);
		pnlNavLists.add(pnlKhachHang);
		pnlKhachHang.setLayout(new BorderLayout(0, 0));
		
		JLabel lblKhachHang = new JLabel("Khách Hàng");
		lblKhachHang.setHorizontalAlignment(SwingConstants.CENTER);
		lblKhachHang.setIcon(new ImageIcon(MainFrame.class.getResource("/view/icon/khachHang_icon.png")));
		lblKhachHang.setForeground(Color.DARK_GRAY);
		lblKhachHang.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlKhachHang.add(lblKhachHang);
		
		JPanel pnlSanPham = new JPanel();
		pnlSanPham.setBackground(clrTheme);
		pnlNavLists.add(pnlSanPham);
		pnlSanPham.setLayout(new BorderLayout(0, 0));
		
		JLabel lblSanPham = new JLabel("Sản Phẩm");
		lblSanPham.setHorizontalAlignment(SwingConstants.CENTER);
		lblSanPham.setIcon(new ImageIcon(MainFrame.class.getResource("/view/icon/clothes_icon.png")));
		lblSanPham.setForeground(Color.DARK_GRAY);
		lblSanPham.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlSanPham.add(lblSanPham);
		
		JPanel pnlNhaCungCap = new JPanel();
		pnlNhaCungCap.setBackground(clrTheme);
		pnlNavLists.add(pnlNhaCungCap);
		pnlNhaCungCap.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNhaCungCap = new JLabel("Nhà cung cấp");
		lblNhaCungCap.setHorizontalAlignment(SwingConstants.CENTER);
		lblNhaCungCap.setIcon(new ImageIcon(MainFrame.class.getResource("/view/icon/boxes_icon.png")));
		lblNhaCungCap.setForeground(Color.DARK_GRAY);
		lblNhaCungCap.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlNhaCungCap.add(lblNhaCungCap);
		
		JPanel pnlNhanVien = new JPanel();
		pnlNhanVien.setBackground(clrTheme);
		pnlNavLists.add(pnlNhanVien);
		pnlNhanVien.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNhanVien = new JLabel("Nhân Viên");
		lblNhanVien.setHorizontalAlignment(SwingConstants.CENTER);
		lblNhanVien.setIcon(new ImageIcon(MainFrame.class.getResource("/view/icon/nhanVien_icon.png")));
		lblNhanVien.setForeground(Color.DARK_GRAY);
		lblNhanVien.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlNhanVien.add(lblNhanVien);
		
		JPanel pnlThongKe = new JPanel();
		pnlThongKe.setBackground(clrTheme);
		pnlNavLists.add(pnlThongKe);
		pnlThongKe.setLayout(new BorderLayout(0, 0));
		
		JLabel lblThngK = new JLabel("Thống Kê");
		lblThngK.setHorizontalAlignment(SwingConstants.CENTER);
		lblThngK.setIcon(new ImageIcon(MainFrame.class.getResource("/view/icon/thongKe_icon.png")));
		lblThngK.setForeground(Color.DARK_GRAY);
		lblThngK.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlThongKe.add(lblThngK);
		
		JPanel pnlTraHang = new JPanel();
		pnlTraHang.setBackground(clrTheme);
		pnlNavLists.add(pnlTraHang);
		pnlTraHang.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTraHang = new JLabel("Trả Hàng");
		lblTraHang.setHorizontalAlignment(SwingConstants.CENTER);
		lblTraHang.setIcon(new ImageIcon(MainFrame.class.getResource("/view/icon/traHang_icon.png")));
		lblTraHang.setForeground(Color.DARK_GRAY);
		lblTraHang.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlTraHang.add(lblTraHang);
		
		JPanel pnlHoTro = new JPanel();
		pnlHoTro.setBackground(clrTheme);
		pnlNavLists.add(pnlHoTro);
		pnlHoTro.setLayout(new BorderLayout(0, 0));
		
		JLabel lblHoTro = new JLabel("Hỗ Trợ");
		lblHoTro.setHorizontalAlignment(SwingConstants.CENTER);
		lblHoTro.setIcon(new ImageIcon(MainFrame.class.getResource("/view/icon/hoTro_icon.png")));
		lblHoTro.setForeground(Color.DARK_GRAY);
		lblHoTro.setFont(new Font("Tahoma", Font.BOLD, 18));
		pnlHoTro.add(lblHoTro);
		
		JPanel pnlLogout = new JPanel();
		pnlNavBar.add(pnlLogout, BorderLayout.SOUTH);
		
	}

}
