/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.dcx.bookmania.core.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.dcx.bookmania.core.constants.DcxbookmaniaCoreConstants;
import com.dcx.bookmania.core.setup.CoreSystemSetup;


/**
 * Do not use, please use {@link CoreSystemSetup} instead.
 * 
 */
public class DcxbookmaniaCoreManager extends GeneratedDcxbookmaniaCoreManager
{
	public static final DcxbookmaniaCoreManager getInstance()
	{
		final ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (DcxbookmaniaCoreManager) em.getExtension(DcxbookmaniaCoreConstants.EXTENSIONNAME);
	}
}
