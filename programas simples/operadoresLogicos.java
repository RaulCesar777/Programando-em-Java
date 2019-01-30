/**
 * @author Raul Cesar Mulerschat
 * @email raulzito737@gmail.com
 * @create date 2019-01-29 19:40:22
 * @modify date 2019-01-30 01:40:22
 * @desc [Tabelas verdades %b]
 */






import java.util.Scanner;
public class operadoresLogicos
{

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void main(String[] args) 
    {
        

        menu();

        
    }
     //////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void limpar()
    {
        int n;
        for (n=0; n<=500;n++){
            System.out.println("\r");
        }
        
    }

     ////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void operador_E_condicional()
    {
        System.out.printf("************************************\n");
        System.out.printf("* operador  &&    (E condicional)  *\n");
        System.out.printf("************************************\n");
        System.out.printf("*(false   &&  false)  =  ( %b ) *\n", (false  && false ));
        System.out.printf("*(false   &&  true )  =  ( %b ) *\n", (false  && true  ));
        System.out.printf("*(true    &&  false)  =  ( %b ) *\n", (true   && false ));
        System.out.printf("*(true    &&  true )  =  ( %b )  *\n",(true   && true  ));
        System.out.printf("************************************\n");

    }
     ////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void operador_OU_condicional()
    {
        System.out.printf("************************************\n");
        System.out.printf("* operador  ||  (OU condicional)   *\n");
        System.out.printf("************************************\n");
        System.out.printf("*(false     ||  false) = ( %b ) *\n",  (false  || false ));
        System.out.printf("*(false     ||  true ) = ( %b )  *\n", (false  || true  ));
        System.out.printf("*(true      ||  false) = ( %b )  *\n", (true   || false ));
        System.out.printf("*(true      ||  true ) = ( %b )  *\n", (true   || true  ));
        System.out.printf("************************************\n");

    }

     //////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void operador_E_logico()
    {
        System.out.printf("************************************\n");
        System.out.printf("* operador   &  (E logico boleano) *\n");
        System.out.printf("************************************\n");
        System.out.printf("*(false   &    false) = ( %b )  *\n", (false  & false ));
        System.out.printf("*(false   &    true ) = ( %b )  *\n", (false  & true  ));
        System.out.printf("*(true    &    false) = ( %b )  *\n", (true   & false ));
        System.out.printf("*(true    &    true ) = ( %b )   *\n",(true   & true  ));
        System.out.printf("************************************\n");

    }

     ///////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void operador_OU_inclusivo_logico()
    {
        System.out.printf("************************************\n");
        System.out.printf("* operador | (OU Inclusivo logico) *\n");
        System.out.printf("************************************\n");
        System.out.printf("*(false   |    false) = ( %b )  *\n", (false  | false ));
        System.out.printf("*(false   |    true ) = ( %b )   *\n", (false  | true  ));
        System.out.printf("*(true    |    false) = ( %b )   *\n", (true   | false ));
        System.out.printf("*(true    |    true ) = ( %b )   *\n",(true   | true  ));
        System.out.printf("************************************\n");

    }
     ///////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void operador_OU_exclusivo_logico()
    {
        System.out.printf("************************************\n");
        System.out.printf("* operador ^ (OU exclusivo logico) *\n");
        System.out.printf("************************************\n");
        System.out.printf("*(false   ^    false) = ( %b )  *\n", (false  ^ false ));
        System.out.printf("*(false   ^    true ) = ( %b )   *\n", (false  ^ true  ));
        System.out.printf("*(true    ^    false) = ( %b )   *\n", (true   ^ false ));
        System.out.printf("*(true    ^    true ) = ( %b )  *\n",  (true   ^ true  ));
        System.out.printf("************************************\n");

    }
     /////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void operador_negacaologica()
    {
        System.out.printf("************************************\n");
        System.out.printf("* operador ! (negacao logica)      *\n");
        System.out.printf("************************************\n");
        System.out.printf("*( !false) = ( %b )              *\n", (!false));        
        System.out.printf("*( !true ) = ( %b )             *\n", (!true));
        System.out.printf("************************************\n");

    }

     ////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void menu()
    {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        System.out.print("qual operador logico deseja consultar  ?\n");
        System.out.print("operador  E condicional               =1\n");
        System.out.print("operador  OU condicional              =2\n");
        System.out.print("operador  E logico                    =3\n");
        System.out.print("operador  OU inclusivo_logico         =4\n");
        System.out.print("operador  OU exclusivo_logico         =5\n");
        System.out.print("operador  negacao logica              =6\n");
        System.out.print("Digite uma opcao ou 7 para sair !!!     \n");

        opcao = entrada.nextInt();
        
        avalia(opcao);


    }

     ////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void avalia(int opcao)
    {
        
        limpar();
           
        
        Scanner entrada = new Scanner(System.in);
        
        if(opcao >=7){
            ;
        }else{
            if(opcao<6){

                while(opcao<7){

            
                    if(opcao ==1){
                        operador_E_condicional();
                        break;
                    }else{
                        if (opcao == 2){
                            operador_OU_condicional();
                            break;
                        }else{
                            if(opcao ==3){
                                operador_E_logico();
                                break;
                            }else{
                                if(opcao==4){
                                    operador_OU_inclusivo_logico();
                                    break;
                                }else{
                                    if(opcao == 5){
                                        operador_OU_exclusivo_logico();
                                        break;
                                    }else{
                                        if(opcao == 6){
                                            operador_negacaologica();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }         
        
        
                   
                }  
        
                System.out.print("deseja outra opcao ?\n");
                System.out.print(" (1) retorna para o menu (7) para sair ?\n");
                
                opcao = entrada.nextInt();
                if(opcao==1){
                    limpar();
                    menu();
                    
                }else{
                    if(opcao==7){
                        limpar();
                        ;
                    }else{
                        if(opcao != 1 || opcao !=7){
                            limpar();
                            System.out.print("Opcao invalida\n");
                             
                            tentadenovo();
                        }
                    }
                }    
                            

            }
        }  


        
    }

     //////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void tentadenovo(){


        Scanner entrada = new Scanner(System.in);
        int opcao;


        System.out.print("deseja outra opcao ?\n");
        System.out.print(" (1) retorna para o menu (7) para sair ?\n");
        
        opcao = entrada.nextInt();
        if(opcao==1){
            limpar();
            menu();
            
        }else{
            if(opcao==7){ 
                limpar();          
                ;
            }else{
                if(opcao != 1 || opcao !=7){
                    limpar();
                    System.out.print("Opcao invalida\n");
                   
                    tentadenovo();
                }
            }
        }
    }
}