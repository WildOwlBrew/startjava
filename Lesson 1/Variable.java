public class Variable {
    public static void main(String[] args) {
    byte core = 4;
    short ram = 8;
    int cpu = 64;
    long hResol = 2560, vResol = 1440;
    float freq = 3.3f;
    double freqBoost = 3.45;
    char name;
    name = 'B';
    boolean result = true;
    System.out.println ("Тип системы: " +cpu+ "-разрядная ОС");
    System.out.println ("Количество ядер процессора: " +core);
    System.out.println ("Оперативная память:" +ram+ "GB");
    System.out.println ("Базовая частота процессора: " +freq+ "GHz");
    System.out.println ("Максимальная частота процессора: " +freqBoost+ "GHz");
    System.out.println ("Разрешение экрана: " +hResol+ "X" +vResol);
    System.out.println ("Имя компьютера " +name);
    System.out.println ("Результат: " +result);
    }
}
