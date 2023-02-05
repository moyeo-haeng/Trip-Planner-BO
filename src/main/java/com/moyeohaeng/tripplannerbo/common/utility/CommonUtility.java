package com.moyeohaeng.tripplannerbo.common.utility;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeBoxRes;
import com.moyeohaeng.tripplannerbo.common.repository.CommonCodeRepository;
import com.moyeohaeng.tripplannerbo.common.repository.CommonCodeDslRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class CommonUtility {

    @Autowired
    private CommonCodeDslRepository commonCodeDslRepository;
    @Autowired
    private CommonCodeRepository commonCodeRepository;

    public final List<CommonCodeBoxRes> searchCommonCode(CommonCode parameter) {
        return commonCodeDslRepository.searchCommonCode(parameter);
    }


    //테스트 데이터 저장(임시)
    public void test(){
        commonCodeRepository.save(
                CommonCode.builder().commonType("DS").commonCdId("10").commonCdNm("구성중").commonCdDesc("구성중").commonGroupCdId("DS0001")
                        .commonGroupCdNm("전시상태관리").commonGroupCdDesc("전시상태관리").commonSortSeq(1).commonCdEditYn("Y").useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonCodeRepository.save(
                CommonCode.builder().commonType("DS").commonCdId("20").commonCdNm("승인요청").commonCdDesc("승인요청").commonGroupCdId("DS0001")
                        .commonGroupCdNm("전시상태관리").commonGroupCdDesc("전시상태관리").commonSortSeq(2).commonCdEditYn("Y").useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonCodeRepository.save(
                CommonCode.builder().commonType("DS").commonCdId("30").commonCdNm("승인").commonCdDesc("승인").commonGroupCdId("DS0001")
                        .commonGroupCdNm("전시상태관리").commonGroupCdDesc("전시상태관리").commonSortSeq(3).commonCdEditYn("Y").useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonCodeRepository.save(
                CommonCode.builder().commonType("ST").commonCdId("10").commonCdNm("PC").commonCdDesc("PC").commonGroupCdId("ST0001")
                        .commonGroupCdNm("매체").commonGroupCdDesc("매체").commonSortSeq(1).commonCdEditYn("Y").useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonCodeRepository.save(
                CommonCode.builder().commonType("ST").commonCdId("20").commonCdNm("MOBILE").commonCdDesc("MOBILE").commonGroupCdId("ST0001")
                        .commonGroupCdNm("매체").commonGroupCdDesc("매체").commonSortSeq(2).commonCdEditYn("Y").useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );
    }
}
