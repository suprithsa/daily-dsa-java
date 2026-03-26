public class Grading{
    public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> result = new ArrayList<>();

    for (int grade : grades) {
        if (grade >= 38) {
            int nextMultiple = ((grade / 5) + 1) * 5;

            if (nextMultiple - grade < 3) {
                grade = nextMultiple;
            }
        }
        result.add(grade);
    }

    return result;
}
}