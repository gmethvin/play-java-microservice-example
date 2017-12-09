package com.example.myservice;

import java.util.concurrent.atomic.AtomicInteger;

import javax.inject.Singleton;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

@Singleton
public class MyServiceController extends Controller {

  private AtomicInteger counter = new AtomicInteger();

  /**
   * An action that returns some JSON with a welcome message
   */
  public Result index() {
    return ok(Json.toJson(new WelcomeMessage("Hello World!")));
  }

  /**
   * An action that responds with current count.
   */
  public Result count() {
    return ok(Json.toJson(new CountMessage(counter.incrementAndGet())));
  }

  public class WelcomeMessage {
    public final String message;
    public WelcomeMessage(String message) {
      this.message = message;
    }
  }

  public class CountMessage {
    public final int count;
    public CountMessage(int count) {
      this.count = count;
    }
  }


}
