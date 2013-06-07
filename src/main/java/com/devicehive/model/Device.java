package com.devicehive.model;

import com.google.gson.annotations.SerializedName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

/**
 * TODO JavaDoc
 */
@Entity
public class Device {

    @SerializedName("id")
    @Id
    @GeneratedValue
    private UUID id;

    @SerializedName("key")
    @Column
    private String key;

    @SerializedName("name")
    @Column
    private String name;

    @SerializedName("status")
    @Column
    private String status;

    @SerializedName("data")
    private Object data;

    @SerializedName("network")
    private Network network;

    @SerializedName("deviceClass")
    private DeviceClass deviceClass;

    public Device() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public DeviceClass getDeviceClass() {
        return deviceClass;
    }

    public void setDeviceClass(DeviceClass deviceClass) {
        this.deviceClass = deviceClass;
    }
}
