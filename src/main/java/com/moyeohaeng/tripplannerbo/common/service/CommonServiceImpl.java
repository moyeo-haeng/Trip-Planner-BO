package com.moyeohaeng.tripplannerbo.common.service;

import com.moyeohaeng.tripplannerbo.common.domain.CommonDetailCode;
import com.moyeohaeng.tripplannerbo.common.domain.CommonGroupCode;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonDetailCodeSaveRequest;
import com.moyeohaeng.tripplannerbo.common.domain.request.CommonGroupCodeSaveRequest;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonDetailCodeResponse;
import com.moyeohaeng.tripplannerbo.common.domain.response.CommonGroupCodeResponse;
import com.moyeohaeng.tripplannerbo.common.repository.CommonDetailCodeRepository;
import com.moyeohaeng.tripplannerbo.common.repository.CommonGroupCodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CommonServiceImpl implements CommonService {

    private final CommonGroupCodeRepository commonGroupCodeRepository;
    private final CommonDetailCodeRepository commonDetailCodeRepository;

    @Transactional
    public Long save(CommonDetailCodeSaveRequest commonDetailCodeRequest) {
        return commonDetailCodeRepository.save(commonDetailCodeRequest.toEntity()).getCommonCdNo();
    }

    @Transactional
    public Long save(CommonGroupCodeSaveRequest commonGroupCodeRequest) {
        return commonGroupCodeRepository.save(commonGroupCodeRequest.toEntity()).getCommonGrpCdNo();
    }

    @Transactional(readOnly = true)
    public List<CommonGroupCodeResponse> findAllCommonGroupCode() {
        return commonGroupCodeRepository.findAllCommonGroupCode().stream()
                .map(CommonGroupCodeResponse::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<CommonDetailCodeResponse> findAllCommonDetailCode() {
        return commonDetailCodeRepository.findAllCommonDetailCode().stream()
                .map(CommonDetailCodeResponse::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public CommonGroupCodeResponse findCommGrpByNo(long commonGrpCdNo) {
        CommonGroupCode entity = commonGroupCodeRepository.findById(commonGrpCdNo)
                .orElseThrow(() -> new IllegalArgumentException("없음 : " + commonGrpCdNo));
        return new CommonGroupCodeResponse(entity);
    }

    @Transactional(readOnly = true)
    public CommonGroupCodeResponse findCommGrpByCommonGrpCdId (String commonGrpCdId) {
        CommonGroupCode entity = commonGroupCodeRepository.findCommonGroupCodeByCommonGrpCdId(commonGrpCdId)
                .orElseThrow(() -> new IllegalArgumentException("없음 : " + commonGrpCdId));
        return new CommonGroupCodeResponse(entity);
    }

    @Transactional(readOnly = true)
    public CommonGroupCodeResponse findCommGrpByCommonGrpCdNm (String commonGrpCdNm) {
        CommonGroupCode entity = commonGroupCodeRepository.findCommonGroupCodeByCommonGrpCdNm(commonGrpCdNm)
                .orElseThrow(() -> new IllegalArgumentException("없음 : " + commonGrpCdNm));
        return new CommonGroupCodeResponse(entity);
    }

    @Transactional(readOnly = true)
    public CommonDetailCodeResponse findCommDtlByNo(long commonCdNo) {
        CommonDetailCode entity = commonDetailCodeRepository.findById(commonCdNo)
                .orElseThrow(() -> new IllegalArgumentException("없음 : " + commonCdNo));
        return new CommonDetailCodeResponse(entity);
    }

    @Transactional(readOnly = true)
    public CommonDetailCodeResponse findCommDtlByCommonCdId (String commonCdId) {
        CommonDetailCode entity = commonDetailCodeRepository.findCommonDetailCodeByCommonCdId(commonCdId)
                .orElseThrow(() -> new IllegalArgumentException("없음 : " + commonCdId));
        return new CommonDetailCodeResponse(entity);
    }

    @Transactional(readOnly = true)
    public CommonDetailCodeResponse findCommDtlByCommonCdNm (String commonCdNm) {
        CommonDetailCode entity = commonDetailCodeRepository.findCommonDetailCodeByCommonCdNm(commonCdNm)
                .orElseThrow(() -> new IllegalArgumentException("없음 : " + commonCdNm));
        return new CommonDetailCodeResponse(entity);
    }

}
