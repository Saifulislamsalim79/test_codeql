package com.google.firebase.auth;

import androidx.annotation.Keep;
import com.google.firebase.C5988g;
import com.google.firebase.auth.internal.C5238n0;
import com.google.firebase.auth.internal.InterfaceC5213b;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.p181q.C6730h;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
@Keep
/* loaded from: classes2.dex */
public class FirebaseAuthRegistrar implements InterfaceC5305r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ FirebaseAuth lambda$getComponents$0(InterfaceC5299o interfaceC5299o) {
        return new C5238n0((C5988g) interfaceC5299o.mo25206a(C5988g.class));
    }

    @Override // com.google.firebase.components.InterfaceC5305r
    @Keep
    public List<C5296n<?>> getComponents() {
        C5296n.C5298b m25228b = C5296n.m25228b(FirebaseAuth.class, InterfaceC5213b.class);
        m25228b.m25214b(C5313u.m25157j(C5988g.class));
        m25228b.m25210f(C5267p0.f13078a);
        m25228b.m25211e();
        return Arrays.asList(m25228b.m25212d(), C6730h.m20935a("fire-auth", "21.0.1"));
    }
}
