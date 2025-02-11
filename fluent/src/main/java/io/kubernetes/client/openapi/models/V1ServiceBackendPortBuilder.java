package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1ServiceBackendPortBuilder extends io.kubernetes.client.openapi.models.V1ServiceBackendPortFluentImpl<io.kubernetes.client.openapi.models.V1ServiceBackendPortBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1ServiceBackendPort,io.kubernetes.client.openapi.models.V1ServiceBackendPortBuilder> {

    io.kubernetes.client.openapi.models.V1ServiceBackendPortFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1ServiceBackendPortBuilder() {
        this(true);
    }

    public V1ServiceBackendPortBuilder(java.lang.Boolean validationEnabled) {
        this(new V1ServiceBackendPort(), validationEnabled);
    }

    public V1ServiceBackendPortBuilder(io.kubernetes.client.openapi.models.V1ServiceBackendPortFluent<?> fluent) {
        this(fluent, true);
    }

    public V1ServiceBackendPortBuilder(io.kubernetes.client.openapi.models.V1ServiceBackendPortFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1ServiceBackendPort(), validationEnabled);
    }

    public V1ServiceBackendPortBuilder(io.kubernetes.client.openapi.models.V1ServiceBackendPortFluent<?> fluent,io.kubernetes.client.openapi.models.V1ServiceBackendPort instance) {
        this(fluent, instance, true);
    }

    public V1ServiceBackendPortBuilder(io.kubernetes.client.openapi.models.V1ServiceBackendPortFluent<?> fluent,io.kubernetes.client.openapi.models.V1ServiceBackendPort instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withName(instance.getName());
        
        fluent.withNumber(instance.getNumber());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1ServiceBackendPortBuilder(io.kubernetes.client.openapi.models.V1ServiceBackendPort instance) {
        this(instance,true);
    }

    public V1ServiceBackendPortBuilder(io.kubernetes.client.openapi.models.V1ServiceBackendPort instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withName(instance.getName());
        
        this.withNumber(instance.getNumber());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1ServiceBackendPort build() {
        V1ServiceBackendPort buildable = new V1ServiceBackendPort();
        buildable.setName(fluent.getName());
        buildable.setNumber(fluent.getNumber());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1ServiceBackendPortBuilder that = (V1ServiceBackendPortBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
