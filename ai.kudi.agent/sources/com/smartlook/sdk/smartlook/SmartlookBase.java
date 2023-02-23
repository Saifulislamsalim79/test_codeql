package com.smartlook.sdk.smartlook;

import android.os.Bundle;
import android.view.View;
import com.smartlook.sdk.smartlook.analytic.api.EventTrackingMode;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewState;
import com.smartlook.sdk.smartlook.analytic.automatic.annotation.ViewType;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingMode;
import com.smartlook.sdk.smartlook.core.api.annotation.RenderingModeOption;
import com.smartlook.sdk.smartlook.core.api.model.LogListener;
import com.smartlook.sdk.smartlook.core.session.model.UserProperties;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.RecordingMask;
import com.smartlook.sdk.smartlook.core.video.sensitivity.model.SmartlookSensitivity;
import com.smartlook.sdk.smartlook.integration.IntegrationListener;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogSeverity;
import e.a.a.a.f.a0.c;
import java.util.List;
import org.json.JSONObject;
/* loaded from: classes2.dex */
public abstract class SmartlookBase {

    /* renamed from: a */
    public static final e.a.a.a.c.d.a f17139a = e.a.a.a.c.h.a.u();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19265a() {
        return "currentEventTrackingModes() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19261a(SetupOptions setupOptions) {
        return "setup() called with: setup options = " + e.a.a.a.f.a0.a.a(setupOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19236b() {
        return "currentRenderingMode() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19233b(SetupOptions setupOptions) {
        return "setup() called with: setupOptions = " + e.a.a.a.f.a0.a.a(setupOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ String m19220c() {
        return "currentRenderingModeOption() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ String m19217c(String str) {
        return "setup() called with: smartlookAPIKey = " + str;
    }

    public static void cancelTimedCustomEvent(final String str, final String str2) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.r0
            /* renamed from: a */
            public final String m19036a() {
                String m19248a;
                m19248a = SmartlookBase.m19248a(str, str2);
                return m19248a;
            }
        });
        f17139a.v(str, str2);
    }

    public static List<EventTrackingMode> currentEventTrackingModes() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", C7311y1.f17283a);
        return f17139a.W();
    }

