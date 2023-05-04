package com.lordoftherings.app.rest.Repo;

import com.lordoftherings.app.rest.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie,Long> {
}
