import javax.swing.JOptionPane;

public class Ex2 {
        public static void main(String[] args) {
        //declarando 
        int n1, n2, n3, n4, resultado;
        //entrada
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primero número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número: "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite o quarto número: "));
        //operação
        resultado = (n1*n1) + (n2*n2) + (n3*n3) + (n4*n4);
        //imprimindo
        String c = String.format("(%f*%f) + (%f*%f) ++ (%f*%f) + (%f*%f) = %f", n1,n2,n3,n4,resultado);
            JOptionPane.showMessageDialog(null,c);
    }    
    
}
