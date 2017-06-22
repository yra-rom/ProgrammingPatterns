import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public final class ImmutablePoint {
    private final double x;
    private final double y;

    public ImmutablePoint offset(double x, double y){
        return new ImmutablePoint(this.x + x, this.y + y);
    }

}
