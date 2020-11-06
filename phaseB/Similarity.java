/**
 * Interface for a similarity data structure. Similarities are responsible for recording a single
 * instance of suspected plagiarism between two projects at specific locations.
 */
public interface Similarity {

  /**
   * Method to get the suspicious ASTNode from a project.
   *
   * @param side Side, which project's ASTNode to get
   * @return ASTNode, the node from the given project
   */
  ASTNode getNode(Side side);

  /**
   * Method to get the filename where the suspected plagiarism occurred.
   *
   * @param side Side, which project filename to get
   * @return String, the filename
   */
  String getFileName(Side side);

  /**
   * Method to get the line number of the suspected plagiarism.
   *
   * @param side Side, which project line number to get
   * @return int, the line number
   */
  int getLineNumber(Side side);
}
