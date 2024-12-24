import java.util.*;
import java.lang.*;
import java.io.*;

public class Die { //defines one Die object
    private int n; //number of faces
    private int faceValue; //the number that is showing
    private Random rand; //a randomizer
    
    //constructor uses parameter n to create an n-sided die
    public Die(int n) {
        this.n = n;
        this.rand = new Random();
    }
    
    //getter method to access the faceValue
    public int getFaceValue() {
        return faceValue;
    }
    
    //setter method to change the number of faces of the die
    public void setN(int n) {
        this.n = n;
    }
    
    public void roll() {
        faceValue = rand.nextInt(n)+1;
    }
}