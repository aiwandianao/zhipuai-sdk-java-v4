package com.zhipu.oapi.service.v4.fine_turning;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


/**
 * Request to create a fine tuning job
 * https://platform.openai.com/docs/api-reference/fine-tuning/create
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class QueryPersonalFineTuningJobRequest {

    private Integer limit;

    private String after;



}
