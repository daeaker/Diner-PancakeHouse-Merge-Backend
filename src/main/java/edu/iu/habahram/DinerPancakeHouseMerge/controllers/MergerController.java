package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.DinerRepository;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.PancakeHouseRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
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

    @RequestMapping()
    public List<MenuItem> getMenuItems() {
        List<MenuItem> totalList = new ArrayList<>();

        MenuItem[] dinerMenu = this.dinerRepository.getTheMenu();
        List<MenuItem> pancakeMenu = this.pancakeHouseRepository.getTheMenu();

        totalList.addAll(pancakeMenu);
        totalList.addAll(List.of(dinerMenu));

        return totalList;

    }

}
