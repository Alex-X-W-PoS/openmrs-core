/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.api.db;

import java.util.List;

import org.hibernate.SessionFactory;
import org.openmrs.ItemHLB;
import org.openmrs.api.ItemHLBService;
/**
 *
 * @author Alex
 */
public interface ItemHLBDAO {
    
    public void setSessionFactory(SessionFactory sessionFactory);
    
    public ItemHLB saveItemHLB(ItemHLB itemhlb);
    
    public ItemHLB getItemHLB(Integer itemHLBid);
    
    public ItemHLB getItemHLB(String nombre);
    
    public ItemHLB getItemHLBByUuid(String uuid);
    
    public List<ItemHLB> getAllItemHLBs();
    
    public List<ItemHLB> getItemHLBs(String nameFragment);
    
    public void deleteItemHLB(ItemHLB itemhlb); 
}
