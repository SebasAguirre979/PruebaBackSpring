package com.example.demoback.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoback.model.Stakeholder;
import com.example.demoback.service.StakeholderService;

@RestController
@RequestMapping ("/stakeholder/")
public class StakeholderREST {
    
    @Autowired
    private StakeholderService stakeholderService;

    @GetMapping
    private ResponseEntity<List<Stakeholder>> getAllStakeholders (){
        return ResponseEntity.ok(stakeholderService.findAll());
    }

    @PostMapping
    private ResponseEntity<Stakeholder> savePersona (@RequestBody Stakeholder stakeholder){
        
        try {
            Stakeholder stakeholderGuardado = stakeholderService.save(stakeholder);
            return ResponseEntity.created(new URI("/stakeholder/"+stakeholderGuardado.getB_id())).body(stakeholderGuardado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    
    @DeleteMapping (value = "delete/{b_id}")
    private ResponseEntity<Boolean> deleteStakeholder (@PathVariable ("b_id") Long b_id){
        stakeholderService.deleteById(b_id);
        return ResponseEntity.ok(!(stakeholderService.findById(b_id)!=null));

    }

}

