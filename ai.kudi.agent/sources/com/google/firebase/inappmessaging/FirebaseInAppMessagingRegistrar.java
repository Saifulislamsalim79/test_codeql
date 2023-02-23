package com.google.firebase.inappmessaging;

import android.app.Application;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.C5988g;
import com.google.firebase.abt.component.C5173b;
import com.google.firebase.analytics.p111a.InterfaceC5174a;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.components.InterfaceC5304q;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.inappmessaging.p154j0.C6175e3;
import com.google.firebase.inappmessaging.p154j0.C6195i2;
import com.google.firebase.inappmessaging.p154j0.p155s3.p156a.C6260b;
import com.google.firebase.inappmessaging.p154j0.p155s3.p156a.C6279c;
import com.google.firebase.inappmessaging.p154j0.p155s3.p156a.InterfaceC6258a;
import com.google.firebase.inappmessaging.p154j0.p155s3.p156a.InterfaceC6282d;
import com.google.firebase.inappmessaging.p154j0.p155s3.p157b.C6288c0;
import com.google.firebase.inappmessaging.p154j0.p155s3.p157b.C6291e;
import com.google.firebase.inappmessaging.p154j0.p155s3.p157b.C6297h;
import com.google.firebase.inappmessaging.p154j0.p155s3.p157b.C6311o;
import com.google.firebase.inappmessaging.p154j0.p155s3.p157b.C6317r;
import com.google.firebase.inappmessaging.p154j0.p155s3.p157b.C6327z;
import com.google.firebase.installations.InterfaceC6432h;
import com.google.firebase.p167m.InterfaceC6473d;
import com.google.firebase.p181q.C6730h;
import java.util.Arrays;
import java.util.List;
import p272h.p286c.p287a.p288a.InterfaceC8241g;
@Keep
/* loaded from: classes2.dex */
public class FirebaseInAppMessagingRegistrar implements InterfaceC5305r {
    /* JADX INFO: Access modifiers changed from: private */
    public C6408r providesFirebaseInAppMessaging(InterfaceC5299o interfaceC5299o) {
        C5988g c5988g = (C5988g) interfaceC5299o.mo25206a(C5988g.class);
        C6279c.C6281b m22421q = C6279c.m22421q();
        m22421q.m22417c(new C6317r((Application) c5988g.m23093i()));
        m22421q.m22418b(new C6311o(interfaceC5299o.mo25195e(InterfaceC5174a.class), (InterfaceC6473d) interfaceC5299o.mo25206a(InterfaceC6473d.class)));
        m22421q.m22419a(new C6291e());
        m22421q.m22415e(new C6288c0(new C6175e3()));
        InterfaceC6282d m22416d = m22421q.m22416d();
        InterfaceC6258a.InterfaceC6259a m22449b = C6260b.m22449b();
        m22449b.mo22447a(new C6195i2(((C5173b) interfaceC5299o.mo25206a(C5173b.class)).m25451b("fiam")));
        m22449b.mo22443e(new C6297h(c5988g, (InterfaceC6432h) interfaceC5299o.mo25206a(InterfaceC6432h.class), m22416d.mo22402m()));
        m22449b.mo22444d(new C6327z(c5988g));
        m22449b.mo22446b(m22416d);
        m22449b.mo22445c((InterfaceC8241g) interfaceC5299o.mo25206a(InterfaceC8241g.class));
        return m22449b.build().mo22450a();
    }

    @Override // com.google.firebase.components.InterfaceC5305r
    @Keep
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25229a = C5296n.m25229a(C6408r.class);
        m25229a.m25214b(C5313u.m25157j(Context.class));
        m25229a.m25214b(C5313u.m25157j(InterfaceC6432h.class));
        m25229a.m25214b(C5313u.m25157j(C5988g.class));
        m25229a.m25214b(C5313u.m25157j(C5173b.class));
        m25229a.m25214b(C5313u.m25166a(InterfaceC5174a.class));
        m25229a.m25214b(C5313u.m25157j(InterfaceC8241g.class));
        m25229a.m25214b(C5313u.m25157j(InterfaceC6473d.class));
        m25229a.m25210f(new InterfaceC5304q() { // from class: com.google.firebase.inappmessaging.c
            @Override // com.google.firebase.components.InterfaceC5304q
            /* renamed from: a */
            public final Object mo20385a(InterfaceC5299o interfaceC5299o) {
                C6408r providesFirebaseInAppMessaging;
                providesFirebaseInAppMessaging = FirebaseInAppMessagingRegistrar.this.providesFirebaseInAppMessaging(interfaceC5299o);
                return providesFirebaseInAppMessaging;
            }
        });
        m25229a.m25211e();
        return Arrays.asList(m25229a.m25212d(), C6730h.m20935a("fire-fiam", "20.1.1"));
    }
}
