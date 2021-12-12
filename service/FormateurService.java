package tn.isima.formationadd.service;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;

        import tn.isima.formationadd.model.Formation;
        import tn.isima.formationadd.repo.FormationRepo;

        import javax.transaction.Transactional;
        import java.util.UUID;

@Service
@Transactional
public class FormationService {
    private final FormationRepo formationRepo;

    @Autowired
    public FormationService(FormationRepo formationRepo) {
        this.formationRepo = formationRepo;
    }

    public Formation addFormation(Formation formation) {
        formation.setFormationCode(UUID.randomUUID().toString());
        return formationRepo.save(formation);
    }


}