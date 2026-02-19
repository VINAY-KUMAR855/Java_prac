// Defining a class inside another class is called Nested class.
class University {
    int age = 18;
    static String brach = "AI";
    static class Branch{
        public static void main(String[] args){
            University nc = new University();
            System.err.println("Branch executed");
            System.out.println("Age: "+nc.age);
            System.out.println("Brach: "+brach);
        }
    }
    public static void main(String[] args) {
        System.out.println("Main method executed");
        Branch.main(args);
    }
}
