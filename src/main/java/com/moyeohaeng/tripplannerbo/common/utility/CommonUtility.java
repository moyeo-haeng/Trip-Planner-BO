package com.moyeohaeng.tripplannerbo.common.utility;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import com.moyeohaeng.tripplannerbo.common.domain.CommonDetailCode;
import com.moyeohaeng.tripplannerbo.common.domain.CommonGroupCode;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeBoxReq;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeBoxRes;
import com.moyeohaeng.tripplannerbo.common.repository.CommonCodeDslRepository;
import com.moyeohaeng.tripplannerbo.common.repository.CommonDetailCodeRepository;
import com.moyeohaeng.tripplannerbo.common.repository.CommonGroupCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.List;

public class CommonUtility {

    @Autowired
    private CommonCodeDslRepository commonCodeDslRepository;
    @Autowired
    private CommonGroupCodeRepository commonGroupCodeRepository;
    @Autowired
    private CommonDetailCodeRepository commonDetailCodeRepository;

    public final List<CommonCodeBoxRes> searchCommonCode(CommonCodeBoxReq parameter) {
        return commonCodeDslRepository.searchCommonCode(parameter);
    }


    //테스트 데이터 저장(임시)
    public void test(){

        // 이거 먼저 돌려서 그룹코드 만들어놓고 상세코드 만들어야대..

/*        commonGroupCodeRepository.save(
                CommonGroupCode.builder().commonType("DS").commonGrpCdId("DS0001").commonGrpCdNm("전시상태관리").commonGrpCdDesc("전시상태관리").commonSortSeq(1)
                        .useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonGroupCodeRepository.save(
                CommonGroupCode.builder().commonType("ST").commonGrpCdId("ST0001").commonGrpCdNm("매체").commonGrpCdDesc("매체").commonSortSeq(1)
                        .useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );*/

        commonDetailCodeRepository.save(
                CommonDetailCode.builder().commonGrpCdNo(1).commonCdId("10").commonCdNm("구성중").commonCdDesc("구성중").commonTypeCd1("Y")
                        .useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonDetailCodeRepository.save(
                CommonDetailCode.builder().commonGrpCdNo(1).commonCdId("11").commonCdNm("승인요청").commonCdDesc("승인요청").commonTypeCd1("N")
                        .useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonDetailCodeRepository.save(
                CommonDetailCode.builder().commonGrpCdNo(1).commonCdId("12").commonCdNm("승인").commonCdDesc("승인").commonTypeCd1("Y")
                        .useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonDetailCodeRepository.save(
                CommonDetailCode.builder().commonGrpCdNo(1).commonCdId("13").commonCdNm("반려").commonCdDesc("반려").commonTypeCd1("N")
                        .useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonDetailCodeRepository.save(
                CommonDetailCode.builder().commonGrpCdNo(2).commonCdId("20").commonCdNm("PC").commonCdDesc("PC").commonTypeCd1("Y")
                        .useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonDetailCodeRepository.save(
                CommonDetailCode.builder().commonGrpCdNo(2).commonCdId("21").commonCdNm("MOBILE").commonCdDesc("MOBILE").commonTypeCd3("Y")
                        .useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );

        commonDetailCodeRepository.save(
                CommonDetailCode.builder().commonGrpCdNo(2).commonCdId("22").commonCdNm("APP").commonCdDesc("APP").commonTypeCd3("Y")
                        .useYn("Y").regId("ldw0503").regDtime(LocalDateTime.now())
                        .build()
        );


    }
}
