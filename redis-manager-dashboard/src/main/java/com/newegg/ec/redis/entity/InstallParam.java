package com.newegg.ec.redis.entity;

import java.util.List;

/**
 * @author Jay.H.Zou
 * @date 2019/7/26
 */
public class InstallParam {

    private Cluster cluster;

    private String machineGroup;

    private boolean isCustomized;

    private int startPort;

    private int endPort;

    List<RedisNode> redisNodeList;

    public Cluster getCluster() {
        return cluster;
    }

    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }

    public String getMachineGroup() {
        return machineGroup;
    }

    public void setMachineGroup(String machineGroup) {
        this.machineGroup = machineGroup;
    }

    public boolean isCustomized() {
        return isCustomized;
    }

    public void setCustomized(boolean customized) {
        isCustomized = customized;
    }

    public int getStartPort() {
        return startPort;
    }

    public void setStartPort(int startPort) {
        this.startPort = startPort;
    }

    public int getEndPort() {
        return endPort;
    }

    public void setEndPort(int endPort) {
        this.endPort = endPort;
    }

    public List<RedisNode> getRedisNodeList() {
        return redisNodeList;
    }

    public void setRedisNodeList(List<RedisNode> redisNodeList) {
        this.redisNodeList = redisNodeList;
    }
}
