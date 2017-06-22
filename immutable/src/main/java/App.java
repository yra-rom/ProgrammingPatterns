public class App {
    public static void main(String[] args) {
        ImmutablePoint point = new ImmutablePoint(0,0);
        ImmutablePoint pointOffset = point.offset(1.5,1.5);
    }
}
