package com.google.firebase.inappmessaging.p154j0;

import android.os.Bundle;
import com.google.android.gms.tasks.InterfaceC4458g;
import com.google.firebase.C5988g;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.inappmessaging.C6007d;
import com.google.firebase.inappmessaging.C6125e;
import com.google.firebase.inappmessaging.EnumC6139h0;
import com.google.firebase.inappmessaging.EnumC6361l;
import com.google.firebase.inappmessaging.EnumC6363m;
import com.google.firebase.inappmessaging.InterfaceC6411u;
import com.google.firebase.inappmessaging.model.AbstractC6386i;
import com.google.firebase.inappmessaging.model.C6365a;
import com.google.firebase.inappmessaging.model.C6371c;
import com.google.firebase.inappmessaging.model.C6378f;
import com.google.firebase.inappmessaging.model.C6383h;
import com.google.firebase.inappmessaging.model.C6387j;
import com.google.firebase.inappmessaging.model.MessageType;
import com.google.firebase.inappmessaging.p154j0.p158t3.InterfaceC6332a;
import com.google.firebase.installations.InterfaceC6432h;
import java.util.HashMap;
import java.util.Map;
/* compiled from: MetricsLoggerClient.java */
/* renamed from: com.google.firebase.inappmessaging.j0.d3 */
/* loaded from: classes2.dex */
public class C6168d3 {

    /* renamed from: g */
    private static final Map<InterfaceC6411u.EnumC6413b, EnumC6139h0> f15022g = new HashMap();

    /* renamed from: h */
    private static final Map<InterfaceC6411u.EnumC6412a, EnumC6361l> f15023h = new HashMap();

    /* renamed from: a */
    private final InterfaceC6170b f15024a;

    /* renamed from: b */
    private final C5988g f15025b;

    /* renamed from: c */
    private final InterfaceC6432h f15026c;

    /* renamed from: d */
    private final InterfaceC6332a f15027d;

    /* renamed from: e */
    private final InterfaceC5174a f15028e;

