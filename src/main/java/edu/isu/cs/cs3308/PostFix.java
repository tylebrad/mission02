package edu.isu.cs.cs3308;

/**
 * Postfix expression evaluator.
 *
 * @author Isaac Griffith
 */
public class PostFix {

    /**
     * Evaluates the provided postfix expression and returns the answer. If the
     * provided string is null, empty, or only contains whitespace then return
     * 0;
     *
     * @param //postfix A string representing an postfix notation expression where
     * each item is separated by a space.
     * @return value of the postfix express or 0 if the postfix expression is null,
     * empty, or contains only whitespace.
     */
    public static int evalPostFix(String infix) {
        String x = infix;
        if(infix == null || x.trim().isEmpty() || infix.isEmpty()) //Returning 0 for all failure conditions
            return 0;

        for (int i = 0; i < infix.length(); i++)
            Integer.parseInt(infix);
        return 0;
    }
}
