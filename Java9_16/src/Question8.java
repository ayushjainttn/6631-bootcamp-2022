class Resource implements AutoCloseable {
    @Override
    public void close() throws Exception {
        throw new Exception("close() method automatically invoked");
    }
}
public class Question8 extends Resource{
    public static void main(String[] args) {
        try(Resource resource = new Resource()){
            System.out.println("Inside try block");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
