package controller;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class DataStreamTest {

    public void usarDataOutputStream() {
        try {
            // Local do Arquivo
            File file = new File("texto.serializado");


            // Escrevendo dentro de um arquivo binário serializado
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);

            dataOutputStream.writeInt(1);
            dataOutputStream.writeUTF("Teste");

            fileOutputStream.close();
            dataOutputStream.close();

            // Lendo de um arquivo binário serializado
            FileInputStream fileInputStream = new FileInputStream(file);

            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readUTF());

            // Possíveis erros
        } catch (FileNotFoundException ex) {
            System.out.println("File é diretório inválido");;
        } catch (IOException ex) {
            System.out.println("Falha de gravação");
        } catch (SecurityException ex) {
            System.out.println("Usuário sem acesso á gravar dados no diretório");
        }

    }

}
