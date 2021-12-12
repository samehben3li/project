package tn.isima.formationadd.resource;

        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.*;

        import tn.isima.formationadd.model.Formateur;
        import tn.isima.formationadd.service.FormateurService;

        import java.util.List;

@RestController
@RequestMapping("/formation")
@CrossOrigin(origins = "*")
public class FormationResource {
    private final FormationService formationService;



    public FormationResource(FormationService formationService) {
        this.formationService = formationService;
    }



    @PostMapping("/add")
    public ResponseEntity<Formation> addFormation(@RequestBody Formation formation) {
        Formation newFormation = formationService.addFormation(formation);
        return new ResponseEntity<>(newFormation, HttpStatus.CREATED);
    }


}