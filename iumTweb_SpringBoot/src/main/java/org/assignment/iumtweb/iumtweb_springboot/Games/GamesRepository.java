package org.assignment.iumtweb.iumtweb_springboot.Games;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface GamesRepository extends JpaRepository<Games, Long> {
    Optional<Games> findByHomeClubName(String homeClubName);
    Optional<Games> findByStadium(String stadium);

}
