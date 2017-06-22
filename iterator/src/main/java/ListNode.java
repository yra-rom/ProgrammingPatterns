import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ListNode<T> {
    private T element;
    private ListNode<T> next;

    public ListNode(T element) {
        this.element = element;
    }
}
