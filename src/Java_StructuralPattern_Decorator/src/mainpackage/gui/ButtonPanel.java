package mainpackage.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import mainpackage.decorator.BaseBianca;
import mainpackage.decorator.BaseRossa;
import mainpackage.decorator.Carciofi;
import mainpackage.decorator.Consumation;
import mainpackage.decorator.ExtraAddict;
import mainpackage.decorator.Patate;

public class ButtonPanel extends JPanel {

	private JButton submit;
	private JComboBox basi;
	private JComboBox extrasAddicts1;
	private JComboBox extrasAddicts2;
	private JComboBox extrasAddicts3;
	private JComboBox extrasAddicts4;

	private ExtraAddict e1;
	private ExtraAddict e2;
	private ExtraAddict e3;
	private ExtraAddict e4;

	private Consumation c;
	private ArrayList<ExtraAddict> addicts;

	public ButtonPanel() {
		String[] basiPizza = { "", "Bianca", "Rossa" };
		String[] extras = { "", "Patate", "Carciofi" };
		addicts = new ArrayList<>();
		submit = new JButton("submit");
		basi = new JComboBox<>(basiPizza);
		extrasAddicts1 = new JComboBox<>(extras);
		extrasAddicts2 = new JComboBox<>(extras);
		extrasAddicts3 = new JComboBox<>(extras);
		extrasAddicts4 = new JComboBox<>(extras);

		this.add(basi);
		this.add(extrasAddicts1);
		this.add(extrasAddicts2);
		this.add(extrasAddicts3);
		this.add(extrasAddicts4);

		basi.setSelectedIndex(0);
		basi.setActionCommand(getName());
		initButtonsFunctions();
		this.setBackground(Color.RED);
	}

	private void initButtonsFunctions() {
		submit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				switch (basi.getSelectedItem().toString()) {
				case "Bianca":
					c = new BaseBianca();
					break;

				case "Rossa":
					c = new BaseRossa();
					break;
				default:
					System.out.println("niente pizza ");
					break;
				}

				switch (extrasAddicts1.getSelectedItem().toString()) {
				case "Patate":
					e1 = new Patate(c);
					addicts.add(e1);
					break;
				case "Carciofi":
					e1 = new Carciofi(c);
					addicts.add(e1);
					break;

				default:
					break;
				}
				switch (extrasAddicts2.getSelectedItem().toString()) {
				case "Patate":
					e2 = new Patate(c);
					addicts.add(e2);
					break;
				case "Carciofi":
					e2 = new Carciofi(c);
					addicts.add(e2);
					break;

				default:
					break;
				}
				switch (extrasAddicts3.getSelectedItem().toString()) {
				case "Patate":
					e3 = new Patate(c);
					addicts.add(e3);
					break;
				case "Carciofi":
					e3 = new Carciofi(c);
					addicts.add(e3);
					break;

				default:
					break;
				}
				switch (extrasAddicts4.getSelectedItem().toString()) {
				case "Patate":
					e4 = new Patate(c);
					addicts.add(e4);
					break;
				case "Carciofi":
					e4 = new Carciofi(c);
					addicts.add(e4);
					break;

				default:
					break;
				}
				if (c != null) {
//					System.out.println(c.getProductName()) ; 
					for (ExtraAddict extraAddict : addicts) {
						System.out.println(extraAddict.getProductName());
					}
				}
			}
		});
		this.add(submit);
	}
}
