package ru.ivashkevich.well_constructor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.ivashkevich.well_constructor.model.Well;
import ru.ivashkevich.well_constructor.service.WellService;

import java.util.List;

@Controller
@RequestMapping("/wells")
@RequiredArgsConstructor
public class WellController {

    private final WellService wellService;

    @GetMapping
    public String showAllWells(Model model){
        List<Well> wells = wellService.getAllWells();
        model.addAttribute("allWells", wells);

        return "all-wells";
    }


}
