public class Singer extends Person{
    private String name;
    private String designation;
    private String bandName;

    public Singer(){

    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getDesignation() {
        return designation;
    }


    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandNameName(String bandName) {
        this.bandName = bandName;
    }

    private void learn(){

    }

    private void eat(){

    }
    private void walk(){

    }

    private void singing(){

    }

    private void playGuitar(){

    }

}
