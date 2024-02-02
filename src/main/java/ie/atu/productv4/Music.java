package ie.atu.productv4;

import ie.atu.productv3.Product;
public class Music extends Product{

    private String Artist;
    private String Label;

    public Music(){
        super();
        Artist = "";
        Label = "";
        count++;
    }

    public void setArtist (String Artist){
        this.Artist = Artist;
    }

    public String getArtist() {
        return Artist;
    }

    public void setLabel(String Label){
        this.Label = Label;
    }

    public String getLabel(){
        return Label;
    }

    public String toString(){
        return super.toString() + " by " + Artist + "\n" + Label;
    }
}
