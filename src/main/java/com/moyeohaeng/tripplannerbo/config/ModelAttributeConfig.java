package com.moyeohaeng.tripplannerbo.config;

import com.moyeohaeng.tripplannerbo.common.Constant;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeBoxReq;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@Configuration      // 설정파일만들때 사용(bean 설정을 담당하는 클래스)
@ControllerAdvice   // @Controller나 @RestController에서 발생한 예외를 한 곳에서 관리하고 처리할 수 있게 도와주는 어노테이션
                    // -> 전역 컨트롤러를 만듦
public class ModelAttributeConfig {

    @ModelAttribute(Constant.COMMONCODEBOXREQ_MODEL_ATTRIBUTE_NAME) // 도메인 객체나 DTO프로퍼티에 요청 파라미터를 한 번에 받을 수 있는 @ModelAttribute를 전역으로 사용
    public Class<CommonCodeBoxReq> CommonCodeReq() {
        return CommonCodeBoxReq.class;
    }

    @ModelAttribute(Constant.CONSTANT_MODEL_ATTRIBUTE_NAME)
    public Class<Constant> Constant() {return Constant.class;}
}
