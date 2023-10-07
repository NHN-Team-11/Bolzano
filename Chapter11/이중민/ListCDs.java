package Chapter11.이중민;

import java.io.PrintStream;

public class ListCDs<T extends CD> implements List<T> {
    private CD head;

    @Override
    public void add(T p) {
        if(head == null) {
            head = new CD(p.getAuthor(), p.getTitle(), p.getYear(), p.getPrice());
        }
        else {
            CD current = head;
            while(current.nextNode() != null) {
                current = current.nextNode();
            }
            current.setNextNode(new CD(p.getAuthor(), p.getTitle(), p.getYear(), p.getPrice()));
        }
    }

    @Override
    public void delete(String s) {
        CD current = head;

        CD p = new CD();
        p.setNextNode(current);
        current = p;

        while(p.nextNode() != null) {
            if(p.nextNode().getTitle().equals(s)) {
                p.setNextNode(p.nextNode().nextNode());
            }else {
                p = p.nextNode();
            }
        }
    }


    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }


    @Override
    public void print(CD cd, PrintStream ps) {
        CD current = cd;
        while(current != null) {
            ps.print("저자: " + current.getAuthor() + "/" + "제목: " + current.getTitle() + "/" + 
                    "출판 연도: " + current.getYear() + "/" + "가격: " + current.getPrice());
            ps.println();
            current = current.nextNode();
        }
    }

    public int allCDSumPrice() {
        CD current = head;
        int sum = 0;

        while(current != null) {
            sum += current.getPrice();
            current = current.nextNode();
        }

        return sum;
    }

    public CD listOfAuthorsCDs(String name) {
       return listOfAuthorsCDsRecursive(head, name);
    }

    public CD listOfAuthorsCDsRecursive(CD current, String name) {
        if(current == null) {
            return null;
        }

        if (current.getAuthor().equals(name)) {
            current.setNextNode(listOfAuthorsCDsRecursive(current.nextNode(), name));
            return current;
        }
        else {
            return listOfAuthorsCDsRecursive(current.nextNode(), name);
        }
    }


    public static void main(String[] args) {
        CD one = new CD("이중민", "오예스", "2023", 1000);
        CD two = new CD("이중민", "아리랑", "2022", 2000);
        CD three = new CD("김민석", "아리랑", "2022", 2000);

        ListCDs<CD> listCDs = new ListCDs<>();
        listCDs.add(one);
        listCDs.add(two);
        listCDs.add(three);
        System.out.println(listCDs.allCDSumPrice());
        // listCDs.print(listCDs.head, System.out);
        listCDs.print(listCDs.listOfAuthorsCDs("이중민"), System.out);
        
        
    }
}
