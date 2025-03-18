package ProjetoFinal;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Terminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DirectoryManager directoryManager = new DirectoryManager();
        FileManager fileManager = new FileManager();
        HistoryComm history = new HistoryComm();
        Map<String, CommandHandler> commands = new HashMap<>();

        commands.put("pwd", new PwdComm(directoryManager));
        commands.put("ls", new LsComm(directoryManager));
        commands.put("cd", new CdComm(directoryManager));
        commands.put("mkdir", new MkdirComm(directoryManager));
        commands.put("touch", new TouchComm(fileManager));
        commands.put("rm", new RmComm(fileManager));
        commands.put("cat", new CatComm(fileManager));
        commands.put("echo", new EchoComm(fileManager));
        commands.put("history", history);

        do {
            System.out.print("> ");
            String input = sc.nextLine();
            history.addCommand(input);

            String[] parts = input.split(" "); // Separa o comando em 2, utilizando o espaço para delimitar
            String command = parts[0];

            if (commands.containsKey(command)) {
                String[] arr = new String[parts.length - 1];
                System.arraycopy(parts, 1, arr, 0, arr.length); // Copia todo o array parts a partir do comando (parts[0])

                commands.get(command).execute(arr);
            } else if (command.equals("exit")) {
                history.saveHistory();
                System.out.println("Finalizando...");
                sc.close();
                break;
            } else {
                System.out.println("Comando " + command + " nao reconhecido!");
            }
        } while (true);
    }
}