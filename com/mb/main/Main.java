package com.mb.main;

import com.mb.items.blackiron;
import com.mb.items.blueiron;
import com.mb.items.redaxe;
import com.mb.items.rediron;
import com.mb.items.redpick;
import com.mb.items.redspade;
import com.mb.items.redsword;
import com.mb.items.sstick;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, version = Main.VERSION)
public class Main
{
    public static final String MODID = "mb";
    public static final String VERSION = "1.0";
    
    public static final CreativeTabs mbtab = new CreativeTabs("mbtab"){
    	
		public Item getTabIconItem() {
		
			return Main.redsword;
		}
    	
    };
  //Items
    public static Item rediron;
    public static Item blueiron;
    public static Item blackiron;
    public static Item sstick;
    public static Item redsword;
    public static Item redpick;
    public static Item redspade;
    public static Item redaxe;
    public static Item bluesword;
    public static Item bluepick;
    public static Item bluespade;
    public static Item blueaxe;
    public static Item blacksword;
    public static Item blackpick;
    public static Item blackspade;
    public static Item blackaxe;
 
    
    
    //Tools
    public static Item.ToolMaterial redironm = EnumHelper.addToolMaterial("redironm", 2, 550, 7.0F, 2.5F, 18);
    public static Item.ToolMaterial blueironm = EnumHelper.addToolMaterial("blueironm", 2, 450, 6.5F, 2.0F, 16);
    public static Item.ToolMaterial blackironm = EnumHelper.addToolMaterial("blackironm", 2, 300, 6.0F, 2.0F, 14);
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
		//Items
    	rediron = new rediron().setUnlocalizedName("rediron").setCreativeTab(this.mbtab).setTextureName("mb:redingot");
		blueiron = new blueiron().setUnlocalizedName("blueiron").setCreativeTab(this.mbtab).setTextureName("mb:blueingot");
		blackiron = new blackiron().setUnlocalizedName("blackiron").setCreativeTab(this.mbtab).setTextureName("mb:blackingot");
		sstick = new sstick().setUnlocalizedName("sstick").setCreativeTab(this.mbtab).setTextureName("mb:sstick");
		redsword = new redsword(redironm).setUnlocalizedName("redsword").setCreativeTab(this.mbtab).setTextureName("mb:redsword");
		redpick = new redpick(redironm).setUnlocalizedName("redpick").setCreativeTab(this.mbtab).setTextureName("mb:redpick");
		redspade = new redspade(redironm).setUnlocalizedName("redspade").setCreativeTab(this.mbtab).setTextureName("mb:redspade");
		redaxe = new redaxe(redironm).setUnlocalizedName("redaxe").setCreativeTab(this.mbtab).setTextureName("mb:redaxe");
		
		//ItemRegistry
		GameRegistry.registerItem(rediron,"rediron");
		GameRegistry.registerItem(blackiron,"blackiron");
		GameRegistry.registerItem(blueiron,"blueiron");
		GameRegistry.registerItem(sstick,"sstick");
		GameRegistry.registerItem(redsword,"redsword");
		GameRegistry.registerItem(redpick,"redpick");
		GameRegistry.registerItem(redspade,"redspade");
		GameRegistry.registerItem(redaxe,"redaxe");
	    
		
    }
}
