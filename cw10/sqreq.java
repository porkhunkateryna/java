package cw10;

import java.util.Scanner;
import java.lang.Math;

class sqrteq{ 
  public static void main(String[] args){ 
    double a,b,c,d, eps=1e-8;
    Scanner in = new Scanner(System.in);
    a = in.nextDouble();
    b = in.nextDouble();
    c = in.nextDouble();

    if (Math.abs(a) < eps) {
      if (Math.abs(b) < eps) { 
        if (Math.abs(c) < eps){ // �� ����������� ��� ���� 
            System.out.println("�������� ����� �����");
        }
        else{ 
            System.out.println("�������� ����");
        }
      }
      else{ 
        System.out.println("xl = x2 = " +(-c / b) ) ; 
      }
    }
    else{  // ����������� �� ��� ����
        if((d=b*b - 4*a*c)< 0.0){ // ��������� ����� 
           d = 0.5 * Math.sqrt(-d) / a; 
           a = -0.5 * b/ a;
           System.out.println("xl = " +a+ " +i " +d+ ",x2 = " +a+ " -i " +d);
    } 
    else { 
        // ĳ��� ����� 
        d =0.5 * Math.sqrt(d) / a;
        a = -0.5 * b / a; 
      System.out.println("x1 = " + (a + d) + ", x2 = " +(a - d));
    } 
  } 
 } 
} 