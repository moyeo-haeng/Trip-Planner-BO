package com.moyeohaeng.tripplannerbo.common.repository;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeBoxRes;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.moyeohaeng.tripplannerbo.common.domain.QCommonCode.commonCode;

@Repository
@RequiredArgsConstructor
public class CommonCodeDslRepository {

    private final JPAQueryFactory queryFactory;

    public List<CommonCodeBoxRes> searchCommonCode(CommonCode parameter){

        List<CommonCodeBoxRes> result = queryFactory
                .select(Projections.fields(CommonCodeBoxRes.class, commonCode))
                .from(commonCode)
                .where(commonCode.commonGroupCdId.eq(parameter.getCommonGroupCdId()))
                .fetch();

        return result;
    }
}
