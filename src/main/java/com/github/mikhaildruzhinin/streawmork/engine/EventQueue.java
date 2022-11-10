package com.github.mikhaildruzhinin.streawmork.engine;

import java.util.concurrent.ArrayBlockingQueue;

import com.github.mikhaildruzhinin.streawmork.api.Event;

/**
 * This is the class for intemediate event queues between processes.
 */
public class EventQueue extends ArrayBlockingQueue<Event> {
  private static final long serialVersionUID = 3673430816396878407L;

  public EventQueue(int size) {
      super(size);
  }
}
