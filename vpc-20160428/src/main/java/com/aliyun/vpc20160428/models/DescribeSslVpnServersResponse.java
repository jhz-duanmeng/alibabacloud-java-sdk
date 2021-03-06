// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeSslVpnServersResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("SslVpnServers")
    @Validation(required = true)
    public DescribeSslVpnServersResponseSslVpnServers sslVpnServers;

    public static DescribeSslVpnServersResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSslVpnServersResponse self = new DescribeSslVpnServersResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSslVpnServersResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSslVpnServersResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeSslVpnServersResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSslVpnServersResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSslVpnServersResponse setSslVpnServers(DescribeSslVpnServersResponseSslVpnServers sslVpnServers) {
        this.sslVpnServers = sslVpnServers;
        return this;
    }
    public DescribeSslVpnServersResponseSslVpnServers getSslVpnServers() {
        return this.sslVpnServers;
    }

    public static class DescribeSslVpnServersResponseSslVpnServersSslVpnServer extends TeaModel {
        @NameInMap("RegionId")
        @Validation(required = true)
        public String regionId;

        @NameInMap("SslVpnServerId")
        @Validation(required = true)
        public String sslVpnServerId;

        @NameInMap("VpnGatewayId")
        @Validation(required = true)
        public String vpnGatewayId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("LocalSubnet")
        @Validation(required = true)
        public String localSubnet;

        @NameInMap("ClientIpPool")
        @Validation(required = true)
        public String clientIpPool;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("Cipher")
        @Validation(required = true)
        public String cipher;

        @NameInMap("Proto")
        @Validation(required = true)
        public String proto;

        @NameInMap("Port")
        @Validation(required = true)
        public Integer port;

        @NameInMap("Compress")
        @Validation(required = true)
        public Boolean compress;

        @NameInMap("Connections")
        @Validation(required = true)
        public Integer connections;

        @NameInMap("MaxConnections")
        @Validation(required = true)
        public Integer maxConnections;

        @NameInMap("InternetIp")
        @Validation(required = true)
        public String internetIp;

        @NameInMap("EnableMultiFactorAuth")
        @Validation(required = true)
        public Boolean enableMultiFactorAuth;

        @NameInMap("IDaaSInstanceId")
        @Validation(required = true)
        public String IDaaSInstanceId;

        public static DescribeSslVpnServersResponseSslVpnServersSslVpnServer build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnServersResponseSslVpnServersSslVpnServer self = new DescribeSslVpnServersResponseSslVpnServersSslVpnServer();
            return TeaModel.build(map, self);
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setSslVpnServerId(String sslVpnServerId) {
            this.sslVpnServerId = sslVpnServerId;
            return this;
        }
        public String getSslVpnServerId() {
            return this.sslVpnServerId;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setVpnGatewayId(String vpnGatewayId) {
            this.vpnGatewayId = vpnGatewayId;
            return this;
        }
        public String getVpnGatewayId() {
            return this.vpnGatewayId;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setLocalSubnet(String localSubnet) {
            this.localSubnet = localSubnet;
            return this;
        }
        public String getLocalSubnet() {
            return this.localSubnet;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setClientIpPool(String clientIpPool) {
            this.clientIpPool = clientIpPool;
            return this;
        }
        public String getClientIpPool() {
            return this.clientIpPool;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setCipher(String cipher) {
            this.cipher = cipher;
            return this;
        }
        public String getCipher() {
            return this.cipher;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setProto(String proto) {
            this.proto = proto;
            return this;
        }
        public String getProto() {
            return this.proto;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setCompress(Boolean compress) {
            this.compress = compress;
            return this;
        }
        public Boolean getCompress() {
            return this.compress;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setConnections(Integer connections) {
            this.connections = connections;
            return this;
        }
        public Integer getConnections() {
            return this.connections;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setMaxConnections(Integer maxConnections) {
            this.maxConnections = maxConnections;
            return this;
        }
        public Integer getMaxConnections() {
            return this.maxConnections;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setEnableMultiFactorAuth(Boolean enableMultiFactorAuth) {
            this.enableMultiFactorAuth = enableMultiFactorAuth;
            return this;
        }
        public Boolean getEnableMultiFactorAuth() {
            return this.enableMultiFactorAuth;
        }

        public DescribeSslVpnServersResponseSslVpnServersSslVpnServer setIDaaSInstanceId(String IDaaSInstanceId) {
            this.IDaaSInstanceId = IDaaSInstanceId;
            return this;
        }
        public String getIDaaSInstanceId() {
            return this.IDaaSInstanceId;
        }

    }

    public static class DescribeSslVpnServersResponseSslVpnServers extends TeaModel {
        @NameInMap("SslVpnServer")
        @Validation(required = true)
        public java.util.List<DescribeSslVpnServersResponseSslVpnServersSslVpnServer> sslVpnServer;

        public static DescribeSslVpnServersResponseSslVpnServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeSslVpnServersResponseSslVpnServers self = new DescribeSslVpnServersResponseSslVpnServers();
            return TeaModel.build(map, self);
        }

        public DescribeSslVpnServersResponseSslVpnServers setSslVpnServer(java.util.List<DescribeSslVpnServersResponseSslVpnServersSslVpnServer> sslVpnServer) {
            this.sslVpnServer = sslVpnServer;
            return this;
        }
        public java.util.List<DescribeSslVpnServersResponseSslVpnServersSslVpnServer> getSslVpnServer() {
            return this.sslVpnServer;
        }

    }

}
