package ProjetoFinal;

public class HistoryComm extends CommandHandler{
    private final CommandHistory history;

    public HistoryComm(CommandHistory history) {
        this.history = history;
    }

    @Override
    public void execute(String[] args) {
        history.showHistory();
    }
}
