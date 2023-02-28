package com.egorKorolyov.mai.weather.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CurrentResponseDto implements Serializable {

    LocationDto location;

    CurrentDto current;

}
