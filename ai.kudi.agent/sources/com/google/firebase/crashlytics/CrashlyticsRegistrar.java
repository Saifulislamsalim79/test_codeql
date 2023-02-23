package com.google.firebase.crashlytics;

import com.google.firebase.C5988g;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.components.InterfaceC5304q;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.crashlytics.p112h.InterfaceC5331d;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p181q.C6730h;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements InterfaceC5305r {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public C5325g m25136a(InterfaceC5299o interfaceC5299o) {
        return C5325g.m25122b((C5988g) interfaceC5299o.mo25206a(C5988g.class), (InterfaceC6432h) interfaceC5299o.mo25206a(InterfaceC6432h.class), interfaceC5299o.mo25195e(InterfaceC5331d.class), interfaceC5299o.mo25195e(InterfaceC5174a.class));
    }

    @Override // com.google.firebase.components.InterfaceC5305r
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25229a = C5296n.m25229a(C5325g.class);
        m25229a.m25214b(C5313u.m25157j(C5988g.class));
        m25229a.m25214b(C5313u.m25157j(InterfaceC6432h.class));
        m25229a.m25214b(C5313u.m25166a(InterfaceC5331d.class));
        m25229a.m25214b(C5313u.m25166a(InterfaceC5174a.class));
        m25229a.m25210f(new InterfaceC5304q() { // from class: com.google.firebase.crashlytics.d
            @Override // com.google.firebase.components.InterfaceC5304q
            /* renamed from: a */
            public final Object mo20385a(InterfaceC5299o interfaceC5299o) {
                C5325g m25136a;
                m25136a = CrashlyticsRegistrar.this.m25136a(interfaceC5299o);
                return m25136a;
            }
        });
        m25229a.m25211e();
        return Arrays.asList(m25229a.m25212d(), C6730h.m20935a("fire-cls", "18.2.4"));
    }
}
