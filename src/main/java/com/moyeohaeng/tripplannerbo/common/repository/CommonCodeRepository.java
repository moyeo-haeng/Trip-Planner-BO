package com.moyeohaeng.tripplannerbo.common.repository;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
//    List<CommonCode> findALL();
import org.springframework.stereotype.Repository;

@Repository
public interface CommonCodeRepository extends JpaRepository<CommonCode, Long> {

    CommonCode findCommonCodeByCommonCdId(String commonCdId);
}
