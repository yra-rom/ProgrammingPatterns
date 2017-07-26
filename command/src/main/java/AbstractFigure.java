import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class AbstractFigure implements Figure {
    private Integer transparency = 0;
}
