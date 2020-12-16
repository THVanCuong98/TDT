package org.exoplatform.platform.component;

import org.exoplatform.platform.navigation.component.help.HelpService;
import org.exoplatform.services.log.ExoLogger;
import org.exoplatform.services.log.Log;
import org.exoplatform.social.core.space.spi.SpaceService;
import org.exoplatform.webui.config.annotation.ComponentConfig;
import org.exoplatform.webui.core.UIPortletApplication;
import org.exoplatform.webui.core.lifecycle.UIApplicationLifecycle;

@ComponentConfig(lifecycle = UIApplicationLifecycle.class, template = "app:/groovy/platformNavigation/portlet/UIHelpPlatformToolbarPortlet/UIHelpPlatformToolbarPortlet.gtmpl")
public class UIBrowserPlatformToolbarPortlet extends UIPortletApplication {
    private static final Log LOG = ExoLogger.getExoLogger(UIHelpPlatformToolbarPortlet.class);
    private String currentNavigation = "";
    public UIBrowserPlatformToolbarPortlet() throws Exception {
        try {
        } catch (Exception exception) {
            // spaceService should be "null" because the Social profile isn't activated
            LOG.warn("SpaceService not loaded by the kernel please activate [social] profile");
        }
    }

}
