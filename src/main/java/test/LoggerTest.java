package test;

public class LoggerTest {

    public static void main(String[] args) throws Exception {
        Utils.setupLogging();
        Utils.LOG.fine("hello !");
    }

}
