package hyland;

public class triangle {
	static int pointsBelongToTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int xP, int yP, int xQ, int yQ) {
        double areaOfTriangle = triangleArea(x1,y1,x2,y2,x3,y3);
        if(areaOfTriangle == 0)
            return 0;
        if(areaOfTriangle == triangleArea(xP,yP,x2,y2,x3,y3)+triangleArea(x1,y1,xP,yP,x3,y3)+triangleArea(x1,y1,x2,y2,xP,yP) && areaOfTriangle != triangleArea(xQ,yQ,x2,y2,x3,y3)+triangleArea(x1,y1,xQ,yQ,x3,y3)+triangleArea(x1,y1,x2,y2,xQ,yQ)) {
            return 1;
        }
        if(areaOfTriangle == triangleArea(xQ,yQ,x2,y2,x3,y3)+triangleArea(x1,y1,xQ,yQ,x3,y3)+triangleArea(x1,y1,x2,y2,xQ,yQ) && areaOfTriangle != triangleArea(xP,yP,x2,y2,x3,y3)+triangleArea(x1,y1,xP,yP,x3,y3)+triangleArea(x1,y1,x2,y2,xP,yP)) {
            return 2;
        }
        if(areaOfTriangle == triangleArea(xP,yP,x2,y2,x3,y3)+triangleArea(x1,y1,xP,yP,x3,y3)+triangleArea(x1,y1,x2,y2,xP,yP) && areaOfTriangle == triangleArea(xQ,yQ,x2,y2,x3,y3)+triangleArea(x1,y1,xQ,yQ,x3,y3)+triangleArea(x1,y1,x2,y2,xQ,yQ)) {
            return 3;
        }
        
        return 4;
    }
    static double triangleArea(int x1, int y1, int x2, int y2, int x3, int y3) {
		return Math.abs((x1*(y2-y3) + x2*(y3-y1)+x3*(y1-y2))/2.0);
	}
}
