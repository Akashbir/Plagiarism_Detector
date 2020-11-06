/**
 * Interface to represent the view in an MVC architecture.
 */
public interface View {

    /**
     * Method to show the files inside of a selected project.
     *
     * @param filePath String, the files inside the project
     * @param side Side, the side of this project (i.e. is this project 1 or 2)
     */
    void showFiles(String filePath, Side side);

    /**
     * Method to display the side-by-side view of files in which similarities are highlighted
     * for the user to examine.
     */
    void showSimilarities();

    /**
     * Method to produce an errorMessage for the user when something unexpected occurs.
     *
     * @param errorMessage String, the message to show to the user
     */
    void errorMessages(String errorMessage);

    /**
     * Method to display the currently selected algorithm.
     *
     * @param chooseAlgorithm String, the name of the algorithm
     */
    void chooseDepth(String chooseAlgorithm);

}
