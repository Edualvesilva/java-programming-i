
import java.util.ArrayList;

public class BirdInfo {

    private String birdName;
    private String latinName;
    private int observation;
   

    public BirdInfo() {
       
        this.observation = 0;
    }

    // setters
    public void setBirdName(String name) {
        this.birdName = name;
    }

    public void setLatinName(String name) {
        this.latinName = name;
    }


    public void observation() {
        this.observation++;
    }

    // getters
    public String getBirdName() {
        return this.birdName;
    }

    public String getLatinName() {
        return this.latinName;
    }

    // end of getters


    public String toString(){
    
    return this.birdName+"("+this.latinName+"):"+ this.observation+" Observations";
    
    }
    
}
