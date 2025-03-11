package ProjetoFinal;

public class CdComm extends CommandHandler{
    private final DirectoryManager directoryManager;

    public CdComm(DirectoryManager directoryManager) {
        this.directoryManager = directoryManager;
    }

    @Override
    public void execute(String[] args) {
        if(args.length > 0) {
            directoryManager.cd(args[0]);
        } else {
            System.out.println("Uso: cd <diretorio>");
        }
    }
}
