public class Student implements Comparable{
    private String name;
    private double score;

    public Student(String name) {
        this.name = name;
        this.score = 0;
    }

    public void addScore(int score){
        this.score += score;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        return this.name.compareTo(((Student) o).name);
    }
}
