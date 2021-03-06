package com.vanhal.progressiveautomation.core;

import com.vanhal.progressiveautomation.events.EventRenderWorld;

import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;


import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends Proxy {
	@Override
	public void registerEntities() {
		super.registerEntities();
	}
	
	@Override
	public boolean isClient() {
		return true;
	}
	
	@Override
	public boolean isServer() {
		return false;
	}
	
	@Override
	public void init() {
		super.init();
		MinecraftForge.EVENT_BUS.register(new EventRenderWorld());
	}
}
