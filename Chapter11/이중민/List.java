package Chapter11.이중민;

import java.io.PrintStream;

public interface List<T> {
    void add(T p);
    void delete(String s);
    int size();
    void print(T t, PrintStream ps);
}
