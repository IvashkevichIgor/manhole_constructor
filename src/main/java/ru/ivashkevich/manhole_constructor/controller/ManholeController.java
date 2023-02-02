package ru.ivashkevich.manhole_constructor.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.ivashkevich.manhole_constructor.model.Manhole;
import ru.ivashkevich.manhole_constructor.service.ManholeService;

import java.util.List;

@Controller
@RequestMapping("/manholes")
@RequiredArgsConstructor
public class ManholeController {

    private final ManholeService manholeService;

    @GetMapping
    public String showAllManholes(Model model){
        List<Manhole> manholes = manholeService.getAllManholes();
        model.addAttribute("allManholes", manholes);

        return "all-manholes";
    }


}
