package com.google.firebase.perf;

import androidx.annotation.Keep;
import com.google.firebase.C5988g;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p181q.C6730h;
import com.google.firebase.perf.p173g.p174a.C6597a;
import com.google.firebase.perf.p173g.p175b.C6601a;
import com.google.firebase.remoteconfig.C6772o;
import java.util.Arrays;
import java.util.List;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
@Keep
/* loaded from: classes2.dex */
public class FirebasePerfRegistrar implements InterfaceC5305r {
    /* JADX INFO: Access modifiers changed from: private */
    public static C6565c providesFirebasePerformance(InterfaceC5299o interfaceC5299o) {
        C6597a.C6599b m21512b = C6597a.m21512b();
        m21512b.m21509b(new C6601a((C5988g) interfaceC5299o.mo25206a(C5988g.class), (InterfaceC6432h) interfaceC5299o.mo25206a(InterfaceC6432h.class), interfaceC5299o.mo25197b(C6772o.class), interfaceC5299o.mo25197b(InterfaceC8241g.class)));
        return m21512b.m21510a().mo21508a();
    }

    @Override // com.google.firebase.components.InterfaceC5305r
    @Keep
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25229a = C5296n.m25229a(C6565c.class);
        m25229a.m25214b(C5313u.m25157j(C5988g.class));
        m25229a.m25214b(C5313u.m25156k(C6772o.class));
        m25229a.m25214b(C5313u.m25157j(InterfaceC6432h.class));
        m25229a.m25214b(C5313u.m25156k(InterfaceC8241g.class));
        m25229a.m25210f(C6563a.f15837a);
        return Arrays.asList(m25229a.m25212d(), C6730h.m20935a("fire-perf", C6564b.f15839b));
    }
}
