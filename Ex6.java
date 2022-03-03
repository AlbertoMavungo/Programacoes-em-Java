import javax.swing.JOptionPane;
public class Ex6 {
    public static void main(String[] args) {
        //declacao das variáveis 
        Integer anos, idade_dias;
        //entrada de dados
        
        anos = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade"));
        //operação
        idade_dias = anos * 365;
        //Iimprimindo
        String c = String.format("Você tem %d dias de idade", idade_dias);
        JOptionPane.showMessageDialog(null,c);   
    }    
}
