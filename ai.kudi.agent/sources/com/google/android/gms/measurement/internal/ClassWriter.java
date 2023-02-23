package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.util.InterfaceC2967e;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* loaded from: classes.dex */
public final class ClassWriter implements AbstractParser {

    /* renamed from: z */
    private static volatile ClassWriter f9945z;

    /* renamed from: A */
    private volatile Boolean f9946A;

    /* renamed from: B */
    private final String f9947B;

    /* renamed from: G */
    private volatile boolean f9948G;

    /* renamed from: H */
    private final String f9949H;

    /* renamed from: K */
    private final boolean f9950K;

    /* renamed from: M */
    private final C4292m7 f9951M;

    /* renamed from: a */
    protected Boolean f9952a;

    /* renamed from: b */
    private final C4215g f9953b;

    /* renamed from: c */
    private final Context f9954c;

    /* renamed from: d */
    private final String f9955d;

    /* renamed from: e */
    private Boolean f9956e;

    /* renamed from: f */
    private C4308o f9957f;

    /* renamed from: g */
    private final ByteVector f9958g;

    /* renamed from: h */
    final long f9959h;
    private final C4158b index;

    /* renamed from: k */
    private final C4245i7 f9960k;
    private final Item key;

    /* renamed from: l */
    private boolean f9961l = false;

    /* renamed from: m */
    private C4410w8 f9962m;

    /* renamed from: mv */
    private final C4294m9 f9963mv;

    /* renamed from: n */
    private final AtomicInteger f9964n;

    /* renamed from: o */
    private final C4409w7 f9965o;

    /* renamed from: p */
    private C4237i f9966p;
    protected Boolean pool;

    /* renamed from: q */
    private final InterfaceC2967e f9967q;

    /* renamed from: r */
    private final C4181d f9968r;

    /* renamed from: s */
    private final String f9969s;

    /* renamed from: t */
    private final C4184d2 f9970t;

    /* renamed from: u */
    private final C4276l3 f9971u;

    /* renamed from: v */
    private final C4429y4 f9972v;

    /* renamed from: w */
    private C4252j3 f9973w;

    /* renamed from: x */
    private long f9974x;

