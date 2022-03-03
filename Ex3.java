import javax.swing.JOptionPane;
public class Ex3 {
    public static void main(String[] args) {
        //declacao das variáveis 
        Double v_unitario , q_vendida, comicao, total_venda;
        //entrada de dados
        v_unitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário: "));
        q_vendida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade vendida: "));
        //operação
        total_venda = q_vendida * v_unitario;
        comicao = total_venda * 0.05;
        //Iimprimindo
        String c = String.format("%.2f * %.2f = %.2f", q_vendida ,v_unitario, comicao);
        JOptionPane.showMessageDialog(null,c);   
    }    
}
