

package segundo_pack;

// @Author: RaulCesar777
//@Date:   2019-01-05 19:49:11
//@Last Modified by:   Win10
//Last Modified time: 2019-01-05 20:54:35


import java.util.Scanner;
public class GradeBook
{
    private String courseName;
    private int total;
    private int contador;
    private int contA;
    private int contB;
    private int contC;
    private int contD;
    private int contF;
    

////////////////////////////////////////////////////////////////////////////////////////
    public GradeBook(String name)
    {

        courseName = name;
    }
    /////////////////////////////////////////////////////////////////////////////////
    public void setCourseName(String name){ 

        courseName = name;  /* armazena o nome do curso */     

    }  

    /////////////////////////////////////////////////////////////////////////////////////
    public String getCourseName()
    {
        return courseName;
    }

    ///////////////////////////////////////////////////////////////////////////////////////

    public void displayMessage()
    {
        System.out.printf(" Bem Vindo ao curso  %s  \n", getCourseName());
        
    }
    ///////////////////////////////////////////////////////////////////////////////////
    public void inputGrades()
    {
        Scanner entrada = new Scanner(System.in);
        int nota;
            System.out.printf("entre com as notas de 0 a 100 \n");
            System.out.printf("control z para sair \n");

                while(entrada.hasNext()){
                    nota = entrada.nextInt();
                    total+=nota;
                    ++contador;

                    incrementacontadordenotas(nota);
                }

    }

    ////////////////////////////////////////////////////////////////////////////////////////

    public void incrementacontadordenotas(int nota)
    {
        switch(nota/10)
        {
            case 9:
            case 10:
            ++contA;
            break;

            case 8:
            ++contB;
            break;

            case 7:
            ++contC;
            break;

            case 6:
            ++contD;
            break;

            default:
            ++contF;
            break;
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////

    public void mostrarelatorio()
    {
        System.out.println("\n relatorio de notas");

        if(contador!=0)
        {
            double media =(double)total/ contador;
            System.out.printf("total de %d notas inseridas %d\n", contador, total);
            System.out.printf(" media da classe eh %.2f%n", media);
            System.out.printf(" %n %s %n %s %d %n %s %d %n %s %d %n %s %d %n %s %d %n",
                                "numero de estudante em relacao as notas:",
                                "A:",contA,
                                "B:",contB,
                                "C:",contC,
                                "D:",contD,
                                "F:",contF);
        }
        else System.out.println(" nao ha registro de notas");



    }
}