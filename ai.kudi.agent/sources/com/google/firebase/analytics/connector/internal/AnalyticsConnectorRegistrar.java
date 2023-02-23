package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C5988g;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.p167m.InterfaceC6473d;
import com.google.firebase.p181q.C6730h;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-api@@20.0.0 */
@Keep
/* loaded from: classes2.dex */
public class AnalyticsConnectorRegistrar implements InterfaceC5305r {
    @Override // com.google.firebase.components.InterfaceC5305r
    @Keep
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25229a = C5296n.m25229a(InterfaceC5174a.class);
        m25229a.m25214b(C5313u.m25157j(C5988g.class));
        m25229a.m25214b(C5313u.m25157j(Context.class));
        m25229a.m25214b(C5313u.m25157j(InterfaceC6473d.class));
        m25229a.m25210f(C5184b.f12917a);
        m25229a.m25211e();
        return Arrays.asList(m25229a.m25212d(), C6730h.m20935a("fire-analytics", "20.0.0"));
    }
}
