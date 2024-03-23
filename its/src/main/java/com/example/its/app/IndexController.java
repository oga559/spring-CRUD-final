package com.example.its.app;

import com.example.its.entity.Index;
import com.example.its.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class IndexController {
    private final IndexService indexService;

    public IndexController(IndexService indexService) {
        this.indexService = indexService;
    }

    @GetMapping("/index")
    public String index(@ModelAttribute IndexForm indexForm){
        return "index";
    }

    // RedirectAttributesはリダイレクト時のmodel.addAttribute
    @PostMapping("/index")
    public String post(IndexForm indexForm, Model model, RedirectAttributes redirectAttributes){
        Index index = new Index();
        index.setName(indexForm.getName());
        index.setEmail(indexForm.getEmail());

        indexService.save(index);

        //	2重送信対策のためリダイレクト
        return "redirect:/index";
    }
}
