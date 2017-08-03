import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aa")
public class class44 extends WorldMapData {
   @ObfuscatedName("cr")
   @ObfuscatedSignature(
      signature = "Lib;"
   )
   static IndexData field551;
   @ObfuscatedName("ix")
   @ObfuscatedGetter(
      intValue = -1909907631
   )
   static int field548;
   @ObfuscatedName("u")
   List field550;
   @ObfuscatedName("o")
   HashSet field546;
   @ObfuscatedName("p")
   HashSet field547;

   @ObfuscatedName("cg")
   @ObfuscatedSignature(
      signature = "(Lfw;ZI)V",
      garbageValue = "252003539"
   )
   void method638(Buffer var1, boolean var2) {
      this.field550 = new LinkedList();
      int var3 = var1.readUnsignedShort();

      for(int var4 = 0; var4 < var3; ++var4) {
         int var5 = var1.method3216();
         Coordinates var6 = new Coordinates(var1.readInt());
         boolean var7 = var1.readUnsignedByte() == 1;
         if(var2 || !var7) {
            this.field550.add(new class25(var5, var6));
         }
      }

   }

   @ObfuscatedName("cu")
   @ObfuscatedSignature(
      signature = "(Lfw;Lfw;Lfw;IZB)V",
      garbageValue = "-25"
   )
   void method637(Buffer var1, Buffer var2, Buffer var3, int var4, boolean var5) {
      this.loadMapData(var1, var4);
      int var6 = var3.readUnsignedShort();
      this.field546 = new HashSet(var6);

      int var7;
      for(var7 = 0; var7 < var6; ++var7) {
         class22 var8 = new class22();

         try {
            var8.method151(var2, var3);
         } catch (IllegalStateException var13) {
            continue;
         }

         this.field546.add(var8);
      }

      var7 = var3.readUnsignedShort();
      this.field547 = new HashSet(var7);

      for(int var11 = 0; var11 < var7; ++var11) {
         class45 var9 = new class45();

         try {
            var9.method644(var2, var3);
         } catch (IllegalStateException var12) {
            continue;
         }

         this.field547.add(var9);
      }

      this.method638(var2, var5);
   }
}
