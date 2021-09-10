//package com.im.hazelcastdemo.config;
//
//import com.hazelcast.client.HazelcastClient;
//import com.hazelcast.client.config.ClientConfig;
//import com.hazelcast.client.config.ClientNetworkConfig;
//import com.hazelcast.config.Config;
//import com.hazelcast.config.ManagementCenterConfig;
//import com.hazelcast.core.Hazelcast;
//import com.hazelcast.core.HazelcastInstance;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * Hazelcast 配置
// *
// * Hazelcast直接把集群中最早的节点作为master节点，一旦第一个节点挂了，第二个就成为了master节点
// * master与各成员保持连接和心跳，维护成员列表和虚拟节点列表，并在各节点和客户端要获取时提供。管理这两个列表的服务分别是ClusterService和PartitionService。
// *
// * 单点问题、故障转移、动态扩容、数据一致性
// */
//@Configuration
//public class HazelcastConfiguration {
//
//    private static final Logger LOG = LoggerFactory.getLogger(HazelcastConfiguration.class);
//
//    @Bean
//    public HazelcastInstance hazelcastInstance() {
////        Config config = new Config();
////        config.setInstanceName("demo");
////        config.getUserCodeDeploymentConfig().setEnabled(true);
////
////        //如果有集群管理中心，可以配置
////        ManagementCenterConfig centerConfig = new ManagementCenterConfig();
////        centerConfig.setScriptingEnabled(true);
////        centerConfig.addTrustedInterface("10.73.243.127");
////        centerConfig.addTrustedInterface("127.0.0.1");
////        centerConfig.addTrustedInterface("10.11.22.124");
////        centerConfig.addTrustedInterface("10.21.19.137");
////        config.setManagementCenterConfig(centerConfig);
////        HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance(config);
//
//
//
//        ClientConfig clientConfig = new ClientConfig();
//        ClientNetworkConfig clientNetworkConfig = clientConfig.getNetworkConfig();
////        clientNetworkConfig.addAddress("127.0.0.1");
////        clientNetworkConfig.addAddress("10.11.22.124");
////        clientNetworkConfig.addAddress("10.21.19.137");
//
////        clientConfig.setInstanceName("demo");
////        clientConfig.setClusterName("demo");
//        HazelcastInstance hazelcastInstance = HazelcastClient.newHazelcastClient(clientConfig);
//        return hazelcastInstance;
//    }
//
//
//
////    /**
////     * HazelcastInstance client
////     * @return
////     */
////    @Bean
////    public HazelcastInstance hazelcastInstance() {
//////        // 设置客户端链接策略
////        ClientConfig clientConfig = new ClientConfig();
////        clientConfig.getNetworkConfig().addAddress("10.73.243.127");
//////        clientConfig.getConnectionStrategyConfig().setAsyncStart(true);
//////        ClientStateListener clientStateListener = new ClientStateListener(clientConfig);
//////
//////        // 设置重连侧策略
//////        ConnectionRetryConfig connectionRetryConfig = clientConfig.getConnectionStrategyConfig().getConnectionRetryConfig();
//////        connectionRetryConfig
//////                .setClusterConnectTimeoutMillis(Long.MAX_VALUE)
//////                .setInitialBackoffMillis(1000)
//////                .setMaxBackoffMillis(60000)
//////                .setMultiplier(2)
//////                .setJitter(0.2);
//////
//////        Config config = new Config();
//////        JoinConfig join = config.getNetworkConfig().getJoin();
//////        join.getTcpIpConfig().setEnabled(true);
//////        join.getMulticastConfig().setEnabled(false);
////
////        HazelcastInstance clientInstance = HazelcastClient.newHazelcastClient(clientConfig);
//////        HazelcastInstance clientInstance = HazelcastClient.newHazelcastClient();
////        ClientService clientService = clientInstance.getClientService();
////        clientService.addClientListener(new ClientListener() {
////            @Override
////            public void clientConnected(Client client) {
////                LOG.info("Client : " + client.getName() + " is connected to member: " + clientInstance.getName());
////                LOG.info("Client : " + client.getName() + " is connected with labels " + client.getLabels());
////            }
////
////            @Override
////            public void clientDisconnected(Client client) {
////                LOG.info("Client : " + client.getName() + " disconnected to member: " + clientInstance.getName());
////            }
////        });
//////
////        return clientInstance;
////    }
//
//}
