package CatchingExceptionHierarchy;

class MyParentException extends Exception {
}
class MyChildException extends MyParentException {
}

// 创建 MyChildException 的子类 MyGrandChildException
class MyGrandChildException extends MyChildException {
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyGrandChildException(); // throwing an instance of MyGrandChildException
        }  catch (MyGrandChildException g) { // catching MyGrandChildException
            System.err.println("Caught MyGrandChildException");
        } catch (MyChildException s) {
            System.err.println("Caught MyChildException");
        }catch (MyParentException a) {
            System.err.println("Caught MyParentException");
        }
    }
}