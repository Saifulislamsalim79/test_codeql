package org.org.org.org.asm.nonstiff;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import java.io.File;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p549l0.C13276s;
import kotlin.p549l0.C13277t;
import org.org.org.org.asm.C14598f;
import org.org.org.org.asm.asm.Item;
import org.org.org.org.asm.asm.ZipInputStream;
/* renamed from: org.org.org.org.asm.nonstiff.b */
/* loaded from: classes.dex */
public final class C14611b implements InterfaceC14610a {

    /* renamed from: a */
    public static final String[] f32365a;

    /* renamed from: b */
    public static final InterfaceC11824h f32366b;

    /* renamed from: c */
    public static final C14611b f32367c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        InterfaceC11824h $r3;
        C14611b $r0 = new C14611b();
        f32367c = $r0;
        String[] $r1 = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        f32365a = $r1;
        StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2 $r2 = StringsKt__StringBuilderJVMKt$LINE_SEPARATOR$2.INSTANCE;
        $r3 = C13218k.m5625b($r2);
        f32366b = $r3;
    }

    private C14611b() {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    private final Item m1080b() {
        InterfaceC11824h $r2 = f32366b;
        Object $r1 = $r2.getValue();
        Item $r3 = (Item) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean get() {
        boolean $z0;
        String $r1 = Build.TAGS;
        if ($r1 != null) {
            $z0 = C13277t.m5421J($r1, "test-keys", false, 2, null);
            return $z0;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final boolean write() {
        String[] $r1 = f32365a;
        for (String $r3 : $r1) {
            File $r2 = new File($r3);
            boolean $z0 = $r2.exists();
            if ($z0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.nonstiff.InterfaceC14610a
    /* renamed from: a */
    public Item mo1081a() {
        Item $r1 = m1080b();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.nonstiff.InterfaceC14610a
    public boolean close() {
        boolean $z0 = get();
        if ($z0) {
            return true;
        }
        boolean $z02 = write();
        return $z02;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public ZipInputStream doInBackground() {
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
        long $l0 = $r2.availMem;
        long $l1 = $r1.freeMemory();
        boolean $z0 = $r2.lowMemory;
        ZipInputStream $r7 = new ZipInputStream($l0, $l1, $z0);
        return $r7;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // org.org.org.org.asm.nonstiff.InterfaceC14610a
    public boolean getContents() {
        boolean $z0;
        boolean $z02;
        boolean $z03;
        boolean $z04;
        boolean $z05;
        boolean $z06;
        boolean $z07;
        boolean $z08;
        String $r1 = Build.FINGERPRINT;
        Log_OC.loadImage($r1, "Build.FINGERPRINT");
        $z0 = C13276s.m5447E($r1, "generic", false, 2, null);
        if ($z0) {
            return true;
        }
        Log_OC.loadImage($r1, "Build.FINGERPRINT");
        $z02 = C13276s.m5447E($r1, "unknown", false, 2, null);
        if ($z02) {
            return true;
        }
        String $r12 = Build.MODEL;
        Log_OC.loadImage($r12, "Build.MODEL");
        $z03 = C13277t.m5421J($r12, "google_sdk", false, 2, null);
        if ($z03) {
            return true;
        }
        Log_OC.loadImage($r12, "Build.MODEL");
        $z04 = C13277t.m5421J($r12, "Emulator", false, 2, null);
        if ($z04) {
            return true;
        }
        Log_OC.loadImage($r12, "Build.MODEL");
        $z05 = C13277t.m5421J($r12, "Android SDK built for x86", false, 2, null);
        if ($z05) {
            return true;
        }
        String $r13 = Build.MANUFACTURER;
        Log_OC.loadImage($r13, "Build.MANUFACTURER");
        $z06 = C13277t.m5421J($r13, "Genymotion", false, 2, null);
        if ($z06) {
            return true;
        }
        String $r14 = Build.BRAND;
        Log_OC.loadImage($r14, "Build.BRAND");
        $z07 = C13276s.m5447E($r14, "generic", false, 2, null);
        if ($z07) {
            String $r15 = Build.DEVICE;
            Log_OC.loadImage($r15, "Build.DEVICE");
            $z08 = C13276s.m5447E($r15, "generic", false, 2, null);
            if ($z08) {
                return true;
            }
        }
        boolean $z09 = Log_OC.append("google_sdk", Build.PRODUCT);
        return $z09;
    }
}
