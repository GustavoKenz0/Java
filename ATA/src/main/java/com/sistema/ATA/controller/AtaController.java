package com.sistema.ATA.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sistema.ATA.Repositórios.AtaRepository;
import com.sistema.ATA.Repositórios.ParticipanteRepository;
import com.sistema.ATA.model.Ata;
import com.sistema.ATA.model.Participante;

@Controller
public class AtaController {

	@Autowired
    private AtaRepository ataRepository;

    @Autowired
    private ParticipanteRepository participanteRepository;

    @GetMapping("/emitir-ata")
    public String emitirAtaForm(Model model) {
        model.addAttribute("ata", new Ata());
        model.addAttribute("participantes", new ArrayList<Participante>());
        return "emitirAta";
    }

    @PostMapping("/salvar-ata")
    public String salvarAta(@ModelAttribute Ata ata) {
        ataRepository.save(ata);
        return "redirect:/exibir-ata/" + ata.getId();
    }

    @GetMapping("/exibir-ata/{id}")
    public String exibirAta(@PathVariable Long id, Model model) {
        Ata ata = ataRepository.findById(id).orElse(new Ata());
        model.addAttribute("ata", ata);
        return "exibirAta";
    }
}
