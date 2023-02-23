package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC2987a;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.d1 */
/* loaded from: classes2.dex */
public final class C3747d1 extends C3918o0 implements f1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C3747d1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        m29321m.writeLong(j);
        m29319o(23, m29321m);
    }

    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        m29321m.writeString(str2);
        C3948q0.m29087d(m29321m, bundle);
        m29319o(9, m29321m);
    }

    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeLong(j);
        m29319o(43, m29321m);
    }

    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        m29321m.writeLong(j);
        m29319o(24, m29321m);
    }

    public final void generateEventId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29319o(22, m29321m);
    }

    public final void getAppInstanceId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29319o(20, m29321m);
    }

    public final void getCachedAppInstanceId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29319o(19, m29321m);
    }

    public final void getConditionalUserProperties(String str, String str2, InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        m29321m.writeString(str2);
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29319o(10, m29321m);
    }

    public final void getCurrentScreenClass(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29319o(17, m29321m);
    }

    public final void getCurrentScreenName(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29319o(16, m29321m);
    }

    public final void getGmpAppId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29319o(21, m29321m);
    }

    public final void getMaxUserProperties(String str, InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29319o(6, m29321m);
    }

    public final void getTestFlag(InterfaceC3824i1 interfaceC3824i1, int i) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29321m.writeInt(i);
        m29319o(38, m29321m);
    }

    public final void getUserProperties(String str, String str2, boolean z, InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        m29321m.writeString(str2);
        C3948q0.m29088c(m29321m, z);
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29319o(5, m29321m);
    }

    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    public final void initialize(InterfaceC2987a interfaceC2987a, C3919o1 c3919o1, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC2987a);
        C3948q0.m29087d(m29321m, c3919o1);
        m29321m.writeLong(j);
        m29319o(1, m29321m);
    }

    public final void isDataCollectionEnabled(InterfaceC3824i1 interfaceC3824i1) throws RemoteException {
        throw null;
    }

    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        m29321m.writeString(str2);
        C3948q0.m29087d(m29321m, bundle);
        C3948q0.m29088c(m29321m, z);
        C3948q0.m29088c(m29321m, z2);
        m29321m.writeLong(j);
        m29319o(2, m29321m);
    }

    public final void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC3824i1 interfaceC3824i1, long j) throws RemoteException {
        throw null;
    }

    public final void logHealthData(int i, String str, InterfaceC2987a interfaceC2987a, InterfaceC2987a interfaceC2987a2, InterfaceC2987a interfaceC2987a3) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeInt(5);
        m29321m.writeString(str);
        C3948q0.m29086e(m29321m, interfaceC2987a);
        C3948q0.m29086e(m29321m, interfaceC2987a2);
        C3948q0.m29086e(m29321m, interfaceC2987a3);
        m29319o(33, m29321m);
    }

    public final void onActivityCreated(InterfaceC2987a interfaceC2987a, Bundle bundle, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC2987a);
        C3948q0.m29087d(m29321m, bundle);
        m29321m.writeLong(j);
        m29319o(27, m29321m);
    }

    public final void onActivityDestroyed(InterfaceC2987a interfaceC2987a, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC2987a);
        m29321m.writeLong(j);
        m29319o(28, m29321m);
    }

    public final void onActivityPaused(InterfaceC2987a interfaceC2987a, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC2987a);
        m29321m.writeLong(j);
        m29319o(29, m29321m);
    }

    public final void onActivityResumed(InterfaceC2987a interfaceC2987a, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC2987a);
        m29321m.writeLong(j);
        m29319o(30, m29321m);
    }

    public final void onActivitySaveInstanceState(InterfaceC2987a interfaceC2987a, InterfaceC3824i1 interfaceC3824i1, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC2987a);
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29321m.writeLong(j);
        m29319o(31, m29321m);
    }

    public final void onActivityStarted(InterfaceC2987a interfaceC2987a, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC2987a);
        m29321m.writeLong(j);
        m29319o(25, m29321m);
    }

    public final void onActivityStopped(InterfaceC2987a interfaceC2987a, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC2987a);
        m29321m.writeLong(j);
        m29319o(26, m29321m);
    }

    public final void performAction(Bundle bundle, InterfaceC3824i1 interfaceC3824i1, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, bundle);
        C3948q0.m29086e(m29321m, interfaceC3824i1);
        m29321m.writeLong(j);
        m29319o(32, m29321m);
    }

    public final void registerOnMeasurementEventListener(InterfaceC3872l1 interfaceC3872l1) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC3872l1);
        m29319o(35, m29321m);
    }

    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeLong(j);
        m29319o(12, m29321m);
    }

    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, bundle);
        m29321m.writeLong(j);
        m29319o(8, m29321m);
    }

    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, bundle);
        m29321m.writeLong(j);
        m29319o(44, m29321m);
    }

    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, bundle);
        m29321m.writeLong(j);
        m29319o(45, m29321m);
    }

    public final void setCurrentScreen(InterfaceC2987a interfaceC2987a, String str, String str2, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC2987a);
        m29321m.writeString(str);
        m29321m.writeString(str2);
        m29321m.writeLong(j);
        m29319o(15, m29321m);
    }

    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29088c(m29321m, z);
        m29319o(39, m29321m);
    }

    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29087d(m29321m, bundle);
        m29319o(42, m29321m);
    }

    public final void setEventInterceptor(InterfaceC3872l1 interfaceC3872l1) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC3872l1);
        m29319o(34, m29321m);
    }

    public final void setInstanceIdProvider(InterfaceC3903n1 interfaceC3903n1) throws RemoteException {
        throw null;
    }

    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29088c(m29321m, z);
        m29321m.writeLong(j);
        m29319o(11, m29321m);
    }

    public final void setMinimumSessionDuration(long j) throws RemoteException {
        throw null;
    }

    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeLong(j);
        m29319o(14, m29321m);
    }

    public final void setUserId(String str, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        m29321m.writeLong(j);
        m29319o(7, m29321m);
    }

    public final void setUserProperty(String str, String str2, InterfaceC2987a interfaceC2987a, boolean z, long j) throws RemoteException {
        Parcel m29321m = m29321m();
        m29321m.writeString(str);
        m29321m.writeString(str2);
        C3948q0.m29086e(m29321m, interfaceC2987a);
        C3948q0.m29088c(m29321m, z);
        m29321m.writeLong(j);
        m29319o(4, m29321m);
    }

    public final void unregisterOnMeasurementEventListener(InterfaceC3872l1 interfaceC3872l1) throws RemoteException {
        Parcel m29321m = m29321m();
        C3948q0.m29086e(m29321m, interfaceC3872l1);
        m29319o(36, m29321m);
    }
}
