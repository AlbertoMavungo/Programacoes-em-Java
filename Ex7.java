import javax.swing.JOptionPane;
public class Ex7 {
    public static void main(String[] args) {
        //declacao das variáveis 
        Integer anos, meses, dias;
        //entrada de dados
        
        anos = Integer.parseInt(JOptionPane.showInputDialog("entra com a idade em anos"));
        meses = Integer.parseInt(JOptionPane.showInputDialog("entra com a idade em meses"));
        dias = Integer.parseInt(JOptionPane.showInputDialog("entra com a idade em dias"));
        //operação
        //Iimprimindo
        String c = String.format("Você tem %d dias de idade", dias);
        JOptionPane.showMessageDialog(null,c);   
    }    
}
