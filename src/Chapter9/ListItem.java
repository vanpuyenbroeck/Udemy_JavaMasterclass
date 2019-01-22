package Chapter9;

public abstract class ListItem {
    protected Object item;
    protected ListItem nextItem = null;
    protected ListItem previousItem = null;

    public ListItem(Object item) {
        this.item = item;
    }

    abstract ListItem next();

    abstract ListItem previous();

    abstract void setNext(ListItem nexItem);

    abstract void setPrevious(ListItem previousItem);

    abstract int compareTo(ListItem listItem);

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}
