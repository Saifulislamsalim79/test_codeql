package org.org.org.org.asm.nonstiff;

import android.app.ActivityManager;
import android.content.Context;
import e.a.a.a.f.u.m;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import org.org.org.org.asm.C14598f;
import org.org.org.org.asm.asm.Item;
/* loaded from: classes.dex */
public final class StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2 extends AbstractC11802m implements InterfaceC11756a<m> {
    public static final StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2 INSTANCE;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2 $r0 = new StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2();
        INSTANCE = $r0;
    }

    public StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Item initialize() {
        Runtime $r1 = Runtime.getRuntime();
        ActivityManager.MemoryInfo $r2 = new ActivityManager.MemoryInfo();
        C14598f $r3 = C14598f.f32351c;
        Context $r4 = $r3.getContext();
        Object $r5 = $r4.getSystemService("activity");
        if ($r5 == null) {
            NullPointerException $r8 = new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            throw $r8;
        }
        ActivityManager $r6 = (ActivityManager) $r5;
        $r6.getMemoryInfo($r2);
        long $l0 = $r2.totalMem;
        long $l1 = $r1.totalMemory();
        Item $r7 = new Item($l0, $l1);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ m invoke() {
        Item $r1 = initialize();
        return $r1;
    }
}
