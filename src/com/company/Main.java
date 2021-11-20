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

    float boxerNumberOneWeight = 78.2f;
    float boxerNumberTwoWeight = 82.7f;
    float totalWeight = boxerNumberOneWeight + boxerNumberTwoWeight;
    System.out.println("Общий вес бойцов: " + totalWeight + " кг");
    float weightDifference = boxerNumberTwoWeight - boxerNumberOneWeight;
    System.out.println("Разница в весе бойцов: " + weightDifference + " кг");

    short banana = 5;
    short bananaWeight = 80;
    short milk100Ml = 2;
    short milk100MlWeight = 105;
    short iceCream = 2;
    short iceCreamWeight = 100;
    short rawEgg = 4;
    short rawEggWeight = 70;
    int breakfastWeightGm = (banana * bananaWeight) + (milk100Ml * milk100MlWeight) + (iceCream * iceCreamWeight)
            + (rawEgg * rawEggWeight);
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

    int mashaSalaryMonth = 67_760;
    float mashaSalaryGrow = mashaSalaryMonth * 1.1f;
    float mashaYearSalaryDifference = (mashaSalaryGrow - mashaSalaryMonth)*12;
    System.out.println("Зарплата Маши с повышением: " + mashaSalaryGrow + "; Разница в годовом доходе: " + mashaYearSalaryDifference);
    int denisSalaryMonth = 83_690;
    float denisSalaryGrow = denisSalaryMonth * 1.1f;
    float denisYearSalaryDifference = (denisSalaryGrow - denisSalaryMonth)*12;
    System.out.println("Зарплата Дениса с повышением: " + denisSalaryGrow + "; Разница в годовом доходе: " + denisYearSalaryDifference);
    int kristinaSalaryMonth = 76_230;
    float kristinaSalaryGrow = kristinaSalaryMonth * 1.1f;
    float kristinaYearSalaryDifference = (kristinaSalaryGrow - kristinaSalaryMonth)*12;
    System.out.println("Зарплата Кристины с повышением: " + kristinaSalaryGrow + "; Разница в годовом доходе: " + kristinaYearSalaryDifference);

;




    }
}
