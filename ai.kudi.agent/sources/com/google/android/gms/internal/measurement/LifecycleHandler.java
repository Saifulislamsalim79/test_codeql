package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.InterfaceC2987a;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* loaded from: classes.dex */
public interface LifecycleHandler extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException;

    void getAppInstanceId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException;

    void getCachedAppInstanceId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, InterfaceC3824i1 interfaceC3824i1) throws RemoteException;

    void getCurrentScreenClass(InterfaceC3824i1 interfaceC3824i1) throws RemoteException;

    void getCurrentScreenName(InterfaceC3824i1 interfaceC3824i1) throws RemoteException;

    void getGmpAppId(InterfaceC3824i1 interfaceC3824i1) throws RemoteException;

    void getMaxUserProperties(String str, InterfaceC3824i1 interfaceC3824i1) throws RemoteException;

    void getTestFlag(InterfaceC3824i1 interfaceC3824i1, int i) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, InterfaceC3824i1 interfaceC3824i1) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(InterfaceC2987a interfaceC2987a, C3919o1 c3919o1, long j) throws RemoteException;

    void isDataCollectionEnabled(InterfaceC3824i1 interfaceC3824i1) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC3824i1 interfaceC3824i1, long j) throws RemoteException;

    void logHealthData(int i, String str, InterfaceC2987a interfaceC2987a, InterfaceC2987a interfaceC2987a2, InterfaceC2987a interfaceC2987a3) throws RemoteException;

    void onActivityCreated(InterfaceC2987a interfaceC2987a, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(InterfaceC2987a interfaceC2987a, long j) throws RemoteException;

    void onActivityPaused(InterfaceC2987a interfaceC2987a, long j) throws RemoteException;

    void onActivityResumed(InterfaceC2987a interfaceC2987a, long j) throws RemoteException;

    void onActivitySaveInstanceState(InterfaceC2987a interfaceC2987a, InterfaceC3824i1 interfaceC3824i1, long j) throws RemoteException;

    void onActivityStarted(InterfaceC2987a interfaceC2987a, long j) throws RemoteException;

    void onActivityStopped(InterfaceC2987a interfaceC2987a, long j) throws RemoteException;

    void performAction(Bundle bundle, InterfaceC3824i1 interfaceC3824i1, long j) throws RemoteException;

    void registerOnMeasurementEventListener(InterfaceC3872l1 interfaceC3872l1) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(InterfaceC2987a interfaceC2987a, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(InterfaceC3872l1 interfaceC3872l1) throws RemoteException;

    void setInstanceIdProvider(InterfaceC3903n1 interfaceC3903n1) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, InterfaceC2987a interfaceC2987a, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(InterfaceC3872l1 interfaceC3872l1) throws RemoteException;
}
