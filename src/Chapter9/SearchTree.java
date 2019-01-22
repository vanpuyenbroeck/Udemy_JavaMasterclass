package Chapter9;

public interface SearchTree {
    ListItem getRoot();
    boolean addItem (ListItem listItem);
    boolean removeItem (ListItem listItem);
    void traverse (ListItem root);
}
