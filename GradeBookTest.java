/*
* @Author: RaulCesar777
* @Date:   2019-01-05 19:49:55
* @Last Modified by:   RaulCesar777
* @Last Modified time: 2019-01-05 21:12:42
*/

	import java.util.Scanner;
public class GradeBookTest {

   
    public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);
        GradeBook mygrade = new GradeBook();
        System.out.println("entre com o nome do curso");
        String nomedoCurso = entrada.nextLine();
        System.out.println();	

        mygrade.displayMessage(nomedoCurso);
    }
    
}
