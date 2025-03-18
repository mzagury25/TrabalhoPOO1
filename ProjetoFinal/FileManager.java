package ProjetoFinal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileManager {

    public void touch(String fileName) {
        try {
            new File(fileName).createNewFile();
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }
    }

    public void rm(String path) {
        File file = new File(path);
        if (file.exists()) {
            if (file.isDirectory()) {
                file.delete();
            } else {
                file.delete();
            }
        } else {
            System.out.println("Arquivo ou diretorio "  + path + " nao encontrado");
        }
    }

    public void cat(String fileName) {
        try {
            String content = new String(Files.readAllBytes(Paths.get(fileName)));  // Lendo todo o arquivo
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }

    public void echo(String text, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) { // Garantir que a instancia seja fechada
            writer.write(text);
        } catch (IOException e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
