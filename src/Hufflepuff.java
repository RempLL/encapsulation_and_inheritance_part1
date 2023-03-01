public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgressionDistance, int industriousness, int loyalty, int honesty) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() +
                ", Фамилия: " + getSurname() +
                ", Сила магии: " + getPowerOfMagic() +
                ", Расстояние трансгресии: " + getTransgressionDistance() +
                ", Трудолюбием: " + industriousness +
                ", Верность: " + loyalty +
                ", Честность: " + honesty
                ;
    }

    public static void bestStudentHufflepuff(Hufflepuff firstStudent,Hufflepuff secondStudent){
        int sumFirst = firstStudent.getIndustriousness()+firstStudent.getLoyalty()+firstStudent.getHonesty();
        int sumSecond = secondStudent.getIndustriousness()+secondStudent.getLoyalty()+secondStudent.getHonesty();
        if(firstStudent==secondStudent){
            throw new NullPointerException("Нельзя передавать одного и того же ученика");
        } else {
            if (sumSecond > sumFirst) {
                System.out.println(secondStudent.getName() + " лучший Пуфендуец, чем " + firstStudent.getName());
            } else if (sumFirst > sumSecond) {
                System.out.println(firstStudent.getName() + " лучший Пуфендуец, чем " + secondStudent.getName());
            } else {
                System.out.println(firstStudent.getName() + " и " + secondStudent.getName() + " оба лучшие Пуфендуйцы");
            }
        }
    }

}
