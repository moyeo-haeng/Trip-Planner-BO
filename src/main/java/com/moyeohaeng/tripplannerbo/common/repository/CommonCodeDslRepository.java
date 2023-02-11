package com.moyeohaeng.tripplannerbo.common.repository;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import com.moyeohaeng.tripplannerbo.common.domain.CommonGroupCode;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeBoxReq;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeBoxRes;
import com.querydsl.core.types.Projections;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.thymeleaf.util.StringUtils;

import java.util.List;

import static com.moyeohaeng.tripplannerbo.common.domain.QCommonCode.commonCode;
import static com.moyeohaeng.tripplannerbo.common.domain.QCommonDetailCode.commonDetailCode;
import static com.moyeohaeng.tripplannerbo.common.domain.QCommonGroupCode.commonGroupCode;


@Repository
@RequiredArgsConstructor
public class CommonCodeDslRepository {

    private final JPAQueryFactory queryFactory;

    public List<CommonCodeBoxRes> searchCommonCode(CommonCodeBoxReq parameter){

        List<CommonCodeBoxRes> result = queryFactory
                .select(Projections.fields(CommonCodeBoxRes.class, commonDetailCode, commonGroupCode))
                .from(commonDetailCode)
                .join(commonGroupCode)
                .on(commonDetailCode.commonGrpCdNo.eq(commonGroupCode.commonGrpCdNo))
                .where(
                        eqCommonCdId(parameter.getCommonCdId()),
                        eqCommonGrpCdId(parameter.getCommonGrpCdId()),
                        eqCommonTypeCd1(parameter.getCommonTypeCd1()),
                        eqCommonTypeCd2(parameter.getCommonTypeCd2()),
                        eqCommonTypeCd3(parameter.getCommonTypeCd3())
                )
                .fetch();

        return result;
    }

    private BooleanExpression eqCommonCdId(String commonCdId){
        if(StringUtils.isEmpty(commonCdId)) return null;
        return commonDetailCode.commonCdId.eq(commonCdId);
    }
    private BooleanExpression eqCommonGrpCdId(String commonGrpCdId){
        if(StringUtils.isEmpty(commonGrpCdId)) return null;
        return commonGroupCode.commonGrpCdId.eq(commonGrpCdId);
    }
    private BooleanExpression eqCommonTypeCd1(String commonTypeCd1){
        if(StringUtils.isEmpty(commonTypeCd1)) return null;
        return commonDetailCode.commonTypeCd1.eq(commonTypeCd1);
    }
    private BooleanExpression eqCommonTypeCd2(String commonTypeCd2){
        if(StringUtils.isEmpty(commonTypeCd2)) return null;
        return commonDetailCode.commonTypeCd2.eq(commonTypeCd2);
    }
    private BooleanExpression eqCommonTypeCd3(String commonTypeCd3){
        if(StringUtils.isEmpty(commonTypeCd3)) return null;
        return commonDetailCode.commonCdId.eq(commonTypeCd3);
    }
}
