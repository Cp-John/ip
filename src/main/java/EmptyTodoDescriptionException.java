public class EmptyTodoDescriptionException extends DukeException {
    private static final String ERROR_MESSAGE = "☹ OOPS!!! The description of a todo cannot be empty.";

    public EmptyTodoDescriptionException() {
        super(ERROR_MESSAGE);
    }
}
