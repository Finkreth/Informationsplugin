/*  1:   */ package me.finkreth.info;
/*  2:   */
/*  3:   */ import me.finkreth.commands.COMMAND_cc
/*  4:   */ import java.io.PrintStream;
/*  5:   */ import org.bukkit.Location;
/*  6:   */ import org.bukkit.Server;
/*  7:   */ import org.bukkit.entity.Player;
/*  8:   */ import org.bukkit.event.EventHandler;
/*  9:   */ import org.bukkit.event.Listener;
/*  10:   */ import org.bukkit.event.player.PlayerJoinEvent;
/* 11:   */ import org.bukkit.plugin.PluginManager;
/* 12:   */ import org.bukkit.plugin.java.JavaPlugin;
/* 13:   */
/* 14:   */ public class Info
/* 15:   */   extends JavaPlugin
/* 16:   */   implements Listener
/* 17:   */ {
/* 18:   */   public void onEnable()
/* 19:   */   {
/* 20:15 */     getServer().getPluginManager().registerEvents(this, this);
/* 21:16 */     System.out.println("[Info] Plugin erfolgreich aktiviert!");
/* 22:   */   }
/* 23:   */
/* 24:   */   public void onDisable()
/* 25:   */   {
/* 26:21 */     System.out.println("[Info] Plugin erfolgreich deaktiviert!");
/* 27:   */   }
/* 28:   */
/* 29:   */   @EventHandler
/* 30:   */   public void OnPlayerJoinEvent(PlayerJoinEvent event)
/* 31:   */   {
/* 32:26 */     Player player = event.getPlayer();
/* 33:27 */     float yaw = 0.0F;
/* 34:28 */     float pitch = 4.0F;
/* 35:29 */     Location spawn = new Location(player.getWorld(), 1557.3340000000001D, 89.0D, 859.82100000000003D, yaw, pitch);
/* 36:30 */     player.teleport(spawn);
/* 37:   */   }
/* 38:   */ }