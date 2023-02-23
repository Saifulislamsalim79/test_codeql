package org.org.org.org.asm;

import android.widget.ImageView;
/* renamed from: org.org.org.org.asm.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C14606l {

    /* renamed from: c */
    public static final /* synthetic */ int[] f32362c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        ImageView.ScaleType[] $r0 = ImageView.ScaleType.values();
        int $i0 = $r0.length;
        int[] $r1 = new int[$i0];
        f32362c = $r1;
        ImageView.ScaleType $r2 = ImageView.ScaleType.MATRIX;
        int $i02 = $r2.ordinal();
        $r1[$i02] = 1;
        ImageView.ScaleType $r22 = ImageView.ScaleType.FIT_XY;
        int $i03 = $r22.ordinal();
        $r1[$i03] = 2;
        ImageView.ScaleType $r23 = ImageView.ScaleType.FIT_START;
        int $i04 = $r23.ordinal();
        $r1[$i04] = 3;
        ImageView.ScaleType $r24 = ImageView.ScaleType.FIT_CENTER;
        int $i05 = $r24.ordinal();
        $r1[$i05] = 4;
        ImageView.ScaleType $r25 = ImageView.ScaleType.FIT_END;
        int $i06 = $r25.ordinal();
        $r1[$i06] = 5;
        ImageView.ScaleType $r26 = ImageView.ScaleType.CENTER;
        int $i07 = $r26.ordinal();
        $r1[$i07] = 6;
        ImageView.ScaleType $r27 = ImageView.ScaleType.CENTER_CROP;
        int $i08 = $r27.ordinal();
        $r1[$i08] = 7;
        ImageView.ScaleType $r28 = ImageView.ScaleType.CENTER_INSIDE;
        int $i09 = $r28.ordinal();
        $r1[$i09] = 8;
    }
}
