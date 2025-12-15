package azkeep.mediadiary.repository;

import azkeep.mediadiary.entity.MediaSelected;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface MediaSelectedRepo extends JpaRepository<MediaSelected, Integer> {
    @Query("select m from MediaSelected m where m.date >= ?1")
    Optional<MediaSelected> findByDateGreaterThanEqual(@NonNull LocalDate date);

}
