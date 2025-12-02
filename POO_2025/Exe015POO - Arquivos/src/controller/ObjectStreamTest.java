package controller;

import model.Pessoa;

import java.io.*;
import java.time.LocalDate;

public class ObjectStreamTest {
    public void usarObjectOutputStreamCriar() {
        try {
            File file = new File("arquivo.teste");

            FileOutputStream fileOutputStream = new FileOutputStream(file);

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject("arquivo");
            objectOutputStream.writeObject(new Pessoa("Sr.Teste", LocalDate.of(2025, 12, 1), "teste@teste.com", "123456789101"));

            objectOutputStream.close();

        } catch (NotSerializableException e) {
            System.out.println("Erro ao serializar objeto");
        } catch (IOException ex) {
            System.out.println("Falha de gravação");
        } catch (SecurityException ex) {
            System.out.println("Usuário sem acesso á gravar dados no diretório");
        }
    }

}
