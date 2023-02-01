package com.moyeohaeng.tripplannerbo.sample.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class SampleModel {

    @Id
    private String sampleNo;

    private String sampleNm;
}
