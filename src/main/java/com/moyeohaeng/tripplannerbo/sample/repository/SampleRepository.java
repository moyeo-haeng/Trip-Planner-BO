package com.moyeohaeng.tripplannerbo.sample.repository;

import com.moyeohaeng.tripplannerbo.sample.domain.SampleModel;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

import static com.moyeohaeng.tripplannerbo.sample.domain.QSampleModel.sampleModel;
@Repository
@RequiredArgsConstructor
public class SampleRepository {
    private final JPAQueryFactory queryFactory;

    public List<SampleModel> sample(){

        List<SampleModel> result = queryFactory
                .select(Projections.fields(SampleModel.class, sampleModel.sampleNo, sampleModel.sampleNm))
                .from(sampleModel)
                .fetch();

        return result;
    }
}
