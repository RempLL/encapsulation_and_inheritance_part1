public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри", "Поттер", 20, 20, 20, 20, 19);
        Gryffindor hermione = new Gryffindor("Гермиона", "Грейнджер", 18, 18, 18, 18, 18);
        Gryffindor ron = new Gryffindor("Рон", "Уизли", 7, 7, 7, 7, 7);


        Hufflepuff zaharia = new Hufflepuff("Захария", "Смит", 13, 14, 15, 16, 17);
        Hufflepuff cedric = new Hufflepuff("Седрик", "Диггори", 15, 15, 15, 15, 15);
        Hufflepuff justin = new Hufflepuff("Джастин", "Финч-Флетчли", 18, 13, 16, 15, 16);


        Ravenclaw zhou = new Ravenclaw("Чжоу", "Чанг", 11, 12, 14, 15, 16, 17);
        Ravenclaw padma = new Ravenclaw("Падма", "Патил", 10, 11, 12, 13, 14, 15);
        Ravenclaw markus = new Ravenclaw("Маркус", "Белби", 11, 11, 12, 13, 14, 15);


        Slytherin draco = new Slytherin("Драко", "Малфой", 12, 12, 12, 12, 12, 12, 12);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", 2, 2, 3, 4, 5, 6, 7);
        Slytherin gregory = new Slytherin("Грегори", "Гойл", 2, 1, 4, 4, 5, 6, 7);


        System.out.println(harry);
        Gryffindor.bestStudentGryffindor(harry, ron);
        Ravenclaw.bestStudentRavenclaw(padma,markus);
        Hufflepuff.bestStudentHufflepuff(cedric,justin);
        Slytherin.bestStudentSlytherin(gregory,graham);
        Hogwarts.bestStudentHogwarts(gregory,gregory);
    }
}