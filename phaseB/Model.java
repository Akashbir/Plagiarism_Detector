import java.util.List;

/**
 * Interface for the model in an MVC architecture.
 */
public interface Model {

    /**
     * Choose a project.
     *
     * @param filePath String, filepath to the project
     * @param side Side, choose a side for this project (i.e. is this project 1 or 2)
     */
    void setProject(String filePath, Side side);

    /**
     * Method to run the chosen methods for plagiarism detection.
     *
     * @return List of Similarity, list of objects which describe where similarities are located
     */
    List<Similarity> detectPlagiarism();
}
