package com.interface_concept;

public class Mobile {
private Network network;

Mobile(Network network){
	this.network=network;
}

public String getNetwork() {
	return this.network.getBroadBandName();  
}
}
