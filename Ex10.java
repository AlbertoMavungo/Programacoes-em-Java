import javax.swing.JOptionPane;
public class Ex10 {
    public static void main(String[] args) {
        //declacao das variáveis 
        Double custo_carro, custo_fabrica, porc_impostos, distribuidor;
        //entrada de dados
        custo_fabrica = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo da fábrica: "));
        //operação
        distribuidor = (custo_fabrica * 28/100);
        porc_impostos = (custo_fabrica * 45/100);
        custo_carro = distribuidor + porc_impostos;
        //Iimprimindo
        String c = String.format("o novo salário é",custo_carro);
        JOptionPane.showMessageDialog(null,c);   
    }    
}