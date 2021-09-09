package lista2.emcapsulamento;
import javax.swing.JOptionPane;

public class testaAluno {

    public static void main(String args[]) {

        Aluno aluno1 = new Aluno(155474, "Jorgin da 12", 54, 5.9f, 2.9f);

        Aluno aluno2 = new Aluno();

        aluno2.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade")));
        aluno2.setNome(JOptionPane.showInputDialog("Informe seu nome"));
        aluno2.setNumeroAluno(Integer.parseInt(JOptionPane.showInputDialog("Informe seu numero de aluno")));
        aluno2.setNota(6, 7);


        

        aluno1.notaFinal();

        System.out.println(aluno1.toString()); 

        //Null indica que a caixa de dialago nao tem pai
        JOptionPane.showMessageDialog(null,  aluno2.toString(), "Dados aluno", 1);

        System.out.println(aluno2.toString()); 
        aluno2.notaFinal();


        
        




    }    
}

