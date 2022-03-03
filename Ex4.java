import javax.swing.JOptionPane;
public class Ex4 {
    public static void main(String[] args) {
        //declacao das variáveis 
        Integer numero, resultado;
        //entrada de dados
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro "));
        //operação
        resultado = numero - 1;
        //Iimprimindo
        String c = String.format("o resultado é %d", resultado);
        JOptionPane.showMessageDialog(null,c);   
    }    
}
