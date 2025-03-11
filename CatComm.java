package ProjetoFinal;

public class CatComm extends CommandHandler{
    private final FileManager fileManager;

    public CatComm(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public void execute(String[] args) {
        if(args.length > 0) {
            fileManager.cat(args[0]);
        } else {
            System.out.println("Uso: cat <arquivos>");
        }
    }
}

