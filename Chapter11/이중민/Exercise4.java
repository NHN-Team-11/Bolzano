package Chapter11.이중민;

public class ListOfPersonsArray {

    private Person[] a;
    private int n;

    public ListOfPersonsArray() {
        a = new Person[10];
        n = 0;
    }

    public void add (Person p) {
        if (n == a.length) {
            Person[] b = new Person[a.length * 2];
            for (int i = 0; i < a.length; i++) {
                b[i] = a[i];
            }
            a = b;
        }
        a[n] = p;
        n++;
    }

    public void remove(int k) {
        if((k >= 0 && k < n)) {
            for (int i = k; i < n; i++) {
                a[i] = a[i+1];
            }
            n--;
        }
        //a.length/4는 실제 데이터보다 넉넉하게 메모리를 확보해두었다가 실제 사용량이 일정 수준 이하로 떨어질 경우 메모리를 재조정하는 기준점이다.
        if((a.length > 10) && (n < a.length/4)) {
            Person[] b = new Person[a.length/2];
            for (int i = 0; i < n; i++) {
                b[i] = a[i];
            }
            a = b;
        }
    }
}