package com.moyeohaeng.tripplannerbo.common.utility;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeReq;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeRes;
import com.moyeohaeng.tripplannerbo.common.repository.CommonCodeRepository;
import com.moyeohaeng.tripplannerbo.common.repository.CommonRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class CommonUtility {

    @Autowired
    private CommonRepository commonRepository;
    @Autowired
    private CommonCodeRepository commonCodeRepository;


    public final List<CommonCodeRes> searchCommonCode() { /*CommonCodeReq parameter*/

        commonCodeRepository.save(
                CommonCode.builder().commonType("ST").commonCdId("10").commonCdNm("구성중").commonCdDesc("구성중").commonGroupCdId("ST0001")
                .commonGroupCdNm("전시상태관리").commonGroupCdDesc("전시상태관리").commonSortSeq(1).commonCdEditYn("Y").useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                .build()
        );

        commonCodeRepository.save(
                CommonCode.builder().commonType("ST").commonCdId("20").commonCdNm("승인요청").commonCdDesc("승인요청").commonGroupCdId("ST0001")
                        .commonGroupCdNm("전시상태관리").commonGroupCdDesc("전시상태관리").commonSortSeq(2).commonCdEditYn("Y").useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonCodeRepository.save(
                CommonCode.builder().commonType("ST").commonCdId("30").commonCdNm("승인").commonCdDesc("승인").commonGroupCdId("ST0001")
                        .commonGroupCdNm("전시상태관리").commonGroupCdDesc("전시상태관리").commonSortSeq(3).commonCdEditYn("Y").useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        return commonRepository.searchCommonCode(/*parameter*/);
    }
}
