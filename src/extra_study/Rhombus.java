package extra_study;

class Rhombus {

private int side;

private int altitude;

 

public void calculate ( int perimeter , int a ) {

side = perimeter / 4;

altitude= a;

int area = side * altitude;

System.out.println(area);

}

}

class Main {

public static void main ( String args [ ] )

{

Rhombus r = new Rhombus();

System.out.print(r.calculate(0, 0));

}

}