package io.intercom.com.bumptech.glide.load.p400n;

import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.util.Collections;
import java.util.List;
/* compiled from: ModelLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.n */
/* loaded from: classes3.dex */
public interface InterfaceC10697n<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.n$a */
    /* loaded from: classes3.dex */
    public static class C10698a<Data> {

        /* renamed from: a */
        public final InterfaceC10622g f24505a;

        /* renamed from: b */
        public final List<InterfaceC10622g> f24506b;

        /* renamed from: c */
        public final InterfaceC10631b<Data> f24507c;

        public C10698a(InterfaceC10622g interfaceC10622g, InterfaceC10631b<Data> interfaceC10631b) {
            this(interfaceC10622g, Collections.emptyList(), interfaceC10631b);
        }

        public C10698a(InterfaceC10622g interfaceC10622g, List<InterfaceC10622g> list, InterfaceC10631b<Data> interfaceC10631b) {
            C10892h.m12014d(interfaceC10622g);
            this.f24505a = interfaceC10622g;
            C10892h.m12014d(list);
            this.f24506b = list;
            C10892h.m12014d(interfaceC10631b);
            this.f24507c = interfaceC10631b;
        }
    }

    /* renamed from: a */
    boolean mo12457a(Model model);

    /* renamed from: b */
    C10698a<Data> mo12456b(Model model, int i, int i2, C10626i c10626i);
}
