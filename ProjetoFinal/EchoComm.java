package ProjetoFinal;

public class EchoComm extends CommandHandler {
    private final FileManager fileManager;

    public EchoComm(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public void execute(String[] args) {
        if (args.length < 3 || !args[args.length - 2].equals(">")) {
            System.out.println("Uso: echo <texto> > <arquivo>");
            return;
        }

        StringBuilder texto = new StringBuilder(); // Concatena todas as palavras do texto em uma unica string
        for (int i = 0; i < args.length - 2; i++) {
            texto.append(args[i]).append(" "); // Primeiro argumento (o texto)
        }
        String textoFinal = texto.toString().trim(); // Remove espaços extras

        String arquivo = args[args.length - 1]; // Ultimo argumento (o arquivo)

        fileManager.echo(textoFinal, arquivo);
    }
}
