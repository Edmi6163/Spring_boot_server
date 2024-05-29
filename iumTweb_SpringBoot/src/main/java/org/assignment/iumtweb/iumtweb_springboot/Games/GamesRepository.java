package org.assignment.iumtweb.iumtweb_springboot.Games;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.OptionalInt;

public interface GamesRepository extends JpaRepository<Games, Long> {
    Optional<Games> findByHomeClubName(String homeClubName);
    Optional<Games> findByStadium(String stadium);
    Optional<Games> findByGameId(Long gameId);
    Optional<Games> findByHomeClubManagerName(String homeClubManagerName);

}
