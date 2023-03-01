public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, powerOfMagic, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() +
                ", Фамилия: " + getSurname() +
                ", Сила магии: " + getPowerOfMagic() +
                ", Расстояние трансгресии: " + getTransgressionDistance() +
                ", Хитрость: " + cunning +
                ", Решительность: " + determination +
                ", Амбициозность: " + ambition +
                ", Находчивость: " + resourcefulness +
                ", Жажда власти: " + lustForPower
                ;
    }

    public static void bestStudentSlytherin(Slytherin firstStudent,Slytherin secondStudent){
        int sumFirst = firstStudent.getCunning()+firstStudent.getDetermination()+firstStudent.getAmbition()+firstStudent.getResourcefulness()+firstStudent.getLustForPower();
        int sumSecond = secondStudent.getCunning()+secondStudent.getDetermination()+secondStudent.getAmbition()+secondStudent.getResourcefulness()+secondStudent.getLustForPower();
        if(firstStudent==secondStudent){
            throw new NullPointerException("Нельзя передавать одного и того же ученика");
        } else {
            if (sumSecond > sumFirst) {
                System.out.println(secondStudent.getName() + " лучший Слизеринец, чем " + firstStudent.getName());
            } else if (sumFirst > sumSecond) {
                System.out.println(firstStudent.getName() + " лучший Слизеринец, чем " + secondStudent.getName());
            } else {
                System.out.println(firstStudent.getName() + " и " + secondStudent.getName() + " оба лучшие Слизеринцы");
            }
        }
    }

}
