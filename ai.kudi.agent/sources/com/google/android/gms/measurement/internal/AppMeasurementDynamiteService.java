package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.List;
import com.google.android.gms.common.util.DynamiteApi;
import com.google.android.gms.dynamic.BinderC2989b;
import com.google.android.gms.dynamic.InterfaceC2987a;
import com.google.android.gms.internal.measurement.C3919o1;
import com.google.android.gms.internal.measurement.IExtensionHost$Stub;
import com.google.android.gms.internal.measurement.InterfaceC3824i1;
import com.google.android.gms.internal.measurement.InterfaceC3872l1;
import com.google.android.gms.internal.measurement.InterfaceC3903n1;
import java.util.Map;
import p201g.p218e.C7521a;
/* compiled from: com.google.android.gms:play-services-measurement-sdk@@20.0.0 */
@DynamiteApi
/* loaded from: classes.dex */
public class AppMeasurementDynamiteService extends IExtensionHost$Stub {

    /* renamed from: d */
    private final Map<Integer, InterfaceC4188d6> f9938d;

    /* renamed from: o */
    ClassWriter f9939o = null;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public AppMeasurementDynamiteService() {
        Map r2 = new C7521a();
        Map r3 = r2;
        this.f9938d = r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    private final void m28476a(InterfaceC3824i1 interfaceC3824i1, String str) {
        setRequired();
        ClassWriter $r4 = this.f9939o;
        ByteVector $r3 = $r4.m28427b();
        $r3.m28442b(interfaceC3824i1, str);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void setRequired() {
        ClassWriter $r1 = this.f9939o;
        if ($r1 != null) {
            return;
        }
        IllegalStateException $r2 = new IllegalStateException("Attempting to perform action before initialize.");
        throw $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void beginAdUnitExposure(String str, long j) throws RemoteException {
        setRequired();
        ClassWriter $r3 = this.f9939o;
        C4184d2 $r2 = $r3.time();
        $r2.m28313l(str, j);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        setRequired();
        ClassWriter $r5 = this.f9939o;
        C4245i7 $r4 = $r5.m28424f();
        $r4.m28132h0(str, str2, bundle);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void clearMeasurementEnabled(long j) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r1 = $r2.m28424f();
        $r1.m28156J(null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void endAdUnitExposure(String str, long j) throws RemoteException {
        setRequired();
        ClassWriter $r3 = this.f9939o;
        C4184d2 $r2 = $r3.time();
        $r2.m28312m(str, j);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void generateEventId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        ByteVector $r3 = $r2.m28427b();
        long $l0 = $r3.next();
        setRequired();
        ClassWriter $r22 = this.f9939o;
        ByteVector $r32 = $r22.m28427b();
        $r32.m28466a(interfaceC3824i1, $l0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void getAppInstanceId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        setRequired();
        ClassWriter $r4 = this.f9939o;
        C4429y4 $r3 = $r4.newClass();
        Runnable r5 = new RunnableC4232h6(this, interfaceC3824i1);
        Runnable r6 = r5;
        $r3.m27810z(r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void getCachedAppInstanceId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r3 = $r2.m28424f();
        String $r4 = $r3.m28142X();
        m28476a(interfaceC3824i1, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void getConditionalUserProperties(String str, String str2, InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        setRequired();
        ClassWriter $r6 = this.f9939o;
        C4429y4 $r5 = $r6.newClass();
        Runnable r7 = new RunnableC4259ja(this, interfaceC3824i1, str, str2);
        Runnable r8 = r7;
        $r5.m27810z(r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void getCurrentScreenClass(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r3 = $r2.m28424f();
        String $r4 = $r3.m28141Y();
        m28476a(interfaceC3824i1, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void getCurrentScreenName(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r3 = $r2.m28424f();
        String $r4 = $r3.m28140Z();
        m28476a(interfaceC3824i1, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void getGmpAppId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        String $r4;
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r3 = $r2.m28424f();
        MethodWriter r9 = (MethodWriter) $r3;
        ClassWriter $r22 = r9.f9987b;
        String $r42 = $r22.m28420q();
        if ($r42 != null) {
            MethodWriter r92 = (MethodWriter) $r3;
            ClassWriter $r23 = r92.f9987b;
            $r4 = $r23.m28420q();
        } else {
            MethodWriter r93 = (MethodWriter) $r3;
            ClassWriter $r24 = r93.f9987b;
            try {
                Context $r5 = $r24.getContext();
                MethodWriter r94 = (MethodWriter) $r3;
                ClassWriter $r25 = r94.f9987b;
                String $r43 = $r25.getString();
                $r4 = C4316o7.m28008c($r5, "google_app_id", $r43);
            } catch (IllegalStateException $r6) {
                MethodWriter r95 = (MethodWriter) $r3;
                ClassWriter $r26 = r95.f9987b;
                Item $r7 = $r26.get();
                C4312o3 $r8 = $r7.m28416b();
                $r8.m28013b("getGoogleAppId failed with exception", $r6);
                $r4 = null;
            }
        }
        m28476a(interfaceC3824i1, $r4);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void getMaxUserProperties(String str, InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        setRequired();
        ClassWriter $r3 = this.f9939o;
        C4245i7 $r4 = $r3.m28424f();
        $r4.m28147S(str);
        setRequired();
        ClassWriter $r32 = this.f9939o;
        ByteVector $r5 = $r32.m28427b();
        $r5.m28467a(interfaceC3824i1, 25);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void getTestFlag(InterfaceC3824i1 interfaceC3824i1, int i) throws RemoteException {
        setRequired();
        if (i == 0) {
            ClassWriter $r3 = this.f9939o;
            ByteVector $r4 = $r3.m28427b();
            ClassWriter $r32 = this.f9939o;
            C4245i7 $r5 = $r32.m28424f();
            String $r13 = $r5.m28139a0();
            $r4.m28442b(interfaceC3824i1, $r13);
        } else if (i == 1) {
            ClassWriter $r33 = this.f9939o;
            ByteVector $r42 = $r33.m28427b();
            ClassWriter $r34 = this.f9939o;
            C4245i7 $r52 = $r34.m28424f();
            Long $r12 = $r52.m28143W();
            long $l1 = $r12.longValue();
            $r42.m28466a(interfaceC3824i1, $l1);
        } else if (i == 2) {
            ClassWriter $r35 = this.f9939o;
            ByteVector $r43 = $r35.m28427b();
            ClassWriter $r36 = this.f9939o;
            C4245i7 $r53 = $r36.m28424f();
            Double $r8 = $r53.m28145U();
            double $d0 = $r8.doubleValue();
            Bundle $r1 = new Bundle();
            $r1.putDouble("r", $d0);
            try {
                interfaceC3824i1.mo29532l($r1);
            } catch (RemoteException $r9) {
                ClassWriter $r37 = ((MethodWriter) $r43).f9987b;
                Item $r10 = $r37.get();
                C4312o3 $r11 = $r10.clear();
                $r11.m28013b("Error returning double value to wrapper", $r9);
            }
        } else if (i == 3) {
            ClassWriter $r38 = this.f9939o;
            ByteVector $r44 = $r38.m28427b();
            ClassWriter $r39 = this.f9939o;
            C4245i7 $r54 = $r39.m28424f();
            Integer $r7 = $r54.m28144V();
            int $i0 = $r7.intValue();
            $r44.m28467a(interfaceC3824i1, $i0);
        } else if (i != 4) {
        } else {
            ClassWriter $r310 = this.f9939o;
            ByteVector $r45 = $r310.m28427b();
            ClassWriter $r311 = this.f9939o;
            C4245i7 $r55 = $r311.m28424f();
            Boolean $r6 = $r55.m28146T();
            boolean $z0 = $r6.booleanValue();
            $r45.m28441b(interfaceC3824i1, $z0);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void getUserProperties(String str, String str2, boolean z, InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        setRequired();
        ClassWriter $r6 = this.f9939o;
        C4429y4 $r5 = $r6.newClass();
        Runnable r7 = new RunnableC4234h8(this, interfaceC3824i1, str, str2, z);
        Runnable r8 = r7;
        $r5.m27810z(r8);
    }

    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void initForTests(Map map) throws RemoteException {
        setRequired();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void initialize(InterfaceC2987a interfaceC2987a, C3919o1 c3919o1, long j) throws RemoteException {
        ClassWriter $r1 = this.f9939o;
        if ($r1 != null) {
            Item $r7 = $r1.get();
            C4312o3 $r8 = $r7.clear();
            $r8.m28014a("Attempting to initialize multiple times");
            return;
        }
        Object $r4 = BinderC2989b.m31495o(interfaceC2987a);
        Context $r5 = (Context) $r4;
        List.m31820a($r5);
        Long $r6 = Long.valueOf(j);
        this.f9939o = ClassWriter.m28434a($r5, c3919o1, $r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void isDataCollectionEnabled(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        setRequired();
        ClassWriter $r4 = this.f9939o;
        C4429y4 $r3 = $r4.newClass();
        Runnable r5 = new RunnableC4271ka(this, interfaceC3824i1);
        Runnable r6 = r5;
        $r3.m27810z(r6);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        setRequired();
        ClassWriter $r4 = this.f9939o;
        C4245i7 $r5 = $r4.m28424f();
        $r5.m28126s(str, str2, bundle, z, z2, j);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC3824i1 interfaceC3824i1, long j) throws RemoteException {
        Bundle $r7;
        setRequired();
        List.get(str2);
        if (bundle != null) {
            $r7 = r11;
            Bundle r11 = new Bundle(bundle);
        } else {
            $r7 = r11;
            Bundle r112 = new Bundle();
        }
        $r7.putString("_o", "app");
        C4355s r12 = new C4355s(bundle);
        C4379u r13 = new C4379u(str2, r12, "app", j);
        ClassWriter $r9 = this.f9939o;
        C4429y4 $r4 = $r9.newClass();
        Runnable r14 = new RunnableC4233h7(this, interfaceC3824i1, r13, str);
        Runnable r15 = r14;
        $r4.m27810z(r15);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void logHealthData(int i, String str, InterfaceC2987a interfaceC2987a, InterfaceC2987a interfaceC2987a2, InterfaceC2987a interfaceC2987a3) throws RemoteException {
        setRequired();
        Object $r6 = interfaceC2987a == null ? null : BinderC2989b.m31495o(interfaceC2987a);
        Object $r7 = interfaceC2987a2 == null ? null : BinderC2989b.m31495o(interfaceC2987a2);
        Object $r5 = interfaceC2987a3 != null ? BinderC2989b.m31495o(interfaceC2987a3) : null;
        ClassWriter $r8 = this.f9939o;
        Item $r9 = $r8.get();
        $r9.m28419a(i, true, false, str, $r6, $r7, $r5);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void onActivityCreated(InterfaceC2987a interfaceC2987a, Bundle bundle, long j) throws RemoteException {
        setRequired();
        ClassWriter $r3 = this.f9939o;
        C4245i7 $r4 = $r3.m28424f();
        Application.ActivityLifecycleCallbacks $r5 = $r4.f10371c;
        if ($r5 != null) {
            ClassWriter $r32 = this.f9939o;
            C4245i7 $r42 = $r32.m28424f();
            $r42.m28130o();
            Object $r6 = BinderC2989b.m31495o(interfaceC2987a);
            Activity $r7 = (Activity) $r6;
            Application.ActivityLifecycleCallbacks r8 = $r5;
            r8.onActivityCreated($r7, bundle);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void onActivityDestroyed(InterfaceC2987a interfaceC2987a, long j) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r3 = $r2.m28424f();
        Application.ActivityLifecycleCallbacks $r4 = $r3.f10371c;
        if ($r4 != null) {
            ClassWriter $r22 = this.f9939o;
            C4245i7 $r32 = $r22.m28424f();
            $r32.m28130o();
            Object $r5 = BinderC2989b.m31495o(interfaceC2987a);
            Activity $r6 = (Activity) $r5;
            Application.ActivityLifecycleCallbacks r7 = $r4;
            r7.onActivityDestroyed($r6);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void onActivityPaused(InterfaceC2987a interfaceC2987a, long j) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r3 = $r2.m28424f();
        Application.ActivityLifecycleCallbacks $r4 = $r3.f10371c;
        if ($r4 != null) {
            ClassWriter $r22 = this.f9939o;
            C4245i7 $r32 = $r22.m28424f();
            $r32.m28130o();
            Object $r5 = BinderC2989b.m31495o(interfaceC2987a);
            Activity $r6 = (Activity) $r5;
            Application.ActivityLifecycleCallbacks r7 = $r4;
            r7.onActivityPaused($r6);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void onActivityResumed(InterfaceC2987a interfaceC2987a, long j) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r3 = $r2.m28424f();
        Application.ActivityLifecycleCallbacks $r4 = $r3.f10371c;
        if ($r4 != null) {
            ClassWriter $r22 = this.f9939o;
            C4245i7 $r32 = $r22.m28424f();
            $r32.m28130o();
            Object $r5 = BinderC2989b.m31495o(interfaceC2987a);
            Activity $r6 = (Activity) $r5;
            Application.ActivityLifecycleCallbacks r7 = $r4;
            r7.onActivityResumed($r6);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void onActivitySaveInstanceState(InterfaceC2987a interfaceC2987a, InterfaceC3824i1 interfaceC3824i1, long j) throws RemoteException {
        setRequired();
        ClassWriter $r4 = this.f9939o;
        C4245i7 $r5 = $r4.m28424f();
        Application.ActivityLifecycleCallbacks $r6 = $r5.f10371c;
        Bundle r12 = new Bundle();
        if ($r6 != null) {
            ClassWriter $r42 = this.f9939o;
            C4245i7 $r52 = $r42.m28424f();
            $r52.m28130o();
            Object $r7 = BinderC2989b.m31495o(interfaceC2987a);
            Activity $r8 = (Activity) $r7;
            Application.ActivityLifecycleCallbacks r13 = $r6;
            r13.onActivitySaveInstanceState($r8, r12);
        }
        try {
            interfaceC3824i1.mo29532l(r12);
        } catch (RemoteException $r9) {
            ClassWriter $r43 = this.f9939o;
            Item $r10 = $r43.get();
            C4312o3 $r11 = $r10.clear();
            $r11.m28013b("Error returning bundle value to wrapper", $r9);
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void onActivityStarted(InterfaceC2987a interfaceC2987a, long j) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r3 = $r2.m28424f();
        C4222g7 $r4 = $r3.f10371c;
        if ($r4 != null) {
            ClassWriter $r22 = this.f9939o;
            C4245i7 $r32 = $r22.m28424f();
            $r32.m28130o();
            Object $r5 = BinderC2989b.m31495o(interfaceC2987a);
            Activity activity = (Activity) $r5;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void onActivityStopped(InterfaceC2987a interfaceC2987a, long j) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r3 = $r2.m28424f();
        C4222g7 $r4 = $r3.f10371c;
        if ($r4 != null) {
            ClassWriter $r22 = this.f9939o;
            C4245i7 $r32 = $r22.m28424f();
            $r32.m28130o();
            Object $r5 = BinderC2989b.m31495o(interfaceC2987a);
            Activity activity = (Activity) $r5;
        }
    }

    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void performAction(Bundle bundle, InterfaceC3824i1 interfaceC3824i1, long j) throws RemoteException {
        setRequired();
        interfaceC3824i1.mo29532l(null);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void registerOnMeasurementEventListener(InterfaceC3872l1 interfaceC3872l1) throws RemoteException {
        InterfaceC4188d6 interfaceC4188d6;
        setRequired();
        Map $r1 = this.f9938d;
        synchronized ($r1) {
            Map $r3 = this.f9938d;
            int $i0 = interfaceC3872l1.mo29409d();
            Integer $r4 = Integer.valueOf($i0);
            Object $r5 = $r3.get($r4);
            interfaceC4188d6 = (InterfaceC4188d6) $r5;
            if (interfaceC4188d6 == null) {
                interfaceC4188d6 = r9;
                C4295ma r9 = new C4295ma(this, interfaceC3872l1);
                Map $r32 = this.f9938d;
                int $i02 = interfaceC3872l1.mo29409d();
                Integer $r42 = Integer.valueOf($i02);
                $r32.put($r42, interfaceC4188d6);
            }
        }
        ClassWriter $r6 = this.f9939o;
        C4245i7 $r7 = $r6.m28424f();
        InterfaceC4188d6 r10 = interfaceC4188d6;
        $r7.m28121x(r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void resetAnalyticsData(long j) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r1 = $r2.m28424f();
        $r1.m28120y(j);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        setRequired();
        if (bundle != null) {
            ClassWriter $r2 = this.f9939o;
            C4245i7 $r5 = $r2.m28424f();
            $r5.m28161E(bundle, j);
            return;
        }
        ClassWriter $r22 = this.f9939o;
        Item $r3 = $r22.get();
        C4312o3 $r4 = $r3.m28416b();
        $r4.m28014a("Conditional user property must not be null");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setConsent(Bundle bundle, long j) throws RemoteException {
        setRequired();
        ClassWriter $r3 = this.f9939o;
        C4245i7 $r2 = $r3.m28424f();
        $r2.m28158H(bundle, j);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        setRequired();
        ClassWriter $r3 = this.f9939o;
        C4245i7 $r2 = $r3.m28424f();
        $r2.m28160F(bundle, -20, j);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setCurrentScreen(InterfaceC2987a interfaceC2987a, String str, String str2, long j) throws RemoteException {
        setRequired();
        ClassWriter $r4 = this.f9939o;
        C4409w7 $r5 = $r4.m28425d();
        Object $r6 = BinderC2989b.m31495o(interfaceC2987a);
        Activity $r7 = (Activity) $r6;
        $r5.m27900E($r7, str, str2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setDataCollectionEnabled(boolean z) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r3 = $r2.m28424f();
        AbstractC4413x r6 = (AbstractC4413x) $r3;
        r6.next();
        MethodWriter r7 = (MethodWriter) $r3;
        ClassWriter $r22 = r7.f9987b;
        C4429y4 $r4 = $r22.newClass();
        Runnable r5 = new RunnableC4267k6($r3, z);
        Runnable r8 = r5;
        $r4.m27810z(r8);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setDefaultEventParameters(Bundle $r2) {
        final Bundle $r22;
        setRequired();
        ClassWriter $r3 = this.f9939o;
        final C4245i7 $r4 = $r3.m28424f();
        if ($r2 == null) {
            $r22 = null;
        } else {
            Bundle r7 = new Bundle($r2);
            $r22 = r7;
        }
        MethodWriter r9 = (MethodWriter) $r4;
        ClassWriter $r32 = r9.f9987b;
        C4429y4 $r6 = $r32.newClass();
        Runnable r10 = new Runnable() { // from class: com.google.android.gms.measurement.internal.i6
            @Override // java.lang.Runnable
            public final void run() {
                C4245i7.this.m28128q($r22);
            }
        };
        $r6.m27810z(r10);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setEventInterceptor(InterfaceC3872l1 interfaceC3872l1) throws RemoteException {
        setRequired();
        C4283la r7 = new C4283la(this, interfaceC3872l1);
        ClassWriter $r4 = this.f9939o;
        C4429y4 $r5 = $r4.newClass();
        boolean $z0 = $r5.m27826C();
        if ($z0) {
            ClassWriter $r42 = this.f9939o;
            C4245i7 $r6 = $r42.m28424f();
            $r6.m28157I(r7);
            return;
        }
        ClassWriter $r43 = this.f9939o;
        C4429y4 $r52 = $r43.newClass();
        Runnable r8 = new RunnableC4247i9(this, r7);
        Runnable r9 = r8;
        $r52.m27810z(r9);
    }

    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setInstanceIdProvider(InterfaceC3903n1 interfaceC3903n1) throws RemoteException {
        setRequired();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        setRequired();
        ClassWriter $r1 = this.f9939o;
        C4245i7 $r2 = $r1.m28424f();
        Boolean $r3 = Boolean.valueOf(z);
        $r2.m28156J($r3);
    }

    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setMinimumSessionDuration(long j) throws RemoteException {
        setRequired();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setSessionTimeoutDuration(long j) throws RemoteException {
        setRequired();
        ClassWriter $r2 = this.f9939o;
        C4245i7 $r3 = $r2.m28424f();
        MethodWriter r6 = (MethodWriter) $r3;
        ClassWriter $r22 = r6.f9987b;
        C4429y4 $r4 = $r22.newClass();
        Runnable r5 = new RunnableC4291m6($r3, j);
        Runnable r7 = r5;
        $r4.m27810z(r7);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setUserId(String str, long j) throws RemoteException {
        setRequired();
        if (str != null) {
            int $i1 = str.length();
            if ($i1 == 0) {
                ClassWriter $r2 = this.f9939o;
                Item $r3 = $r2.get();
                C4312o3 $r4 = $r3.clear();
                $r4.m28014a("User ID must be non-empty");
                return;
            }
        }
        ClassWriter $r22 = this.f9939o;
        C4245i7 $r5 = $r22.m28424f();
        $r5.m28153M(null, "_id", str, true, j);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void setUserProperty(String str, String str2, InterfaceC2987a interfaceC2987a, boolean z, long j) throws RemoteException {
        setRequired();
        Object $r4 = BinderC2989b.m31495o(interfaceC2987a);
        ClassWriter $r5 = this.f9939o;
        C4245i7 $r6 = $r5.m28424f();
        $r6.m28153M(str, str2, $r4, z, j);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // com.google.android.gms.internal.measurement.LifecycleHandler
    public void unregisterOnMeasurementEventListener(InterfaceC3872l1 interfaceC3872l1) throws RemoteException {
        Object $r5;
        setRequired();
        Map $r1 = this.f9938d;
        synchronized ($r1) {
            Map $r3 = this.f9938d;
            int $i0 = interfaceC3872l1.mo29409d();
            Integer $r4 = Integer.valueOf($i0);
            $r5 = (InterfaceC4188d6) $r3.remove($r4);
        }
        if ($r5 == null) {
            $r5 = r9;
            C4295ma r9 = new C4295ma(this, interfaceC3872l1);
        }
        ClassWriter $r6 = this.f9939o;
        C4245i7 $r7 = $r6.m28424f();
        InterfaceC4188d6 r10 = (InterfaceC4188d6) $r5;
        $r7.m28151O(r10);
    }
}
