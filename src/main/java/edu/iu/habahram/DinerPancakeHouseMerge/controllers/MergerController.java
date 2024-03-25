package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/merger")
public class MergerController {

    DinerRepository dinerRepository;
    PancakeHouseRepository pancakeHouseRepository;

    public MergerController(DinerRepository dinerRepository, PancakeHouseRepository pancakeHouseRepository) {
        this.dinerRepository = dinerRepository;
        this.pancakeHouseRepository = pancakeHouseRepository;
    }

    @GetMapping()
    public List<MenuItem> getMenuItems() {
        List<MenuItem> menuItems = new ArrayList<>();

        Iterator lunchItems = dinerRepository.getTheMenuIterator();
        while (lunchItems.hasNext()) {
            menuItems.add(lunchItems.next());
        }

        Iterator breakfastItems = pancakeHouseRepository.getTheMenuIterator();
        while (breakfastItems.hasNext()) {
            menuItems.add(breakfastItems.next());
        }

        return menuItems;

    }

}