// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceTopologyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Topologys")
    @Validation(required = true)
    public DescribeInstanceTopologyResponseTopologys topologys;

    public static DescribeInstanceTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceTopologyResponse self = new DescribeInstanceTopologyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceTopologyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceTopologyResponse setTopologys(DescribeInstanceTopologyResponseTopologys topologys) {
        this.topologys = topologys;
        return this;
    }
    public DescribeInstanceTopologyResponseTopologys getTopologys() {
        return this.topologys;
    }

    public static class DescribeInstanceTopologyResponseTopologysTopology extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("HostId")
        @Validation(required = true)
        public String hostId;

        public static DescribeInstanceTopologyResponseTopologysTopology build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseTopologysTopology self = new DescribeInstanceTopologyResponseTopologysTopology();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseTopologysTopology setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceTopologyResponseTopologysTopology setHostId(String hostId) {
            this.hostId = hostId;
            return this;
        }
        public String getHostId() {
            return this.hostId;
        }

    }

    public static class DescribeInstanceTopologyResponseTopologys extends TeaModel {
        @NameInMap("Topology")
        @Validation(required = true)
        public java.util.List<DescribeInstanceTopologyResponseTopologysTopology> topology;

        public static DescribeInstanceTopologyResponseTopologys build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceTopologyResponseTopologys self = new DescribeInstanceTopologyResponseTopologys();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceTopologyResponseTopologys setTopology(java.util.List<DescribeInstanceTopologyResponseTopologysTopology> topology) {
            this.topology = topology;
            return this;
        }
        public java.util.List<DescribeInstanceTopologyResponseTopologysTopology> getTopology() {
            return this.topology;
        }

    }

}
