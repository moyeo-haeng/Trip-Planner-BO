package com.moyeohaeng.tripplannerbo.common.repository;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeReq;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeRes;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.moyeohaeng.tripplannerbo.common.domain.QCommonCode.commonCode;

@Repository
@RequiredArgsConstructor
public class CommonRepository {

    private final JPAQueryFactory queryFactory;

    public List<CommonCodeRes> searchCommonCode(CommonCode parameter){

        List<CommonCodeRes> result = queryFactory
                .select(Projections.fields(CommonCodeRes.class, commonCode))
                .from(commonCode)
                .where(commonCode.commonGroupCdId.eq(parameter.getCommonGroupCdId()))
                .fetch();

        return result;
    }
}
