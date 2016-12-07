/**
 * Created by bulochka on 24.11.2016.
 *
 Написать программу, моделирующую работу с вкладами в бан-
 ке. Сведения о каждом вкладе содержат: название, годовой про-
 цент, возможность пополнения счета. Сведения о каждом вклад-
 чике содержат: фамилию, имя, отчество, номер счета, вид вкла-
 да, сумму, дату открытия. Начальное формирование данных
 осуществляется из файла (или файлов). С помощью меню необ-
 ходимо обеспечить следующие функции:
 a) добавление вклада или вкладчика;
 b) удаление вклада или вкладчика;
 c) пополнение счета, если это возможно, по имени вкладчика
 и номеру счета;
 d) снятие процентов с вклада;
 e) закрытие счета с выплатой процентов;
 f) вывод на экран списка вкладчиков, отсортированных по
 фамилии;
 g) вывод на экран списка вкладчиков по заданному диапазо-
 ну размера вклада.
 */

import java.io.*;
import java.util.*;

public class Banking {
    public static void main(String[] args) throws Exception {

        String contributionFile = "ContributionsData.txt";
        String contributerFile = "ContributerData.txt";
        Scanner scanner = new Scanner(System.in);

        Filer filer = new Filer();


        List<String> listOfContributions;
        List<String> listOfContributer;
        String value = scanner.next();
        scanner = new Scanner(System.in);
        int choise = scanner.nextInt();

        switch (choise) {
            case 1: {
                System.out.print("Добавить\n 1 - Вклад\n 2 - Вкладчика :");
                if ((choise = scanner.nextInt()) == 1){
                    System.out.print("\nВведите имя счета: ");
                    String name = scanner.next();
                    System.out.print("\nГодовой Процент: ");
                    float annual = scanner.nextFloat();
                    System.out.print("\nВозможность пополнения: ");
                    boolean contributionAdder = scanner.nextBoolean();
                    Contribution contributions = new Contribution();
                    contributions.setContribution(name, annual, contributionAdder);
                    String info_string = contributions.getInfo();
                    filer.addString(contributionFile, info_string);
                } else if (choise == 2) {
                    String second_name, name, father_name;
                    int kind_of_contriution;
                    float summ;
                    System.out.print("\nВведите фамилию: ");
                    second_name = scanner.next();
                    System.out.print("\nВведите имя: ");
                    name = scanner.next();
                    System.out.print("\nВведите отчество: ");
                    father_name = scanner.next();
                    System.out.print("\nВведите вид вклада: ");
                    kind_of_contriution = scanner.nextInt();
                    System.out.print("\nВведите сумму вклада: ");
                    summ = scanner.nextFloat();
                    Contributer contributer = new Contributer();
                    contributer.setContributer(second_name, name, father_name, kind_of_contriution, summ);
                    String info_string = contributer.getInfo();
                    filer.addString(contributerFile, info_string);
                } else {
                    return;
                }
            }
            case 2: {
                System.out.print("Удалить\n 1 - Вклад\n 2 - Вкладчика :");
            }
            case 3: {
                System.out.print("Пополнение счета, если это возможно, по имени вкладчика и номеру счета");
            }
            case 4: {
                System.out.print("Cнятие процентов с вклада;");
            }
            case 5: {
                System.out.print("Закрытие счета с выплатой процентов;");
            }
            case 6: {
                System.out.print("вывод на экран списка вкладчиков, отсортированных по фамилии;");
                filer.sortBySurname(contributerFile);
            }
            case 7: {
                System.out.print("вывод на экран списка вкладчиков по заданному диапазону размера вклада");
            }
        }
    }

    private static void ListSorted(List<String> list, String value){
        String[] string;
        for(String str: list){
            string = str.split(",");
            for(int i = 0; i < string.length; i++){
                if(string[i].equals(value)){
                    System.out.println(string + ", i = "+ i);
                }
            }
        }
    }
}