    /* renamed from: y */
    private int f9975y;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x01db, code lost:
        if (r0 != 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    ClassWriter(com.google.android.gms.measurement.internal.C4210f6 r70) {
        /*
            Method dump skipped, instructions count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ClassWriter.<init>(com.google.android.gms.measurement.internal.f6):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r12 == null) goto L7;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.measurement.internal.ClassWriter m28434a(android.content.Context r29, com.google.android.gms.internal.measurement.C3919o1 r30, java.lang.Long r31) {
        /*
            java.lang.Class<com.google.android.gms.measurement.internal.b5> r11 = com.google.android.gms.measurement.internal.b5.class
            if (r30 == 0) goto L46
            r0 = r30
            java.lang.String r12 = r0.f9587w
            if (r12 == 0) goto L10
            r0 = r30
            java.lang.String r12 = r0.f9588x
            if (r12 != 0) goto L46
        L10:
            com.google.android.gms.internal.measurement.o1 r13 = new com.google.android.gms.internal.measurement.o1
            r0 = r30
            long r14 = r0.f9583c
            r0 = r30
            long r0 = r0.f9584d
            r16 = r0
            r0 = r30
            boolean r0 = r0.f9585e
            r18 = r0
            r0 = r30
            java.lang.String r12 = r0.f9586f
            r0 = r30
            android.os.Bundle r0 = r0.f9589y
            r19 = r0
            r20 = 0
            r21 = 0
            r22 = 0
            r0 = r13
            r1 = r14
            r3 = r16
            r5 = r18
            r6 = r12
            r7 = r20
            r8 = r21
            r9 = r19
            r10 = r22
            r0.<init>(r1, r3, r5, r6, r7, r8, r9, r10)
            r30 = r13
        L46:
            r0 = r29
            com.google.android.gms.common.internal.List.m31820a(r0)
            r0 = r29
            android.content.Context r23 = r0.getApplicationContext()
            r0 = r23
            com.google.android.gms.common.internal.List.m31820a(r0)
            com.google.android.gms.measurement.internal.ClassWriter r24 = com.google.android.gms.measurement.internal.ClassWriter.f9945z
            if (r24 != 0) goto L7c
            monitor-enter(r11)
            com.google.android.gms.measurement.internal.ClassWriter r24 = com.google.android.gms.measurement.internal.ClassWriter.f9945z     // Catch: java.lang.Throwable -> L79
            if (r24 != 0) goto L77
            com.google.android.gms.measurement.internal.f6 r25 = new com.google.android.gms.measurement.internal.f6     // Catch: java.lang.Throwable -> L79
            r0 = r25
            r1 = r29
            r2 = r30
            r3 = r31
            r0.<init>(r1, r2, r3)     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.measurement.internal.ClassWriter r24 = new com.google.android.gms.measurement.internal.ClassWriter     // Catch: java.lang.Throwable -> L79
            r0 = r24
            r1 = r25
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L79
            com.google.android.gms.measurement.internal.ClassWriter.f9945z = r24     // Catch: java.lang.Throwable -> L79
        L77:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L79
            goto Lb7
        L79:
            r26 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L79
            throw r26
        L7c:
            if (r30 == 0) goto Lb7
            r0 = r30
            android.os.Bundle r0 = r0.f9589y
            r19 = r0
            if (r19 == 0) goto Lb7
            java.lang.String r27 = "dataCollectionDefaultEnabled"
            r0 = r19
            r1 = r27
            boolean r18 = r0.containsKey(r1)
            if (r18 == 0) goto Lb7
            com.google.android.gms.measurement.internal.ClassWriter r24 = com.google.android.gms.measurement.internal.ClassWriter.f9945z
            r0 = r24
            com.google.android.gms.common.internal.List.m31820a(r0)
            com.google.android.gms.measurement.internal.ClassWriter r24 = com.google.android.gms.measurement.internal.ClassWriter.f9945z
            r0 = r30
            android.os.Bundle r0 = r0.f9589y
            r19 = r0
            java.lang.String r27 = "dataCollectionDefaultEnabled"
            r0 = r19
            r1 = r27
            boolean r18 = r0.getBoolean(r1)
            r0 = r18
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r0)
            r0 = r28
            r1 = r24
            r1.f9946A = r0
        Lb7:
            com.google.android.gms.measurement.internal.ClassWriter r24 = com.google.android.gms.measurement.internal.ClassWriter.f9945z
            r0 = r24
            com.google.android.gms.common.internal.List.m31820a(r0)
            com.google.android.gms.measurement.internal.ClassWriter r24 = com.google.android.gms.measurement.internal.ClassWriter.f9945z
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ClassWriter.m28434a(android.content.Context, com.google.android.gms.internal.measurement.o1, java.lang.Long):com.google.android.gms.measurement.internal.ClassWriter");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m28432a(ClassWriter classWriter, C4210f6 c4210f6) {
        String $r14;
        C4429y4 $r2 = classWriter.newClass();
        $r2.m27823h();
        C4215g $r3 = classWriter.f9953b;
        $r3.m28257e();
        C4308o r19 = new C4308o(classWriter);
        Label r22 = (Label) r19;
        r22.put();
        classWriter.f9957f = r19;
        long $l0 = c4210f6.f10263f;
        C4237i $r10 = new C4237i(classWriter, $l0);
        $r10.put();
        classWriter.f9966p = $r10;
        C4252j3 r20 = new C4252j3(classWriter);
        ((AbstractC4413x) r20).put();
        classWriter.f9973w = r20;
        C4410w8 r21 = new C4410w8(classWriter);
        AbstractC4413x r23 = (AbstractC4413x) r21;
        r23.put();
        classWriter.f9962m = r21;
        ByteVector $r8 = classWriter.f9958g;
        $r8.visitMaxs();
        C4181d $r9 = classWriter.f9968r;
        $r9.visitMaxs();
        classWriter.f9966p.visitFrame();
        Item $r11 = classWriter.get();
        C4312o3 $r12 = $r11.m28413r();
        C4215g $r32 = classWriter.f9953b;
        $r32.m28256f();
        $r12.m28013b("App measurement initialized, version", 46000L);
        Item $r112 = classWriter.get();
        C4312o3 $r122 = $r112.m28413r();
        $r122.m28014a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String $r142 = $r10.getItem();
        String $r15 = classWriter.f9955d;
        boolean $z0 = TextUtils.isEmpty($r15);
        if ($z0) {
            ByteVector $r82 = classWriter.m28427b();
            boolean $z02 = $r82.m28460a($r142);
            if ($z02) {
                Item $r113 = classWriter.get();
                C4312o3 $r123 = $r113.m28413r();
                $r123.m28014a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                Item $r114 = classWriter.get();
                C4312o3 $r124 = $r114.m28413r();
                String $r143 = String.valueOf($r142);
                int $i1 = $r143.length();
                if ($i1 != 0) {
                    $r14 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat($r143);
                } else {
                    $r14 = $r15;
                    String $r152 = new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                }
                $r124.m28014a($r14);
            }
        }
        Item $r115 = classWriter.get();
        C4312o3 $r125 = $r115.save();
        $r125.m28014a("Debug-level message logging enabled");
        int $i12 = classWriter.f9975y;
        AtomicInteger $r16 = classWriter.f9964n;
        int $i2 = $r16.get();
        if ($i12 != $i2) {
            Item $r116 = classWriter.get();
            C4312o3 $r126 = $r116.m28416b();
            int $i13 = classWriter.f9975y;
            Integer $r17 = Integer.valueOf($i13);
            AtomicInteger $r162 = classWriter.f9964n;
            int $i14 = $r162.get();
            Integer $r18 = Integer.valueOf($i14);
            $r126.m28012c("Not all components initialized", $r17, $r18);
        }
        classWriter.f9961l = true;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private static final void m28431a(MethodWriter methodWriter) {
        if (methodWriter != null) {
            return;
        }
        IllegalStateException $r1 = new IllegalStateException("Component not created");
        throw $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private static final void m28430a(AbstractC4413x abstractC4413x) {
        if (abstractC4413x == null) {
            IllegalStateException $r1 = new IllegalStateException("Component not created");
            throw $r1;
        }
        boolean $z0 = abstractC4413x.getCount();
        if ($z0) {
            return;
        }
        Class $r2 = abstractC4413x.getClass();
        String $r3 = String.valueOf($r2);
        String $r4 = String.valueOf($r3);
        $r4.length();
        IllegalStateException $r12 = new IllegalStateException("Component not initialized: ".concat(String.valueOf($r3)));
        throw $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private static final void put(Label label) {
        if (label == null) {
            IllegalStateException $r1 = new IllegalStateException("Component not created");
            throw $r1;
        }
        boolean $z0 = label.equals();
        if ($z0) {
            return;
        }
        Class $r2 = label.getClass();
        String $r3 = String.valueOf($r2);
        String $r4 = String.valueOf($r3);
        $r4.length();
        IllegalStateException $r12 = new IllegalStateException("Component not initialized: ".concat(String.valueOf($r3)));
        throw $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static final void visitEnd() {
        IllegalStateException $r0 = new IllegalStateException("Unexpected call on client side");
        throw $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d1, code lost:
        if (r17 != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0271, code lost:
        if (r17 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0472, code lost:
        if (r17 == false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024b  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void m28433a(com.google.android.gms.internal.measurement.C3919o1 r55) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ClassWriter.m28433a(com.google.android.gms.internal.measurement.o1):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final /* synthetic */ void m28429a(String str, int $i0, Throwable th, byte[] bArr, Map map) {
        if ($i0 != 200 && $i0 != 204) {
            if ($i0 == 304) {
                $i0 = 304;
            }
            Item $r9 = get();
            C4312o3 $r10 = $r9.clear();
            Integer $r24 = Integer.valueOf($i0);
            $r10.m28012c("Network Request for Deferred Deep Link failed. response, exception", $r24, th);
        }
        if (th == null) {
            C4181d $r5 = putByte();
            C4439z3 $r6 = $r5.f10180A;
            $r6.m27806a(true);
            if (bArr == null || bArr.length == 0) {
                Item $r92 = get();
                C4312o3 $r102 = $r92.save();
                $r102.m28014a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject $r7 = new JSONObject(new String(bArr));
                String $r1 = $r7.optString("deeplink", "");
                String $r8 = $r7.optString("gclid", "");
                double $d0 = $r7.optDouble("timestamp", 0.0d);
                boolean $z0 = TextUtils.isEmpty($r1);
                if ($z0) {
                    Item $r93 = get();
                    C4312o3 $r103 = $r93.save();
                    $r103.m28014a("Deferred Deep Link is empty.");
                    return;
                }
                ByteVector $r11 = m28427b();
                ClassWriter classWriter = ((MethodWriter) $r11).f9987b;
                boolean $z02 = TextUtils.isEmpty($r1);
                if (!$z02) {
                    ClassWriter $r12 = ((MethodWriter) $r11).f9987b;
                    Context $r13 = $r12.f9954c;
                    PackageManager $r14 = $r13.getPackageManager();
                    Uri $r16 = Uri.parse($r1);
                    Intent $r15 = new Intent("android.intent.action.VIEW", $r16);
                    List $r17 = $r14.queryIntentActivities($r15, 0);
                    if ($r17 != null) {
                        boolean $z03 = $r17.isEmpty();
                        if (!$z03) {
                            Bundle $r18 = new Bundle();
                            $r18.putString("gclid", $r8);
                            $r18.putString("_cis", "ddp");
                            C4245i7 $r19 = this.f9960k;
                            $r19.m28124u("auto", "_cmp", $r18);
                            ByteVector $r112 = m28427b();
                            boolean $z04 = TextUtils.isEmpty($r1);
                            if ($z04) {
                                return;
                            }
                            try {
                                ClassWriter $r122 = ((MethodWriter) $r112).f9987b;
                                Context $r132 = $r122.f9954c;
                                SharedPreferences $r20 = $r132.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0);
                                SharedPreferences.Editor $r21 = $r20.edit();
                                $r21.putString("deeplink", $r1);
                                long $l1 = Double.doubleToRawLongBits($d0);
                                $r21.putLong("timestamp", $l1);
                                boolean $z05 = $r21.commit();
                                if ($z05) {
                                    Intent $r152 = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                    ClassWriter $r123 = ((MethodWriter) $r112).f9987b;
                                    $r123.f9954c.sendBroadcast($r152);
                                    return;
                                }
                                return;
                            } catch (RuntimeException $r22) {
                                ClassWriter $r124 = ((MethodWriter) $r112).f9987b;
                                Item $r94 = $r124.get();
                                C4312o3 $r104 = $r94.m28416b();
                                $r104.m28013b("Failed to persist Deferred Deep Link. exception", $r22);
                                return;
                            }
                        }
                    }
                }
                Item $r95 = get();
                C4312o3 $r105 = $r95.clear();
                $r105.m28012c("Deferred Deep Link validation failed. gclid, deep link", $r8, $r1);
                return;
            } catch (JSONException $r23) {
                Item $r96 = get();
                C4312o3 $r106 = $r96.m28416b();
                $r106.m28013b("Failed to parse the Deferred Deep Link response. exception", $r23);
                return;
            }
        }
        Item $r97 = get();
        C4312o3 $r107 = $r97.clear();
        Integer $r242 = Integer.valueOf($i0);
        $r107.m28012c("Network Request for Deferred Deep Link failed. response, exception", $r242, th);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    final void m28428a(boolean z) {
        Boolean $r1 = Boolean.valueOf(z);
        this.f9946A = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (java.lang.Math.abs(r6 - r12) > 1000) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:
        if (r15 != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b6  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean m28435a() {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.ClassWriter.m28435a():boolean");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4292m7 accept() {
        C4292m7 $r1 = this.f9951M;
        Label r2 = (Label) $r1;
        put(r2);
        C4292m7 $r12 = this.f9951M;
        return $r12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void append() {
        AtomicInteger $r1 = this.f9964n;
        $r1.incrementAndGet();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public final ByteVector m28427b() {
        ByteVector $r1 = this.f9958g;
        m28431a($r1);
        ByteVector $r12 = this.f9958g;
        return $r12;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4429y4 booleanValue() {
        C4429y4 r1 = this.f9972v;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.measurement.internal.AbstractParser
    /* renamed from: c */
    public final InterfaceC2967e mo28412c() {
        InterfaceC2967e r1 = this.f9967q;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final void m28426c(boolean z) {
        C4429y4 $r1 = newClass();
        $r1.m27823h();
        this.f9948G = z;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    public final C4409w7 m28425d() {
        C4409w7 $r1 = this.f9965o;
        AbstractC4413x r2 = (AbstractC4413x) $r1;
        m28430a(r2);
        C4409w7 $r12 = this.f9965o;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String encode() {
        String r1 = this.f9947B;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean equals() {
        String $r1 = this.f9955d;
        boolean $z0 = TextUtils.isEmpty($r1);
        return $z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final C4245i7 m28424f() {
        C4245i7 $r1 = this.f9960k;
        AbstractC4413x r2 = (AbstractC4413x) $r1;
        m28430a(r2);
        C4245i7 $r12 = this.f9960k;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.measurement.internal.AbstractParser
    public final Item get() {
        Item $r1 = this.key;
        put($r1);
        Item $r12 = this.key;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.measurement.internal.AbstractParser
    public final Context getContext() {
        Context r1 = this.f9954c;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int getCount() {
        C4429y4 $r2 = newClass();
        $r2.m27823h();
        boolean $z0 = this.f9953b.put();
        if ($z0) {
            return 1;
        }
        Boolean $r4 = this.f9952a;
        if ($r4 != null) {
            boolean $z02 = $r4.booleanValue();
            if ($z02) {
                return 2;
            }
        }
        C4429y4 $r22 = newClass();
        $r22.m27823h();
        boolean $z03 = this.f9948G;
        if ($z03) {
            C4181d $r5 = putByte();
            Boolean $r42 = $r5.getBoolean();
            if ($r42 != null) {
                boolean $z04 = $r42.booleanValue();
                return $z04 ? 0 : 3;
            }
            C4215g $r3 = this.f9953b;
            ClassWriter $r6 = ((MethodWriter) $r3).f9987b;
            C4158b c4158b = $r6.index;
            Boolean $r43 = $r3.m28266a("firebase_analytics_collection_enabled");
            if ($r43 != null) {
                boolean $z05 = $r43.booleanValue();
                return $z05 ? 0 : 4;
            }
            Boolean $r44 = this.pool;
            if ($r44 != null) {
                boolean $z06 = $r44.booleanValue();
                return $z06 ? 0 : 5;
            }
            C4215g $r32 = this.f9953b;
            C4162b3 $r1 = C4173c3.f10108T;
            boolean $z07 = $r32.m28265a((String) null, $r1);
            if (!$z07 || this.f9946A == null) {
                return 0;
            }
            boolean $z08 = this.f9946A.booleanValue();
            return $z08 ? 0 : 7;
        }
        return 8;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getString() {
        String r1 = this.f9969s;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4215g getValue() {
        C4215g r1 = this.f9953b;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: i */
    public final String m28423i() {
        String r1 = this.f9949H;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean init() {
        C4429y4 $r1 = newClass();
        $r1.m27823h();
        boolean z0 = this.f9948G;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: k */
    public final C4410w8 m28422k() {
        C4410w8 $r1 = this.f9962m;
        AbstractC4413x r2 = (AbstractC4413x) $r1;
        m28430a(r2);
        C4410w8 $r12 = this.f9962m;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: l */
    public final boolean m28421l() {
        boolean z0 = this.f9950K;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.measurement.internal.AbstractParser
    public final C4429y4 newClass() {
        C4429y4 $r1 = this.f9972v;
        Label r2 = (Label) $r1;
        put(r2);
        C4429y4 $r12 = this.f9972v;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4308o newDouble() {
        C4308o $r1 = this.f9957f;
        Label r2 = (Label) $r1;
        put(r2);
        C4308o $r12 = this.f9957f;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4237i newNameType() {
        C4237i $r1 = this.f9966p;
        m28430a((AbstractC4413x) $r1);
        C4237i $r12 = this.f9966p;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.measurement.internal.AbstractParser
    public final C4158b newUTF8() {
        C4158b r1 = this.index;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean next() {
        Boolean $r1 = this.f9946A;
        if ($r1 != null) {
            Boolean $r12 = this.f9946A;
            boolean $z0 = $r12.booleanValue();
            return $z0;
        }
        return false;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Item put() {
        Item $r1 = this.key;
        if ($r1 != null) {
            boolean $z0 = $r1.equals();
            if ($z0) {
                return this.key;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4181d putByte() {
        C4181d $r1 = this.f9968r;
        m28431a($r1);
        C4181d $r12 = this.f9968r;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: q */
    public final String m28420q() {
        String r1 = this.f9955d;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean remove() {
        int $i0 = getCount();
        return $i0 == 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void run() {
        C4429y4 $r4 = newClass();
        $r4.m27823h();
        Label r26 = (Label) accept();
        put(r26);
        C4237i $r6 = newNameType();
        String $r7 = $r6.getItem();
        C4181d $r8 = putByte();
        Pair $r9 = $r8.m28321a($r7);
        C4215g $r10 = this.f9953b;
        boolean $z0 = $r10.set();
        if ($z0) {
            Object $r11 = $r9.second;
            boolean $z02 = ((Boolean) $r11).booleanValue();
            if (!$z02) {
                Object $r112 = $r9.first;
                boolean $z03 = TextUtils.isEmpty((CharSequence) $r112);
                if (!$z03) {
                    C4292m7 $r5 = accept();
                    Label r262 = (Label) $r5;
                    r262.copyTo();
                    MethodWriter r27 = (MethodWriter) $r5;
                    ClassWriter $r14 = r27.f9987b;
                    Context $r15 = $r14.f9954c;
                    Object $r113 = $r15.getSystemService("connectivity");
                    ConnectivityManager $r16 = (ConnectivityManager) $r113;
                    NetworkInfo $r17 = null;
                    if ($r16 != null) {
                        try {
                            $r17 = $r16.getActiveNetworkInfo();
                        } catch (SecurityException e) {
                        }
                    }
                    if ($r17 != null) {
                        boolean $z04 = $r17.isConnected();
                        if ($z04) {
                            ByteVector $r18 = m28427b();
                            C4237i $r62 = newNameType();
                            ClassWriter $r142 = ((MethodWriter) $r62).f9987b;
                            C4215g $r102 = $r142.f9953b;
                            $r102.m28256f();
                            Object $r114 = $r9.first;
                            String $r19 = (String) $r114;
                            C4181d $r82 = putByte();
                            C4163b4 $r20 = $r82.f10190i;
                            long $l0 = $r20.m28404a();
                            URL $r21 = $r18.m28473a(46000L, $r7, $r19, $l0 - 1);
                            if ($r21 != null) {
                                C4292m7 $r52 = accept();
                                C4440z4 r24 = new C4440z4(this);
                                MethodWriter r272 = (MethodWriter) $r52;
                                r272.putShort();
                                Label r263 = (Label) $r52;
                                r263.copyTo();
                                com.google.android.gms.common.internal.List.m31820a($r21);
                                com.google.android.gms.common.internal.List.m31820a(r24);
                                MethodWriter r273 = (MethodWriter) $r52;
                                C4429y4 $r42 = r273.f9987b.newClass();
                                Runnable r25 = new RunnableC4280l7($r52, $r7, $r21, null, null, r24, null);
                                Runnable r28 = r25;
                                $r42.m27811y(r28);
                                return;
                            }
                            return;
                        }
                    }
                    Item $r22 = get();
                    C4312o3 $r23 = $r22.clear();
                    $r23.m28014a("Network is not available for Deferred Deep Link request. Skipping");
                    return;
                }
            }
        }
        Item $r222 = get();
        C4312o3 $r232 = $r222.save();
        $r232.m28014a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4184d2 time() {
        C4184d2 $r1 = this.f9970t;
        if ($r1 != null) {
            return $r1;
        }
        IllegalStateException $r2 = new IllegalStateException("Component not created");
        throw $r2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void toByteArray() {
        int $i0 = this.f9975y;
        this.f9975y = $i0 + 1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4276l3 visitAnnotation() {
        C4276l3 r1 = this.f9971u;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4252j3 visitInnerClass() {
        C4252j3 $r1 = this.f9973w;
        AbstractC4413x r2 = (AbstractC4413x) $r1;
        m28430a(r2);
        C4252j3 $r12 = this.f9973w;
        return $r12;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final C4294m9 visitTypeAnnotation() {
        C4294m9 $r1 = this.f9963mv;
        AbstractC4413x r2 = (AbstractC4413x) $r1;
        m28430a(r2);
        C4294m9 $r12 = this.f9963mv;
        return $r12;
    }
}
