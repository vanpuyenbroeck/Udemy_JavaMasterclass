package Chapter9;

public abstract class ListItem {
    protected Object item;
    protected ListItem nextItem = null;
    protected ListItem previousItem = null;

    public ListItem(Object item) {
        this.item = item;
    }

    abstract public void next();
    abstract public void previous();
    abstract public void setNext(Object object);
    abstract public void setPrevious(Object object);
    abstract public int compareTo(ListItem listItem);
}
