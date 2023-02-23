package com.smartlook.sdk.smartlook;

import com.segment.analytics.Middleware;
import com.smartlook.sdk.smartlook.integration.segment.SegmentMiddlewareOption;
import com.smartlook.sdk.smartlook.util.logging.annotation.LogAspect;
import e.a.a.a.f.a0.c;
import java.util.List;
/* loaded from: classes2.dex */
public class SmartlookSegmentIntegration {

    /* renamed from: a */
    public static final e.a.a.a.c.d.a f17141a = e.a.a.a.c.h.a.u();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19132a() {
        return "createSegmentMiddleware() called";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ String m19131a(List list) {
        return "createSegmentMiddleware() called with: options = " + e.a.a.a.f.a0.a.d(list);
    }

    public static Middleware createSegmentMiddleware() {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "SmartlookSegmentIntegration", C7276m2.f17223a);
        return f17141a.a((List) null);
    }

    public static Middleware createSegmentMiddleware(final List<SegmentMiddlewareOption> list) {
        e.a.a.a.f.a0.c.e(LogAspect.SDK_METHODS, "SmartlookSegmentIntegration", new c.b() { // from class: com.smartlook.sdk.smartlook.l2
            /* renamed from: a */
            public final String m19053a() {
                String m19131a;
                m19131a = SmartlookSegmentIntegration.m19131a(list);
                return m19131a;
            }
        });
        return f17141a.a(list);
    }
}
