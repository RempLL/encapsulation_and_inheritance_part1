public class Ravenclaw extends Hogwarts {
    private int education;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgressionDistance, int education, int wisdom, int wit, int creativity) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.education = education;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getEducation() {
        return education;
    }

    public void setEducation(int education) {
        this.education = education;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() +
                ", Фамилия: " + getSurname() +
                ", Сила магии: " + getPowerOfMagic() +
                ", Расстояние трансгресии: " + getTransgressionDistance() +
                ", Образованность: " + education +
                ", Мудрость: " + wisdom +
                ", Остроумность: " + wit +
                ", Креативность: " + creativity
                ;
    }

    public static void bestStudentRavenclaw(Ravenclaw firstStudent,Ravenclaw secondStudent){
        int sumFirst = firstStudent.getEducation()+firstStudent.getWisdom()+firstStudent.getWit()+firstStudent.getCreativity();
        int sumSecond = secondStudent.getEducation()+secondStudent.getWisdom()+secondStudent.getWit()+secondStudent.getCreativity();
        if(firstStudent==secondStudent){
            throw new NullPointerException("Нельзя передавать одного и того же ученика");
        } else {
            if (sumSecond > sumFirst) {
                System.out.println(secondStudent.getName() + " лучший Когтевранец, чем " + firstStudent.getName());
            } else if (sumFirst > sumSecond) {
                System.out.println(firstStudent.getName() + " лучший Когтевранец, чем " + secondStudent.getName());
            } else {
                System.out.println(firstStudent.getName() + " и " + secondStudent.getName() + " оба лучшие Когтевранецы");
            }
        }
    }
}
