package ie.atu.productv4;

public class Tv extends Product{
    private String Size;
    private String Manufacture;

    public Tv(){
        super();
        Size = "";
        Manufacture = "";
        count++;
    }

    public void setSize(String Size){
        this.Size = Size;
    }

    public String getSize() {
        return Size;
    }

    public void setManufacture(String Manufacture){
        this.Manufacture = Manufacture;
    }

    public String getManufacture() {
        return Manufacture;
    }

    public String toString(){
        return super.toString() + " by " + Manufacture + "\n" + "Screen size is " + Size + "\"";
    }
}
