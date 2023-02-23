package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.p181q.C6730h;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class AbtRegistrar implements InterfaceC5305r {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ C5173b m25453a(InterfaceC5299o interfaceC5299o) {
        return new C5173b((Context) interfaceC5299o.mo25206a(Context.class), interfaceC5299o.mo25197b(InterfaceC5174a.class));
    }

    @Override // com.google.firebase.components.InterfaceC5305r
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25229a = C5296n.m25229a(C5173b.class);
        m25229a.m25214b(C5313u.m25157j(Context.class));
        m25229a.m25214b(C5313u.m25158i(InterfaceC5174a.class));
        m25229a.m25210f(C5172a.f12888a);
        return Arrays.asList(m25229a.m25212d(), C6730h.m20935a("fire-abt", "21.0.0"));
    }
}
