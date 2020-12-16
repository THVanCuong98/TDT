package org.exoplatform.search.portlet.indexing.management;
import juzu.impl.request.ControllerHandler;
import juzu.impl.request.ControlParameter;
import juzu.impl.request.PhaseParameter;
import juzu.impl.request.ContextualParameter;
import juzu.impl.request.BeanParameter;
import juzu.impl.common.Tools;
import java.util.Arrays;
import juzu.request.Phase;
import juzu.impl.plugin.controller.descriptor.ControllerDescriptor;
import javax.annotation.Generated;
import juzu.impl.common.Cardinality;
import juzu.impl.request.Request;
@Generated(value={})
public class IndexingManagementApplication_ {
private static final Class<org.exoplatform.search.portlet.indexing.management.IndexingManagementApplication> TYPE = org.exoplatform.search.portlet.indexing.management.IndexingManagementApplication.class;
private static final ControllerHandler<Phase.View> method_0 = new ControllerHandler<Phase.View>("IndexingManagementApplication.index",Phase.VIEW,TYPE,Tools.safeGetMethod(TYPE,"index"), Arrays.<ControlParameter>asList());
public static Phase.View.Dispatch index() { return Request.createViewDispatch(method_0); }
public static final ControllerDescriptor DESCRIPTOR = new ControllerDescriptor(TYPE,Arrays.<ControllerHandler<?>>asList(method_0));
}
