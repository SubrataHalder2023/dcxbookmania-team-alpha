/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.dcx.bookmania.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.dcx.bookmania.fulfilmentprocess.constants.DcxbookmaniaFulfilmentProcessConstants;

public class DcxbookmaniaFulfilmentProcessManager extends GeneratedDcxbookmaniaFulfilmentProcessManager
{
	public static final DcxbookmaniaFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (DcxbookmaniaFulfilmentProcessManager) em.getExtension(DcxbookmaniaFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
