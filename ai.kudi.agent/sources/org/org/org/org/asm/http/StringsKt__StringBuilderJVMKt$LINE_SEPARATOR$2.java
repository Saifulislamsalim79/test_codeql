package org.org.org.org.asm.http;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import org.org.org.org.asm.C14598f;
/* loaded from: classes.dex */
public final class StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2 extends AbstractC11802m implements InterfaceC11756a<PackageInfo> {
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
    public final PackageInfo doInBackground() {
        C14598f $r2 = C14598f.f32351c;
        try {
            Context $r3 = $r2.getContext();
            PackageManager $r4 = $r3.getPackageManager();
            C14603f $r5 = C14603f.f32359c;
            String $r6 = $r5.close();
            PackageInfo $r7 = $r4.getPackageInfo($r6, 128);
            return $r7;
        } catch (PackageManager.NameNotFoundException e) {
            return null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ PackageInfo invoke() {
        PackageInfo $r1 = doInBackground();
        return $r1;
    }
}
