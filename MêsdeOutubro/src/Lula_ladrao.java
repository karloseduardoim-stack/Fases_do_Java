import javax.swing.JOptionPane;

public class Lula_ladrao {
public static void main(String[]args) {
	int politicos= 0;
	int eleitores=0;
	int votos=0;
     
	JOptionPane.showMessageDialog(null, "Bem Vindo(a) as Eleições de 2026!!!\n Por favor, faça seu trabalho de cidadão e escolha \n Um bom candidato!");

	 politicos=Integer.parseInt(JOptionPane.showInputDialog("Quantos candidatos terá nessa Eleição?"));
	 
	 eleitores=Integer.parseInt(JOptionPane.showInputDialog("Quantos ELEITORES terá nessa Eleição?"));

	 
	 
	 String nome[]= new String[politicos];
	 String numero[]=new String[eleitores];
	 
	 for(int contagem =0; contagem <politicos; contagem++) {
		 
		 nome[contagem]=JOptionPane.showInputDialog("Qual o nome de cada candidato?");
		
		 JOptionPane.showMessageDialog(null, " Este é o nome de cada candidato\n "+ nome[contagem]);
		 
		 numero[contagem]=JOptionPane.showInputDialog("Diga agora, o número de cada Eleitor:");

	 }
		for(int i=0; i<votos;i++) {
			JOptionPane
		}
	 
	 

}
}
