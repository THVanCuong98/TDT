package org.exoplatform.search.portlet.indexing.management;
import juzu.impl.plugin.application.descriptor.ApplicationDescriptor;
public class Application {
private final ApplicationDescriptor descriptor;
public Application() throws Exception {
this.descriptor = ApplicationDescriptor.create(getClass());
}
public ApplicationDescriptor getDescriptor() {
return descriptor;
}
}
