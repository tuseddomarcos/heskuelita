package beans;


public abstract class Component {


    private Integer id;

    public Component () {

        super ();
    }

    public Component (int id) {

        super ();

        this.id = id;
    }


    public int getId () {

        return id;
    }

    public void setId (int id) {

        this.id = id;
    }
}