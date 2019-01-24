/*
* @Author: RaulCesar777
* @Date:   2019-01-05 19:49:11
* @Last Modified by:   Win10
* @Last Modified time: 2019-01-05 20:54:35
*clsse gradeBook possui uma variavel de instancia 
* nomedocurso  e metodos para configurar e obter seu valor */
/* usando set e get*/



import java.util.Scanner;
public class GradeBook
{
    private String courseName;
    // o construtor inicializa courseName com o arguemento String
    public GradeBook(String name){

        courseName = name;
    }

    public void setCourseName(String name){ /* metodo para configurar o nome do curso*/

        courseName = name;  /* armazena o nome do curso */     

    } /*fim do metodo  set nomedoCurso */

    // metodo para recuperar o nome
    public String getCourseName()
    {
        return courseName;
    }//fim do metodo getNomeDoCurso

    public void displayMessage()
    {
        System.out.printf(" Bem Vindo ao curso \n %s ! \n", getCourseName());
        
    }
    public void determineClassAvarege(){

        Scanner input =new Scanner (System.in);

        int total; //soma todas as notas
        int gradeCounter;//numero de notas a serem inseridas
        int grade;//nota
        int avarege;//media

        total=0;
        gradeCounter=1;
        while(gradeCounter<=10){
            System.out.println("entre com a nota");
            grade=input.nextInt();
            total= total+grade;
            gradeCounter=gradeCounter+1;

            
        }
        avarege= total/10;
        System.out.printf("\n total das 10 notas %d \n", total);
        System.out.printf("\nMedia da classe = %d\n", avarege);


    }
}