    /* renamed from: f */
    private final C6236p2 f15029f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MetricsLoggerClient.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.d3$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C6169a {

        /* renamed from: a */
        static final /* synthetic */ int[] f15030a;

        static {
            int[] iArr = new int[MessageType.values().length];
            f15030a = iArr;
            try {
                iArr[MessageType.CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15030a[MessageType.MODAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15030a[MessageType.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15030a[MessageType.IMAGE_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: MetricsLoggerClient.java */
    /* renamed from: com.google.firebase.inappmessaging.j0.d3$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC6170b {
        /* renamed from: a */
        void mo22392a(byte[] bArr);
    }

    static {
        f15022g.put(InterfaceC6411u.EnumC6413b.UNSPECIFIED_RENDER_ERROR, EnumC6139h0.UNSPECIFIED_RENDER_ERROR);
        f15022g.put(InterfaceC6411u.EnumC6413b.IMAGE_FETCH_ERROR, EnumC6139h0.IMAGE_FETCH_ERROR);
        f15022g.put(InterfaceC6411u.EnumC6413b.IMAGE_DISPLAY_ERROR, EnumC6139h0.IMAGE_DISPLAY_ERROR);
        f15022g.put(InterfaceC6411u.EnumC6413b.IMAGE_UNSUPPORTED_FORMAT, EnumC6139h0.IMAGE_UNSUPPORTED_FORMAT);
        f15023h.put(InterfaceC6411u.EnumC6412a.AUTO, EnumC6361l.AUTO);
        f15023h.put(InterfaceC6411u.EnumC6412a.CLICK, EnumC6361l.CLICK);
        f15023h.put(InterfaceC6411u.EnumC6412a.SWIPE, EnumC6361l.SWIPE);
        f15023h.put(InterfaceC6411u.EnumC6412a.UNKNOWN_DISMISS_TYPE, EnumC6361l.UNKNOWN_DISMISS_TYPE);
    }

    public C6168d3(InterfaceC6170b interfaceC6170b, InterfaceC5174a interfaceC5174a, C5988g c5988g, InterfaceC6432h interfaceC6432h, InterfaceC6332a interfaceC6332a, C6236p2 c6236p2) {
        this.f15024a = interfaceC6170b;
        this.f15028e = interfaceC5174a;
        this.f15025b = c5988g;
        this.f15026c = interfaceC6432h;
        this.f15027d = interfaceC6332a;
        this.f15029f = c6236p2;
    }

    /* renamed from: b */
    private C6007d.C6009b m22616b(AbstractC6386i abstractC6386i, String str) {
        C6007d.C6009b m23017a0 = C6007d.m23017a0();
        m23017a0.m23003L("20.1.1");
        m23017a0.m23002M(this.f15025b.m23089m().m23066e());
        m23017a0.m23008F(abstractC6386i.m22152a().m22180a());
        C6125e.C6127b m22667U = C6125e.m22667U();
        m22667U.m22663G(this.f15025b.m23089m().m23068c());
        m22667U.m22664F(str);
        m23017a0.m23007G(m22667U);
        m23017a0.m23006H(this.f15027d.mo22281a());
        return m23017a0;
    }

    /* renamed from: c */
    private C6007d m22615c(AbstractC6386i abstractC6386i, String str, EnumC6361l enumC6361l) {
        C6007d.C6009b m22616b = m22616b(abstractC6386i, str);
        m22616b.m23005I(enumC6361l);
        return m22616b.build();
    }

    /* renamed from: d */
    private C6007d m22614d(AbstractC6386i abstractC6386i, String str, EnumC6363m enumC6363m) {
        C6007d.C6009b m22616b = m22616b(abstractC6386i, str);
        m22616b.m23004K(enumC6363m);
        return m22616b.build();
    }

    /* renamed from: e */
    private C6007d m22613e(AbstractC6386i abstractC6386i, String str, EnumC6139h0 enumC6139h0) {
        C6007d.C6009b m22616b = m22616b(abstractC6386i, str);
        m22616b.m23001N(enumC6139h0);
        return m22616b.build();
    }

    /* renamed from: f */
    private boolean m22612f(AbstractC6386i abstractC6386i) {
        int i = C6169a.f15030a[abstractC6386i.m22151c().ordinal()];
        if (i == 1) {
            C6378f c6378f = (C6378f) abstractC6386i;
            return (m22610h(c6378f.m22172i()) ^ true) && (m22610h(c6378f.m22171j()) ^ true);
        } else if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    C6163c3.m22620b("Unable to determine if impression should be counted as conversion.");
                    return false;
                }
                return !m22610h(((C6383h) abstractC6386i).m22156e());
            }
            return !m22610h(((C6371c) abstractC6386i).m22196e());
        } else {
            return !m22610h(((C6387j) abstractC6386i).m22148e());
        }
    }

    /* renamed from: g */
    private boolean m22611g(AbstractC6386i abstractC6386i) {
        return abstractC6386i.m22152a().m22178c();
    }

    /* renamed from: h */
    private boolean m22610h(C6365a c6365a) {
        return (c6365a == null || c6365a.m22202b() == null || c6365a.m22202b().isEmpty()) ? false : true;
    }

    /* renamed from: n */
    private void m22604n(AbstractC6386i abstractC6386i, String str, boolean z) {
        String m22180a = abstractC6386i.m22152a().m22180a();
        Bundle m22617a = m22617a(abstractC6386i.m22152a().m22179b(), m22180a);
        C6163c3.m22621a("Sending event=" + str + " params=" + m22617a);
        InterfaceC5174a interfaceC5174a = this.f15028e;
        if (interfaceC5174a != null) {
            interfaceC5174a.mo22587c("fiam", str, m22617a);
            if (z) {
                InterfaceC5174a interfaceC5174a2 = this.f15028e;
                interfaceC5174a2.mo22584f("fiam", "_ln", "fiam:" + m22180a);
                return;
            }
            return;
        }
        C6163c3.m22618d("Unable to log event: analytics library is missing");
    }

    /* renamed from: a */
    Bundle m22617a(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", str2);
        bundle.putString("_nmn", str);
        try {
            bundle.putInt("_ndt", (int) (this.f15027d.mo22281a() / 1000));
        } catch (NumberFormatException e) {
            C6163c3.m22618d("Error while parsing use_device_time in FIAM event: " + e.getMessage());
        }
        return bundle;
    }

    /* renamed from: i */
    public /* synthetic */ void m22609i(AbstractC6386i abstractC6386i, InterfaceC6411u.EnumC6412a enumC6412a, String str) {
        this.f15024a.mo22392a(m22615c(abstractC6386i, str, f15023h.get(enumC6412a)).mo19709e());
    }

    /* renamed from: j */
    public /* synthetic */ void m22608j(AbstractC6386i abstractC6386i, String str) {
        this.f15024a.mo22392a(m22614d(abstractC6386i, str, EnumC6363m.IMPRESSION_EVENT_TYPE).mo19709e());
    }

    /* renamed from: k */
    public /* synthetic */ void m22607k(AbstractC6386i abstractC6386i, String str) {
        this.f15024a.mo22392a(m22614d(abstractC6386i, str, EnumC6363m.CLICK_EVENT_TYPE).mo19709e());
    }

    /* renamed from: l */
    public /* synthetic */ void m22606l(AbstractC6386i abstractC6386i, InterfaceC6411u.EnumC6413b enumC6413b, String str) {
        this.f15024a.mo22392a(m22613e(abstractC6386i, str, f15022g.get(enumC6413b)).mo19709e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public void m22605m(final AbstractC6386i abstractC6386i, final InterfaceC6411u.EnumC6412a enumC6412a) {
        if (!m22611g(abstractC6386i)) {
            this.f15026c.mo22049h().f(new InterfaceC4458g() { // from class: com.google.firebase.inappmessaging.j0.n1
                @Override // com.google.android.gms.tasks.InterfaceC4458g
                /* renamed from: c */
                public final void mo18742c(Object obj) {
                    C6168d3.this.m22609i(abstractC6386i, enumC6412a, (String) obj);
                }
            });
            m22604n(abstractC6386i, "fiam_dismiss", false);
        }
        this.f15029f.m22497h(abstractC6386i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m22603o(final AbstractC6386i abstractC6386i) {
        if (!m22611g(abstractC6386i)) {
            this.f15026c.mo22049h().f(new InterfaceC4458g() { // from class: com.google.firebase.inappmessaging.j0.l1
                @Override // com.google.android.gms.tasks.InterfaceC4458g
                /* renamed from: c */
                public final void mo18742c(Object obj) {
                    C6168d3.this.m22608j(abstractC6386i, (String) obj);
                }
            });
            m22604n(abstractC6386i, "fiam_impression", m22612f(abstractC6386i));
        }
        this.f15029f.m22503b(abstractC6386i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m22602p(final AbstractC6386i abstractC6386i, C6365a c6365a) {
        if (!m22611g(abstractC6386i)) {
            this.f15026c.mo22049h().f(new InterfaceC4458g() { // from class: com.google.firebase.inappmessaging.j0.m1
                @Override // com.google.android.gms.tasks.InterfaceC4458g
                /* renamed from: c */
                public final void mo18742c(Object obj) {
                    C6168d3.this.m22607k(abstractC6386i, (String) obj);
                }
            });
            m22604n(abstractC6386i, "fiam_action", true);
        }
        this.f15029f.m22498g(abstractC6386i, c6365a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m22601q(final AbstractC6386i abstractC6386i, final InterfaceC6411u.EnumC6413b enumC6413b) {
        if (!m22611g(abstractC6386i)) {
            this.f15026c.mo22049h().f(new InterfaceC4458g() { // from class: com.google.firebase.inappmessaging.j0.k1
                @Override // com.google.android.gms.tasks.InterfaceC4458g
                /* renamed from: c */
                public final void mo18742c(Object obj) {
                    C6168d3.this.m22606l(abstractC6386i, enumC6413b, (String) obj);
                }
            });
        }
        this.f15029f.m22504a(abstractC6386i, enumC6413b);
    }
}
