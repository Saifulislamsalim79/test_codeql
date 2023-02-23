package com.smartlook.sdk.smartlook;

import com.smartlook.sdk.smartlook.core.bridge.BridgeInterface;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import e.a.a.a.f.a0.c;
/* loaded from: classes2.dex */
public abstract class SmartlookBridgeBase extends SmartlookBase {

    /* renamed from: b */
    public static final e.a.a.a.c.d.a f17140b = e.a.a.a.c.h.a.u();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19142a(Exception exc) {
        return "bridgeSetupHandler() setup options are not valid: exception = " + e.a.a.a.f.a0.a.a(exc);
    }

    /* renamed from: c */
    private static void m19140c(String str, boolean z) {
        try {
            e.a.a.a.c.d.a aVar = f17140b;
            final SetupOptions build = aVar.b(str).build();
            if (z) {
                e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "BridgeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.j2
                    /* renamed from: a */
                    public final String m19064a() {
                        String m19141c;
                        m19141c = SmartlookBridgeBase.m19141c(SetupOptions.this);
                        return m19141c;
                    }
                });
                aVar.I(build);
            } else {
                e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "BridgeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.c2
                    /* renamed from: a */
                    public final String m19097a() {
                        String m19139d;
                        m19139d = SmartlookBridgeBase.m19139d(SetupOptions.this);
                        return m19139d;
                    }
                });
                SmartlookBase.setup(build);
            }
        } catch (Exception e) {
            e.a.a.a.f.a0.c.j(LogAspect.MANDATORY, "BridgeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.h2
                /* renamed from: a */
                public final String m19072a() {
                    String m19142a;
                    m19142a = SmartlookBridgeBase.m19142a(e);
                    return m19142a;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ String m19139d(SetupOptions setupOptions) {
        return "bridgeSetupHandler() called with: setupOptions" + e.a.a.a.f.a0.a.a(setupOptions);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m19138e(String str, String str2, String str3) {
        return "trackNavigationEvent() called with: name = " + str + ", type = " + str2 + ", viewState = " + str3;
    }

    public static void enableLogging(String str) {
        f17140b.Z(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m19137f(String str, String str2) {
        return "setRenderingMode() called with: renderingMode = " + str + ", renderingModeOption = " + str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m19136g(String str, String str2) {
        return "trackNavigationEvent() called with: name = " + str + ", viewState = " + e.a.a.a.f.a0.a.a(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m19135h(String str) {
        return "setEventTrackingMode() called with: eventTrackingMode = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static /* synthetic */ String m19134i(String str) {
        return "setEventTrackingMode() called with: eventTrackingModes = " + str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ String m19133j(String str) {
        return "setRenderingMode() called with: renderingMode = " + str;
    }

    public static void registerBridgeInterface(BridgeInterface bridgeInterface) {
        f17140b.n(bridgeInterface);
    }

    public static void setEventTrackingMode(final String str) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "BridgeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.f2
            /* renamed from: a */
            public final String m19080a() {
                String m19135h;
                m19135h = SmartlookBridgeBase.m19135h(str);
                return m19135h;
            }
        });
        f17140b.n0(str);
    }

    public static void setEventTrackingModes(final String str) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "BridgeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.k2
            /* renamed from: a */
            public final String m19057a() {
                String m19134i;
                m19134i = SmartlookBridgeBase.m19134i(str);
                return m19134i;
            }
        });
        f17140b.s0(str);
    }

    public static void setRenderingMode(final String str) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "BridgeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.d2
            /* renamed from: a */
            public final String m19088a() {
                String m19133j;
                m19133j = SmartlookBridgeBase.m19133j(str);
                return m19133j;
            }
        });
        f17140b.M(str, (String) null);
    }

    public static void setupAndStartRecordingBridge(String str) {
        m19140c(str, true);
    }

    public static void setupBridge(String str) {
        m19140c(str, false);
    }

    public static void trackNavigationEvent(final String str, final String str2) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "BridgeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.e2
            /* renamed from: a */
            public final String m19084a() {
                String m19136g;
                m19136g = SmartlookBridgeBase.m19136g(str, str2);
                return m19136g;
            }
        });
        f17140b.p0(str, (String) null, str2);
    }

    public static void setRenderingMode(final String str, final String str2) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "BridgeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.i2
            /* renamed from: a */
            public final String m19068a() {
                String m19137f;
                m19137f = SmartlookBridgeBase.m19137f(str, str2);
                return m19137f;
            }
        });
        f17140b.M(str, str2);
    }

    public static void trackNavigationEvent(final String str, final String str2, final String str3) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "BridgeAPI", new c.b() { // from class: com.smartlook.sdk.smartlook.g2
            /* renamed from: a */
            public final String m19076a() {
                String m19138e;
                m19138e = SmartlookBridgeBase.m19138e(str, str2, str3);
                return m19138e;
            }
        });
        f17140b.p0(str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ String m19141c(SetupOptions setupOptions) {
        return "bridgeSetupHandler() called with: setupOptions = " + e.a.a.a.f.a0.a.a(setupOptions);
    }
}
