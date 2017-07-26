public abstract class AbstractIrrevertibleCommand implements Command {
    @Override
    public final void undo() {
        throw new UnsupportedOperationException();
    }
}
