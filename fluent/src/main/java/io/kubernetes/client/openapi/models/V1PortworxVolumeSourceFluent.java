package io.kubernetes.client.openapi.models;

import java.lang.Deprecated;
import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.fluent.Fluent;
import java.lang.String;
import java.lang.Boolean;

public interface V1PortworxVolumeSourceFluent<A extends io.kubernetes.client.openapi.models.V1PortworxVolumeSourceFluent<A>> extends io.kubernetes.client.fluent.Fluent<A> {


    public java.lang.String getFsType();
    public A withFsType(java.lang.String fsType);
    public java.lang.Boolean hasFsType();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withFsType instead.
     */
        public A withNewFsType(java.lang.String original);
    public java.lang.Boolean getReadOnly();
    public A withReadOnly(java.lang.Boolean readOnly);
    public java.lang.Boolean hasReadOnly();
    public java.lang.String getVolumeID();
    public A withVolumeID(java.lang.String volumeID);
    public java.lang.Boolean hasVolumeID();
    
    @java.lang.Deprecated
        
    /**
     * Method is deprecated. use withVolumeID instead.
     */
        public A withNewVolumeID(java.lang.String original);
}
