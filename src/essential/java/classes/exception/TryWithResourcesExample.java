package essential.java.classes.exception;

class Door implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("The door is closed!");
    }
}

public class TryWithResourcesExample {
    public static void main(String[] args) {

        try (Door door = new Door()){
          //  door.close();
            //throw new RuntimeException();
        } catch (Exception e) {
            System.out.println(e.getClass());
        } finally {
            System.out.println("");
        }
    }
}
