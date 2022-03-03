import javax.swing.JOptionPane;
public class Ex1 {
    public static void main(String[] args) {
        //declacao das variáveis 
        Double Quantidade, Cotacao, Reais;
        //entrada de dados
        Quantidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade dos dólares: "));
        Cotacao = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação atual: "));
        //operação
        Reais = Quantidade * Cotacao;
        //Iimprimindo
        String c = String.format("%.2f + %.2f = %.2f", Quantidade,Cotacao,Reais);
        JOptionPane.showMessageDialog(null,c);
    }    
}
