package com.nettakrim.signed_paintings.mixin;

import net.minecraft.client.Screenshot;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Screenshot.class)
public class ScreenshotRecorderMixin {
    //@Inject(at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/platform/NativeImage;writeToFile(Ljava/io/File;)V"), method = "method_22691")
    //private static void onScreenshot(NativeImage nativeImage, File file, Consumer<?> consumer, CallbackInfo ci) {
    //    String filename = file.getPath().replace(SignedPaintingsClient.getScreenshotDirectory(), "");
    //    SignedPaintingsCommands.recentScreenshots.add(filename);
    //}
}
