package Chapter11.minseok;

import java.util.ArrayList;
import java.util.List;

public class BigNumber {
    private List<Integer> head;

    public BigNumber(String str) {
        head = new ArrayList<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            int value = Character.getNumericValue(str.charAt(i));
            head.add(value);
        }
    }

}
