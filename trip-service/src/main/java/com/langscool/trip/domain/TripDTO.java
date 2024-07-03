package com.langscool.trip.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@NoArgsConstructor
@AllArgsConstructor
@Component
@Data
@Builder

public class TripDTO {
    
    private Long id;

    private String userId;

    private String destination;

    private String startDate;

    private String endDate;

    private String status;

    private String wGender;

    private String tStyle;

    private String tGoal;
}
