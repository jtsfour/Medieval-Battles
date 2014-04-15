package com.mb.main;

import com.mb.items.blackaxe;
import com.mb.items.blackiron;
import com.mb.items.blackpick;
import com.mb.items.blackspade;
import com.mb.items.blacksword;
import com.mb.items.blueaxe;
import com.mb.items.blueiron;
import com.mb.items.bluepick;
import com.mb.items.bluespade;
import com.mb.items.bluesword;
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
import net.minecraft.item.ItemStack;
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
    	rediron = new rediron().setUnlocalizedName("rediron").setCreativeTab(this.mbtab).setTextureName("mb:redingot2");
		blueiron = new blueiron().setUnlocalizedName("blueiron").setCreativeTab(this.mbtab).setTextureName("mb:blueingot2");
		blackiron = new blackiron().setUnlocalizedName("blackiron").setCreativeTab(this.mbtab).setTextureName("mb:blackingot2");
		sstick = new sstick().setUnlocalizedName("sstick").setCreativeTab(this.mbtab).setTextureName("mb:sstick");
		redsword = new redsword(redironm).setUnlocalizedName("redsword").setCreativeTab(this.mbtab).setTextureName("mb:redsword");
		redpick = new redpick(redironm).setUnlocalizedName("redpick").setCreativeTab(this.mbtab).setTextureName("mb:redpick");
		redspade = new redspade(redironm).setUnlocalizedName("redspade").setCreativeTab(this.mbtab).setTextureName("mb:redspade");
		redaxe = new redaxe(redironm).setUnlocalizedName("redaxe").setCreativeTab(this.mbtab).setTextureName("mb:redaxe");
		bluesword = new bluesword(blueironm).setUnlocalizedName("bluesword").setCreativeTab(this.mbtab).setTextureName("mb:bluesword");
		bluepick = new bluepick(blueironm).setUnlocalizedName("bluepick").setCreativeTab(this.mbtab).setTextureName("mb:bluepick");
		bluespade = new bluespade(blueironm).setUnlocalizedName("bluespade").setCreativeTab(this.mbtab).setTextureName("mb:bluespade");
		blueaxe = new blueaxe(blueironm).setUnlocalizedName("blueaxe").setCreativeTab(this.mbtab).setTextureName("mb:blueaxe");
		blacksword = new blacksword(blackironm).setUnlocalizedName("blacksword").setCreativeTab(this.mbtab).setTextureName("mb:blacksword");
		blackpick = new blackpick(blackironm).setUnlocalizedName("blackpick").setCreativeTab(this.mbtab).setTextureName("mb:blackpick");
		blackspade = new blackspade(blackironm).setUnlocalizedName("blackspade").setCreativeTab(this.mbtab).setTextureName("mb:blackspade");
		blackaxe = new blackaxe(blackironm).setUnlocalizedName("blackaxe").setCreativeTab(this.mbtab).setTextureName("mb:blackaxe");
		//ItemRegistry
		GameRegistry.registerItem(rediron,"rediron");
		GameRegistry.registerItem(blackiron,"blackiron");
		GameRegistry.registerItem(blueiron,"blueiron");
		GameRegistry.registerItem(sstick,"sstick");
		GameRegistry.registerItem(redsword,"redsword");
		GameRegistry.registerItem(redpick,"redpick");
		GameRegistry.registerItem(redspade,"redspade");
		GameRegistry.registerItem(redaxe,"redaxe");
	    GameRegistry.registerItem(bluesword, "bluesword");
	    GameRegistry.registerItem(bluepick, "bluepick");
	    GameRegistry.registerItem(bluespade, "bluespade");
	    GameRegistry.registerItem(blueaxe, "blueaxe");
	    GameRegistry.registerItem(blacksword,"blacksword");
	    GameRegistry.registerItem(blackpick,"blackpick");
	    GameRegistry.registerItem(blackspade,"blackspade");
	    GameRegistry.registerItem(blackaxe,"blackaxe");
	    //ItemStacks
	    ItemStack redironstack = new ItemStack(this.rediron,3);
	    ItemStack redstoneblockstack = new ItemStack(Blocks.redstone_block,1);
	    ItemStack redstonestack = new ItemStack(Items.redstone,1);
	    ItemStack ironstack = new ItemStack(Items.iron_ingot,3);
	    ItemStack stickstack = new ItemStack(Items.stick,1);
	    ItemStack redpickstack = new ItemStack(this.redpick,1);
	    ItemStack redswordstack = new ItemStack(this.redsword,1);
	    ItemStack redspadestack = new ItemStack(this.redspade,1);
	    ItemStack redaxestack = new ItemStack(this.redaxe,1);
	    ItemStack blueironstack = new ItemStack(this.blueiron,3);
	    ItemStack lapisstack = new ItemStack(Items.dye,1,4);
	    ItemStack lapisblockstack = new ItemStack(Blocks.lapis_block,1);
	    ItemStack blueswordstack = new ItemStack(this.bluesword,1);
	    ItemStack bluepickstack = new ItemStack(this.bluepick,1);
	    ItemStack bluespadestack = new ItemStack(this.bluespade,1);
	    ItemStack blueaxestack = new ItemStack(this.blueaxe,1);
	    ItemStack coalstack = new ItemStack(Items.coal,1);
	    ItemStack blackswordstack = new ItemStack(this.blacksword,1);
	    ItemStack blackpickstack = new ItemStack(this.blackpick,1);
	    ItemStack blackspadestack = new ItemStack(this.blackspade,1);
	    ItemStack blackaxestack = new ItemStack(this.blackaxe,1);
	    ItemStack blackironstack = new ItemStack(this.blackiron,3);
	    //Crafting Recipes
	//rediron
	GameRegistry.addRecipe(redironstack,"zyz","xxx","zyz",'z',redstonestack,'y',redstoneblockstack,'x',ironstack);
	GameRegistry.addRecipe(redpickstack,"xxx"," z "," z ",'x',redironstack,'z',stickstack);
	GameRegistry.addRecipe(redswordstack," x "," x "," z ",'x',redironstack,'z',stickstack);
	GameRegistry.addRecipe(redspadestack," x "," z "," z ",'x',redironstack,'z',stickstack);
	GameRegistry.addRecipe(redaxestack," xx"," zx"," z ",'x',redironstack,'z',stickstack);
	GameRegistry.addRecipe(redaxestack," xx","xz "," z ",'x',redironstack,'z',stickstack);
	//blueiron
	GameRegistry.addRecipe(blueironstack,"zyz","xxx","zyz",'z',lapisstack,'y',lapisblockstack,'x',ironstack);
	GameRegistry.addRecipe(blueswordstack," x "," x "," z ",'x',blueironstack,'z',stickstack);
	GameRegistry.addRecipe(bluepickstack,"xxx"," z "," z ",'x',blueironstack,'z',stickstack);
	GameRegistry.addRecipe(bluespadestack," x "," z "," z ",'x',blueironstack,'z',stickstack);
	GameRegistry.addRecipe(blueaxestack," xx"," zx"," z ",'x',blueironstack,'z',stickstack);
	GameRegistry.addRecipe(blueaxestack," xx","xz "," z ",'x',blueironstack,'z',stickstack);
	//blackiron
	GameRegistry.addRecipe(blackironstack,"zzz","xxx","zzz",'z',coalstack,'x',ironstack);
	GameRegistry.addRecipe(blackswordstack," x "," x "," z ",'x',blackironstack,'z',stickstack);
	GameRegistry.addRecipe(blackpickstack,"xxx"," z "," z ",'x',blackironstack,'z',stickstack);
	GameRegistry.addRecipe(blackspadestack," x "," z "," z ",'x',blackironstack,'z',stickstack);
	GameRegistry.addRecipe(blackaxestack," xx"," zx"," z ",'x',blackironstack,'z',stickstack);
	GameRegistry.addRecipe(blackaxestack," xx","xz "," z ",'x',blackironstack,'z',stickstack);
    }
}
