package ProjetoFinal;

public class LsComm extends CommandHandler{
    private final DirectoryManager directoryManager;

    public LsComm(DirectoryManager directoryManager) {
        this.directoryManager = directoryManager;
    }

    @Override
    public void execute(String[] args) {
        directoryManager.ls();
    }
}
