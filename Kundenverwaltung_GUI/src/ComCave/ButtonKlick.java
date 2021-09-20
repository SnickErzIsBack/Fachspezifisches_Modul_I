package ComCave;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ButtonKlick implements ActionListener
{
	Window w;

	public ButtonKlick(Window window)
	{
		this.w = window;
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(  e.getSource().equals( w.btnSpeichern )   )
		{
			Kunde.kundenListe.add(new Kunde(
					w.cbAnrede.getSelectedItem().toString(),
					w.tfVorname.getText(),
					w.tfNachname.getText(),
					w.tfAnschrift.getText(),
					w.tfPlz.getText(),
					w.tfOrt.getText(),
					w.tfTelefon.getText(),
					w.cbxNeukunde.isSelected()
			));
			
			if(DateiManager.kundenSpeichern())
			{
				clearForm();
			}else {
				JOptionPane.showMessageDialog(w, "Kunde nicht gespeichert");
			}
			
		}else if(  e.getSource().equals( w.btnShowKunde )  ){
			w.taKundenAnzeige.setText(""); // TextArea leeren
			String text = "";
			for(Kunde kunde : Kunde.kundenListe)
			{
				text += kunde.getAnrede() + " " + kunde.getVorname() + " " + kunde.getNachname() + "\n";
			}
			w.taKundenAnzeige.setText(text);
		}else if( e.getSource().equals( w.btnCsvExport ) ) {
			File file = new File( new File("export.csv").getAbsolutePath() );
			
			JFileChooser exportDialog = new JFileChooser();
			exportDialog.setSelectedFile(file);
			
			int result = exportDialog.showSaveDialog(w);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				file = exportDialog.getSelectedFile();
				DateiManager.csvSpeichern(file);
			}
		}
	}

	private void clearForm()
	{
		w.tfVorname.setText("");
		w.cbAnrede.setSelectedIndex(0);
		w.cbxNeukunde.setSelected(false);
	}
}
