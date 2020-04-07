package br.com.studyspringboot.repository;

import br.com.studyspringboot.domain.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("select ac from Client ac " +
            "where (:term is null or (lower(ac.name) like lower(concat('%', :term, '%')) ) ) " +
            "order by ac.name ")
    Page<Client> findByTerm(
            @Param("term") String term,
            Pageable pageable);
}