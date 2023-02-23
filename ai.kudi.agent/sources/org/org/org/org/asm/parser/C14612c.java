package org.org.org.org.asm.parser;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.p483e0.p485d.Log_OC;
/* renamed from: org.org.org.org.asm.parser.c */
/* loaded from: classes.dex */
public final class C14612c {

    /* renamed from: a */
    public static final List<Long> f32379a;

    /* renamed from: c */
    public static final C14612c f32380c;

    /* renamed from: f */
    public static final List<Long> f32381f;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14612c $r0 = new C14612c();
        f32380c = $r0;
        ArrayList $r1 = new ArrayList();
        f32379a = $r1;
        ArrayList $r12 = new ArrayList();
        f32381f = $r12;
    }

    private C14612c() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1062a() {
        System $r4 = System.f32375c;
        LogAspect $r1 = LogAspect.RENDERING_HISTOGRAM;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r4.get($r1, false, $r2);
        TopLevel$NativeErrors $r6 = TopLevel$NativeErrors.f32378m;
        if ($r5 == $r6) {
            List $r8 = f32379a;
            Label $r7 = new Label($r8);
            List $r82 = f32381f;
            Label $r9 = new Label($r82);
            TopLevel$NativeErrors $r52 = $r4.get($r1, false, $r2);
            int $i0 = $r52.ordinal();
            if ($i0 == 0) {
                StringBuilder $r10 = new StringBuilder();
                String $r11 = $r7.m1068a();
                String $r112 = $r9.m1068a();
                java.lang.Object[] $r3 = {$r11, $r112};
                String $r113 = String.format(" \nNATIVE:\n%s\n\nWIREFRAMES:\n%s", Arrays.copyOf($r3, 2));
                Log_OC.loadImage($r113, "java.lang.String.format(format, *args)");
                $r10.append($r113);
                $r10.append(", [logAspect: ");
                $r10.append($r1);
                $r10.append(']');
                String $r114 = $r10.toString();
                $r4.size($r1, $r2, "RenderingHistogram", $r114);
            }
        }
        List $r83 = f32379a;
        $r83.clear();
        List $r84 = f32381f;
        $r84.clear();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1061a(long j, org.org.org.org.org.core.internal.asm.TopLevel$NativeErrors topLevel$NativeErrors) {
        Log_OC.getArray(topLevel$NativeErrors, "category");
        int $i1 = topLevel$NativeErrors.ordinal();
        if ($i1 == 0) {
            List $r2 = f32379a;
            Long $r3 = Long.valueOf(j);
            $r2.add($r3);
        } else if ($i1 != 1) {
        } else {
            List $r22 = f32381f;
            Long $r32 = Long.valueOf(j);
            $r22.add($r32);
        }
    }
}
