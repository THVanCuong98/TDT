package org.exoplatform.search.portlet.indexing.management.templates;
import juzu.impl.plugin.template.metadata.TemplateDescriptor;
import juzu.impl.plugin.template.TemplateService;
@javax.annotation.Generated({})
public class indexingManagement extends juzu.template.Template
{
@javax.inject.Inject
public indexingManagement(TemplateService templatePlugin)
{
super(templatePlugin, "/org/exoplatform/search/portlet/indexing/management/templates/indexingManagement.gtmpl");
}
public static final juzu.impl.plugin.template.metadata.TemplateDescriptor DESCRIPTOR = new juzu.impl.plugin.template.metadata.TemplateDescriptor("/org/exoplatform/search/portlet/indexing/management/templates/indexingManagement.gtmpl",0xb736356f94eda2a0L,org.exoplatform.search.portlet.indexing.management.templates.indexingManagement.class,juzu.impl.template.spi.juzu.dialect.gtmpl.GroovyTemplateStub.class);
public Builder builder() {
return new Builder();
}
public Builder with() {
return (Builder)super.with();
}
public class Builder extends juzu.template.Template.Builder
{
}
}
