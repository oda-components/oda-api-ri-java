package com.odac.tmfapi.tmf676.oapi.controller;

import com.odac.tmfapi.tmf676.oapi.model.Error;
import com.odac.tmfapi.tmf676.oapi.model.Refund;
import com.odac.tmfapi.tmf676.oapi.model.RefundCreate;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link RefundApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
public interface RefundApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /refund : Creates a Refund
     * This operation creates a Refund entity.
     *
     * @param refund The Refund to be created (required)
     * @return Created (status code 201)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     * @see RefundApi#createRefund
     */
    default ResponseEntity<Refund> createRefund(RefundCreate refund) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\", \"amount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"authorizationCode\" : \"authorizationCode\", \"@type\" : \"@type\", \"channel\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"description\" : \"description\", \"requestor\" : { \"@referredType\" : \"@referredType\", \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"totalAmount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"@baseType\" : \"@baseType\", \"name\" : \"name\", \"paymentMethod\" : { \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\", \"@referredType\" : \"@referredType\", \"validFor\" : { \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\" }, \"@type\" : \"@type\", \"description\" : \"description\", \"isPreferred\" : true, \"relatedParty\" : { \"@referredType\" : \"@referredType\", \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"@baseType\" : \"@baseType\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"account\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" } ], \"status\" : \"status\" }, \"correlatorId\" : \"correlatorId\", \"payment\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"id\" : \"id\", \"href\" : \"href\", \"taxAmount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"@schemaLocation\" : \"https://openapi-generator.tech\", \"refundDate\" : \"2000-01-23T04:56:07.000+00:00\", \"account\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /refund : List or find Refund objects
     * This operation list or find Refund entities
     *
     * @param fields Comma-separated properties to be provided in response (optional)
     * @param offset Requested index for start of resources to be provided in response (optional)
     * @param limit Requested number of resources to be provided in response (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     * @see RefundApi#listRefund
     */
    default ResponseEntity<List<Refund>> listRefund(String fields,
        Integer offset,
        Integer limit) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "[ { \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\", \"amount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"authorizationCode\" : \"authorizationCode\", \"@type\" : \"@type\", \"channel\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"description\" : \"description\", \"requestor\" : { \"@referredType\" : \"@referredType\", \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"totalAmount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"@baseType\" : \"@baseType\", \"name\" : \"name\", \"paymentMethod\" : { \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\", \"@referredType\" : \"@referredType\", \"validFor\" : { \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\" }, \"@type\" : \"@type\", \"description\" : \"description\", \"isPreferred\" : true, \"relatedParty\" : { \"@referredType\" : \"@referredType\", \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"@baseType\" : \"@baseType\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"account\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" } ], \"status\" : \"status\" }, \"correlatorId\" : \"correlatorId\", \"payment\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"id\" : \"id\", \"href\" : \"href\", \"taxAmount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"@schemaLocation\" : \"https://openapi-generator.tech\", \"refundDate\" : \"2000-01-23T04:56:07.000+00:00\", \"account\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"status\" : \"status\" }, { \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\", \"amount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"authorizationCode\" : \"authorizationCode\", \"@type\" : \"@type\", \"channel\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"description\" : \"description\", \"requestor\" : { \"@referredType\" : \"@referredType\", \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"totalAmount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"@baseType\" : \"@baseType\", \"name\" : \"name\", \"paymentMethod\" : { \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\", \"@referredType\" : \"@referredType\", \"validFor\" : { \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\" }, \"@type\" : \"@type\", \"description\" : \"description\", \"isPreferred\" : true, \"relatedParty\" : { \"@referredType\" : \"@referredType\", \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"@baseType\" : \"@baseType\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"account\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" } ], \"status\" : \"status\" }, \"correlatorId\" : \"correlatorId\", \"payment\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"id\" : \"id\", \"href\" : \"href\", \"taxAmount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"@schemaLocation\" : \"https://openapi-generator.tech\", \"refundDate\" : \"2000-01-23T04:56:07.000+00:00\", \"account\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"status\" : \"status\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /refund/{id} : Retrieves a Refund by ID
     * This operation retrieves a Refund entity. Attribute selection is enabled for all first level attributes.
     *
     * @param id Identifier of the Refund (required)
     * @param fields Comma-separated properties to provide in response (optional)
     * @return Success (status code 200)
     *         or Bad Request (status code 400)
     *         or Unauthorized (status code 401)
     *         or Forbidden (status code 403)
     *         or Not Found (status code 404)
     *         or Method Not allowed (status code 405)
     *         or Conflict (status code 409)
     *         or Internal Server Error (status code 500)
     * @see RefundApi#retrieveRefund
     */
    default ResponseEntity<Refund> retrieveRefund(String id,
        String fields) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\", \"amount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"authorizationCode\" : \"authorizationCode\", \"@type\" : \"@type\", \"channel\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"description\" : \"description\", \"requestor\" : { \"@referredType\" : \"@referredType\", \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"totalAmount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"@baseType\" : \"@baseType\", \"name\" : \"name\", \"paymentMethod\" : { \"statusDate\" : \"2000-01-23T04:56:07.000+00:00\", \"@referredType\" : \"@referredType\", \"validFor\" : { \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\", \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\" }, \"@type\" : \"@type\", \"description\" : \"description\", \"isPreferred\" : true, \"relatedParty\" : { \"@referredType\" : \"@referredType\", \"role\" : \"role\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"@baseType\" : \"@baseType\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"account\" : [ { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" } ], \"status\" : \"status\" }, \"correlatorId\" : \"correlatorId\", \"payment\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"id\" : \"id\", \"href\" : \"href\", \"taxAmount\" : { \"unit\" : \"unit\", \"value\" : 0.8008282 }, \"@schemaLocation\" : \"https://openapi-generator.tech\", \"refundDate\" : \"2000-01-23T04:56:07.000+00:00\", \"account\" : { \"@referredType\" : \"@referredType\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"name\" : \"name\", \"description\" : \"description\", \"id\" : \"id\", \"href\" : \"href\", \"@schemaLocation\" : \"https://openapi-generator.tech\" }, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json;charset=utf-8"))) {
                    String exampleString = "{ \"reason\" : \"reason\", \"code\" : \"code\", \"@baseType\" : \"@baseType\", \"@type\" : \"@type\", \"message\" : \"message\", \"referenceError\" : \"https://openapi-generator.tech\", \"@schemaLocation\" : \"https://openapi-generator.tech\", \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json;charset=utf-8", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}