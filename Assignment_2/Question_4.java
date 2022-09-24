public class Question_4 {
    public static void main(String[] args){

        int population=80000; // intital population
        int year=0; // number of years
        while(population<=150000)
        {
            year++;
            population+=(population*5)/100; // increasing population by 5%
        }
        System.out.println("Years taken= "+year);
    }
}
