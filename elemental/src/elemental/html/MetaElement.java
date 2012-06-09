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
package elemental.html;
import elemental.dom.Element;

import elemental.events.*;
import elemental.util.*;
import elemental.dom.*;
import elemental.html.*;
import elemental.css.*;
import elemental.stylesheets.*;

import java.util.Date;

/**
  * The meta objects expose the <a class=" external" target="_blank" rel="external" href="http://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-37041454" title="http://www.w3.org/TR/DOM-Level-2-HTML/html.html#ID-37041454">HTMLMetaElement</a> interface which contains descriptive metadata about a document.&nbsp; This object inherits all of the properties and methods described in the <a class="internal" rel="internal" href="https://developer.mozilla.org/en/DOM/element">element</a> section.
  */
public interface MetaElement extends Element {


  /**
    * Gets or sets the value of meta-data property.
    */
  String getContent();

  void setContent(String arg);


  /**
    * Gets or sets the name of an HTTP&nbsp;response header to define for a document.
    */
  String getHttpEquiv();

  void setHttpEquiv(String arg);


  /**
    * Gets or sets the name of a meta-data property to define for a document.
    */
  String getName();

  void setName(String arg);


  /**
    * Gets or sets the name of a scheme used to interpret the value of a meta-data property.
    */
  String getScheme();

  void setScheme(String arg);
}
