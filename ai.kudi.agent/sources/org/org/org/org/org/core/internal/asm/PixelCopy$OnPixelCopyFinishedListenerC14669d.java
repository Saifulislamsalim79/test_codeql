package org.org.org.org.org.core.internal.asm;

import android.graphics.Bitmap;
import android.os.HandlerThread;
import android.view.PixelCopy;
/* renamed from: org.org.org.org.org.core.internal.asm.d */
/* loaded from: classes.dex */
public final class PixelCopy$OnPixelCopyFinishedListenerC14669d implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: L */
    public final /* synthetic */ HandlerThread f32652L;

    /* renamed from: a */
    public final /* synthetic */ ClassWriter f32653a;

    /* renamed from: b */
    public final /* synthetic */ Bitmap f32654b;

    public PixelCopy$OnPixelCopyFinishedListenerC14669d(ClassWriter classWriter, Bitmap bitmap, HandlerThread handlerThread) {
        this.f32653a = classWriter;
        this.f32654b = bitmap;
        this.f32652L = handlerThread;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        if (i == 0) {
            ClassWriter $r2 = this.f32653a;
            Bitmap $r1 = this.f32654b;
            $r2.f32640p = $r1;
        }
        HandlerThread $r3 = this.f32652L;
        $r3.quitSafely();
    }
}
