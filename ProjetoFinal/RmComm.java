package ProjetoFinal;

public class RmComm extends CommandHandler{
    private final FileManager fileManager;

    public RmComm(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public void execute(String[] args) {
        if(args.length > 0) {
            fileManager.rm(args[0]);
        } else {
            System.out.println("Uso: rm <arquivo/diretorio>");
        }
    }
}
