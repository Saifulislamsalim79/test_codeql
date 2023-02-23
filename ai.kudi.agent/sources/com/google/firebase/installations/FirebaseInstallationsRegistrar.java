package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.C5988g;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.p169n.InterfaceC6555f;
import com.google.firebase.p181q.C6730h;
import com.google.firebase.p181q.InterfaceC6732i;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements InterfaceC5305r {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ InterfaceC6432h m22078a(InterfaceC5299o interfaceC5299o) {
        return new C6429g((C5988g) interfaceC5299o.mo25206a(C5988g.class), interfaceC5299o.mo25197b(InterfaceC6732i.class), interfaceC5299o.mo25197b(InterfaceC6555f.class));
    }

    @Override // com.google.firebase.components.InterfaceC5305r
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25229a = C5296n.m25229a(InterfaceC6432h.class);
        m25229a.m25214b(C5313u.m25157j(C5988g.class));
        m25229a.m25214b(C5313u.m25158i(InterfaceC6555f.class));
        m25229a.m25214b(C5313u.m25158i(InterfaceC6732i.class));
        m25229a.m25210f(C6424d.f15514a);
        return Arrays.asList(m25229a.m25212d(), C6730h.m20935a("fire-installations", "17.0.0"));
    }
}
