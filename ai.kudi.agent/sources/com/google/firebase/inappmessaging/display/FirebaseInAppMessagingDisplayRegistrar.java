package com.google.firebase.inappmessaging.display;

import android.app.Application;
import androidx.annotation.Keep;
import com.google.firebase.C5988g;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.components.InterfaceC5304q;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.inappmessaging.C6408r;
import com.google.firebase.inappmessaging.display.internal.p149r.p150a.C6089b;
import com.google.firebase.inappmessaging.display.internal.p149r.p150a.C6099d;
import com.google.firebase.inappmessaging.display.internal.p149r.p150a.InterfaceC6103f;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6104a;
import com.google.firebase.inappmessaging.display.internal.p149r.p151b.C6108e;
import com.google.firebase.p181q.C6730h;
import java.util.Arrays;
import java.util.List;
@Keep
/* loaded from: classes2.dex */
public class FirebaseInAppMessagingDisplayRegistrar implements InterfaceC5305r {
    /* JADX INFO: Access modifiers changed from: private */
    public C6015c buildFirebaseInAppMessagingUI(InterfaceC5299o interfaceC5299o) {
        Application application = (Application) ((C5988g) interfaceC5299o.mo25206a(C5988g.class)).m23093i();
        C6099d.C6101b m22743e = C6099d.m22743e();
        m22743e.m22741a(new C6104a(application));
        InterfaceC6103f m22740b = m22743e.m22740b();
        C6089b.C6091b m22756b = C6089b.m22756b();
        m22756b.m22752c(m22740b);
        m22756b.m22753b(new C6108e((C6408r) interfaceC5299o.mo25206a(C6408r.class)));
        C6015c mo22757a = m22756b.m22754a().mo22757a();
        application.registerActivityLifecycleCallbacks(mo22757a);
        return mo22757a;
    }

    @Override // com.google.firebase.components.InterfaceC5305r
    @Keep
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25229a = C5296n.m25229a(C6015c.class);
        m25229a.m25214b(C5313u.m25157j(C5988g.class));
        m25229a.m25214b(C5313u.m25157j(C6408r.class));
        m25229a.m25210f(new InterfaceC5304q() { // from class: com.google.firebase.inappmessaging.display.b
            @Override // com.google.firebase.components.InterfaceC5304q
            /* renamed from: a */
            public final Object mo20385a(InterfaceC5299o interfaceC5299o) {
                C6015c buildFirebaseInAppMessagingUI;
                buildFirebaseInAppMessagingUI = FirebaseInAppMessagingDisplayRegistrar.this.buildFirebaseInAppMessagingUI(interfaceC5299o);
                return buildFirebaseInAppMessagingUI;
            }
        });
        m25229a.m25211e();
        return Arrays.asList(m25229a.m25212d(), C6730h.m20935a("fire-fiamd", "20.1.1"));
    }
}
