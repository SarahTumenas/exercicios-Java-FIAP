package Capitulo006;

import javax.imageio.IIOException;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {


    public static void main(String[] args) {
        String nomeDoArquivo = "estoque.csv";
        String diretorio = System.getProperty("user.home");
        String caminho = diretorio + "\\" + nomeDoArquivo;

        List <String> conteudo = new ArrayList<>();
        conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da unidade;");
        conteudo.add("Pera; 200; pct; R$ 5,40;");
        conteudo.add("Morango; 400; cx; R$ 6,50;");
        conteudo.add("Abacaxi; 280; un; R$ 5,00");

        //gravarEstoque(nomeDoArquivo, caminho, conteudo);

        lerEstoque(caminho, diretorio);

    }

    private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo){
        FileWriter stream;
        PrintWriter print;


        try {
            //stream é uma conexão escrita para o arquivo
            stream = new FileWriter(caminho);

            //a classe PrintWriter escreverá no arquivo
            print = new PrintWriter(stream);

            for (String linha:conteudo) {
                //o método println escreve uma linha no arquivo
                print.println(linha);

            }
            //close fecha o arquivo
            print.close();
            stream.close();

            System.out.println("O arquivo" + nomeDoArquivo + " foi salvo em " + caminho);

        } catch (IIOException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void lerEstoque (String caminho, String diretorio){

        try {
            //abre arquivo
            FileReader stream = new FileReader(caminho);

            //BufferedReader possui o metodo readLine ()
            //lê uma linha do arquivo e retorna uma string com o valor lido ou null
            BufferedReader reader = new BufferedReader(stream);

            //lê uma linha do arquivo
            String linha = reader.readLine();

            //enquanto a linha for diferente de null
            while (linha != null) {

                System.out.println(linha);
                //lê a próxima linha do arquivo
                linha = reader.readLine();
            }
            reader.close();
            //fecha o arquivo
            stream.close();
        } catch (IIOException | FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File arquivo = new File(caminho);

        if (arquivo.exists()){
            System.out.println("O arquivo existe!" +
                    "\nPode ser lido: " + arquivo.canRead() +
                    "\nPode ser gravado: " + arquivo.canWrite() +
                    "\nTamanho: " + arquivo.length() +
                    "\nCaminho: " + arquivo.getPath());
        } else{
            //cria arquivo
            try {
                if (arquivo.createNewFile())
                    System.out.println("Arquivo criado!");
                else
                    System.out.println("Arquivo não criado");
            }catch (IIOException e){
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



        File Diretorio = new File(diretorio);

        if (Diretorio.exists()){
            System.out.println("Diretório existe!");
        }else {
            System.out.println("Diretório não criado.");
        }

    }

}
