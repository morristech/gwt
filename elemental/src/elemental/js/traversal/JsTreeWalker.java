/*
 * Copyright 2012 Google Inc.
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
package elemental.js.traversal;
import elemental.dom.Node;
import elemental.traversal.NodeFilter;
import elemental.traversal.TreeWalker;
import elemental.js.dom.JsNode;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;

import elemental.events.*;
import elemental.util.*;
import elemental.dom.*;
import elemental.html.*;
import elemental.css.*;
import elemental.js.stylesheets.*;
import elemental.js.events.*;
import elemental.js.util.*;
import elemental.js.dom.*;
import elemental.js.html.*;
import elemental.js.css.*;
import elemental.js.stylesheets.*;

import java.util.Date;

public class JsTreeWalker extends JsElementalMixinBase  implements TreeWalker {
  protected JsTreeWalker() {}

  public final native JsNode getCurrentNode() /*-{
    return this.currentNode;
  }-*/;

  public final native void setCurrentNode(Node param_currentNode) /*-{
    this.currentNode = param_currentNode;
  }-*/;

  public final native boolean isExpandEntityReferences() /*-{
    return this.expandEntityReferences;
  }-*/;

  public final native JsNodeFilter getFilter() /*-{
    return this.filter;
  }-*/;

  public final native JsNode getRoot() /*-{
    return this.root;
  }-*/;

  public final native int getWhatToShow() /*-{
    return this.whatToShow;
  }-*/;

  public final native JsNode firstChild() /*-{
    return this.firstChild();
  }-*/;

  public final native JsNode lastChild() /*-{
    return this.lastChild();
  }-*/;

  public final native JsNode nextNode() /*-{
    return this.nextNode();
  }-*/;

  public final native JsNode nextSibling() /*-{
    return this.nextSibling();
  }-*/;

  public final native JsNode parentNode() /*-{
    return this.parentNode();
  }-*/;

  public final native JsNode previousNode() /*-{
    return this.previousNode();
  }-*/;

  public final native JsNode previousSibling() /*-{
    return this.previousSibling();
  }-*/;
}
