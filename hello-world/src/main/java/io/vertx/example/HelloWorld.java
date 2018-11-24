package io.vertx.example;

import io.vertx.core.Vertx;

/**
 * @author Kishore Tulsiani
 */
public class HelloWorld {

  public static void main(String[] args) {

    // Create an HTTP server which simply returns "Hello World!" to each request.
    Vertx.vertx()
      .createHttpServer()
      .requestHandler(req -> {
        System.out.printf("Responding with Hello World!");
        req.response().end("Hello World!");
      })
      .listen(8080);
  }
}
