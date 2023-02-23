package org.org.org.org.app;

import com.smartlook.sdk.smartlook.integration.model.AmplitudeIntegration;
import com.smartlook.sdk.smartlook.integration.model.BugsnagIntegration;
import com.smartlook.sdk.smartlook.integration.model.FirebaseCrashlyticsIntegration;
import com.smartlook.sdk.smartlook.integration.model.HeapIntegration;
import com.smartlook.sdk.smartlook.integration.model.Integration;
import com.smartlook.sdk.smartlook.integration.model.MixpanelIntegration;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import org.org.org.org.app.adapters.EnumC14573f;
import org.org.org.org.app.asm.AbstractC14577h;
import org.org.org.org.app.asm.ByteVector;
import org.org.org.org.app.asm.C14575d;
import org.org.org.org.app.asm.C14576f;
import org.org.org.org.app.asm.C14578i;
import org.org.org.org.app.asm.C14579m;
import org.org.org.org.app.asm.MethodWriter;
import org.org.org.org.app.tools.C14582h;
import org.org.org.org.asm.Activity.Settings;
import org.org.org.org.asm.parser.Log;
import org.org.org.org.asm.parser.System;
import org.org.org.org.asm.parser.TopLevel$NativeErrors;
import org.org.org.org.org.locale.C14709f;
/* renamed from: org.org.org.org.app.f */
/* loaded from: classes.dex */
public final class C14581f {

    /* renamed from: a */
    public final List<e.a.a.a.d.c.f> f32295a;

    /* renamed from: b */
    public final InterfaceC11824h f32296b;

    /* renamed from: c */
    public AtomicBoolean f32297c;

