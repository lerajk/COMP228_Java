/**
 * Created by Miachealangelo di Lodovico on 9/19/16.
 */
public class GameObject {
// object center(x,y), velocity, object state (alive or dead), and object rotation.

    private double x, y;
    private double velocity;
    private boolean state; // state is alive when true or dead when false
    private boolean rotation; // rotation is clockwise when true or counter clockwise when false


// Intialize Constructor

public GameObject (double x, double y, double velocity, boolean state, boolean rotation ) {

    this.x = x;
    this.y = y;
    this.velocity = velocity;
    this.state = state;
    this.rotation = rotation;

}

     public double getX(){

        return x;

    }

    public double getY(){

        return y;

    }

    public double getVelocity(){

        return velocity;

    }

    public boolean getState(){


        return state;

    }

    public boolean getRotation(){

        return rotation;

    }




}

