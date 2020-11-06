/**
 * Interface for a pre-processor. The purpose of a pre-processor is to perform text mutations on
 * project files which prepare the file for conversion into an AST (like removing comments).
 */
public interface PreProcessor {

    /**
     * Method to remove the comments.
     *
     * @param file String, text contents of the project to be processed
     * @return String, the original program code with the comments removed
     */
    String removeComments(String file);

    /**
     * Method to rename the variables to assist during pattern recognition.
     *
     * @param file String, text contents of the project to be processed
     * @return String, the original program code with the variables renamed
     */
    String renameVariables(String file);
}