    /* renamed from: t */
    public ScheduledThreadPoolExecutor f32298t;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14581f() {
        InterfaceC11824h $r1;
        ArrayList $r2 = new ArrayList();
        this.f32295a = $r2;
        AtomicBoolean $r3 = new AtomicBoolean(false);
        this.f32297c = $r3;
        C14580b $r4 = C14580b.f32294a;
        $r1 = C13218k.m5625b($r4);
        this.f32296b = $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final AbstractC14577h m1186a(Integration integration) {
        boolean $z0 = integration instanceof AmplitudeIntegration;
        if ($z0) {
            AmplitudeIntegration $r3 = (AmplitudeIntegration) integration;
            C14579m $r2 = new C14579m($r3);
            return $r2;
        }
        boolean $z02 = integration instanceof FirebaseCrashlyticsIntegration;
        if ($z02) {
            FirebaseCrashlyticsIntegration $r5 = (FirebaseCrashlyticsIntegration) integration;
            ByteVector $r4 = new ByteVector($r5);
            return $r4;
        }
        boolean $z03 = integration instanceof C14582h;
        if ($z03) {
            C14582h $r7 = (C14582h) integration;
            C14575d $r6 = new C14575d($r7);
            return $r6;
        }
        boolean $z04 = integration instanceof HeapIntegration;
        if ($z04) {
            HeapIntegration $r9 = (HeapIntegration) integration;
            C14578i $r8 = new C14578i($r9);
            return $r8;
        }
        boolean $z05 = integration instanceof MixpanelIntegration;
        if ($z05) {
            MixpanelIntegration $r11 = (MixpanelIntegration) integration;
            MethodWriter $r10 = new MethodWriter($r11);
            return $r10;
        }
        boolean $z06 = integration instanceof BugsnagIntegration;
        if (!$z06) {
            InvalidParameterException $r14 = new InvalidParameterException("Invalid integration!");
            throw $r14;
        }
        BugsnagIntegration $r13 = (BugsnagIntegration) integration;
        C14576f $r12 = new C14576f($r13);
        return $r12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1185a(Integration integration, String $r2, EnumC14573f enumC14573f, String str) {
        String $r22;
        int $i0 = enumC14573f.ordinal();
        if ($i0 == 0) {
            $r22 = $r2 + "() successfully integrated: integration =  " + Log.get(integration, false, 2, null);
        } else if ($i0 != 1) {
            return;
        } else {
            $r22 = $r2 + "() failed to integrate: integration =  " + Log.get(integration, false, 2, null);
        }
        if (str != null) {
            $r22 = $r22 + " url = " + str;
        }
        System $r6 = System.f32375c;
        LogAspect $r7 = LogAspect.AUTO_INTEGRATION;
        LogSeverity $r8 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r9 = $r6.get($r7, false, $r8);
        if ($r9.ordinal() != 0) {
            return;
        }
        $r6.size($r7, $r8, "AutoIntegration", $r22 + ", [logAspect: " + $r7 + ']');
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1182a(final AbstractC14577h abstractC14577h) {
        EnumC14573f $r2 = abstractC14577h.mo1192c();
        Integration $r3 = abstractC14577h.m1194a();
        m1179a(this, $r3, "onNewInstance", $r2, null, 8, null);
        EnumC14573f $r4 = EnumC14573f.f32286f;
        if ($r2 == $r4) {
            close(new Runnable() { // from class: org.org.org.org.app.Plot$a
                /* JADX WARN: Can't parse signature for local variable: 
                java.lang.NullPointerException
                 */
                @Override // java.lang.Runnable
                public final void run() {
                    C14581f $r1 = C14581f.this;
                    AbstractC14577h $r22 = abstractC14577h;
                    $r1.m1182a($r22);
                }
            });
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ void m1179a(C14581f c14581f, Integration integration, String str, EnumC14573f enumC14573f, String $r5, int i, Object obj) {
        int $i0 = i & 8;
        if ($i0 != 0) {
            $r5 = null;
        }
        c14581f.m1185a(integration, str, enumC14573f, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public static /* synthetic */ void m1178a(C14581f c14581f, String str, List $r3, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r3 = null;
        }
        c14581f.m1175b(str, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static /* synthetic */ void add(C14581f c14581f, String str, List $r3, int i, Object obj) {
        int $i0 = i & 2;
        if ($i0 != 0) {
            $r3 = null;
        }
        c14581f.m1184a(str, $r3);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void close(Runnable runnable) {
        System $r2 = System.f32375c;
        LogAspect $r3 = LogAspect.AUTO_INTEGRATION;
        LogSeverity $r4 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r5 = $r2.get($r3, false, $r4);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            String $r7 = "runRetry() will retry auto integration in 5000 ms, [logAspect: " + $r3 + ']';
            $r2.size($r3, $r4, "AutoIntegration", $r7);
        }
        m1172d();
        ScheduledThreadPoolExecutor $r8 = this.f32298t;
        if ($r8 != null) {
            TimeUnit $r9 = TimeUnit.MILLISECONDS;
            $r8.schedule(runnable, 5000L, $r9);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: d */
    private final void m1172d() {
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.AUTO_INTEGRATION;
        LogSeverity $r3 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r4 = $r1.get($r2, false, $r3);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            String $r6 = "createExecutor() called, [logAspect: " + $r2 + ']';
            $r1.size($r2, $r3, "AutoIntegration", $r6);
        }
        ScheduledThreadPoolExecutor $r7 = this.f32298t;
        if ($r7 == null) {
            Settings $r8 = Settings.this$0;
            ScheduledThreadPoolExecutor $r72 = $r8.get(2, "auto_integrations");
            this.f32298t = $r72;
            return;
        }
        TopLevel$NativeErrors $r42 = $r1.get($r2, false, $r3);
        int $i02 = $r42.ordinal();
        if ($i02 != 0) {
            return;
        }
        String $r62 = "createExecutor() autoIntegrationExecutor already created, [logAspect: " + $r2 + ']';
        $r1.size($r2, $r3, "AutoIntegration", $r62);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void execute() {
        System $r1 = System.f32375c;
        LogAspect $r2 = LogAspect.AUTO_INTEGRATION;
        LogSeverity $r3 = LogSeverity.VERBOSE;
        TopLevel$NativeErrors $r5 = $r1.get($r2, false, $r3);
        int $i0 = $r5.ordinal();
        if ($i0 == 0) {
            String $r7 = "runTicker() trying to run ticker, [logAspect: " + $r2 + ']';
            $r1.size($r2, $r3, "AutoIntegration", $r7);
        }
        AtomicBoolean $r8 = this.f32297c;
        boolean $z0 = $r8.get();
        if ($z0) {
            TopLevel$NativeErrors $r52 = $r1.get($r2, false, $r3);
            int $i02 = $r52.ordinal();
            if ($i02 != 0) {
                return;
            }
            String $r72 = "runTicker() ticker already running, [logAspect: " + $r2 + ']';
            $r1.size($r2, $r3, "AutoIntegration", $r72);
            return;
        }
        ScheduledThreadPoolExecutor $r9 = this.f32298t;
        if ($r9 != null) {
            Runnable $r10 = wrapTask();
            TimeUnit $r4 = TimeUnit.MILLISECONDS;
            $r9.scheduleAtFixedRate($r10, 0L, 1000L, $r4);
            AtomicBoolean $r82 = this.f32297c;
            $r82.set(false);
        }
        TopLevel$NativeErrors $r53 = $r1.get($r2, false, $r3);
        int $i03 = $r53.ordinal();
        if ($i03 != 0) {
            return;
        }
        String $r73 = "runTicker() ticker running, [logAspect: " + $r2 + ']';
        $r1.size($r2, $r3, "AutoIntegration", $r73);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: f */
    public final C14709f m1171f() {
        InterfaceC11824h $r2 = this.f32296b;
        Object $r1 = $r2.getValue();
        C14709f $r3 = (C14709f) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Runnable wrapTask() {
        return new Runnable() { // from class: org.org.org.org.app.WrappingExecutorService$1
            /* JADX WARN: Can't parse signature for local variable: 
            java.lang.NullPointerException
             */
            /* JADX WARN: Incorrect condition in loop: B:4:0x000e */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r13 = this;
                    org.org.org.org.app.f r0 = org.org.org.org.app.C14581f.this
                    java.util.List r1 = org.org.org.org.app.C14581f.m1173b(r0)
                    java.util.Iterator r2 = r1.iterator()
                La:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto L33
                    java.lang.Object r4 = r2.next()
                    r6 = r4
                    org.org.org.org.app.asm.h r6 = (org.org.org.org.app.asm.AbstractC14577h) r6
                    r5 = r6
                    org.org.org.org.app.f r0 = org.org.org.org.app.C14581f.this
                    org.org.org.org.org.locale.f r7 = org.org.org.org.app.C14581f.m1181a(r0)
                    r9 = 1
                    java.lang.String r8 = r7.m627b(r9)
                    org.org.org.org.app.adapters.f r10 = r5.mo1193a(r8)
                    org.org.org.org.app.f r0 = org.org.org.org.app.C14581f.this
                    com.smartlook.sdk.smartlook.integration.model.Integration r11 = r5.m1194a()
                    java.lang.String r12 = "onHandlerTick"
                    org.org.org.org.app.C14581f.m1180a(r0, r11, r12, r10, r8)
                    goto La
                L33:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.app.WrappingExecutorService$1.run():void");
            }
        };
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:4:0x0015 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m1187a() {
        /*
            r10 = this;
            java.util.List<e.a.a.a.d.c.f> r0 = r10.f32295a
            java.util.ArrayList r1 = new java.util.ArrayList
            r3 = 10
            int r2 = kotlin.p557z.C13722p.m3921o(r0, r3)
            r1.<init>(r2)
            java.util.Iterator r4 = r0.iterator()
        L11:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L27
            java.lang.Object r6 = r4.next()
            r8 = r6
            org.org.org.org.app.asm.h r8 = (org.org.org.org.app.asm.AbstractC14577h) r8
            r7 = r8
            com.smartlook.sdk.smartlook.integration.model.Integration r9 = r7.m1194a()
            r1.add(r9)
            goto L11
        L27:
            java.util.List r0 = kotlin.p557z.C13722p.m3972B0(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.app.C14581f.m1187a():java.util.List");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0011 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1184a(java.lang.String r12, java.util.List r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L3
            return
        L3:
            r0 = 0
            if (r13 == 0) goto L7
            goto L9
        L7:
            java.util.List<e.a.a.a.d.c.f> r13 = r11.f32295a
        L9:
            java.util.Iterator r1 = r13.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r3 = r1.next()
            r5 = r3
            org.org.org.org.app.asm.h r5 = (org.org.org.org.app.asm.AbstractC14577h) r5
            r4 = r5
            org.org.org.org.app.adapters.f r6 = r4.mo1188f(r12)
            com.smartlook.sdk.smartlook.integration.model.Integration r7 = r4.m1194a()
            java.lang.String r8 = "onNewVisitorURL"
            r11.m1185a(r7, r8, r6, r12)
            org.org.org.org.app.adapters.f r9 = org.org.org.org.app.adapters.EnumC14573f.f32286f
            if (r6 != r9) goto Ld
            r0 = 1
            goto Ld
        L2e:
            if (r0 == 0) goto L38
            org.org.org.org.app.Widget r10 = new org.org.org.org.app.Widget
            r10.<init>(r11, r12)
            r11.close(r10)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.app.C14581f.m1184a(java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0090, code lost:
        if (r19 != false) goto L11;
     */
    /* JADX WARN: Incorrect condition in loop: B:16:0x009f */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1183a(java.util.List r33) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.app.C14581f.m1183a(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x003c */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1176b() {
        /*
            r15 = this;
            org.org.org.org.asm.parser.System r0 = org.org.org.org.asm.parser.System.f32375c
            com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect r1 = com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect.AUTO_INTEGRATION
            com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity r2 = com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity.DEBUG
            r4 = 0
            org.org.org.org.asm.parser.TopLevel$NativeErrors r3 = r0.get(r1, r4, r2)
            int r5 = r3.ordinal()
            if (r5 == 0) goto L12
            goto L32
        L12:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "disableAllIntegrations() called"
            r6.append(r7)
            java.lang.String r7 = ", [logAspect: "
            r6.append(r7)
            r6.append(r1)
            r4 = 93
            r6.append(r4)
            java.lang.String r8 = r6.toString()
            java.lang.String r7 = "AutoIntegration"
            r0.size(r1, r2, r7, r8)
        L32:
            java.util.List<e.a.a.a.d.c.f> r9 = r15.f32295a
            java.util.Iterator r10 = r9.iterator()
        L38:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L4a
            java.lang.Object r12 = r10.next()
            r14 = r12
            org.org.org.org.app.asm.h r14 = (org.org.org.org.app.asm.AbstractC14577h) r14
            r13 = r14
            r13.mo1189e()
            goto L38
        L4a:
            java.util.List<e.a.a.a.d.c.f> r9 = r15.f32295a
            r9.clear()
            r15.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.app.C14581f.m1176b():void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:10:0x0011 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1175b(final java.lang.String r12, java.util.List r13) {
        /*
            r11 = this;
            if (r12 != 0) goto L3
            return
        L3:
            r0 = 0
            if (r13 == 0) goto L7
            goto L9
        L7:
            java.util.List<e.a.a.a.d.c.f> r13 = r11.f32295a
        L9:
            java.util.Iterator r1 = r13.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2e
            java.lang.Object r3 = r1.next()
            r5 = r3
            org.org.org.org.app.asm.h r5 = (org.org.org.org.app.asm.AbstractC14577h) r5
            r4 = r5
            org.org.org.org.app.adapters.f r6 = r4.m1191e(r12)
            com.smartlook.sdk.smartlook.integration.model.Integration r7 = r4.m1194a()
            java.lang.String r8 = "onNewSessionURL"
            r11.m1185a(r7, r8, r6, r12)
            org.org.org.org.app.adapters.f r9 = org.org.org.org.app.adapters.EnumC14573f.f32286f
            if (r6 != r9) goto Ld
            r0 = 1
            goto Ld
        L2e:
            if (r0 == 0) goto L38
            org.org.org.org.app.AppCompatDelegateImplV7$4 r10 = new org.org.org.org.app.AppCompatDelegateImplV7$4
            r10.<init>()
            r11.close(r10)
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.app.C14581f.m1175b(java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013c, code lost:
        if (r17 != false) goto L33;
     */
    /* JADX WARN: Incorrect condition in loop: B:8:0x0064 */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m1174b(java.util.List r30) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.app.C14581f.m1174b(java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void close() {
        System $r3 = System.f32375c;
        LogAspect $r1 = LogAspect.AUTO_INTEGRATION;
        LogSeverity $r2 = LogSeverity.DEBUG;
        TopLevel$NativeErrors $r4 = $r3.get($r1, false, $r2);
        int $i0 = $r4.ordinal();
        if ($i0 == 0) {
            String $r6 = "shutdown() called, [logAspect: " + $r1 + ']';
            $r3.size($r1, $r2, "AutoIntegration", $r6);
        }
        ScheduledThreadPoolExecutor $r7 = this.f32298t;
        if ($r7 != null) {
            $r7.shutdown();
        }
        this.f32298t = null;
        AtomicBoolean $r8 = this.f32297c;
        $r8.set(false);
    }
}
