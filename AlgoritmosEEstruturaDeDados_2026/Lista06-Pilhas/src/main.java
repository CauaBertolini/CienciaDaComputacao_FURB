public class main {
    public static void main(String[] args) {
        Program program = new Program();
        try {
            program.run();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
