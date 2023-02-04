package com.moyeohaeng.tripplannerbo.config;

import com.moyeohaeng.tripplannerbo.P6spyPrettySqlFormatter;
import com.p6spy.engine.spy.P6SpyOptions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Configuration
public class QuerydslConfiguration {

    // 환경설정파일 (프로젝트 어디에서든 JPAQuery를 받아 queryDSl을 사용하기 위함)
    // EntityManager를 빈으로 등록 후, JPAQueryFactory 생성
    @PersistenceContext
    private EntityManager entityManager;

    @Bean
    public JPAQueryFactory jpaQueryFactory() {
        return new JPAQueryFactory(entityManager);
    }

    // 쿼리 로그 이쁘게 찍기
    @PostConstruct
    public void setLogMessageFormat() {
        P6SpyOptions.getActiveInstance().setLogMessageFormat(P6spyPrettySqlFormatter.class.getName());
    }
}
