package pruebacodigos;

import javax.swing.JOptionPane;

public class PruebaCodigos {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		String mail=JOptionPane.showInputDialog("Introduce mail:");
		
		//System.out.println(controlMail(mail));
		JOptionPane.showMessageDialog(null, controlMail(mail),"Información" ,1,null);
		
	}
	
	public static String controlMail(String mail){

		boolean control=true;
						
		while (control) {

			int cont=0, cont2=0;

			if (mail.length()>3)
			  {				
				for(int i=0;i<mail.length();i++) {
				
					if (mail.charAt(i)=='@') cont++;

					else if (mail.charAt(i)=='.') cont2++;
			    }
							
			  }
			if (cont==1 && cont2==1) {

				 control=false;
				 
			} else mail=JOptionPane.showInputDialog("Dame otro email");
		}
		
		return "El mail introducido es correcto";

	}
}
