import javax.swing.JOptionPane;

public class lula_ladrao {
public static void main(String[]args) {
	int politicos= 0;
	int eleitores=0;
	
     
	JOptionPane.showMessageDialog(null, "Bem Vindo(a) as Eleições de 2026!!!\n Por favor, faça seu trabalho de cidadão e escolha \n Um bom candidato!");

	 politicos=Integer.parseInt(JOptionPane.showInputDialog("Quantos candidatos terá nessa Eleição?"));
	 
	 eleitores=Integer.parseInt(JOptionPane.showInputDialog("Quantos ELEITORES terá nessa Eleição?"));

	 
	 
	 int nome[]= new int[politicos];
	
	int votos[]= new int[eleitores];

	 
	 for(int contagem =0; contagem <politicos; contagem++) {
		 
		 nome[contagem]=Integer.parseInt(JOptionPane.showInputDialog("Qual o numero de cada candidato? \n  (Exemplo:1,2,3,4...)"));
		 JOptionPane.showMessageDialog(null, " Este é o numero do candidato\n "+ nome[contagem]);
		 
	 	 
	 
	 JOptionPane.showMessageDialog(null, "Agora vamos para as votações! "); 

	 for(int votacao=0;votacao<eleitores;votacao++) {
		
		 votos[votacao]=Integer.parseInt(JOptionPane.showInputDialog("Eleitor qual o seu candidato? "));
		 
		 if(votos=nome[1]) {
			 
		 
		}
	 
	
	 
	 
	  }
	 }	
		
	 
	 
	
	 
	 
	 
	 
}	 
}

