/*
    Aufgabe 3) Zeichnen mit Schleifen und Methoden
*/
public class Aufgabe3 {

    private static void drawTriangle(double centerX, double centerY, double height, int direction) {

        switch (direction) {
            case 0:                                                                                 //Osten
                StdDraw.line(centerX, centerY, centerX + height, centerY + height);
                StdDraw.line(centerX + height, centerY + height, centerX + height, centerY - height);
                StdDraw.line(centerX + height, centerY - height, centerX, centerY);
                break;

            case 1:                                                                                 //Norden
                StdDraw.line(centerX, centerY, centerX - height, centerY + height);
                StdDraw.line(centerX - height, centerY + height, centerX + height, centerY + height);
                StdDraw.line(centerX + height, centerY + height, centerX, centerY);
                break;

            case 2:                                                                                 //Westen
                StdDraw.line(centerX, centerY, centerX - height, centerY - height);
                StdDraw.line(centerX - height, centerY - height, centerX - height, centerY + height);
                StdDraw.line(centerX - height, centerY + height, centerX, centerY);
                break;

            case 3:                                                                                 //Süden
                StdDraw.line(centerX, centerY, centerX + height, centerY - height);
                StdDraw.line(centerX + height, centerY - height, centerX - height, centerY - height);
                StdDraw.line(centerX - height, centerY - height, centerX, centerY);
                break;

            default:
                System.out.println("Falsche Richtung!");

        }


    }

    private static void drawTrianglePattern(double centerX, double centerY, int height, int centerShift) {

        drawTriangle(centerX + centerShift, centerY, height, 0); //Osten
        drawTriangle(centerX, centerY + centerShift, height, 1); //Norden
        drawTriangle(centerX - centerShift, centerY, height, 2); //Westen
        drawTriangle(centerX, centerY - centerShift, height, 3); //Süden
    }

    private static void drawTrianglePatternLine(double centerX, double centerY, int height, int growth, int distance) {

        for (int i = 0; i < 7; i++) {
            drawTrianglePattern(centerX + ((((height * 2) + (growth * i)) + distance) * i), centerY, height, growth * i);
        }
    }

    public static void main(String[] args) {

        int pixelWidth = 200;
        int pixelHeight = 200;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);

        drawTriangle(100, 100, 20, 0);
        StdDraw.pause(1000); //Wartezeit 1 Sekunde
        StdDraw.clear();
        drawTriangle(100, 100, 40, 1);
        StdDraw.pause(1000); //Wartezeit 1 Sekunde
        StdDraw.clear();
        drawTriangle(100, 100, 30, 2);
        StdDraw.pause(1000); //Wartezeit 1 Sekunde
        StdDraw.clear();
        drawTriangle(100, 100, 50, 3);
        StdDraw.pause(2000); //Wartezeit 2 Sekunden
        StdDraw.clear();

        drawTrianglePattern(100, 100, 50, 0);
        StdDraw.pause(1000);//Wartezeit 1 Sekunde
        StdDraw.clear();
        drawTrianglePattern(100, 100, 40, 10);
        StdDraw.pause(1000);//Wartezeit 1 Sekunde
        StdDraw.clear();
        drawTrianglePattern(100, 100, 20, 40);
        StdDraw.pause(1000);//Wartezeit 1 Sekunde
        StdDraw.clear();
        drawTrianglePattern(100, 100, 10, 20);
        StdDraw.pause(2000); //Wartezeit 2 Sekunden
        StdDraw.clear();
        pixelWidth = 700;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);

        drawTrianglePatternLine(50, 100, 20, 5, 20);
        StdDraw.pause(2000);//Wartezeit 2 Sekunden
        StdDraw.clear();
        System.out.println("##");
        drawTrianglePatternLine(50, 100, 10, 3, 10);
        StdDraw.pause(2000);//Wartezeit 2 Sekunden
        StdDraw.clear();
        System.out.println("##");
        drawTrianglePatternLine(50, 100, 10, 10, 15);
    }
}


