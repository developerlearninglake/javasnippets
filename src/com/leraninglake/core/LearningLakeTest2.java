import java.io.IOException;

public class LearningLakeTest {
        public static void main(String[] args) {
                try {
                        throw new Exception("Hello ");
                } catch (Exception e) {
                        System.out.print(e.getMessage());
                } catch (IOException e) {
                        System.out.print(e.getMessage());
                } finally {
                        System.out.println("LearningLake");
                }
        }
}