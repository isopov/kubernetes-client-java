package io.kubernetes.client.openapi.models;

import io.kubernetes.client.fluent.VisitableBuilder;
import java.lang.Object;
import java.lang.Boolean;

public class V1SubjectBuilder extends io.kubernetes.client.openapi.models.V1SubjectFluentImpl<io.kubernetes.client.openapi.models.V1SubjectBuilder> implements io.kubernetes.client.fluent.VisitableBuilder<io.kubernetes.client.openapi.models.V1Subject,io.kubernetes.client.openapi.models.V1SubjectBuilder> {

    io.kubernetes.client.openapi.models.V1SubjectFluent<?> fluent;
    java.lang.Boolean validationEnabled;

    public V1SubjectBuilder() {
        this(true);
    }

    public V1SubjectBuilder(java.lang.Boolean validationEnabled) {
        this(new V1Subject(), validationEnabled);
    }

    public V1SubjectBuilder(io.kubernetes.client.openapi.models.V1SubjectFluent<?> fluent) {
        this(fluent, true);
    }

    public V1SubjectBuilder(io.kubernetes.client.openapi.models.V1SubjectFluent<?> fluent,java.lang.Boolean validationEnabled) {
        this(fluent, new V1Subject(), validationEnabled);
    }

    public V1SubjectBuilder(io.kubernetes.client.openapi.models.V1SubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1Subject instance) {
        this(fluent, instance, true);
    }

    public V1SubjectBuilder(io.kubernetes.client.openapi.models.V1SubjectFluent<?> fluent,io.kubernetes.client.openapi.models.V1Subject instance,java.lang.Boolean validationEnabled) {
        this.fluent = fluent; 
        fluent.withApiGroup(instance.getApiGroup());
        
        fluent.withKind(instance.getKind());
        
        fluent.withName(instance.getName());
        
        fluent.withNamespace(instance.getNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public V1SubjectBuilder(io.kubernetes.client.openapi.models.V1Subject instance) {
        this(instance,true);
    }

    public V1SubjectBuilder(io.kubernetes.client.openapi.models.V1Subject instance,java.lang.Boolean validationEnabled) {
        this.fluent = this; 
        this.withApiGroup(instance.getApiGroup());
        
        this.withKind(instance.getKind());
        
        this.withName(instance.getName());
        
        this.withNamespace(instance.getNamespace());
        
        this.validationEnabled = validationEnabled; 
    }

    public io.kubernetes.client.openapi.models.V1Subject build() {
        V1Subject buildable = new V1Subject();
        buildable.setApiGroup(fluent.getApiGroup());
        buildable.setKind(fluent.getKind());
        buildable.setName(fluent.getName());
        buildable.setNamespace(fluent.getNamespace());
        return buildable;
    }

    public boolean equals(java.lang.Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        V1SubjectBuilder that = (V1SubjectBuilder) o;
        if (fluent != null &&fluent != this ? !fluent.equals(that.fluent) :that.fluent != null &&fluent != this ) return false;
        
        if (validationEnabled != null ? !validationEnabled.equals(that.validationEnabled) :that.validationEnabled != null) return false;
        return true;
    }

    public int hashCode() {
        return java.util.Objects.hash(fluent,  validationEnabled,  super.hashCode());
    }

}
