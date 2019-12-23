@Entity
@Table(name = "PACKAGETYPE")
public class PackageType {

    int id;
    String name;
    double cost;

    public PackageType() {
    }

    public PackageType(int id, String name, double cost) {
        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "NAME", length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "COST")
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}