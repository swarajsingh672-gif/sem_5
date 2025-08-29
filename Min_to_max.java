// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Min_to_max {
   public static Main() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      int var2 = var1.nextInt();

      while(var2-- > 0) {
         int var3 = var1.nextInt();
         int[] var4 = new int[var3];

         int var5;
         for(var5 = 0; var5 < var3; ++var5) {
            var4[var5] = var1.nextInt();
         }

         var5 = var4[0];

         int var6;
         for(var6 = 1; var6 < var3; ++var6) {
            if (var4[var6] < var5) {
               var5 = var4[var6];
            }
         }

         var6 = 0;

         for(int var7 = 0; var7 < var3; ++var7) {
            if (var4[var7] > var5) {
               ++var6;
            }
         }

         System.out.println(var6);
      }

   }
}
