public class ProbabilityDriver
{
    public static void main(String[] args) {
        Probability p1 = new Probability(6, 10);
        Probability p2 = new Probability(4, 10);
        System.out.println(p1.probabilityAND(p2));
        System.out.println(p1.probabilityOR(p2, 0.1));
        System.out.println(p1.compareTo(p2));
    }
}