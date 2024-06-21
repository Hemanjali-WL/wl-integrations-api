package org.wellnessliving.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wellnessliving.response.ResponseBase;

import java.util.List;

@RestController
@RequestMapping("/api/integrations")
public class WLIntegrationController {

    @GetMapping("/info")
    @Operation(
            operationId = "info",
            description = "info endpoint"
    )
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = {@Content(schema = @Schema(implementation = ResponseBase.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "400", content = {@Content(schema = @Schema(implementation = ResponseBase.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "401", content = {@Content(schema = @Schema(implementation = ResponseBase.class), mediaType = MediaType.APPLICATION_JSON_VALUE)}),
            @ApiResponse(responseCode = "500", content = {@Content(schema = @Schema(implementation = ResponseBase.class), mediaType = MediaType.APPLICATION_JSON_VALUE)})
    })
    public ResponseEntity<ResponseBase<Object>> info() {
        ResponseBase<Object> response = ResponseBase.builder().valid(true)
                .messages(null).data("WL Integrations API").build();
        return ResponseEntity.ok(response);
    }
}
