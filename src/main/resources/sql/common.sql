CREATE TABLE `COMMON_CODE` (
    `COMMON_NO` bigint PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '공통 테이블 no',
    `COMMON_TYPE` varchar(20) NOT NULL COMMENT '담당 부서 TYPE',
    `COMMON_CD_ID` varchar(255) NOT NULL UNIQUE COMMENT '공통 코드 id',
    `COMMON_CD_NM` varchar(255) NOT NULL COMMENT '공통 코드 이름',
    `COMMON_CD_DESC` varchar(255) NOT NULL COMMENT '공통 코드 설명',
    `COMMON_GROUP_CD_ID` varchar(255) NOT NULL COMMENT 'GROUP 공통 코드 id',
    `COMMON_GROUP_CD_NM` varchar(255) NOT NULL COMMENT 'GROUP 공통 코드 이름',
    `COMMON_GROUP_CD_DESC` varchar(255) NOT NULL COMMENT 'GROUP 공통 코드 설명',
    `COMMON_SORT_SEQ` int DEFAULT (1) COMMENT '정렬 순서',
    `COMMON_CD_EDIT_YN` varchar(2) NOT NULL DEFAULT 'Y' COMMENT '수정 가능 여부',
    `USE_YN` varchar(2) NOT NULL DEFAULT 'Y' COMMENT '사용 여부',
    `REG_ID` varchar(255) NOT NULL COMMENT '등록 id',
    `REG_DTIME` datetime NOT NULL DEFAULT (now()) COMMENT '등록일자',
    `UPT_ID` varchar(255) COMMENT '수정 id',
    `UPT_DTIME` datetime COMMENT '수정일자'
) COMMENT '공통 코드';

drop table common_code;