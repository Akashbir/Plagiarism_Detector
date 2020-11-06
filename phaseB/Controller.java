/**
 * An interface for the Controller in an MVC architecture.
 */
public interface Controller {

    /**
     * Select a student's project to use as one of the two projects. Side reflects the visual
     * location and helps specify if this is project 1 or project 2.
     *
     * @param filePath String, the path to the directory containing the student project
     * @param side Side, whether the project appears on the left of right (internally, P1 or P2)
     */
    void useProject(String filePath, Side side);

    /**
     * Method to run the detection algorithm.
     */
    void runDetection();

    /**
     * Method to open a dialog with the user (error message).
     *
     * @param dialog String, the message to pass along to the user
     */
    void openDialogue(String dialog);

    /**
     * Method to provide the similarities representation for the view. This should handle the
     * highlighting in the side-by-side view.
     */
    void provideSimilarities();

    /**
     * Choose the algorithm(s) to use during detection.
     *
     * @param chooseAlgorithm String, algorithm selection
     */
    void setDepth(String chooseAlgorithm);
}
