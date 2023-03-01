public class Gryffindor extends Hogwarts {


    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgressionDistance, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() +
                ", Фамилия: " + getSurname() +
                ", Сила магии: " + getPowerOfMagic() +
                ", Расстояние трансгресии: " + getTransgressionDistance() +
                ", Благородство: " + nobility +
                ", Честь: " + honor +
                ", Храбрость: " + bravery
                ;
    }

    public static void bestStudentGryffindor(Gryffindor firstStudent,Gryffindor secondStudent){
        int sumFirst = firstStudent.getNobility()+firstStudent.getHonor()+firstStudent.getBravery();
        int sumSecond = secondStudent.getNobility()+secondStudent.getHonor()+secondStudent.getBravery();
        if(firstStudent==secondStudent){
            throw new NullPointerException("Нельзя передавать одного и того же ученика");
        } else {
            if (sumSecond > sumFirst) {
                System.out.println(secondStudent.getName() + " лучший Гриффиндорец, чем " + firstStudent.getName());
            } else if (sumFirst > sumSecond) {
                System.out.println(firstStudent.getName() + " лучший Гриффиндорец, чем " + secondStudent.getName());
            } else {
                System.out.println(firstStudent.getName() + " и " + secondStudent.getName() + " оба лучшие Грифиндорцы");
            }
        }
    }
}
