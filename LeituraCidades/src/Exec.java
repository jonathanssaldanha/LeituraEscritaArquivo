
import java.io.FileNotFoundException;


public class Exec {
    
    public static void main(String[] args) throws FileNotFoundException{
    String arq = "teste.txt";
    
        
    // para Criar um arquivo txt e salvar com o nome teste.txt na pasta src
    /*String texto = "Jonathan\r\n programador\r\n de sucesso";
    
    if(Arquivo.Write(arq, texto))
        System.out.println("Arquivo salvo com sucesso");
    else
            System.out.println("Erro: Salvar Arquivo");
    */
    
    
    // Para Ler um arquivo dentro de src
    /*String texto = Arquivo.Read(arq);
    if(texto.isEmpty())
        System.out.println("Erro ao ler o arquivo");
    else
        System.out.println(texto);
    
    */
    
    
    String ArqConfig = "conf.con";
    /*String nome = "Jonathan";
    String login = "Dev";
    String versao = "1.0.5";
    
    String print = nome+";"+login+";"+versao;
    Arquivo.Write(ArqConfig, print);
    */
    
    String conteudo = Arquivo.Read(ArqConfig);
    String c1 = conteudo.split(";")[0];
    String c2 = conteudo.split(";")[1];
    String c3 = conteudo.split(";")[2];
    
        System.out.println("Nome: "+c1);
        System.out.println("Login: "+c2);
        System.out.println("Versao: "+c3);
   }
}