package com.moyeohaeng.tripplannerbo.sample.service;

import com.moyeohaeng.tripplannerbo.sample.domain.SampleModel;
import com.moyeohaeng.tripplannerbo.sample.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleService {

    private final SampleRepository sampleRepository;

    public List<SampleModel> sample(){
        return sampleRepository.sample();
    }

}
