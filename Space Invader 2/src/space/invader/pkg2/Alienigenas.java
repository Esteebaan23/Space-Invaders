package space.invader.pkg2;

public class Alienigenas {
    int angulo;
    double locationX, locationY;
    double drawLocationX, drawLocationY;
    public Alienigenas(int grados, int centroX, int centroY, double drawX, double drawY)
    {
        angulo=grados;
        locationX=centroX;
        locationY=centroY;
        drawLocationX=drawX;
        drawLocationY=drawY;
    }
    public int getAngulo()
    {
        return angulo;
    }
    public void setAngulo(int grados)
    {
        angulo=grados;
    }
    public double getlocationX()
    {
        return locationX;
    }
    public double getlocationY()
    {
        return locationY;
    }
    public double getdrawLocationX()
    {
        return drawLocationX;
    }
    public double getdrawLocationY()
    {
        return drawLocationY;
    }
    public void setlocationX(int centroX)
    {
        locationX=centroX;
    }
    public void setlocationY(int centroY)
    {
        locationY=centroY;
    }
    public void setdrawLocationX(double drawX)
    {
        drawLocationX=drawX;
    }
    public void setdrawLocationY(double drawY)
    {
        drawLocationY=drawY;
    }
}
