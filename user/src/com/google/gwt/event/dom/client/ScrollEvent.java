/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.event.dom.client;

import com.google.gwt.dom.client.BrowserEvents;

/**
 * Represents a native scroll event.
 */
public class ScrollEvent extends DomEvent<ScrollHandler> {

  /**
   * Event type for scroll events. Represents the meta-data associated with this
   * event.
   */
  private static final Type<ScrollHandler> TYPE = new Type<ScrollHandler>(
      BrowserEvents.SCROLL, new ScrollEvent());

  /**
   * Gets the event type associated with scroll events.
   * 
   * @return the handler type
   */
  public static Type<ScrollHandler> getType() {
    return TYPE;
  }

  /**
   * Protected constructor, use
   * {@link DomEvent#fireNativeEvent(com.google.gwt.dom.client.NativeEvent, com.google.gwt.event.shared.HasHandlers)}
   * to fire scroll events.
   */
  protected ScrollEvent() {
  }

  @Override
  public final Type<ScrollHandler> getAssociatedType() {
    return TYPE;
  }

  @Override
  protected void dispatch(ScrollHandler handler) {
    handler.onScroll(this);
  }

}
