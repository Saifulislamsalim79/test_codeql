package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C5988g;
import com.google.firebase.abt.component.C5173b;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p181q.C6730h;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class RemoteConfigRegistrar implements InterfaceC5305r {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ C6772o m20908a(InterfaceC5299o interfaceC5299o) {
        return new C6772o((Context) interfaceC5299o.mo25206a(Context.class), (C5988g) interfaceC5299o.mo25206a(C5988g.class), (InterfaceC6432h) interfaceC5299o.mo25206a(InterfaceC6432h.class), ((C5173b) interfaceC5299o.mo25206a(C5173b.class)).m25451b("frc"), interfaceC5299o.mo25197b(InterfaceC5174a.class));
    }

    @Override // com.google.firebase.components.InterfaceC5305r
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25229a = C5296n.m25229a(C6772o.class);
        m25229a.m25214b(C5313u.m25157j(Context.class));
        m25229a.m25214b(C5313u.m25157j(C5988g.class));
        m25229a.m25214b(C5313u.m25157j(InterfaceC6432h.class));
        m25229a.m25214b(C5313u.m25157j(C5173b.class));
        m25229a.m25214b(C5313u.m25158i(InterfaceC5174a.class));
        m25229a.m25210f(C6740h.f16213a);
        m25229a.m25211e();
        return Arrays.asList(m25229a.m25212d(), C6730h.m20935a("fire-rc", "21.0.1"));
    }
}
