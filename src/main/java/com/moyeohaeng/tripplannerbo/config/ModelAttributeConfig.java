package com.moyeohaeng.tripplannerbo.config;

import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeReq;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@Configuration      // 설정파일만들때 사용(bean 설정을 담당하는 클래스)
@ControllerAdvice   // @Controller나 @RestController에서 발생한 예외를 한 곳에서 관리하고 처리할 수 있게 도와주는 어노테이션
public class ModelAttributeConfig {

    @ModelAttribute("CommonCodeReq")
    public Class<CommonCodeReq> CommonCodeReq() {
        return CommonCodeReq.class;
    }
}
