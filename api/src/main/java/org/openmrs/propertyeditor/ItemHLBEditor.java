/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.propertyeditor;

import org.openmrs.ItemHLB;
import org.openmrs.api.context.Context;


public class ItemHLBEditor extends OpenmrsPropertyEditor<ItemHLB> {
    public ItemHLBEditor() {
	}
	
	@Override
	protected ItemHLB getObjectById(Integer id) {
		return Context.getItemHLBService().getItemHLB(id);
	}
	
	@Override
	protected ItemHLB getObjectByUuid(String uuid) {
		return Context.getItemHLBService().getItemHLBByUuid(uuid);
	}
}
