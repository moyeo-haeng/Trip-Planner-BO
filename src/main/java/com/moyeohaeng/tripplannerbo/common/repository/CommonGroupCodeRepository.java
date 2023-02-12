package com.moyeohaeng.tripplannerbo.common.repository;

import com.moyeohaeng.tripplannerbo.common.domain.CommonGroupCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommonGroupCodeRepository extends JpaRepository<CommonGroupCode, Long> {
}
