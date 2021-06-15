package treino_diario;

public class SomaDentroDoFor{
    public static void main(String[] args) {
        
        int total=0;
        for(int num=2;num<=20;total +=num,num +=2){
            // seria mesma coisa que total+=num; 
            //seria mesma coisa que total= total + num;
            System.out.printf("total recebeu %d e num recebeu %d \n", total,num);


        }



    }



}