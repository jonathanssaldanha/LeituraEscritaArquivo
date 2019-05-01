
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0101765
 */
public class Exec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String linha;
        Cidade c;
        String partes[];
//      Uma lista que guardará em memória os objetos referentes as cidades
//      lidas do arquivo.
        List<Cidade> cidades = new ArrayList<>();
        
//      Um mapeamento chave,valor que ajuda a recuperar um objeto com base em
//      um identificador, neste caso um String com o nome da própria cidade.
        HashMap<String, Cidade> indice = new HashMap<>();
        
        try {
//          aponta para o arquivo que será lido. lembre de ajustar o endereço 
//          de acordo com sua máquina.
            FileReader fr = new FileReader("C:\\Users\\jonat\\Desktop\\PROGRAMAÇAO_3\\ListaCidades\\cidades.txt");
            BufferedReader in = new BufferedReader(fr);
            
//          itera para cada linha lida do arquivo. 
//          irá parar quando a leitura chegar ao fim do arquivo.
            while((linha = in.readLine()) != null){
//              quebra a linha lida do arquivo. as quebrar são dirigidas pelos
//              espaços em branco.
                partes = linha.split(" ");
                
//              cria um novo objeto do tipo Cidade em cada iteração. coloca os 
//              dados lidos do arquivo no objeto criado.
                c = new Cidade();
                c.setNome(partes[0]);
                c.setX(Integer.parseInt(partes[1]));
                c.setY(Integer.parseInt(partes[2]));
                
//              guarda a referência para o objeto Cidade na lista.
                cidades.add(c);
                
//              associa o nome da cidade ao objeto criado para representar esta
//              cidade.
                indice.put(c.getNome(), c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        Cidade tmp;
        
//      recupera um objeto cidade a partir de seu nome textual. utiliza o mapa!
        tmp = indice.get("bage");
        System.out.println(tmp);
        
        System.out.println("---");
        
//      varre a lista de cidades, imprimindo cada objeto. utiliza foreach.
        for(Cidade cTmp:cidades){
            System.out.println(cTmp);
        }
        
        System.out.println("---");
        
//      varre a lista de cidades, imprimindo cada objeto. utiliza for comum,
//      manipulando índices.
        for(int i= 0; i < cidades.size(); i++){
            tmp = cidades.get(i);
            System.out.println(tmp);
        }
        
    }
    
}
