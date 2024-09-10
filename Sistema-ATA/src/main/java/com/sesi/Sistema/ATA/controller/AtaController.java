package com.sesi.Sistema.ATA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sesi.Sistema.ATA.model.Ata;
import com.sesi.Sistema.ATA.model.TipoAta;
import com.sesi.Sistema.ATA.repository.AtaRepository;

import org.springframework.ui.Model;

@Controller
@RequestMapping("/atas")

public class AtaController {

	@Autowired
    private AtaRepository ataRepository;

    @GetMapping("/nova")
    public String novaAtaForm(Model model) {
        model.addAttribute("ata", new Ata());
        model.addAttribute("tipos", TipoAta.values());
        return "nova-ata";
    }

    @PostMapping("/salvar")
    public String salvarAta(@ModelAttribute Ata ata) {
        ataRepository.save(ata);
        return "redirect:/atas";
    }

    @GetMapping
    public String listarAtas(Model model) {
        model.addAttribute("atas", ataRepository.findAll());
        return "lista-atas";
    }
	
	
}
