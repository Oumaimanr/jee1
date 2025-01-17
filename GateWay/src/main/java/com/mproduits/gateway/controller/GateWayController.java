package com.mproduits.gateway.controller;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GateWayController {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("books_route", r -> r.path("/gateway/api/books/")
                        .uri("lb://service-books"))
                .route("users_route", r -> r.path("/gateway/api/users/")
                        .uri("lb://service-users"))
                .route("loans_route", r -> r.path("/gateway/api/loans/")
                        .uri("lb://service-loans"))
                .route("reservations_route", r -> r.path("/gateway/api/reservations/")
                        .uri("lb://service-reservations"))
                .route("notifications_route", r -> r.path("/gateway/api/notifications/")
                        .uri("lb://service-notifications"))
                .route("statistics_route", r -> r.path("/gateway/api/statistics/")
                        .uri("lb://service-statistics"))
                .build();
    }
}