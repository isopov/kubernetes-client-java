package io.kubernetes.client.openapi.models;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import io.kubernetes.client.fluent.Nested;
import java.lang.String;
import java.lang.Integer;
import java.lang.Deprecated;
import java.lang.Boolean;

public interface V1DeploymentSpecFluent<A extends io.kubernetes.client.openapi.models.V1DeploymentSpecFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.Integer getMinReadySeconds();
    public A withMinReadySeconds(java.lang.Integer minReadySeconds);
    public java.lang.Boolean hasMinReadySeconds();
    public java.lang.Boolean getPaused();
    public A withPaused(java.lang.Boolean paused);
    public java.lang.Boolean hasPaused();
    public java.lang.Integer getProgressDeadlineSeconds();
    public A withProgressDeadlineSeconds(java.lang.Integer progressDeadlineSeconds);
    public java.lang.Boolean hasProgressDeadlineSeconds();
    public java.lang.Integer getReplicas();
    public A withReplicas(java.lang.Integer replicas);
    public java.lang.Boolean hasReplicas();
    public java.lang.Integer getRevisionHistoryLimit();
    public A withRevisionHistoryLimit(java.lang.Integer revisionHistoryLimit);
    public java.lang.Boolean hasRevisionHistoryLimit();
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildSelector instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1LabelSelector getSelector();
    public io.kubernetes.client.openapi.models.V1LabelSelector buildSelector();
    public A withSelector(io.kubernetes.client.openapi.models.V1LabelSelector selector);
    public java.lang.Boolean hasSelector();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<A> withNewSelector();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<A> withNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<A> editSelector();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<A> editOrNewSelector();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<A> editOrNewSelectorLike(io.kubernetes.client.openapi.models.V1LabelSelector item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildStrategy instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1DeploymentStrategy getStrategy();
    public io.kubernetes.client.openapi.models.V1DeploymentStrategy buildStrategy();
    public A withStrategy(io.kubernetes.client.openapi.models.V1DeploymentStrategy strategy);
    public java.lang.Boolean hasStrategy();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<A> withNewStrategy();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<A> withNewStrategyLike(io.kubernetes.client.openapi.models.V1DeploymentStrategy item);
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<A> editStrategy();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<A> editOrNewStrategy();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<A> editOrNewStrategyLike(io.kubernetes.client.openapi.models.V1DeploymentStrategy item);
    
    @java.lang.Deprecated
        
    /**
     * This method has been deprecated, please use method buildTemplate instead.
     * @return The buildable object.
     */
        public io.kubernetes.client.openapi.models.V1PodTemplateSpec getTemplate();
    public io.kubernetes.client.openapi.models.V1PodTemplateSpec buildTemplate();
    public A withTemplate(io.kubernetes.client.openapi.models.V1PodTemplateSpec template);
    public java.lang.Boolean hasTemplate();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<A> withNewTemplate();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<A> withNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<A> editTemplate();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<A> editOrNewTemplate();
    public io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<A> editOrNewTemplateLike(io.kubernetes.client.openapi.models.V1PodTemplateSpec item);
    public interface SelectorNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1LabelSelectorFluent<io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.SelectorNested<N>> {

            public N and();
            public N endSelector();    }


    public interface StrategyNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1DeploymentStrategyFluent<io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.StrategyNested<N>> {

            public N and();
            public N endStrategy();    }


    public interface TemplateNested<N> extends io.kubernetes.client.fluent.Nested<N>,io.kubernetes.client.openapi.models.V1PodTemplateSpecFluent<io.kubernetes.client.openapi.models.V1DeploymentSpecFluent.TemplateNested<N>> {

            public N and();
            public N endTemplate();    }


}
