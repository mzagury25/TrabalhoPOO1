TERMINAL SIMPLES EM JAVA

Este é um terminal simples desenvolvido em Java que simula alguns comandos básicos de um terminal Linux. Ele foi projetado para ser modular e de fácil expansão, permitindo a adição de novos comandos conforme necessário.
Funcionalidades

O terminal suporta os seguintes comandos:

    pwd: Exibe o diretório atual.

    ls: Lista os arquivos e diretórios do diretório atual.

    cd <diretório>: Navega entre diretórios.

    mkdir <nome>: Cria um novo diretório.

    touch <arquivo>: Cria um novo arquivo vazio.

    rm <arquivo/diretório>: Remove um arquivo ou diretório.

    cat <arquivo>: Exibe o conteúdo de um arquivo.

    echo <texto> > <arquivo>: Escreve texto em um arquivo.

    history: Mostra o histórico de comandos digitados.

    exit: Encerra o programa.

Pré-requisitos

    Java Development Kit (JDK) 8 ou superior.

    Um terminal ou prompt de comando para executar o programa.

Como Executar

    Clone o repositório (se aplicável):
    bash
    Copy

    git clone https://github.com/mzagury25/terminalJava
    cd seu-repositorio

    Compile o programa:

        Navegue até o diretório onde estão os arquivos .java.

        Execute o seguinte comando para compilar todos os arquivos Java:
        bash
        Copy

        javac *.java

    Execute o terminal:

        Após a compilação, execute o programa com o seguinte comando:
        bash
        Copy

        java Terminal

Como Usar

    Ao iniciar o programa, você verá um prompt (>), onde pode digitar os comandos.

    Digite um comando e pressione Enter para executá-lo.

    Use o comando exit para encerrar o programa.

Exemplos de Uso

    Listar arquivos no diretório atual:
    bash
    Copy

    > ls

    Criar um novo diretório:
    bash
    Copy

    > mkdir nova_pasta

    Navegar para um diretório:
    bash
    Copy

    > cd nova_pasta

    Criar um arquivo vazio:
    bash
    Copy

    > touch arquivo.txt

    Escrever texto em um arquivo:
    bash
    Copy

    > echo "Olá, mundo!" > arquivo.txt

    Exibir o conteúdo de um arquivo:
    bash
    Copy

    > cat arquivo.txt

    Exibir o histórico de comandos:
    bash
    Copy

    > history

    Encerrar o programa:
    bash
    Copy

    > exit

Estrutura do Projeto

    Terminal.java: Classe principal que inicia o programa e gerencia a entrada do usuário.

    CommandHandler.java: Classe base para manipulação de comandos.

    FileManager.java: Classe para manipulação de arquivos.

    DirectoryManager.java: Classe para manipulação de diretórios.

    CommandHistory.java: Classe para gerenciar o histórico de comandos.

Expansão Modular

Para adicionar novos comandos:

    Crie uma nova classe que estenda CommandHandler.

    Implemente o método execute com a lógica do comando.

    Adicione o comando ao Map de comandos na classe Terminal.

Exemplo de Novo Comando
java
Copy

public class NovoComando extends CommandHandler {
    @Override
    public void execute(String[] args) {
        // Lógica do novo comando
    }
}

No Terminal.java, adicione:
java
Copy

commands.put("novoComando", new NovoComando());
