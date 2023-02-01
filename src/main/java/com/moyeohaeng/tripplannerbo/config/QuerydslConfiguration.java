package com.moyeohaeng.tripplannerbo.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
}
