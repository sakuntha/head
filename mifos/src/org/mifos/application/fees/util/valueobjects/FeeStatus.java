/**

 * FeeStatus.java    version: 1.0



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
package org.mifos.application.fees.util.valueobjects;

import java.util.Set;

import org.mifos.framework.util.valueobjects.ValueObject;

/**
 * This class represent the office status
 */
public class FeeStatus extends ValueObject
{
	private static final long serialVersionUID=666666666666l;
	private Short statusId;
	private Integer lookUpId;
	private Set lookUpValueLocale;

	public FeeStatus()
	{

	}
	public FeeStatus(Short statusId)
	{
		this.statusId = statusId;
	}

	public Integer getLookUpId() {
		return lookUpId;
	}

	public void setLookUpId(Integer lookUpId) {
		this.lookUpId = lookUpId;
	}

	public Set getLookUpValueLocale() {
		return lookUpValueLocale;
	}

	public void setLookUpValueLocale(Set lookUpValueLocale) {
		this.lookUpValueLocale = lookUpValueLocale;
	}

	public Short getStatusId() {
		return statusId;
	}

	public void setStatusId(Short statusId) {
		this.statusId = statusId;
	}


}
