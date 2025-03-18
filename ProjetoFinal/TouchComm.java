package ProjetoFinal;

public class TouchComm extends CommandHandler{
    private final FileManager fileManager;

    public TouchComm(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public void execute(String[] args) {
        if(args.length > 0) {
            fileManager.touch(args[0]);
        } else {
            System.out.println("Uso: touch <arquivos>");
        }
    }
}
