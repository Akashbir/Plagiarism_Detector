/**
 * Interface for an ASTGenerator. ASTGenerators take in a project/file as a string and converts it
 * into an AST object.
 */
public interface ASTGenerator {

    /**
     * Method to convert project/file in the form of a string into an AST object.
     *
     * @param processedFile String, the file as a string (likely with some pre-processing)
     * @return AST, the abstract syntax tree representing this project
     */
    AST generateAST(String processedFile);
}
