package com.company;

public class Main {

    public static void main(String[] args) {
	byte a = 1;
    short b = 2;
    int c = 3;
    long d = 4L;
    float e = 5.1f;
    double f = 6.1;
    char g = 33;
    boolean h = 8<9;
    System.out.println("Целочисленные: " + a + " " + b + " " + c + " " + d);
    System.out.println("С плавающей точкой: " + e + " " + f);
    System.out.println("Символы: " + g);
    System.out.println("Логические: " + h);

    float boxerNomderOneWeight = 78.2f;
    float boxerNomberTwoWeight = 82.7f;
    float totalWeight = boxerNomderOneWeight + boxerNomberTwoWeight;
    System.out.println("Общий вес бойцов: " + totalWeight + " кг");
    float weightDifference = boxerNomberTwoWeight - boxerNomderOneWeight;
    System.out.println("Разница в весе бойцов: " + weightDifference + " кг");

    short banana = 5;
    short bananaWeightGm = 80;
    short milk100Ml = 2;
    short milkWeightGMOf100Ml = 105;
    short iceCream = 2;
    short iceCreamWeightGM = 100;
    short rawEgg = 4;
    short rawEggWeightGM = 70;
    int breakfastWeightGm = (banana * bananaWeightGm) + (milk100Ml * milkWeightGMOf100Ml) + (iceCream * iceCreamWeightGM)
            + (rawEgg * rawEggWeightGM);
    float breakfastWeightKg = breakfastWeightGm / 1000f;
    System.out.println("Вес завтрака: " + breakfastWeightKg + " кг");

    byte weightToLoseKg = 7;
    int weightToLoseGm = weightToLoseKg * 1000;
    int daysWithDietMin = weightToLoseGm / 250;
    int daysWithDietMax = weightToLoseGm / 500;
    int daysWithDietAvarage = (daysWithDietMax + daysWithDietMin) / 2;
    System.out.println("Дней для похудения при потере 250гм в день: " + daysWithDietMin);
    System.out.println("Дней для похудения при потере 500гм в день: " + daysWithDietMax);
    System.out.println("Дней для похудения в среднем: " + daysWithDietAvarage);

    int MashaSalaryMonth = 67_760;
    float MashaSalaryGrow = MashaSalaryMonth * 1.1f;
    float MashaYearSalaryDifference = (MashaSalaryGrow * 12) % (MashaSalaryMonth * 12);
    System.out.println("Зарплата Маши с повышением: " + MashaSalaryGrow + "; Разница в годовом доходе: " + MashaYearSalaryDifference);
    int DenisSalaryMonth = 83_690;
    float DenisSalaryGrow = DenisSalaryMonth * 1.1f;
    float DenisYearSalaryDifference = (DenisSalaryGrow * 12) % (DenisSalaryMonth * 12);
    System.out.println("Зарплата Дениса с повышением: " + DenisSalaryGrow + "; Разница в годовом доходе: " + DenisYearSalaryDifference);
    int KristinaSalaryMonth = 76_230;
    float KristinaSalaryGrow = KristinaSalaryMonth * 1.1f;
    float KristinaYearSalaryDifference = (KristinaSalaryGrow * 12) % (KristinaSalaryMonth * 12);
    System.out.println("Зарплата Кристины с повышением: " + KristinaSalaryGrow + "; Разница в годовом доходе: " + KristinaYearSalaryDifference);

;




    }
}
