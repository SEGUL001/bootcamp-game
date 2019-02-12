package com.bootcamp.game.controller;

import com.bootcamp.game.model.Mod;
import com.bootcamp.game.payload.ModRequest;
import com.bootcamp.game.service.ModService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mods")
public class ModController {
    @Autowired
    private ModService modService;

    @PostMapping("/new")
    public Mod createMod(@RequestBody ModRequest modRequest){
        return modService.createMod(modRequest);
    }
}
