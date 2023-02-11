package com.moyeohaeng.tripplannerbo.common.repository;

import com.moyeohaeng.tripplannerbo.common.domain.CommonGroupCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CommonGroupCodeRepository extends JpaRepository<CommonGroupCode, Long> {

    Optional<CommonGroupCode> findCommonGroupCodeByCommonGrpCdId(String commonGrpCdId);
    Optional<CommonGroupCode> findCommonGroupCodeByCommonGrpCdNm(String commonGrpCdNm);

    @Query("SELECT cgc FROM CommonGroupCode cgc ORDER BY cgc.uptDtime DESC, cgc.regDtime DESC")
    List<CommonGroupCode> findAllCommonGroupCode();

}
