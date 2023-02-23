package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5305r;
import java.util.Collections;
import java.util.List;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements InterfaceC5305r {
    @Override // com.google.firebase.components.InterfaceC5305r
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25229a = C5296n.m25229a(InterfaceC8241g.class);
        m25229a.m25214b(C5313u.m25157j(Context.class));
        m25229a.m25210f(C5958a.f14604a);
        return Collections.singletonList(m25229a.m25212d());
    }
}
