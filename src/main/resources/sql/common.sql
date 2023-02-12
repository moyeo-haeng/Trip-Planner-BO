CREATE TABLE `COMMON_GROUP_CODE` (
  `COMMON_GRP_CD_NO` bigint PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '그룹 공통 코드 테이블 no',
  `COMMON_TYPE` varchar(20) NOT NULL COMMENT '담당 부서 TYPE',
  `COMMON_GRP_CD_ID` varchar(255) NOT NULL COMMENT '그룹 공통 코드 id',
  `COMMON_GRP_CD_NM` varchar(255) NOT NULL COMMENT '그룹 공통 코드 이름',
  `COMMON_GRP_CD_DESC` varchar(255) COMMENT 'GROUP 공통 코드 설명',
  `COMMON_SORT_SEQ` int DEFAULT (1) COMMENT '정렬 순서',
  `REG_ID` varchar(255) NOT NULL COMMENT '등록 id',
  `REG_DTIME` datetime NOT NULL DEFAULT (now()) COMMENT '등록일자',
  `UPT_ID` varchar(255) COMMENT '수정 id',
  `UPT_DTIME` datetime COMMENT '수정일자',
  `USE_YN` varchar(1) NOT NULL DEFAULT 'Y' CHECK (USE_YN IN ('Y', 'N')) COMMENT '사용 여부'
) COMMENT '그룹 공통 코드';

CREATE TABLE `COMMON_CODE` (
  `COMMON_CD_NO` bigint PRIMARY KEY NOT NULL AUTO_INCREMENT COMMENT '공통 코드 테이블 no',
  `COMMON_GRP_CD_NO` bigint NOT NULL COMMENT '그룹 공통 코드 id', # COMMON_GROUP_CODE.COMMON_GRP_CD_NO
  `COMMON_CD_ID` varchar(255) NOT NULL COMMENT '공통 코드 id',
  `COMMON_CD_NM` varchar(255) NOT NULL COMMENT '공통 코드 이름',
  `COMMON_CD_DESC` varchar(255) COMMENT '공통 코드 설명',
  `COMMON_TYPE_CD1` varchar(255) COMMENT '사용 구분자 1',
  `COMMON_TYPE_CD2` varchar(255) COMMENT '사용 구분자 2',
  `COMMON_TYPE_CD3` varchar(255) COMMENT '사용 구분자 3',
  `COMMON_SORT_SEQ` int DEFAULT (1) COMMENT '정렬 순서',
  `REG_ID` varchar(255) NOT NULL COMMENT '등록 id',
  `REG_DTIME` datetime NOT NULL DEFAULT (now()) COMMENT '등록일자',
  `UPT_ID` varchar(255) COMMENT '수정 id',
  `UPT_DTIME` datetime COMMENT '수정일자',
  `USE_YN` varchar(1) NOT NULL DEFAULT 'Y' CHECK (USE_YN IN ('Y', 'N')) COMMENT '사용 여부'
) COMMENT '상세 공통 코드';

CREATE TABLE `MENU` (
  `MENU_NO` bigint PRIMARY KEY auto_increment COMMENT '메뉴번호',
  `MENU_NAME` varchar(255) COMMENT '메뉴이름',
  `MENU_URL` varchar(255) COMMENT '메뉴주소값',
  `MENU_SEQ` int COMMENT '메뉴순번',
  `MENU_PARENT_NO` varchar(255) COMMENT '메뉴부모번호',
  `SITE_DIVI_CD` varchar(255) COMMENT '사이트구분코드',
  `USE_YN` varchar(255) NOT NULL DEFAULT 'Y' COMMENT '사용 여부',
  `REG_ID` varchar(255) NOT NULL COMMENT '등록 id',
  `REG_DTIME` datetime NOT NULL DEFAULT (now()) COMMENT '등록일시',
  `UPT_ID` varchar(255) COMMENT '수정 id',
  `UPT_DTIME` datetime COMMENT '수정일시'
);
