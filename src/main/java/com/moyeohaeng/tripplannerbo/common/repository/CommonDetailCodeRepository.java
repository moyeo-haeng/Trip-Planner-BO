package com.moyeohaeng.tripplannerbo.common.repository;

import com.moyeohaeng.tripplannerbo.common.domain.CommonDetailCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CommonDetailCodeRepository extends JpaRepository<CommonDetailCode, Long> {
    Optional<CommonDetailCode> findCommonDetailCodeByCommonCdId(String commonCdId);
    Optional<CommonDetailCode> findCommonDetailCodeByCommonCdNm(String commonCdNm);

    @Query("SELECT cdc FROM CommonDetailCode cdc ORDER BY cdc.uptDtime DESC, cdc.regDtime DESC")
    List<CommonDetailCode> findAllCommonDetailCode();
}
