package com.google.firebase.database;

import androidx.annotation.Keep;
import com.google.firebase.C5988g;
import com.google.firebase.auth.internal.InterfaceC5213b;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.p163j.p164b.InterfaceC6467b;
import com.google.firebase.p181q.C6730h;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class DatabaseRegistrar implements InterfaceC5305r {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ C5616g m24346a(InterfaceC5299o interfaceC5299o) {
        return new C5616g((C5988g) interfaceC5299o.mo25206a(C5988g.class), interfaceC5299o.mo25195e(InterfaceC5213b.class), interfaceC5299o.mo25195e(InterfaceC6467b.class));
    }

    @Override // com.google.firebase.components.InterfaceC5305r
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25229a = C5296n.m25229a(C5616g.class);
        m25229a.m25214b(C5313u.m25157j(C5988g.class));
        m25229a.m25214b(C5313u.m25166a(InterfaceC5213b.class));
        m25229a.m25214b(C5313u.m25166a(InterfaceC6467b.class));
        m25229a.m25210f(C5607a.f13819a);
        return Arrays.asList(m25229a.m25212d(), C6730h.m20935a("fire-rtdb", "20.0.2"));
    }
}
