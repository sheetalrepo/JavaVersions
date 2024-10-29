package A_Collection.Sorting;

/**
 *
 * @author Sheetal Singh
 */
public class C_Employee {
    
    private String name;
    private Integer id;

    public C_Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "C_Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
    
    
}
