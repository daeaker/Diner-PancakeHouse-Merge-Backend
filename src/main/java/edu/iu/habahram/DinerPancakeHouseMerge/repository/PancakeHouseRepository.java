package edu.iu.habahram.DinerPancakeHouseMerge.repository;

import edu.iu.habahram.DinerPancakeHouseMerge.model.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PancakeHouseRepository {
    public List<MenuItem> getTheMenu() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        return pancakeHouseMenu.getMenuItems();
    }

    public PancakeHouseMenuIterator getTheMenuIterator() {
        return new PancakeHouseMenuIterator(this.getTheMenu());
    }
}
