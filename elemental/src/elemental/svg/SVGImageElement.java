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
package elemental.svg;

import elemental.events.*;
import elemental.util.*;
import elemental.dom.*;
import elemental.html.*;
import elemental.css.*;
import elemental.stylesheets.*;

import java.util.Date;

/**
  * The <code>SVGImageElement</code> interface corresponds to the <code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Element/image">&lt;image&gt;</a></code>
 element.
  */
public interface SVGImageElement extends SVGElement, SVGURIReference, SVGTests, SVGLangSpace, SVGExternalResourcesRequired, SVGStylable, SVGTransformable {


  /**
    * Corresponds to attribute 
<code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Attribute/height">height</a></code> on the given <code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Element/image">&lt;image&gt;</a></code>
 element.
    */
  SVGAnimatedLength getAnimatedHeight();


  /**
    * Corresponds to attribute 
<code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Attribute/preserveAspectRatio">preserveAspectRatio</a></code> on the given <code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Element/image">&lt;image&gt;</a></code>
 element.
    */
  SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();


  /**
    * Corresponds to attribute 
<code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Attribute/width">width</a></code> on the given <code><a rel="custom" href="https://developer.mozilla.org/en/SVG/Element/image">&lt;image&gt;</a></code>
 element.
    */
  SVGAnimatedLength getAnimatedWidth();

  SVGAnimatedLength getX();

  SVGAnimatedLength getY();
}
