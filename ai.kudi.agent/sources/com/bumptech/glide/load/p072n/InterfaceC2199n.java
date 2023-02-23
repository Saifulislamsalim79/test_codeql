package com.bumptech.glide.load.p072n;

import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.InterfaceC2118f;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.p086q.C2380j;
import java.util.Collections;
import java.util.List;
/* compiled from: ModelLoader.java */
/* renamed from: com.bumptech.glide.load.n.n */
/* loaded from: classes2.dex */
public interface InterfaceC2199n<Model, Data> {

    /* compiled from: ModelLoader.java */
    /* renamed from: com.bumptech.glide.load.n.n$a */
    /* loaded from: classes2.dex */
    public static class C2200a<Data> {

        /* renamed from: a */
        public final InterfaceC2118f f6511a;

        /* renamed from: b */
        public final List<InterfaceC2118f> f6512b;

        /* renamed from: c */
        public final InterfaceC2130d<Data> f6513c;

        public C2200a(InterfaceC2118f interfaceC2118f, InterfaceC2130d<Data> interfaceC2130d) {
            this(interfaceC2118f, Collections.emptyList(), interfaceC2130d);
        }

        public C2200a(InterfaceC2118f interfaceC2118f, List<InterfaceC2118f> list, InterfaceC2130d<Data> interfaceC2130d) {
            C2380j.m33129d(interfaceC2118f);
            this.f6511a = interfaceC2118f;
            C2380j.m33129d(list);
            this.f6512b = list;
            C2380j.m33129d(interfaceC2130d);
            this.f6513c = interfaceC2130d;
        }
    }

    /* renamed from: a */
    boolean mo33500a(Model model);

    /* renamed from: b */
    C2200a<Data> mo33499b(Model model, int i, int i2, C2122h c2122h);
}
