public class Encapsulation {

    private int id;
    private String name;
    private String country;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public static void main(String[] args) {
        Encapsulation es = new Encapsulation();
        es.setId(100);
        es.setName("Venkat");
        es.setCountry("India");
        System.out.println(es.getId()+" "+es.getName()+" "+es.getCountry());
    }
}