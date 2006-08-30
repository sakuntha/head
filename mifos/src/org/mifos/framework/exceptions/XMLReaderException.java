/**

 * XMLReaderException    version: 1.0

 

 * Copyright (c) 2005-2006 Grameen Foundation USA

 * 1029 Vermont Avenue, NW, Suite 400, Washington DC 20005

 * All rights reserved.

 

 * Apache License 
 * Copyright (c) 2005-2006 Grameen Foundation USA 
 * 

 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 
 *

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and limitations under the 

 * License. 
 * 
 * See also http://www.apache.org/licenses/LICENSE-2.0.html for an explanation of the license 

 * and how it is applied. 

 *

 */

package org.mifos.framework.exceptions;

/**
 * This exception is thrown when we try to read the xml files in the System.
 */
public class XMLReaderException extends SystemException {
	
	public XMLReaderException() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public XMLReaderException(Object[] values, Throwable cause) {
		super(values, cause);
		// TODO Auto-generated constructor stub
	}
	
	public XMLReaderException(Object[] values) {
		super(values);
		// TODO Auto-generated constructor stub
	}
	
	public XMLReaderException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	public String getKey() {
		return "exception.framework.System.XMLReaderException";
	}
	
}
