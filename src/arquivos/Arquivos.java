package arquivos;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Arquivos {

    public static void main(String[] args) {
        //caminho do arquivo
        String caminho ="C:\\Users\\22282115\\Java\\teste";
        
        //abrir o arquivo em modo escrita  
        Path path = Paths.get(caminho);
        
        try {
            //criar buffer de escrita
            BufferedWriter bw = Files.newBufferedWriter(path,StandardOpenOption.APPEND, StandardOpenOption.WRITE);
            
            bw.write("Olá, F482H90F8WEJ0DJI2039FJS");
            bw.newLine();
            bw.close();
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "O arquivo não existe");
        }
        
    }
    
}
