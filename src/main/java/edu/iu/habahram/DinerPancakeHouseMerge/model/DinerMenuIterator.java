package edu.iu.habahram.DinerPancakeHouseMerge.model;

public class DinerMenuIterator implements Iterator{
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position < menuItems.length-1) {
            return true;
        }
        return false;
    }

    @Override
    public MenuItem next() {
        this.position++;
        return this.menuItems[position];
    }
}
