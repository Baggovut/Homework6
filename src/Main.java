public class Main {
    public static void main(String[] args) {
        //Домашнее задание - 1
        //Задание 1
        System.out.println("\033[4mДомашнее задание - 1\033[0m \nЗадание 1");
        for (int i = 1; i <= 10; i++){
            System.out.print(i+" ");
        }

        //Задание 2
        System.out.println("\nЗадание 2");
        for (int i = 10; i > 0; i--){
            System.out.print(i+" ");
        }

        //Задание 3
        System.out.println("\nЗадание 3");
        for (int i = 0; i <= 17; i+=2){
            System.out.print(i+" ");
        }

        //Задание 4
        System.out.println("\nЗадание 4");
        for (int i = 10; i >= -10; i--){
            System.out.print(i+" ");
        }

        //Домашнее задание - 2
        //Задание 1
        System.out.println("\n\033[4mДомашнее задание - 2\033[0m \nЗадание 1");
        for (int i = 1904, j=1; i <= 2096; i+=4,j++){
            System.out.print(j+") "+i+" ");
        }
        System.out.println("года являются високосными");
        //Задание 2
        System.out.println("\nЗадание 2");
        for (int i = 0; i <= 9; i++){
            System.out.print((int)Math.pow(2,i)+" ");
        }
        //Домашнее задание - 3
        //Задание 1
        System.out.println("\n\033[4mДомашнее задание - 3\033[0m \nЗадание 1");
        short contribution = 29000;
        int accumulation = 0;
        for (int i = 1; i <= 12; i++){
            accumulation+=contribution;
            System.out.println("Месяц "+i+", сумма накоплений равна "+accumulation+" рублей");
        }
        //Задание 2
        System.out.println("\nЗадание 2");
        accumulation = 0;
        for (int i = 1; i <= 12; i++){
            accumulation+=accumulation/100;
            accumulation+=contribution;
            System.out.println("Месяц "+i+", сумма накоплений равна "+accumulation+" рублей");
        }
    }
}