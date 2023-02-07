package com.moyeohaeng.tripplannerbo.common;

public class Constant {

    private Constant(){}

    public static final String COMMONCODEBOXREQ_MODEL_ATTRIBUTE_NAME = "CommonCodeBoxReq";
    public static final String CONSTANT_MODEL_ATTRIBUTE_NAME = "Constant";

    public static final String DS_DISP_STAT_CD 			= "DS0011";	//진행상태코드
    public static final String DS_DISP_STAT_CD_ING 		= "00";		//진행상태코드 - 구성중
    public static final String DS_DISP_STAT_CD_REQ 		= "10";		//진행상태코드 - 승인요청
    public static final String DS_DISP_STAT_CD_APPROVAL = "40"; 	//진행상태코드 - 승인
    public static final String DS_DISP_STAT_CD_STOP		= "50"; 	//진행상태코드 - 일시중지
    public static final String DS_DISP_STAT_CD_RET		= "90";		//진행상태코드 - 반려
}
