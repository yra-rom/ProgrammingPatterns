import java.util.Deque;
import java.util.LinkedList;

@Invoker
public class FigureProcessor {
    private Deque<Command> revertable = new LinkedList<>();
    private Deque<Command> redo = new LinkedList<>();

    public void executeCommand(Command command) {
        command.execute();
        if (command instanceof AbstractRevertibleCommand) {
            revertable.addLast(command);
        }
    }

    public void undoLast() {
        if (!revertable.isEmpty()) {
            Command last = revertable.pollLast();
            redo.addLast(last);
            last.undo();
        }
    }

    public void redoLast() {
        if (!redo.isEmpty()) {
            Command last = redo.pollLast();
            revertable.addLast(last);
            last.redo();
        }
    }


}