    public static RenderingMode currentRenderingMode() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", C7312z.f17284a);
        return f17139a.e0();
    }

    public static RenderingModeOption currentRenderingModeOption() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", C7250h0.f17187a);
        return f17139a.l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ String m19210d() {
        return "getDashboardVisitorUrl() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ String m19208d(String str) {
        return "setupAndStartRecording() called with: smartlookAPIKey = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m19203e() {
        return "isRecording() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m19200e(String str, String str2) {
        return "trackCustomEvent() called with: eventName = " + str + ", properties = " + str2;
    }

    public static void enableLogging(List<LogAspect> list) {
        f17139a.j0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m19197f() {
        return "logCurrentViewHierarchy() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m19196f(String str) {
        return "stopTimedCustomEvent() called with: eventId = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m19193g() {
        return "registerIntegrationListener() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m19192g(String str) {
        return "trackCustomEvent() called with: eventName = " + str;
    }

    public static String getDashboardSessionUrl(final boolean z) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.t1
            /* renamed from: a */
            public final String m19029a() {
                String m19238a;
                m19238a = SmartlookBase.m19238a(z);
                return m19238a;
            }
        });
        return f17139a.V(z);
    }

    public static String getDashboardVisitorUrl() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", C7242f0.f17175a);
        return f17139a.w0();
    }

    public static SmartlookSensitivity getSensitivity(final View view) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.p1
            /* renamed from: a */
            public final String m19040a() {
                String m19262a;
                m19262a = SmartlookBase.m19262a(view);
                return m19262a;
            }
        });
        return f17139a.c(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m19189h() {
        return "removeAllGlobalEventProperties() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ String m19187i() {
        return "startRecording() called";
    }

    public static boolean isRecording() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", C7269l.f17213a);
        return f17139a.B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ String m19185j() {
        return "stopRecording() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static /* synthetic */ String m19183k() {
        return "unregisterIntegrationListener() called";
    }

    public static void logCurrentViewHierarchy() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", C7304w0.f17268a);
        f17139a.C0();
    }

    public static void registerBlacklistedClass(final Class cls) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.o1
            /* renamed from: a */
            public final String m19043a() {
                String m19232b;
                m19232b = SmartlookBase.m19232b(cls);
                return m19232b;
            }
        });
        f17139a.K(cls);
    }

    public static void registerBlacklistedClasses(final List<Class<?>> list) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.g
            /* renamed from: a */
            public final String m19079a() {
                String m19240a;
                m19240a = SmartlookBase.m19240a(list);
                return m19240a;
            }
        });
        f17139a.q0(list);
    }

    public static void registerBlacklistedView(final View view) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.j0
            /* renamed from: a */
            public final String m19066a() {
                String m19234b;
                m19234b = SmartlookBase.m19234b(view);
                return m19234b;
            }
        });
        f17139a.H(view);
    }

    public static void registerBlacklistedViews(final List<View> list) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.l0
            /* renamed from: a */
            public final String m19055a() {
                String m19224b;
                m19224b = SmartlookBase.m19224b(list);
                return m19224b;
            }
        });
        f17139a.v0(list);
    }

    public static void registerIntegrationListener(IntegrationListener integrationListener) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", C7243f1.f17176a);
        f17139a.s(integrationListener);
    }

    public static void registerLogListener(LogListener logListener) {
        f17139a.m(logListener);
    }

    public static void registerWhitelistedView(final View view) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.s
            /* renamed from: a */
            public final String m19034a() {
                String m19219c;
                m19219c = SmartlookBase.m19219c(view);
                return m19219c;
            }
        });
        f17139a.X(view);
    }

    public static void registerWhitelistedViews(final List<View> list) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.i
            /* renamed from: a */
            public final String m19071a() {
                String m19212c;
                m19212c = SmartlookBase.m19212c(list);
                return m19212c;
            }
        });
        f17139a.y0(list);
    }

    public static void removeAllGlobalEventProperties() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", C7235d1.f17166a);
        f17139a.G0();
    }

    public static void removeGlobalEventProperty(final String str) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.t
            /* renamed from: a */
            public final String m19031a() {
                String m19252a;
                m19252a = SmartlookBase.m19252a(str);
                return m19252a;
            }
        });
        f17139a.h0(str);
    }

    public static void resetSession(final boolean z) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.n1
            /* renamed from: a */
            public final String m19046a() {
                String m19222b;
                m19222b = SmartlookBase.m19222b(z);
                return m19222b;
            }
        });
        f17139a.k0(z);
    }

    public static void setBlacklistedItemsColor(final int i) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.e1
            /* renamed from: a */
            public final String m19085a() {
                String m19264a;
                m19264a = SmartlookBase.m19264a(i);
                return m19264a;
            }
        });
        f17139a.g(i);
    }

    public static void setEventTrackingMode(final EventTrackingMode eventTrackingMode) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.u
            /* renamed from: a */
            public final String m19028a() {
                String m19260a;
                m19260a = SmartlookBase.m19260a(EventTrackingMode.this);
                return m19260a;
            }
        });
        f17139a.k(eventTrackingMode);
    }

    public static void setEventTrackingModes(final List<EventTrackingMode> list) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.r1
            /* renamed from: a */
            public final String m19035a() {
                String m19205d;
                m19205d = SmartlookBase.m19205d(list);
                return m19205d;
            }
        });
        f17139a.A0(list);
    }

    public static void setFrameworkInfo(String str, String str2, String str3) {
        f17139a.N(str, str2, str3);
    }

    public static void setGlobalEventProperties(final JSONObject jSONObject, final boolean z) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.q1
            /* renamed from: a */
            public final String m19037a() {
                String m19239a;
                m19239a = SmartlookBase.m19239a(jSONObject, z);
                return m19239a;
            }
        });
        f17139a.D(jSONObject, z);
    }

    public static void setGlobalEventProperty(final String str, final String str2, final boolean z) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.b2
            /* renamed from: a */
            public final String m19101a() {
                String m19243a;
                m19243a = SmartlookBase.m19243a(str, str2, z);
                return m19243a;
            }
        });
        f17139a.A(str, str2, z);
    }

    public static void setRecordingMask(final RecordingMask recordingMask) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.l1
            /* renamed from: a */
            public final String m19054a() {
                String m19256a;
                m19256a = SmartlookBase.m19256a(RecordingMask.this);
                return m19256a;
            }
        });
        f17139a.p(recordingMask);
    }

    public static void setReferrer(final String str, final String str2) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.n
            /* renamed from: a */
            public final String m19048a() {
                String m19229b;
                m19229b = SmartlookBase.m19229b(str, str2);
                return m19229b;
            }
        });
        f17139a.b0(str, str2);
    }

    public static void setRenderingMode(final RenderingMode renderingMode) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.d0
            /* renamed from: a */
            public final String m19090a() {
                String m19259a;
                m19259a = SmartlookBase.m19259a(RenderingMode.this);
                return m19259a;
            }
        });
        f17139a.l(renderingMode, (RenderingModeOption) null);
    }

    public static void setSensitivity(final SmartlookSensitivity smartlookSensitivity, final View... viewArr) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.k
            /* renamed from: a */
            public final String m19060a() {
                String m19255a;
                m19255a = SmartlookBase.m19255a(SmartlookSensitivity.this, viewArr);
                return m19255a;
            }
        });
        f17139a.q(smartlookSensitivity, viewArr);
    }

    public static void setUserIdentifier(final String str) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.x0
            /* renamed from: a */
            public final String m19018a() {
                String m19231b;
                m19231b = SmartlookBase.m19231b(str);
                return m19231b;
            }
        });
        f17139a.x0(str);
    }

    public static void setUserProperties(final JSONObject jSONObject, final boolean z) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.z1
            /* renamed from: a */
            public final String m19011a() {
                String m19223b;
                m19223b = SmartlookBase.m19223b(jSONObject, z);
                return m19223b;
            }
        });
        f17139a.S(jSONObject, z);
    }

    public static void setUserProperty(final String str, final String str2, final boolean z) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.y
            /* renamed from: a */
            public final String m19016a() {
                String m19227b;
                m19227b = SmartlookBase.m19227b(str, str2, z);
                return m19227b;
            }
        });
        f17139a.O(str, str2, z);
    }

    public static void setup(final String str) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.c1
            /* renamed from: a */
            public final String m19098a() {
                String m19217c;
                m19217c = SmartlookBase.m19217c(str);
                return m19217c;
            }
        });
        f17139a.z0(str);
    }

    public static void setupAndStartRecording(final String str) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.h1
            /* renamed from: a */
            public final String m19073a() {
                String m19208d;
                m19208d = SmartlookBase.m19208d(str);
                return m19208d;
            }
        });
        f17139a.D0(str);
    }

    public static void startRecording() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", C7260j1.f17197a);
        f17139a.I0();
    }

    public static String startTimedCustomEvent(final String str) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.s0
            /* renamed from: a */
            public final String m19033a() {
                String m19201e;
                m19201e = SmartlookBase.m19201e(str);
                return m19201e;
            }
        });
        return f17139a.F0(str);
    }

    public static void stopRecording() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", C7222b1.f17155a);
        f17139a.L0();
    }

    public static void stopTimedCustomEvent(final String str) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.n0
            /* renamed from: a */
            public final String m19047a() {
                String m19196f;
                m19196f = SmartlookBase.m19196f(str);
                return m19196f;
            }
        });
        f17139a.J0(str);
    }

    public static void trackCustomEvent(final String str) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.g0
            /* renamed from: a */
            public final String m19078a() {
                String m19192g;
                m19192g = SmartlookBase.m19192g(str);
                return m19192g;
            }
        });
        f17139a.M0(str);
    }

    public static void trackNavigationEvent(final String str, final ViewState viewState) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.w1
            /* renamed from: a */
            public final String m19020a() {
                String m19250a;
                m19250a = SmartlookBase.m19250a(str, viewState);
                return m19250a;
            }
        });
        f17139a.u(str, ViewType.ACTIVITY, viewState);
    }

    public static void unregisterBlacklistedClass(final Class cls) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.m
            /* renamed from: a */
            public final String m19052a() {
                String m19218c;
                m19218c = SmartlookBase.m19218c(cls);
                return m19218c;
            }
        });
        f17139a.Y(cls);
    }

    public static void unregisterBlacklistedClasses(final List<Class<?>> list) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.a0
            /* renamed from: a */
            public final String m19127a() {
                String m19199e;
                m19199e = SmartlookBase.m19199e(list);
                return m19199e;
            }
        });
        f17139a.E0(list);
    }

    public static void unregisterBlacklistedView(final View view) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.i1
            /* renamed from: a */
            public final String m19069a() {
                String m19209d;
                m19209d = SmartlookBase.m19209d(view);
                return m19209d;
            }
        });
        f17139a.g0(view);
    }

    public static void unregisterBlacklistedViews(final List<View> list) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.u1
            /* renamed from: a */
            public final String m19026a() {
                String m19195f;
                m19195f = SmartlookBase.m19195f(list);
                return m19195f;
            }
        });
        f17139a.H0(list);
    }

    public static void unregisterIntegrationListener() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", C7221b0.f17154a);
        f17139a.N0();
    }

    public static void unregisterLogListener() {
        f17139a.O0();
    }

    public static void unregisterWhitelistedView(final View view) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.s1
            /* renamed from: a */
            public final String m19032a() {
                String m19202e;
                m19202e = SmartlookBase.m19202e(view);
                return m19202e;
            }
        });
        f17139a.m0(view);
    }

    public static void unregisterWhitelistedViews(final List<View> list) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.t0
            /* renamed from: a */
            public final String m19030a() {
                String m19191g;
                m19191g = SmartlookBase.m19191g(list);
                return m19191g;
            }
        });
        f17139a.K0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19256a(RecordingMask recordingMask) {
        return "setRecordingMask() called with: mask = [" + e.a.a.a.f.a0.a.a(recordingMask) + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19222b(boolean z) {
        return "resetSession() called: resetUser = " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ String m19213c(String str, JSONObject jSONObject) {
        return "trackCustomEvent() called with: eventName = " + str + ", eventProperties = " + e.a.a.a.f.a0.a.a(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ String m19205d(List list) {
        return "setEventTrackingModes() called with: eventTrackingModes = " + e.a.a.a.f.a0.a.d(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m19201e(String str) {
        return "startTimedCustomEvent() called with: eventName = " + str;
    }

    public static void enableLogging(List<LogAspect> list, LogSeverity logSeverity) {
        f17139a.C(list, logSeverity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m19195f(List list) {
        return "unregisterBlacklistedViews() called with: blacklistedViews = " + e.a.a.a.f.a0.a.d(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m19191g(List list) {
        return "unregisterWhitelistedViews() called with: whitelistedViews = " + e.a.a.a.f.a0.a.d(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19255a(SmartlookSensitivity smartlookSensitivity, View[] viewArr) {
        return "setSensitivity() called with: isSensitive = " + e.a.a.a.f.a0.a.a(smartlookSensitivity) + ", view = " + e.a.a.a.f.a0.a.g(viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19231b(String str) {
        return "setUserIdentifier() called with: identifier = " + str;
    }

    public static void cancelTimedCustomEvent(final String str, final String str2, final JSONObject jSONObject) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.x
            /* renamed from: a */
            public final String m19019a() {
                String m19244a;
                m19244a = SmartlookBase.m19244a(str, str2, jSONObject);
                return m19244a;
            }
        });
        f17139a.z(str, str2, jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m19202e(View view) {
        return "unregisterWhitelistedView() called with: whitelistedView = " + e.a.a.a.f.a0.a.a(view);
    }

    public static <T extends View> SmartlookSensitivity getSensitivity(final Class<T> cls) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.i0
            /* renamed from: a */
            public final String m19070a() {
                String m19253a;
                m19253a = SmartlookBase.m19253a(cls);
                return m19253a;
            }
        });
        return f17139a.d(cls);
    }

    public static void setGlobalEventProperties(final Bundle bundle, final boolean z) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.k1
            /* renamed from: a */
            public final String m19058a() {
                String m19263a;
                m19263a = SmartlookBase.m19263a(bundle, z);
                return m19263a;
            }
        });
        f17139a.i(bundle, z);
    }

    public static void setRenderingMode(final RenderingMode renderingMode, final RenderingModeOption renderingModeOption) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.e0
            /* renamed from: a */
            public final String m19086a() {
                String m19258a;
                m19258a = SmartlookBase.m19258a(RenderingMode.this, renderingModeOption);
                return m19258a;
            }
        });
        f17139a.l(renderingMode, renderingModeOption);
    }

    @SafeVarargs
    public static <T extends View> void setSensitivity(final SmartlookSensitivity smartlookSensitivity, final Class<T>... clsArr) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.w
            /* renamed from: a */
            public final String m19022a() {
                String m19254a;
                m19254a = SmartlookBase.m19254a(SmartlookSensitivity.this, clsArr);
                return m19254a;
            }
        });
        f17139a.r(smartlookSensitivity, clsArr);
    }

    public static void setUserProperties(final Bundle bundle, final boolean z) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.h
            /* renamed from: a */
            public final String m19075a() {
                String m19235b;
                m19235b = SmartlookBase.m19235b(bundle, z);
                return m19235b;
            }
        });
        f17139a.G(bundle, z);
    }

    public static void setup(final SetupOptions setupOptions) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.q
            /* renamed from: a */
            public final String m19039a() {
                String m19261a;
                m19261a = SmartlookBase.m19261a(SetupOptions.this);
                return m19261a;
            }
        });
        f17139a.j(setupOptions);
    }

    public static void setupAndStartRecording(final SetupOptions setupOptions) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.q0
            /* renamed from: a */
            public final String m19038a() {
                String m19233b;
                m19233b = SmartlookBase.m19233b(SetupOptions.this);
                return m19233b;
            }
        });
        f17139a.I(setupOptions);
    }

    public static String startTimedCustomEvent(final String str, final JSONObject jSONObject) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.c0
            /* renamed from: a */
            public final String m19099a() {
                String m19242a;
                m19242a = SmartlookBase.m19242a(str, jSONObject);
                return m19242a;
            }
        });
        return f17139a.f(str, jSONObject);
    }

    public static void stopTimedCustomEvent(final String str, final JSONObject jSONObject) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.v0
            /* renamed from: a */
            public final String m19024a() {
                String m19226b;
                m19226b = SmartlookBase.m19226b(str, jSONObject);
                return m19226b;
            }
        });
        f17139a.P(str, jSONObject);
    }

    public static void trackCustomEvent(final String str, final JSONObject jSONObject) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.k0
            /* renamed from: a */
            public final String m19059a() {
                String m19213c;
                m19213c = SmartlookBase.m19213c(str, jSONObject);
                return m19213c;
            }
        });
        f17139a.c0(str, jSONObject);
    }

    public static void trackNavigationEvent(final String str, final ViewType viewType, final ViewState viewState) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.a2
            /* renamed from: a */
            public final String m19125a() {
                String m19249a;
                m19249a = SmartlookBase.m19249a(str, viewType, viewState);
                return m19249a;
            }
        });
        f17139a.u(str, viewType, viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19227b(String str, String str2, boolean z) {
        return "setUserProperty() called with: key = " + str + ", value = " + str2 + ", immutable = " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ String m19216c(String str, Bundle bundle) {
        return "trackCustomEvent() called with: eventName = " + str + ", bundle = " + e.a.a.a.f.a0.a.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ String m19206d(String str, String str2, String str3) {
        return "trackCustomEvent() called with: eventName = " + str + ", key = " + str2 + ", value = " + str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19223b(JSONObject jSONObject, boolean z) {
        return "setUserProperties() called with: sessionProperties = " + e.a.a.a.f.a0.a.a(jSONObject) + ", immutable = " + e.a.a.a.f.a0.a.a(Boolean.valueOf(z));
    }

    public static void cancelTimedCustomEvent(final String str, final String str2, final Bundle bundle) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.o
            /* renamed from: a */
            public final String m19045a() {
                String m19247a;
                m19247a = SmartlookBase.m19247a(str, str2, bundle);
                return m19247a;
            }
        });
        f17139a.w(str, str2, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ String m19207d(String str, String str2) {
        return "stopTimedCustomEvent() called with: eventId = " + str + ", eventProperties = " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m19199e(List list) {
        return "unregisterBlacklistedClasses() called with: blacklistedClasses = " + e.a.a.a.f.a0.a.d(list);
    }

    public static void setGlobalEventProperties(final String str, final boolean z) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.y0
            /* renamed from: a */
            public final String m19015a() {
                String m19241a;
                m19241a = SmartlookBase.m19241a(str, z);
                return m19241a;
            }
        });
        f17139a.B(str, z);
    }

    public static void setUserProperties(final String str, final boolean z) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.m1
            /* renamed from: a */
            public final String m19050a() {
                String m19225b;
                m19225b = SmartlookBase.m19225b(str, z);
                return m19225b;
            }
        });
        f17139a.Q(str, z);
    }

    public static String startTimedCustomEvent(final String str, final Bundle bundle) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.p
            /* renamed from: a */
            public final String m19042a() {
                String m19251a;
                m19251a = SmartlookBase.m19251a(str, bundle);
                return m19251a;
            }
        });
        return f17139a.e(str, bundle);
    }

    public static void stopTimedCustomEvent(final String str, final Bundle bundle) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.a1
            /* renamed from: a */
            public final String m19126a() {
                String m19230b;
                m19230b = SmartlookBase.m19230b(str, bundle);
                return m19230b;
            }
        });
        f17139a.L(str, bundle);
    }

    public static void trackCustomEvent(final String str, final String str2, final String str3) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.m0
            /* renamed from: a */
            public final String m19051a() {
                String m19206d;
                m19206d = SmartlookBase.m19206d(str, str2, str3);
                return m19206d;
            }
        });
        f17139a.u0(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19254a(SmartlookSensitivity smartlookSensitivity, Class[] clsArr) {
        return "setSensitivity() called with: isSensitive = " + e.a.a.a.f.a0.a.a(smartlookSensitivity) + ", clazz = " + e.a.a.a.f.a0.a.g(clsArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ String m19215c(String str, String str2) {
        return "startTimedCustomEvent() called with: eventName = " + str + ", eventProperties = " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ String m19209d(View view) {
        return "unregisterBlacklistedView() called with: blacklistedView = " + e.a.a.a.f.a0.a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ String m19214c(String str, String str2, String str3) {
        return "stopTimedCustomEvent() called with: eventId = " + str + ", key = " + str2 + ", value = " + str3;
    }

    public static void cancelTimedCustomEvent(final String str, final String str2, final String str3) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.v1
            /* renamed from: a */
            public final String m19023a() {
                String m19246a;
                m19246a = SmartlookBase.m19246a(str, str2, str3);
                return m19246a;
            }
        });
        f17139a.x(str, str2, str3);
    }

    public static void setUserProperties(final UserProperties userProperties) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.j
            /* renamed from: a */
            public final String m19067a() {
                String m19257a;
                m19257a = SmartlookBase.m19257a(UserProperties.this);
                return m19257a;
            }
        });
        f17139a.o(userProperties);
    }

    public static String startTimedCustomEvent(final String str, final String str2) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.o0
            /* renamed from: a */
            public final String m19044a() {
                String m19215c;
                m19215c = SmartlookBase.m19215c(str, str2);
                return m19215c;
            }
        });
        return f17139a.f0(str, str2);
    }

    public static void stopTimedCustomEvent(final String str, final String str2) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.g1
            /* renamed from: a */
            public final String m19077a() {
                String m19207d;
                m19207d = SmartlookBase.m19207d(str, str2);
                return m19207d;
            }
        });
        f17139a.o0(str, str2);
    }

    public static void trackCustomEvent(final String str, final Bundle bundle) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.z0
            /* renamed from: a */
            public final String m19012a() {
                String m19216c;
                m19216c = SmartlookBase.m19216c(str, bundle);
                return m19216c;
            }
        });
        f17139a.a0(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19235b(Bundle bundle, boolean z) {
        return "setUserProperties() called with: sessionProperties = " + e.a.a.a.f.a0.a.a(bundle) + ", immutable = " + e.a.a.a.f.a0.a.a(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ String m19219c(View view) {
        return "registerWhitelistedView() called with: whitelistedView = " + e.a.a.a.f.a0.a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19262a(View view) {
        return "getSensitivity() called with: view = " + e.a.a.a.f.a0.a.a(view);
    }

    public static void cancelTimedCustomEvent(final String str, final String str2, final String str3, final String str4) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.p0
            /* renamed from: a */
            public final String m19041a() {
                String m19245a;
                m19245a = SmartlookBase.m19245a(str, str2, str3, str4);
                return m19245a;
            }
        });
        f17139a.y(str, str2, str3, str4);
    }

    public static String startTimedCustomEvent(final String str, final String str2, final String str3) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.u0
            /* renamed from: a */
            public final String m19027a() {
                String m19228b;
                m19228b = SmartlookBase.m19228b(str, str2, str3);
                return m19228b;
            }
        });
        return f17139a.U(str, str2, str3);
    }

    public static void stopTimedCustomEvent(final String str, final String str2, final String str3) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.x1
            /* renamed from: a */
            public final String m19017a() {
                String m19214c;
                m19214c = SmartlookBase.m19214c(str, str2, str3);
                return m19214c;
            }
        });
        f17139a.i0(str, str2, str3);
    }

    public static void trackCustomEvent(final String str, final String str2) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "API", new c.b() { // from class: com.smartlook.sdk.smartlook.v
            /* renamed from: a */
            public final String m19025a() {
                String m19200e;
                m19200e = SmartlookBase.m19200e(str, str2);
                return m19200e;
            }
        });
        f17139a.t0(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19253a(Class cls) {
        return "getSensitivity() called with: clazz = " + e.a.a.a.f.a0.a.a(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ String m19212c(List list) {
        return "registerWhitelistedViews() called with: whitelistedViews = " + e.a.a.a.f.a0.a.d(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19264a(int i) {
        return "setBlacklistedItemsColor() called with: color = " + i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19225b(String str, boolean z) {
        return "setUserProperties() called with: sessionProperties = " + e.a.a.a.f.a0.a.a(str) + ", immutable = " + e.a.a.a.f.a0.a.a(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19257a(UserProperties userProperties) {
        return "setUserProperties() called with: userProperties = " + e.a.a.a.f.a0.a.a(userProperties);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ String m19218c(Class cls) {
        return "unregisterBlacklistedClass() called with: blacklistedClass = " + e.a.a.a.f.a0.a.a(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19260a(EventTrackingMode eventTrackingMode) {
        return "setEventTrackingMode() called with: eventTrackingMode = " + e.a.a.a.f.a0.a.a(eventTrackingMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19228b(String str, String str2, String str3) {
        return "startTimedCustomEvent() called with: eventName = " + str + ", key = " + str2 + ", value = " + str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19250a(String str, ViewState viewState) {
        return "trackNavigationEvent() called with: name = " + str + ", viewState = " + e.a.a.a.f.a0.a.a(viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19226b(String str, JSONObject jSONObject) {
        return "stopTimedCustomEvent() called with: eventId = " + str + ", eventProperties = " + e.a.a.a.f.a0.a.a(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19249a(String str, ViewType viewType, ViewState viewState) {
        return "trackNavigationEvent() called with: name = " + str + ", type = " + e.a.a.a.f.a0.a.a(viewType) + ", viewState = " + e.a.a.a.f.a0.a.a(viewState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19230b(String str, Bundle bundle) {
        return "stopTimedCustomEvent() called with: eventId = " + str + ", bundle = " + e.a.a.a.f.a0.a.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19229b(String str, String str2) {
        return "setReferrer() called with: referrer = " + str + ", source = " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19242a(String str, JSONObject jSONObject) {
        return "startTimedCustomEvent() called with: eventName = " + str + ", eventProperties = " + e.a.a.a.f.a0.a.a(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19234b(View view) {
        return "registerBlacklistedView() called with: blacklistedView = " + e.a.a.a.f.a0.a.a(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19251a(String str, Bundle bundle) {
        return "startTimedCustomEvent() called with: eventName = " + str + ", bundle = " + e.a.a.a.f.a0.a.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19224b(List list) {
        return "registerBlacklistedViews() called with: blacklistedViews = " + e.a.a.a.f.a0.a.d(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19248a(String str, String str2) {
        return "cancelTimedCustomEvent() called with: eventId = " + str + ", reason = " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ String m19232b(Class cls) {
        return "registerBlacklistedClass() called with: blacklistedClass = " + e.a.a.a.f.a0.a.a(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19244a(String str, String str2, JSONObject jSONObject) {
        return "cancelTimedCustomEvent() called with: eventId = " + str + ", reason = " + str2 + ", eventProperties = " + e.a.a.a.f.a0.a.a(jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19247a(String str, String str2, Bundle bundle) {
        return "cancelTimedCustomEvent() called with: eventId = " + str + ", reason = " + str2 + ", bundle = " + e.a.a.a.f.a0.a.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19246a(String str, String str2, String str3) {
        return "cancelTimedCustomEvent() called with: eventId = " + str + ", reason = " + str2 + ", eventProperties = " + str3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19245a(String str, String str2, String str3, String str4) {
        return "cancelTimedCustomEvent() called with: eventId = " + str + ", reason = " + str2 + ", key = " + str3 + ", value = " + str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19239a(JSONObject jSONObject, boolean z) {
        return "setGlobalEventProperties() called with: globalEventProperties = " + e.a.a.a.f.a0.a.a(jSONObject) + ", immutable = " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19263a(Bundle bundle, boolean z) {
        return "setGlobalEventProperties() called with: globalEventProperties = " + e.a.a.a.f.a0.a.a(bundle) + ", immutable = " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19241a(String str, boolean z) {
        return "setGlobalEventProperties() called with: globalEventProperties = " + str + ", immutable = " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19243a(String str, String str2, boolean z) {
        return "setGlobalEventProperty() called with: key = " + str + ", value = " + str2 + ", immutable = " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19252a(String str) {
        return "removeGlobalEventProperty() called with: key = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19238a(boolean z) {
        return "getDashboardSessionUrl() called with: withCurrentTimestamp = " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19259a(RenderingMode renderingMode) {
        return "setRenderingMode() called with: renderingMode = " + e.a.a.a.f.a0.a.a(renderingMode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19258a(RenderingMode renderingMode, RenderingModeOption renderingModeOption) {
        return "setRenderingMode() called with: renderingMode = " + e.a.a.a.f.a0.a.a(renderingMode) + ", renderingModeOption = " + e.a.a.a.f.a0.a.a(renderingModeOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19240a(List list) {
        return "registerBlacklistedClasses() called with: blacklistedClasses = " + e.a.a.a.f.a0.a.d(list);
    }
}
