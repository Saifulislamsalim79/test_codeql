package p425j.p434c.p435a;

import android.content.Context;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p425j.p434c.p435a.AbstractC11178e;
import p425j.p434c.p435a.C11182g;
import p425j.p434c.p435a.C11191k;
import p425j.p434c.p435a.C11199n;
import p425j.p434c.p435a.p436u.C11228c;
import p577n.p578a.p583c.C14440d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MarkwonBuilderImpl.java */
/* renamed from: j.c.a.f */
/* loaded from: classes3.dex */
public class C11181f implements AbstractC11178e.InterfaceC11179a {

    /* renamed from: a */
    private final Context f25256a;

    /* renamed from: d */
    private AbstractC11178e.InterfaceC11180b f25259d;

    /* renamed from: b */
    private final List<InterfaceC11187i> f25257b = new ArrayList(3);

    /* renamed from: c */
    private TextView.BufferType f25258c = TextView.BufferType.SPANNABLE;

    /* renamed from: e */
    private boolean f25260e = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11181f(Context context) {
        this.f25256a = context;
    }

    /* renamed from: b */
    private static List<InterfaceC11187i> m11443b(List<InterfaceC11187i> list) {
        return new C11202p(list).m11390b();
    }

    @Override // p425j.p434c.p435a.AbstractC11178e.InterfaceC11179a
    /* renamed from: a */
    public AbstractC11178e.InterfaceC11179a mo11444a(InterfaceC11187i interfaceC11187i) {
        this.f25257b.add(interfaceC11187i);
        return this;
    }

    @Override // p425j.p434c.p435a.AbstractC11178e.InterfaceC11179a
    public AbstractC11178e build() {
        if (!this.f25257b.isEmpty()) {
            List<InterfaceC11187i> m11443b = m11443b(this.f25257b);
            C14440d.C14442b c14442b = new C14440d.C14442b();
            C11228c.C11229a m11323i = C11228c.m11323i(this.f25256a);
            C11182g.C11184b c11184b = new C11182g.C11184b();
            C11199n.C11200a c11200a = new C11199n.C11200a();
            C11191k.C11192a c11192a = new C11191k.C11192a();
            for (InterfaceC11187i interfaceC11187i : m11443b) {
                interfaceC11187i.mo11421d(c14442b);
                interfaceC11187i.mo11418g(m11323i);
                interfaceC11187i.mo11419f(c11184b);
                interfaceC11187i.mo11363j(c11200a);
                interfaceC11187i.mo11366a(c11192a);
            }
            C11182g m11430h = c11184b.m11430h(m11323i.m11287z(), c11192a.build());
            return new C11185h(this.f25258c, this.f25259d, c14442b.m1730f(), AbstractC11197m.m11412b(c11200a, m11430h), m11430h, Collections.unmodifiableList(m11443b), this.f25260e);
        }
        throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
    }
}
