package com.github.mikhaildruzhinin.streawmork.engine;

/**
 * A util data class for connections between components.
 */
class Connection {
  public final ComponentExecutor from;
  public final OperatorExecutor to;

  public Connection(ComponentExecutor from, OperatorExecutor to) {
    this.from = from;
    this.to = to;
  }
}
