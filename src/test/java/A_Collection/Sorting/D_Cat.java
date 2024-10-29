package A_Collection.Sorting;

/**
 * Simple POJO Class w/o Comparable or Comparator
 * 
 * @author Sheetal Singh
 */
public class D_Cat {
    private int id;

    public D_Cat(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "D_Cat{" +
                "id=" + id +
                '}';
    }
}
