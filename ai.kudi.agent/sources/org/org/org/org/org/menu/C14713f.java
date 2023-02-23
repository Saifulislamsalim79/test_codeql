package org.org.org.org.org.menu;

import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.asm.Activity.Settings;
import org.org.org.org.asm.asm.C14589h;
import org.org.org.org.asm.asm.Label;
import org.org.org.org.asm.parser.Attribute;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.C14705f;
/* renamed from: org.org.org.org.org.menu.f */
/* loaded from: classes.dex */
public final class C14713f extends File {

    /* renamed from: d */
    public static final long f32853d;

    /* renamed from: a */
    public final Runnable f32854a;

    /* renamed from: e */
    public final ExecutorService f32855e;

    /* renamed from: f */
    public Future<?> f32856f;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        TimeUnit $r0 = TimeUnit.SECONDS;
        long $l0 = $r0.toMillis(30L);
        f32853d = $l0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14713f(String str) {
        super(str);
        Log_OC.getArray(str, "folderPath");
        Runnable $r2 = m566s();
        this.f32854a = $r2;
        Settings $r3 = Settings.this$0;
        ExecutorService $r4 = $r3.getString(2, "fsize");
        Log_OC.loadImage($r4, "ThreadUtils.createFixedP…CUTOR_POOL_SIZE, \"fsize\")");
        this.f32855e = $r4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0023 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m572a(java.io.File r33) {
        /*
            r32 = this;
            r5 = 0
            if (r33 == 0) goto Lc1
            r0 = r33
            boolean r7 = r0.exists()     // Catch: java.lang.Exception -> L39
            if (r7 == 0) goto Lc1
            r9 = 0
            r10 = 1
            r11 = 0
            r0 = r33
            kotlin.io.e r8 = kotlin.p492io.C11855h.m10242h(r0, r9, r10, r11)     // Catch: java.lang.Exception -> L39
            org.org.org.org.org.menu.d$b$b r12 = org.org.org.org.org.menu.d$b$b.ABSOLUTE
            kotlin.k0.h r13 = kotlin.p548k0.C13231i.m5600m(r8, r12)     // Catch: java.lang.Exception -> L39
            java.util.Iterator r14 = r13.iterator()     // Catch: java.lang.Exception -> L39
        L1f:
            boolean r7 = r14.hasNext()     // Catch: java.lang.Exception -> L39
            if (r7 == 0) goto Lc4
            java.lang.Object r15 = r14.next()     // Catch: java.lang.Exception -> L39
            r16 = r15
            java.io.File r16 = (java.io.File) r16
            r33 = r16
            r0 = r33
            long r17 = r0.length()     // Catch: java.lang.Exception -> L39
            r0 = r17
            long r5 = r5 + r0
            goto L1f
        L39:
            r19 = move-exception
            org.org.org.org.asm.parser.System r20 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r21 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.MANDATORY
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r22 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r10 = 0
            r0 = r20
            r1 = r21
            r2 = r22
            org.org.org.org.asm.parser.TopLevel$NativeErrors r23 = r0.get(r1, r10, r2)
            r0 = r23
            int r24 = r0.ordinal()
            if (r24 == 0) goto L54
            return r5
        L54:
            java.lang.StringBuilder r25 = new java.lang.StringBuilder
            r0 = r25
            r0.<init>()
            java.lang.StringBuilder r26 = new java.lang.StringBuilder
            r0 = r26
            r0.<init>()
            java.lang.String r27 = "SdkFolder.getFolderSizeWithoutImages(): exception=["
            r0 = r26
            r1 = r27
            r0.append(r1)
            r10 = 0
            r29 = 2
            r9 = 0
            r0 = r19
            r1 = r29
            java.lang.String r28 = org.org.org.org.asm.parser.Log.get(r0, r10, r1, r9)
            r0 = r26
            r1 = r28
            r0.append(r1)
            java.lang.String r27 = "] "
            r0 = r26
            r1 = r27
            r0.append(r1)
            r0 = r26
            java.lang.String r28 = r0.toString()
            r0 = r25
            r1 = r28
            r0.append(r1)
            java.lang.String r27 = ", [logAspect: "
            r0 = r25
            r1 = r27
            r0.append(r1)
            r0 = r25
            r1 = r21
            r0.append(r1)
            r10 = 93
            r0 = r25
            r0.append(r10)
            r0 = r25
            java.lang.String r28 = r0.toString()
            java.lang.String r27 = "SDKStorageHandler"
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r27
            r4 = r28
            r0.size(r1, r2, r3, r4)
            return r5
        Lc1:
            r30 = 0
            return r30
        Lc4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.org.menu.C14713f.m572a(java.io.File):long");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final boolean m571a(Label label) {
        if (label != null) {
            long $l0 = System.currentTimeMillis();
            long $l1 = label.getFirst();
            long $l02 = $l0 - $l1;
            long $l12 = f32853d;
            return $l02 > $l12;
        }
        return true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void close() {
        Future $r1 = this.f32856f;
        if ($r1 != null) {
            Log_OC.append($r1);
            $r1.cancel(true);
            this.f32856f = null;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final long m568d() {
        long $l0 = m572a(this);
        Label $r4 = new Label($l0, 0L, 2, null);
        m567d($r4);
        System $r5 = System.f32375c;
        LogAspect $r6 = LogAspect.STORAGE;
        LogSeverity $r1 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r7 = $r5.get($r6, true, $r1);
        int $i1 = $r7.ordinal();
        if ($i1 != 0) {
            return $l0;
        }
        StringBuilder $r2 = new StringBuilder();
        StringBuilder $r3 = new StringBuilder();
        $r3.append("SdkFolder.calculateFolderSize() [Slow] SDK folder size calculated: ");
        $r3.append("size = ");
        Attribute $r8 = Attribute.f32368a;
        String $r9 = Attribute.m1072a($r8, $l0, false, 2, null);
        $r3.append($r9);
        String $r92 = $r3.toString();
        $r2.append($r92);
        $r2.append(", [logAspect: ");
        $r2.append($r6);
        $r2.append(']');
        String $r93 = $r2.toString();
        $r5.size($r6, $r1, "SDKStorageHandler", $r93);
        return $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: s */
    private final Runnable m566s() {
        return new Runnable() { // from class: org.org.org.org.org.menu.d$b$a
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            @Override // java.lang.Runnable
            public final void run() {
                C14713f $r1 = C14713f.this;
                C14713f $r3 = C14713f.this;
                long $l0 = $r3.m572a($r3);
                Label $r2 = new Label($l0, 0L, 2, null);
                $r1.m567d($r2);
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Label m573a() {
        C14705f $r3 = C14705f.f32765a;
        C14589h $r1 = Label.f32327g;
        Object $r2 = $r3.add("FOLDER_SIZE", $r1);
        Label $r4 = (Label) $r2;
        return $r4;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final long m569b() {
        Label $r7;
        try {
            $r7 = m573a();
        } catch (Exception e) {
            $r7 = null;
        }
        boolean $z0 = m571a($r7);
        if ($z0) {
            close();
            return m568d();
        }
        close();
        ExecutorService $r8 = this.f32855e;
        Runnable $r9 = this.f32854a;
        Future $r10 = $r8.submit($r9);
        this.f32856f = $r10;
        if ($r7 != null) {
            long $l0 = $r7.m1139a();
            System $r1 = System.f32375c;
            LogAspect $r2 = LogAspect.STORAGE;
            LogSeverity $r3 = LogSeverity.VERBOSE;
            TopLevel$NativeErrors $r11 = $r1.get($r2, true, $r3);
            int $i1 = $r11.ordinal();
            if ($i1 != 0) {
                return $l0;
            }
            StringBuilder $r4 = new StringBuilder();
            StringBuilder $r5 = new StringBuilder();
            $r5.append("SdkFolder.size() [Fast] SDK folder size loaded from cache: ");
            $r5.append("size = ");
            Attribute $r12 = Attribute.f32368a;
            String $r13 = Attribute.m1072a($r12, $l0, false, 2, null);
            $r5.append($r13);
            String $r132 = $r5.toString();
            $r4.append($r132);
            $r4.append(", [logAspect: ");
            $r4.append($r2);
            $r4.append(']');
            String $r133 = $r4.toString();
            $r1.size($r2, $r3, "SDKStorageHandler", $r133);
            return $l0;
        }
        return m568d();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final void m567d(Label label) {
        Log_OC.getArray(label, "folderSize");
        C14705f $r2 = C14705f.f32765a;
        $r2.add(label, "FOLDER_SIZE");
    }
}
