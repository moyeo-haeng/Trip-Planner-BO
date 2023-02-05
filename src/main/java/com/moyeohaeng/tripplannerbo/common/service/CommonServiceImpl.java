package com.moyeohaeng.tripplannerbo.common.service;

import com.moyeohaeng.tripplannerbo.common.domain.CommonCode;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonCodeSaveRequest;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonCodeResponse;
import com.moyeohaeng.tripplannerbo.common.repository.CommonCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class CommonServiceImpl implements CommonService {

    private final CommonCodeRepository commonCodeRepository;

    @Transactional
    public Long save(CommonCodeSaveRequest commonCodeRequest) {
        return commonCodeRepository.save(commonCodeRequest.toEntity()).getCommonNo();
    }

    public CommonCodeResponse findByNo(long commonNo) {
        CommonCode entity = commonCodeRepository.findById(commonNo)
                .orElseThrow(() -> new IllegalArgumentException("없음 : " + commonNo));
        return new CommonCodeResponse(entity);
    }

    @Transactional
    public CommonCodeResponse findCommonCodeByCommonCdId(String commonCdId) {
        CommonCodeResponse commonCode = new CommonCodeResponse(commonCodeRepository.findCommonCodeByCommonCdId(commonCdId));
        return commonCode;
    }

}
