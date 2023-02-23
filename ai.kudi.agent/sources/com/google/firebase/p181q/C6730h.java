package com.google.firebase.p181q;

import android.content.Context;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5313u;
import com.google.firebase.components.InterfaceC5299o;
import com.google.firebase.components.InterfaceC5304q;
/* compiled from: LibraryVersionComponent.java */
/* renamed from: com.google.firebase.q.h */
/* loaded from: classes2.dex */
public class C6730h {

    /* compiled from: LibraryVersionComponent.java */
    /* renamed from: com.google.firebase.q.h$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC6731a<T> {
        /* renamed from: a */
        String mo20932a(T t);
    }

    /* renamed from: a */
    public static C5296n<?> m20935a(String str, String str2) {
        return C5296n.m25223g(AbstractC6729g.m20938a(str, str2), AbstractC6729g.class);
    }

    /* renamed from: b */
    public static C5296n<?> m20934b(final String str, final InterfaceC6731a<Context> interfaceC6731a) {
        C5296n.C5298b m25222h = C5296n.m25222h(AbstractC6729g.class);
        m25222h.m25214b(C5313u.m25157j(Context.class));
        m25222h.m25210f(new InterfaceC5304q() { // from class: com.google.firebase.q.b
            @Override // com.google.firebase.components.InterfaceC5304q
            /* renamed from: a */
            public final Object mo20385a(InterfaceC5299o interfaceC5299o) {
                AbstractC6729g m20938a;
                m20938a = AbstractC6729g.m20938a(str, interfaceC6731a.mo20932a((Context) interfaceC5299o.mo25206a(Context.class)));
                return m20938a;
            }
        });
        return m25222h.m25212d();
    }
}
