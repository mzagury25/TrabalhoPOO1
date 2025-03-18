package ProjetoFinal;

public class MkdirComm extends CommandHandler{
    private final DirectoryManager directoryManager;

    public MkdirComm(DirectoryManager directoryManager) {
        this.directoryManager = directoryManager;
    }

    @Override
    public void execute(String[] args) {
        if(args.length > 0) {
            directoryManager.mkdir(args[0]);
        } else {
            System.out.println("Uso: mkdir <nome>");
        }
    }
}
