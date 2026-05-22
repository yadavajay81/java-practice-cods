package com.springbootpostgresjpa.controller;

import com.springbootpostgresjpa.exception.ResourceNotFoundException;
import com.springbootpostgresjpa.model.Tutorial;
import com.springbootpostgresjpa.repository.TutorialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class TutorialController {

    @Autowired
    TutorialRepository tutorialRepository;

//Get all tutorials
    @GetMapping("/tutorials")
    public List<Tutorial> getAllTutorials(){
        return tutorialRepository.findAll();
    }


   /* @GetMapping("/tutorials")
    public ResponseEntity<List<Tutorial>> getAllTutorials(@RequestParam(required = false) String title){


        try{
            List<Tutorial> tutorials = new ArrayList<Tutorial>();
            if(title == null)
                tutorialRepository.findAll().forEach(tutorials::add);
            else
                tutorialRepository.findByTitleContaining(title).forEach(tutorials::add);
            if(tutorials.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tutorials, HttpStatus.OK);

        } catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/


    @GetMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) throws ResourceNotFoundException {

        Tutorial tutorial = tutorialRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Tutorial not exist with id: "+id));
        return ResponseEntity.ok(tutorial);


        /*Optional<Tutorial> tutorialData = tutorialRepository.findById(id);
        if(tutorialData.isPresent()){
            return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }*/
    }

    @PostMapping("/tutorials")
    public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial){
        try{
            Tutorial _tutorial = tutorialRepository
                    .save(new Tutorial(tutorial.getTitle(),tutorial.getDescription(), tutorial.isPublished()));
            return new ResponseEntity<>(_tutorial, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    //Update tutorial rest API
    @PutMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> updateTutorial(@PathVariable Long id, @RequestBody Tutorial tutorialDetails) throws ResourceNotFoundException {

        Tutorial tutorial = tutorialRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Tutorial not exist with id: "+id));
        tutorial.setTitle(tutorialDetails.getTitle());
        tutorial.setDescription(tutorialDetails.getDescription());
        tutorial.setPublished(tutorialDetails.isPublished());

        Tutorial tutorialUpdate = tutorialRepository.save(tutorial);
        return ResponseEntity.ok(tutorialUpdate);

    }

   /* @PutMapping("/tutorials/{id}")
    public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, Tutorial tutorial){
        Optional<Tutorial> tutorialData = tutorialRepository.findById(id);
        if(tutorialData.isPresent()){
            Tutorial _tutorial = tutorialData.get();
            _tutorial.setTitle(tutorial.getTitle());
            _tutorial.setDescription(tutorial.getDescription());
            _tutorial.setPublished(tutorial.isPublished());
            return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);

        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/

    @DeleteMapping("/tutorials/{id}")
    public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id){

        try{
            tutorialRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch(Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/tutorials")
    public ResponseEntity<HttpStatus> deleteAllTutorials(){
        try{
            tutorialRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/tutorials/published")
    public ResponseEntity<List<Tutorial>> findByPublished(){
        try{
            List<Tutorial> tutorials = tutorialRepository.findByPublished(true);
            if(tutorials.isEmpty()){
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(tutorials, HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
