package com.spring.react;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FluxMonoGenerativeService {

    //Flux : response could be any number from 0 to N -> any number
    //Mono : single -> either 0 or 1 response

    public static void main(String[] args) {
//        FluxMonoGenerativeService service = new FluxMonoGenerativeService();
//        service.namesFlux(); //publisher
//        service.namesFlux().subscribe(s -> System.out.println(s));
//        service.nameMono().subscribe(s -> System.out.println(s));

        Flux<String> flux1 = Flux.just("A", "B", "C", "D");
        Flux<Integer> flux2 = Flux.just(1,2,3,4);

        Flux.zip(flux1, flux2, flux1, flux2).subscribe(tuple -> System.out.println(tuple.getT1() + " " +
                tuple.getT2()));
    }

    public Flux<String> namesFlux(){
        return Flux.fromIterable(List.of("John", "Peter"))
                .map(String::toUpperCase)
                .log();
    }

    public Mono<String> nameMono(){
        return Mono.just("Zack").log();
    }


}
