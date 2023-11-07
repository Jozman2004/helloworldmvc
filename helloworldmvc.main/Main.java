public class Main {
    public static void main(String[] args) {
        // Point d'entrée de votre application.
        // Vous pouvez instancier les objets nécessaires et lancer le contrôleur ici.

        IView view = new YourView(); // Remplacez YourView par votre classe d'implémentation de l'interface IView.
        IModel model = new YourModel(); // Remplacez YourModel par votre classe d'implémentation de l'interface IModel.

        Controller controller = new Controller(view, model);
        controller.run();
    }
}
