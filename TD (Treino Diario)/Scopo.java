/**
 * essa classe serve para estudos dos  tipos de declaração no escopo de uma classe
 * a classe Scopo demosntra escopos de campo e variaveis locais
 */
public class Scopo {

    //Nesse campo as varivais são acessiveis a todos os metodos da classe
    private int x=1;


        // o metodo começo cria e inicializa a variavel local x 
        // e chama o metodo  UsaVariavelLocal e UsaCampo
        public void inicio(){

            int x =5; // variavel local x do metodo sombreia o campo x

            System.out.printf("variavel local x no metodo inicio  e %d\n",x);
            UsaVariavelLocal();
            UsaCampo();
            UsaVariavelLocal();
            UsaCampo();

            System.out.printf("\nvariavel local x no metodo inicio  e %d\n",x);
        }
        
        public void UsaVariavelLocal(){
            int x =25;

            System.out.printf("variavel local x dentro do metodo UsaVariavelLocal  e %d\n",x);
            ++x;
            System.out.printf("variavel local x depois do metodo UsaVariavelLocal  e %d\n",x);


        }

        public void UsaCampo(){

            System.out.printf("variavel local x dentro do metodo UsaCampo  e %d\n",x);

            x*=10;

            System.out.printf("variavel local x depois do metodo UsaCampo  e %d\n",x);

        }
        


}
