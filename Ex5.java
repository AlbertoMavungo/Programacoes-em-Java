import javax.swing.JOptionPane;
public class Ex5 {
    public static void main(String[] args) {
        //declacao das variáveis 
        Double altura , base, area;
        //entrada de dados
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base: "));
         altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
        //operação
        area = base * altura;
        //Iimprimindo
        String c = String.format("%.2f * %.2f = %.2f", base,altura, area);
        JOptionPane.showMessageDialog(null,c);   
    }    
}