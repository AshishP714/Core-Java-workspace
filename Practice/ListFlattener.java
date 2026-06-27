import java.util.*;

public class ListFlattener {
    public static List<Integer> flatten(List<Object> nestedList) {
        if (nestedList == null) return Collections.emptyList();

        List<Integer> result = new ArrayList<>();
       
        Deque<Iterator<Object>> stack = new ArrayDeque<>();
        stack.push(nestedList.iterator());

        while (!stack.isEmpty()) {
            Iterator<Object> it = stack.peek();
            
            if (!it.hasNext()) {
                stack.pop();
                continue;
            }

            Object element = it.next();
            if (element instanceof Integer) {
                result.add((Integer) element);
            } else if (element instanceof List) {
                @SuppressWarnings("unchecked")
                List<Object> subList = (List<Object>) element;
                stack.push(subList.iterator());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Object> nested = List.of(1, List.of(2, 3), List.of(List.of(4), 5));
        System.out.println(flatten(nested));
    }
}
