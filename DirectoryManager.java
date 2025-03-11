package ProjetoFinal;

import java.io.File;

public class DirectoryManager {

    private String currentDirectory = System.getProperty("user.dir"); // Diretorio atual

    public void pwd() {
        System.out.println(currentDirectory);
    }

    public void ls() {
        File dir = new File(currentDirectory);
        String[] files = dir.list(); // Lista tudo
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        }
    }

    public void cd(String path) {
        File newDir = new File(currentDirectory + File.separator + path); // Separador para qualquer SO
        if (newDir.exists() && newDir.isDirectory()) {
            currentDirectory = newDir.getAbsolutePath(); // Caminho absoluto
        } else {
            System.out.println("Diretorio nao encontrado: " + path);
        }
    }

    public void mkdir(String dirName) {
        File newDir = new File(currentDirectory + File.separator + dirName);
        if (!newDir.exists()) {
            newDir.mkdir();
        } else {
            System.out.println("Diretorio ja existe: " + dirName);
        }
    }
}
