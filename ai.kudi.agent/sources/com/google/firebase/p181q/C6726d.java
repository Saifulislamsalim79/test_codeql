package com.google.firebase.p181q;

import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import java.util.Iterator;
import java.util.Set;
/* compiled from: DefaultUserAgentPublisher.java */
/* renamed from: com.google.firebase.q.d */
/* loaded from: classes2.dex */
public class C6726d implements InterfaceC6732i {

    /* renamed from: a */
    private final String f16185a;

    /* renamed from: b */
    private final C6727e f16186b;

    C6726d(Set<AbstractC6729g> set, C6727e c6727e) {
        this.f16185a = m20942d(set);
        this.f16186b = c6727e;
    }

    /* renamed from: b */
    public static C5296n<InterfaceC6732i> m20944b() {
        C5296n.C5298b m25229a = C5296n.m25229a(InterfaceC6732i.class);
        m25229a.m25214b(C5313u.m25155l(AbstractC6729g.class));
        m25229a.m25210f(C6723a.f16180a);
        return m25229a.m25212d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ InterfaceC6732i m20943c(InterfaceC5299o interfaceC5299o) {
        return new C6726d(interfaceC5299o.mo25205d(AbstractC6729g.class), C6727e.m20941a());
    }

    /* renamed from: d */
    private static String m20942d(Set<AbstractC6729g> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC6729g> it = set.iterator();
        while (it.hasNext()) {
            AbstractC6729g next = it.next();
            sb.append(next.mo20937b());
            sb.append('/');
            sb.append(next.mo20936c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.p181q.InterfaceC6732i
    /* renamed from: a */
    public String mo20931a() {
        if (this.f16186b.m20940b().isEmpty()) {
            return this.f16185a;
        }
        return this.f16185a + ' ' + m20942d(this.f16186b.m20940b());
    }
}
