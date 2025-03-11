package ProjetoFinal;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    private List<String> history = new ArrayList<>();

    public void addCommand(String command) {
        history.add(command);
    }

    public void showHistory() {
        for (String c : history) {
            System.out.println(c);
        }
    }

    public void saveHistory() {
        try (FileWriter writer = new FileWriter("history.txt")) { // Garantir fechamento
            for (String c : history) {
                writer.write(c + "\n");
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar historico: " + e.getMessage());
        }
    }
}
