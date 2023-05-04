package com.lordoftherings.app.rest.Repo;

import com.lordoftherings.app.rest.Models.Movie;
import com.lordoftherings.app.rest.Models.Quote;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuoteRepo extends JpaRepository<Quote,Long> {
}
