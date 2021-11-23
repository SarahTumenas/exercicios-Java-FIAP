package Capitulo006;

public class TestException  {
    public static void main(String[] args)  {

        /*try {
             //trecho onde a exceção pode ocorrer
             int divisao = 10 / 0;
             System.out.println(divisao);
         }catch (Exception e){ // captura da exceção
             e.printStackTrace(); // tratamento da exceção
         }*/


        //Execeções Uncheccked

        try {

            int val = 10 / 0;

            // int [] valores = new int[3];
            // System.out.println(valores[4]);

            //String nome = null;
            //System.out.println(nome.length());

            int numero = Integer.parseInt("zero");

        } /*catch (ArithmeticException e) {

            System.out.println("Não é possível realizar uma divisão por zero");

            //mensagem com lista de erros
            System.out.println(e.getMessage());
            //imprime a pilha de erro da exceção
            e.printStackTrace();

        } */catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Não é possível acessar a posição 4 do array!");

        } catch (NullPointerException e){

            System.out.println("Não foi possível retornar o lenth, variável nome não instanciada!");

        } catch (NumberFormatException e){

            System.out.println("Não foi possível realizar a conversão!");

        } catch (Exception e){

            System.out.println("Erro na execução do programa!");

        }
        finally {
            System.out.println("sempre passará aqui, tendo erro ou não!");
        }

    }
}
