import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }

    public static void task1() {


        System.out.println("Задача 1");
        int bigCat = 24756;
        byte bigDog = 125;
        short bigFrog = 32760;
        float bigMouse = 34.54f;
        double bigMonkey = 21.4;
        System.out.println("Значение переменной с типом int ровно " + bigCat);
        System.out.println("Значение переменной с типом byte ровно " + bigDog);
        System.out.println("Значение переменной с типом short ровно " + bigFrog);
        System.out.println("Значение переменной с типом  float ровно " + bigMouse);
        System.out.println("Значение переменной с типом double ровно " + bigMonkey);
    }

    public static void task2() {
        System.out.println("Задача 2");
        float bigCat = 27.2f;
        long bigMouse = 987_678_965_549L;
        double bigDog = 2.786f;
        short bigFrog = 569;
        short bigMonkey = -159;
        short bigGorilla = 27897;
        byte bigPeople = 67;

    }

    public static void task3() {
        System.out.println("Задача 3");
        byte LP = 23;
        byte AS = 27;
        byte EA = 30;
        short sheetsOfPaper = 480;
        int allStudents = LP + AS + EA;
        int sheetsForEach = sheetsOfPaper / allStudents;
        System.out.println("На каждого ученика расчитано " + sheetsForEach + " листов бумаги");

    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottels = 16;
        byte time = 2;
        int perMinute = bottels / time;
        int in20Minute = perMinute * 20;
        int day = 24;
        int dayBottles = 24 * 60;
        day = dayBottles * perMinute;
        int threeDay = dayBottles * 3;
        threeDay = threeDay * perMinute;

        int mountDay = 30;
        mountDay = 30 * 24;
        mountDay = mountDay * 60;
        mountDay = mountDay * perMinute;
        System.out.println("За 20 минут машина произвела " + in20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + dayBottles + " штук бутылок ");
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + mountDay + " штук бутылок");

    }

    public static void task5() {
        System.out.println("Задача 5");
        int cansOfPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        cansOfPaint = cansOfPaint / (whitePaint + brownPaint);
        whitePaint = cansOfPaint * whitePaint;
        brownPaint = cansOfPaint * brownPaint;
        System.out.println("В школе, где " + cansOfPaint + " классов, нужно " + whitePaint + " Банок белой краски и " + brownPaint + " банок коричневой краски");


    }

    public static void task6() {
        System.out.println("Заача 6");
        int bananasCount = 5;
        int milkCount = 2;
        int iceCreamCount = 2;
        int eggsCount = 4;
        int weightBananasUnit = 80;
        int weightMilkUnit = 105;
        int weightIceCreamUnit = 100;
        int wightEggsUnit = 70;
        int totalWeightInGramms = bananasCount * weightBananasUnit + iceCreamCount * weightIceCreamUnit + milkCount * weightMilkUnit + eggsCount * wightEggsUnit;
        double totalWeightInKilogramms = totalWeightInGramms / 1_000D;
        System.out.println("Общий вес в граммах " + totalWeightInGramms + " , вес в кг" + totalWeightInKilogramms);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int weightForLossGramms = 7_000;
        int lossWeightPerDayMin = 250;
        int lossWeightPerDaymax = 500;
        double maxDayCount = (double) weightForLossGramms / lossWeightPerDayMin;
        double minDayCount = (double) weightForLossGramms / lossWeightPerDaymax;
        double lossWeightPerDayAverage = (lossWeightPerDayMin + lossWeightPerDaymax) / 2D;
        double averageDayCount = weightForLossGramms / lossWeightPerDayAverage;
        System.out.println("Минимальное количество дней для похудения " + minDayCount);
        System.out.println("Максимальное количество дней для  похудения " + maxDayCount);
        System.out.println("Среднее количество дней для похудения  " + averageDayCount);


    }

    public static void task8() {
        System.out.println("Задача 8");
        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;
        double indexProcent = 1.1;
        double newMashaSalary = mashaSalary * indexProcent;
        double newDenisSalary = denisSalary * indexProcent;
        double newKristinaSalary = kristinaSalary * indexProcent;
        double annualMashaSalary = 12 * mashaSalary;
        double newAnnualMashaSalary = 12 * newMashaSalary;
        double annualDenisSalary = 12 * denisSalary;
        double newAnnualDenisSalary = 12 * newDenisSalary;
        double annualKristinaSalary = 12 * kristinaSalary;
        double newAnnualKristinaSalary = 12 * newKristinaSalary;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей.Годовой доход вырос на " + (newAnnualMashaSalary - annualMashaSalary) + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + (newAnnualDenisSalary - annualDenisSalary) + " рублей");
        System.out.println("Кристина теперь получает "+ newKristinaSalary + " рублей. Годовой доход вырос на " +(newAnnualKristinaSalary - annualKristinaSalary) + " рублей");

    }
}