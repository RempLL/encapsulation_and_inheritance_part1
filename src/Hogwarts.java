public class Hogwarts {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgressionDistance;

    public Hogwarts(String name, String surname, int powerOfMagic, int transgressionDistance) {
        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgressionDistance = transgressionDistance;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public static void bestStudentHogwarts(Hogwarts firstStudent, Hogwarts secondStudent) {
        if (firstStudent == secondStudent) {
            throw new NullPointerException("Нельзя передавать одного и того же ученика");
        } else {
            if (firstStudent.getPowerOfMagic() > secondStudent.getPowerOfMagic() && firstStudent.getTransgressionDistance() > secondStudent.getTransgressionDistance()) {
                System.out.print(firstStudent.getName() + " " + firstStudent.getSurname() + " обладает большей мощностью магии и дальностью трансгресии, чем "
                        + secondStudent.getName() + " " + secondStudent.getSurname()
                );
            } else if (firstStudent.getPowerOfMagic() > secondStudent.getPowerOfMagic() && firstStudent.getTransgressionDistance() < secondStudent.getTransgressionDistance()) {
                System.out.print(firstStudent.getName() + " " + firstStudent.getSurname() + " обладает большей мощностью магии и дальностью трансгресии, чем "
                        + secondStudent.getName() + " " + secondStudent.getSurname() + ", но меньшей дальностью трансгресии"
                );
            } else if (firstStudent.getPowerOfMagic() > secondStudent.getPowerOfMagic() && firstStudent.getTransgressionDistance() == secondStudent.getTransgressionDistance()) {
                System.out.print(firstStudent.getName() + " " + firstStudent.getSurname() + " обладает большей мощностью магии, чем "
                        + secondStudent.getName() + " " + secondStudent.getSurname() + ". Дальность трансгресии одинаковая."
                );
            } else if (secondStudent.getPowerOfMagic() > firstStudent.getPowerOfMagic() && secondStudent.getTransgressionDistance() > firstStudent.getTransgressionDistance()) {
                System.out.print(secondStudent.getName() + " " + secondStudent.getSurname() + " обладает большей мощностью магии и дальностью трансгресии, чем "
                        + firstStudent.getName() + " " + firstStudent.getSurname() + "."
                );
            } else if (secondStudent.getPowerOfMagic() > firstStudent.getPowerOfMagic() && secondStudent.getTransgressionDistance() < firstStudent.getTransgressionDistance()) {
                System.out.print(secondStudent.getName() + " " + secondStudent.getSurname() + " обладает большей мощностью магии , чем "
                        + firstStudent.getName() + " " + firstStudent.getSurname() + ", но меньшей дальностью трансгресии"
                );
            } else if (secondStudent.getPowerOfMagic() > firstStudent.getPowerOfMagic() && secondStudent.getTransgressionDistance() == firstStudent.getTransgressionDistance()) {
                System.out.print(secondStudent.getName() + " " + secondStudent.getSurname() + " обладает большей мощностью, чем "
                        + firstStudent.getName() + " " + firstStudent.getSurname() + ". Дальность трансгресии одинаковая."
                );
            } else if (secondStudent.getPowerOfMagic() == firstStudent.getPowerOfMagic() && secondStudent.getTransgressionDistance() == firstStudent.getTransgressionDistance()) {
                System.out.print(firstStudent.getName() + " " + firstStudent.getSurname() + " и " + secondStudent.getName() + " " + secondStudent.getSurname()
                        + " имеют одинаковую мощность магии и дальность трансгресии.");
            } else if (firstStudent.getPowerOfMagic() == secondStudent.getPowerOfMagic() && firstStudent.getTransgressionDistance() > secondStudent.getTransgressionDistance()) {
                System.out.print(firstStudent.getName() + " " + firstStudent.getSurname() + " обладает большей дальностью трансгресии, чем "
                        + secondStudent.getName() + " " + secondStudent.getSurname() + ". Мощность магии одинаковая"
                );
            } else if (secondStudent.getPowerOfMagic() == firstStudent.getPowerOfMagic() && secondStudent.getTransgressionDistance() > firstStudent.getTransgressionDistance()) {
                System.out.print(secondStudent.getName() + " " + secondStudent.getSurname() + " обладает большей дальностью трансгресии, чем "
                        + firstStudent.getName() + " " + firstStudent.getSurname() + ". Мощность магии одинаковая"
                );
            }
        }
    }
}
