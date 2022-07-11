public class Main {
    public static void main(String[] args)
    {
    byte a = 1;
    short b = 2;
    int c = 3;
    long d = 4L;
    float e = 5.1f;
    double f = 6.2;
    char g = '!';

    float fighterOne = 78.2f;
    float fighterTwo = 82.7f;
    float totalWeight = fighterOne + fighterTwo;
    System.out.println("Общий вес бойцов - " + totalWeight + " кг");
    float diffWeight = fighterTwo - fighterOne;
    System.out.println("Разница в весе - " + diffWeight + " кг");

    byte bananas = 5;
    byte bananaWeightGram = 80;
    int bananasTotal = bananas * bananaWeightGram;
    short milkMils = 200;
    float milkDensityGramPerMil = 1.05f;
    float milkTotal = milkDensityGramPerMil * milkMils;
    byte icecream = 2;
    byte icecreamWeightGram = 100;
    int icecreamTotal = icecream * icecreamWeightGram;
    byte eggs = 4;
    short eggWeightGram = 80;
    int eggsTotal = eggs * eggWeightGram;
    float breakfastWeightGram =  bananasTotal + milkTotal + icecreamTotal + eggsTotal;
    System.out.println("Вес завтрака - " + breakfastWeightGram + " грамм");
    int gramToKilo = 1000;
    float breakfastWeightKilo = breakfastWeightGram / gramToKilo;
    System.out.println("Вес завтрака - " + breakfastWeightKilo + " кг");

    short weightToLose = 7;
    short weightLossMin = 250;
    short weightLossMax = 500;
    int daysMax = (weightToLose * gramToKilo) / weightLossMin;
    int daysMin = (weightToLose * gramToKilo) / weightLossMax;
    System.out.println("Минимальное кол-во дней для похудения - " + daysMin);
    System.out.println("Максимальное кол-во дней для похудения - " + daysMax);
    int daysMid = (daysMax + daysMin) / 2;
    System.out.println("Среднее кол-во дней для похудения - " + daysMid);

    float percentAdded = 1.1f;
    int monthsInYear = 12;
    float incomeMaryMonth = 67_760f;
    float incomeMaryYearOld = incomeMaryMonth * monthsInYear;
    incomeMaryMonth = incomeMaryMonth * percentAdded;
    float incomeMaryYearNew = incomeMaryYearOld * percentAdded;
    float diffMaryYear = incomeMaryYearNew - incomeMaryYearOld;
    System.out.println("Маша теперь получает " + incomeMaryMonth + " рублей. Годовой доход вырос на " + diffMaryYear + " рублей");

    float incomeDenMonth = 83_690f;
    float incomeDenYearOld = incomeDenMonth * monthsInYear;
    incomeDenMonth = incomeDenMonth * percentAdded;
    float incomeDenYearNew = incomeDenYearOld * percentAdded;
    float diffDenYear = incomeDenYearNew - incomeDenYearOld;
    System.out.println("Денис теперь получает " + incomeDenMonth + " рублей. Годовой доход вырос на " + diffDenYear + " рублей");

    float incomeChrisMonth = 76_230f;
    float incomeChrisYearOld = incomeChrisMonth * monthsInYear;
    incomeChrisMonth = incomeChrisMonth * percentAdded;
    float incomeChrisYearNew = incomeChrisYearOld * percentAdded;
    float diffChrisYear = incomeChrisYearNew - incomeChrisYearOld;
    System.out.println("Кристина теперь получает " + incomeChrisMonth + " рублей. Годовой доход вырос на " + diffChrisYear + " рублей");
    }
}