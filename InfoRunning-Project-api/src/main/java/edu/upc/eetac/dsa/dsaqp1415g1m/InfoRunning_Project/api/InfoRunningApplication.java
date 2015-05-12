package edu.upc.eetac.dsa.dsaqp1415g1m.InfoRunning_Project.api;

import org.glassfish.jersey.linking.DeclarativeLinkingFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class InfoRunningApplication extends ResourceConfig {
public InfoRunningApplication ( ) {
super () ;
register ( DeclarativeLinkingFeature . class ) ;
}
}