/*
 * All content copyright Terracotta, Inc., unless otherwise indicated. All rights reserved.
 */
package org.terracotta.corestorage;

public interface Retriever<T> {
  
  T retrieve();
}
