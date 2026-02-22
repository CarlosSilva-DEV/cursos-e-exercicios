package aula11;
public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante("Juvenal", 22, "M");
        Aluno a1 = new Aluno("Claudio", 16, "M", 1111, "Informática");
        Bolsista b1 = new Bolsista("Jubileu", 22, "M", 1112, "Informática", 12.5f);
        
        System.out.println(v1.toString());
        System.out.println(a1.toString());
        System.out.println(b1.toString());
        System.out.println("");
        
        a1.pagarMensalidade(); // chamada do método principal
        b1.pagarMensalidade(); // chamada do método sobreposto
    } 
}
