package Chapter9;

public class Node extends ListItem {

    public Node(Object item) {
        super(item);
    }

    @Override
    ListItem next() {
        return this.nextItem;
    }

    @Override
    ListItem previous() {
        return this.previousItem;
    }

    @Override
    void setNext(ListItem nexItem) {
        this.nextItem = nexItem;
    }

    @Override
    void setPrevious(ListItem previousItem) {
        this.previousItem = previousItem;
    }

    @Override
    int compareTo(ListItem listItem) {
        if (listItem != null) {
            String thisItem = this.item.toString();
            String otherItem = listItem.getItem().toString();
            return thisItem.compareTo(otherItem);
        } else {
            return -1;
        }
    }
}
