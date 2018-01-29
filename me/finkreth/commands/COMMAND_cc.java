/*  1:   */ package me.finkreth.commands;
/*  2:   */ 
/*  3:   */ import me.finkreth.info.Info;
/*  4:   */ import org.bukkit.Bukkit;
/*  5:   */ import org.bukkit.command.Command;
/*  6:   */ import org.bukkit.command.CommandExecutor;
/*  7:   */ import org.bukkit.command.CommandSender;
/*  8:   */ import org.bukkit.entity.Player;
/*  9:   */ 
/* 10:   */ public class COMMAND_cc
/* 11:   */   implements CommandExecutor
/* 12:   */ {
/* 13:   */   public boolean onCommand(CommandSender cs, Command cmd, String arg2, String[] args)
/* 14:   */   {
/* 15:15 */     if (cmd.getName().equalsIgnoreCase("cc")) {
/* 16:16 */       if (!(cs instanceof Player))
/* 17:   */       {
/* 18:17 */         cs.sendMessage(Main.nocons);
/* 19:   */       }
/* 20:   */       else
/* 21:   */       {
/* 22:19 */         Player p = (Player)cs;
/* 23:20 */         if (p.hasPermission("lobby.chatclear"))
/* 24:   */         {
/* 25:21 */           for (int i = 0; i < 50; i++) {
/* 26:22 */             Bukkit.broadcastMessage(" ");
/* 27:   */           }
/* 28:24 */           Bukkit.broadcastMessage(Main.prefix + "§7Der Chat wurde von §b" + p.getName() + "§7geleert!");
/* 29:   */         }
/* 30:   */         else
/* 31:   */         {
/* 32:26 */           p.sendMessage(Main.noperm);
/* 33:   */         }
/* 34:   */       }
/* 35:   */     }
/* 36:31 */     return true;
/* 37:   */   }
/* 38:   */ }