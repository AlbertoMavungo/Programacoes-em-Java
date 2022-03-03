import javax.swing.JOptionPane;
public class Ex9 {
    public static void main(String[] args) {
        //declacao das variáveis 
        Double salario , reajuste, new_salario, desconto;
        //entrada de dados
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor mensal atual: "));
        reajuste = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
        //operação
        desconto = (salario * reajuste)/100;
        new_salario = salario - desconto;
        //Iimprimindo
        String c = String.format("o novo salário é", new_salario);
        JOptionPane.showMessageDialog(null,c);   
    }    
}