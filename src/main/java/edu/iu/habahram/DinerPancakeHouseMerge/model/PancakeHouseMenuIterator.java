package edu.iu.habahram.DinerPancakeHouseMerge.model;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position < menuItems.size()-1) {
            return true;
        }
        return false;
    }

    @Override
    public MenuItem next() {
         this.position++;
         return this.menuItems.get(position);
    }
}
