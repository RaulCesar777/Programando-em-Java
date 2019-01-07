/*
* @Author: RaulCesar777
* @Date:   2019-01-05 19:49:11
* @Last Modified by:   Win10
* @Last Modified time: 2019-01-05 20:54:35
*clsse gradeBook possui uma variavel de instancia 
* nomedocurso  e metodos para configurar e obter seu valor */
/* usando set e get*/




public class GradeBook
{
    private String courseName;

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

}