package Chapter7.채현명;

public class Ex8 {
    
// Exercise 7.8. What does the following method calculate? => 홀수 개수 판별
public static int mystery(int[] A) {
  int x = 0;
  for (int i = 0; i < A.length; i++)
    if (A[i] % 2 == 1) x++;
  return x;
}
}
