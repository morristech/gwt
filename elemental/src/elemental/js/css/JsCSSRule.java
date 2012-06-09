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
package elemental.js.css;
import elemental.css.CSSStyleSheet;
import elemental.css.CSSRule;

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

public class JsCSSRule extends JsElementalMixinBase  implements CSSRule {
  protected JsCSSRule() {}

  public final native String getCssText() /*-{
    return this.cssText;
  }-*/;

  public final native void setCssText(String param_cssText) /*-{
    this.cssText = param_cssText;
  }-*/;

  public final native JsCSSRule getParentRule() /*-{
    return this.parentRule;
  }-*/;

  public final native JsCSSStyleSheet getParentStyleSheet() /*-{
    return this.parentStyleSheet;
  }-*/;

  public final native int getType() /*-{
    return this.type;
  }-*/;
}
