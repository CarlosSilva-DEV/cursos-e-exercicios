package aula14;
public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTML5");
        
        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Jubileu", 22, "M", "juba");
        u[1] = new Usuario("Creuza", 25, "F", "creuzita09");
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(u[0], v[0]);
        vis[0].avaliar();
        
        vis[1] = new Visualizacao(u[0], v[1]);
        vis[1].avaliar(87.0f);
        
        
        System.out.println("VIDEOS" + "\n" + "---------------------------------------------------------------------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\n");
        
        System.out.println("USUARIOS" + "\n" + "---------------------------------------------------------------------------------");
        System.out.println(u[0].toString());
        System.out.println(u[1].toString());
        
        System.out.println("VISUALIZAÇÃO" + "\n" + "---------------------------------------------------------------------------------");
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
    }
}
