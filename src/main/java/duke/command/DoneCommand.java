package duke.command;

import duke.exception.DukeException;
import duke.task.Task;
import duke.TaskList;
import duke.Ui;
import duke.Storage;

/**
 * Encapsulates the information of a parsed command to mark a task as done.
 */
public class DoneCommand extends Command {
    private int taskId;

    /**
     * @param fullCommand The full user command.
     * @param taskId The task id of the task which will be marked as done.
     */
    public DoneCommand(String fullCommand, int taskId) {
        super(fullCommand);
        assert taskId > 0;
        this.taskId = taskId;
    }

    /**
     * Executes the user command to mark a task as done.
     * @param tasks A TaskList object which encapsulates the data and operations on a task list.
     * @param ui A duke.Ui object which deals with interactions with the user.
     * @param storage A duke.Storage object which deals with loading tasks from the file and saving tasks in the file.
     */
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        Task task = tasks.doneTask(taskId);
        ui.printMsg("Nice! I've marked this task as done: ");
        ui.printMsg("  " + task);
        storage.save(tasks);
    }

    public boolean isExit() {
        return false;
    }
}
