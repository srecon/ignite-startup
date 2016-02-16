package com.blu.ignite;

import org.apache.ignite.Ignite;
import org.apache.ignite.IgniteCache;
import org.apache.ignite.Ignition;
import org.apache.ignite.configuration.CacheConfiguration;
import org.apache.ignite.configuration.IgniteConfiguration;
import org.apache.ignite.spi.discovery.tcp.TcpDiscoverySpi;
import org.apache.ignite.spi.discovery.tcp.ipfinder.multicast.TcpDiscoveryMulticastIpFinder;
import org.apache.ignite.spi.discovery.tcp.ipfinder.vm.TcpDiscoveryVmIpFinder;

import java.util.Arrays;

/**
 * Created by shamim on 09/02/16.
 */
public class Test {
    public static void main(String[] args) throws Exception{
        System.out.println("Test Ignite!!");
        String cacheId = "partitioned";
        TcpDiscoverySpi spi = new TcpDiscoverySpi();
        TcpDiscoveryVmIpFinder ipFinder = new TcpDiscoveryVmIpFinder();
        TcpDiscoveryMulticastIpFinder tcMp = new TcpDiscoveryMulticastIpFinder();
        tcMp.setAddresses(Arrays.asList("192.168.15.153"));
        spi.setIpFinder(tcMp);

        final String PATH="/Users/shamim/Development/java/datafabrics/apache-ignite-fabric-1.5.0.final-bin/examples/config/example-cache.xml";
        IgniteConfiguration cfg = new IgniteConfiguration();
        cfg.setClientMode(true);
        cfg.setDiscoverySpi(spi);
        // Start ignite
        Ignite ignite = Ignition.start(cfg);

        // get or create cache
        IgniteCache<Integer, String> cache = ignite.getOrCreateCache("myCacheName");
        for(int i = 1; i < 100; i++){
            cache.put(i, Integer.toString(i));
        }
        for(int i =1; i<100;i++){
            System.out.println("Cache get:"+ cache.get(i));
        }
        // statistics
        System.out.println("Cache Size:"+ cache.metrics(ignite.cluster()).getSize());
        ignite.close();

    }
}
