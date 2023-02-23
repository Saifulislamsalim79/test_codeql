package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.C5988g;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.iid.p144a.InterfaceC5996a;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p167m.InterfaceC6473d;
import com.google.firebase.p169n.InterfaceC6555f;
import com.google.firebase.p181q.C6730h;
import com.google.firebase.p181q.InterfaceC6732i;
import java.util.Arrays;
import java.util.List;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
/* compiled from: com.google.firebase:firebase-messaging@@23.0.0 */
@Keep
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements InterfaceC5305r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC5299o interfaceC5299o) {
        return new FirebaseMessaging((C5988g) interfaceC5299o.mo25206a(C5988g.class), (InterfaceC5996a) interfaceC5299o.mo25206a(InterfaceC5996a.class), interfaceC5299o.mo25197b(InterfaceC6732i.class), interfaceC5299o.mo25197b(InterfaceC6555f.class), (InterfaceC6432h) interfaceC5299o.mo25206a(InterfaceC6432h.class), (InterfaceC8241g) interfaceC5299o.mo25206a(InterfaceC8241g.class), (InterfaceC6473d) interfaceC5299o.mo25206a(InterfaceC6473d.class));
    }

    @Override // com.google.firebase.components.InterfaceC5305r
    @Keep
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25229a = C5296n.m25229a(FirebaseMessaging.class);
        m25229a.m25214b(C5313u.m25157j(C5988g.class));
        m25229a.m25214b(C5313u.m25159h(InterfaceC5996a.class));
        m25229a.m25214b(C5313u.m25158i(InterfaceC6732i.class));
        m25229a.m25214b(C5313u.m25158i(InterfaceC6555f.class));
        m25229a.m25214b(C5313u.m25159h(InterfaceC8241g.class));
        m25229a.m25214b(C5313u.m25157j(InterfaceC6432h.class));
        m25229a.m25214b(C5313u.m25157j(InterfaceC6473d.class));
        m25229a.m25210f(C6545y.f15798a);
        m25229a.m25213c();
        return Arrays.asList(m25229a.m25212d(), C6730h.m20935a("fire-fcm", "23.0.0"));
    }
}
