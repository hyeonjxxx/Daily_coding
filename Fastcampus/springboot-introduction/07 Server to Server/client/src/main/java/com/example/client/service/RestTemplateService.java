package com.example.client.service;

import com.example.client.dto.Req;
import com.example.client.dto.UserRequest;
import com.example.client.dto.UserResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class RestTemplateService {

    // http://localhost/api/server/hello
    // response
    public UserResponse hello(){

        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/hello")
                .queryParam("name", "steve")
                .queryParam("age", 10)
                .encode()
                .build()
                .toUri();

        System.out.println(uri.toString());

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> result = restTemplate.getForEntity(uri, UserResponse.class);
//        getForEntity, getForObject의 get은 가져오는 것이 아니라 http의 get메소드이다.
        System.out.println(result.getStatusCode());
        System.out.println(result.getBody());


        return result.getBody();
    }

    public void post() {
        // http://localhost:9090/api/server/user/{userId}/name/{userName}  >> 실제 사용x 예제

        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/user/{userId}/name/{userName}")
                .encode()
                .build()
                .expand(100, "david")
                .toUri();

        System.out.println(uri);

        // http body -> object -> object mapper -> json -> rest Template -> http body json
        UserRequest req = new UserRequest();
        req.setName("david");
        req.setAge(10);

        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<UserResponse> response = restTemplate.postForEntity(uri, req, UserResponse.class);
        ResponseEntity<String> response = restTemplate.postForEntity(uri, req, String.class);

        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
        System.out.println(response.getBody());

//        return response.getBody();
    }

    public UserResponse exchange(){
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/user/{userId}/name/{userName}")
                .encode()
                .build()
                .expand(100, "david")
                .toUri();

        System.out.println(uri);

        UserRequest req = new UserRequest();
        req.setName("david");
        req.setAge(10);

        RequestEntity<UserRequest> requestEntity = RequestEntity
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-autorization", "abcd")
                .header("custom-header", "fffff")
                .body(req);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> response = restTemplate.exchange(requestEntity, UserResponse.class);
        return response.getBody();
    }

    public UserResponse genericExchange(){
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/user/{userId}/name/{userName}")
                .encode()
                .build()
                .expand(100, "david")
                .toUri();

        System.out.println(uri);

        UserRequest userRequest = new UserRequest();
        userRequest.setName("david");
        userRequest.setAge(10);

        Req<UserRequest> req = new Req<UserRequest>();
        req.setHeader(
                    new Req.Header()
        );

        req.setResBody(
                userRequest
        );

        RequestEntity<Req<UserRequest>> requestEntity = RequestEntity
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-autorization", "abcd")
                .header("custom-header", "fffff")
                .body(req);

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Req<UserResponse>> response
                = restTemplate.exchange(requestEntity, new ParameterizedTypeReference<Req<UserResponse>>(){});

        return response.getBody().getResBody();

    }

}
