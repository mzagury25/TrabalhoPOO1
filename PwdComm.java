package ProjetoFinal;

public class PwdComm extends CommandHandler{
    private final DirectoryManager directoryManager;

    public PwdComm(DirectoryManager directoryManager) {
        this.directoryManager = directoryManager;
    }

    @Override
    public void execute(String[] args) {
        directoryManager.pwd();
    }
}
