package tn.isima.formationadd.repo;

        import org.springframework.data.jpa.repository.JpaRepository;

        import tn.isima.formationadd.model.Formation;

        import java.util.Optional;

public interface FormationRepo extends JpaRepository<Formation, Long> {


    Optional<Formation> findFormationById(Long id);
}