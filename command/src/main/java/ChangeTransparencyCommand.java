public class ChangeTransparencyCommand extends AbstractRevertibleCommand {
    private Integer oldLevel;
    private Integer newLevel;
    private Figure figure;

    public ChangeTransparencyCommand(Figure figure, Integer newLevel) {
        this.figure = figure;
        this.newLevel = newLevel;
    }

    @Override
    public void execute() {
        this.oldLevel = figure.getTransparency();
        figure.setTransparency(newLevel);
    }

    @Override
    public void undo() {
        if (oldLevel != null && figure != null) {
            Integer levelTmp = figure.getTransparency();
            figure.setTransparency(oldLevel);
            oldLevel = levelTmp;
        }
    }

    @Override
    public void redo() {
        undo();
    }
}
