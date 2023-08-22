public class App {
    public static void main(String[] args) throws Exception {
       


    }

    public interface ReprodutorMusical {
        void tocar();
        void pausar();
        void selecionarMusica(String musica);
    }

    public static void tocar(){
        System.out.print("Telefone Tocando");
    }

        public static void pausar(){
        System.out.print("Telefone sendo chamado");
    }

    public static void selecionarMusica(String musica){
        System.out.print("Tocar música");
    }
}
