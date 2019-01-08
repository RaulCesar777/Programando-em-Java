/*
* @Author: RaulCesar777
* @Date:   2019-01-05 19:49:55
* @Last Modified by:   RaulCesar777
* @Last Modified time: 2019-01-05 21:12:42
*/

	import java.util.Scanner;
public class GradeBookTest {

   
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        // criando objetos gradeBook       
        GradeBook gradeBook1 = new GradeBook("\n introducao a programacao java");
        GradeBook gradeBook2 = new GradeBook("\n introducao a estrutura de dados em java");

        // exibindo objetos
        System.out.printf(" o nome do curso da grade 1 eh %s \n\n", gradeBook1.getCourseName());
        System.out.printf(" o nome do curso da grade 2 eh %s \n\n", gradeBook2.getCourseName());
        
    }
    
}
