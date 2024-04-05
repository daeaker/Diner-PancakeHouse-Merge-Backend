package edu.iu.habahram.DinerPancakeHouseMerge.controllers;

import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuComponent;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItem;
import edu.iu.habahram.DinerPancakeHouseMerge.model.MenuItemRecord;
import edu.iu.habahram.DinerPancakeHouseMerge.repository.MergerRepository;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/merger")
public class MergerController {

    MergerRepository mergerRepository;

    public MergerController(MergerRepository mergerRepository) {
        this.mergerRepository = mergerRepository;
    }

    @GetMapping
    public List<MenuItemRecord> get() {
        List<MenuItemRecord> items = mergerRepository.getTheMenuItems();
        return items;
    }



    @GetMapping("/vegetarian")
    public List<MenuItemRecord> vegetarian() {
        List<MenuItemRecord> items = mergerRepository.getTheVegetarianItems();
        return items;
    }



    @GetMapping("/breakfast")
    public List<MenuItemRecord> breakfast() {
        List<MenuItemRecord> items = mergerRepository.getBreakfastItems();
        return items;
    }


    @GetMapping("/lunch")
    public List<MenuItemRecord> lunch() {
        List<MenuItemRecord> items = mergerRepository.getLunchItems();
        return items;
    }


    @GetMapping("/supper")
    public List<MenuItemRecord> supper() {
        List<MenuItemRecord> items = mergerRepository.getSupperItems();
        return items;
    }



    @PostMapping("/signup")
    public boolean signup(@RequestParam String username, @RequestParam String password, @RequestParam String email) throws IOException {
        Boolean success = mergerRepository.signup(username, password, email);
        return success;
    }




}