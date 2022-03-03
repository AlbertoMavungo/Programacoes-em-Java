import javax.swing.JOptionPane;
public class Ex11 {
    public static void main(String[] args) {
        //declacao das variáveis 
        Double n_carros_vendidos, valor_total, sal_fixo, valor_carro_vend, sal_final, comissao;
        //entrada de dados
        n_carros_vendidos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de carros vendidos: "));
        valor_total = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor total de suas vendas: "));
        sal_fixo = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salário fixo: "));
        valor_carro_vend = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por cada carro vendido: "));
        //operação
       sal_final = sal_fixo + (valor_carro_vend * n_carros_vendidos) + (valor_total * 0.05);

        //Iimprimindo
        String c = String.format("o novo salário é", sal_final);
        JOptionPane.showMessageDialog(null,c);   
    }    
}