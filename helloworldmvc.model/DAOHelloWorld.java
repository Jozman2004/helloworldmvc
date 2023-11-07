public class DAOHelloWorld {
    private static DAOHelloWorld instance = null;
    private String helloWorldMessage = null;

    private DAOHelloWorld() {
        // Constructeur privé pour empêcher l'instanciation directe depuis l'extérieur.
    }

    public static DAOHelloWorld getInstance() {
        if (instance == null) {
            instance = new DAOHelloWorld();
        }
        return instance;
    }

    public void setInstance(DAOHelloWorld instance) {
        DAOHelloWorld.instance = instance;
    }

    public void readFile() {

    }

    public String getHelloWorldMessage() {
        return helloWorldMessage;
    }

    public void setHelloWorldMessage(String helloWorldMessage) {
        this.helloWorldMessage = helloWorldMessage;
    }
}
