package io.intercom.android.sdk.conversation.composer.galleryinput;

import android.graphics.Bitmap;
import io.intercom.com.bumptech.glide.load.engine.p396y.InterfaceC10581e;
import io.intercom.com.bumptech.glide.load.p402o.p403c.C10744g;
/* loaded from: classes.dex */
class DownscaleOnlyCenterCrop extends C10744g {
    static final DownscaleOnlyCenterCrop INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        DownscaleOnlyCenterCrop $r0 = new DownscaleOnlyCenterCrop();
        INSTANCE = $r0;
    }

    DownscaleOnlyCenterCrop() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    @Override // io.intercom.com.bumptech.glide.load.p402o.p403c.C10744g, io.intercom.com.bumptech.glide.load.p402o.p403c.AbstractC10742e
    public Bitmap transform(InterfaceC10581e interfaceC10581e, Bitmap bitmap, int i, int i2) {
        int $i2 = bitmap.getHeight();
        if ($i2 <= i2) {
            int $i22 = bitmap.getWidth();
            if ($i22 <= i) {
                return bitmap;
            }
        }
        Bitmap $r1 = super.transform(interfaceC10581e, bitmap, i, i2);
        return $r1;
    }
}
