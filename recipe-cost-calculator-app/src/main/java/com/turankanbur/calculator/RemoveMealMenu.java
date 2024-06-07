/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 * The package com.turankanbur.calculator contains classes related to the calculator application.
 */
package com.turankanbur.calculator;

/**
 * This class represents the menu for removing meals from the database.
 */
public class RemoveMealMenu extends javax.swing.JFrame {

	/**
	 * The serial version UID for serialization.
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Facade for removing meals.
	 */
	DBFacadeRemoveMeal databaseFacadeForRemoveMealMenu;

	/**
	 * Constructor to initialize the RemoveMealMenu GUI.
	 */
	public RemoveMealMenu() {
		databaseFacadeForRemoveMealMenu = new DBFacadeRemoveMeal(this);
		setResizable(false);
		initComponents();
		setLocationRelativeTo(null);

	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mealbackground.jpg")));

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } },
				new String[] { "meal_id", "meal_name", "recipe_name", "meal_cost" }));
		jScrollPane1.setViewportView(jTable1);

		jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18));
		jButton1.setText("Fetch");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18));
		jButton2.setText("Back");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setFont(new java.awt.Font("Segoe UI", 0, 18));
		jButton3.setText("Remove");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 288,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(45, 45, 45)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 155, Short.MAX_VALUE))
								.addGroup(jPanel1Layout.createSequentialGroup().addGap(96, 96, 96)
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(57, 57, 57)
										.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 116,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(63, 63, 63)
										.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 119,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 666,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(jPanel1Layout.createSequentialGroup().addGap(81, 81, 81)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(30, 30, 30)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
								.addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}

	/**
	 * Action performed when the "Back" button is clicked.
	 * 
	 * @param evt The ActionEvent representing the action
	 */
	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		PlanMealMenu mealMenu = new PlanMealMenu();
		mealMenu.setVisible(true);
		this.dispose();
	}

	/**
	 * Action performed when the "Fetch" button is clicked.
	 * 
	 * @param evt The ActionEvent representing the action
	 */
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		databaseFacadeForRemoveMealMenu.FetchData();
	}

	/**
	 * Action performed when the "Remove" button is clicked.
	 * 
	 * @param evt The ActionEvent representing the action
	 */
	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		databaseFacadeForRemoveMealMenu.removeAdjacentRows();
	}

	/**
	 * Button for action 1.
	 */
	public javax.swing.JButton jButton1;

	/**
	 * Button for action 2.
	 */
	public javax.swing.JButton jButton2;

	/**
	 * Button for action 3.
	 */
	public javax.swing.JButton jButton3;

	/**
	 * Label for displaying information.
	 */
	public javax.swing.JLabel jLabel1;

	/**
	 * Panel for organizing components.
	 */
	public javax.swing.JPanel jPanel1;

	/**
	 * Scroll pane for table display.
	 */
	public javax.swing.JScrollPane jScrollPane1;

	/**
	 * Table for displaying data.
	 */
	public javax.swing.JTable jTable1;


}