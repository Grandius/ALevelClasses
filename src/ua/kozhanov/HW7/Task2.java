package ua.kozhanov.HW7;

public class Task2 {
    public static void main(String[] args) {

        Student[] studAspirs = new Student[6];
        Student ivanov = new Aspirant();
        studAspirs[0] = ivanov;
        studAspirs[1] = new Student("Jenny", "Hawkins", "Group 3", 3.5);
        studAspirs[2] = new Aspirant("Jake", "Doggins", "Group 3", 3.2, false);
        studAspirs[3] = new Student("Daniel", "Grygorovich", "Group 5", 4.2);
        studAspirs[4] = new Aspirant("Edna", "Edelstein", "Group 2", 5.0, true);
        studAspirs[5] = new Student("Michael", "Dillinger", "Group 4", 4.0);

        String position;
        for (Student std : studAspirs) {

            if (std instanceof Aspirant) {
                position = "Aspirant";
            } else {
                position = "Student";
            }
            System.out.println(position+" " + std.getLastName() + " has scholarship of " + std.getScholarship() + " hryvnias.");
        }
    }
}
