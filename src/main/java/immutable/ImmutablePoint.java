package immutable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public final class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint offset(int x, int y){
        return new ImmutablePoint(this.x + x, this.y + y);
    }

}
