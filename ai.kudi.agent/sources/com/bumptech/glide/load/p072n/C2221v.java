package com.bumptech.glide.load.p072n;

import com.bumptech.glide.EnumC1949f;
import com.bumptech.glide.load.C2122h;
import com.bumptech.glide.load.EnumC1993a;
import com.bumptech.glide.load.p070m.InterfaceC2130d;
import com.bumptech.glide.load.p072n.InterfaceC2199n;
import com.bumptech.glide.p085p.C2366b;
/* compiled from: UnitModelLoader.java */
/* renamed from: com.bumptech.glide.load.n.v */
/* loaded from: classes2.dex */
public class C2221v<Model> implements InterfaceC2199n<Model, Model> {

    /* renamed from: a */
    private static final C2221v<?> f6544a = new C2221v<>();

    /* compiled from: UnitModelLoader.java */
    /* renamed from: com.bumptech.glide.load.n.v$a */
    /* loaded from: classes2.dex */
    public static class C2222a<Model> implements InterfaceC2201o<Model, Model> {

        /* renamed from: a */
        private static final C2222a<?> f6545a = new C2222a<>();

        /* renamed from: a */
        public static <T> C2222a<T> m33524a() {
            return (C2222a<T>) f6545a;
        }

        @Override // com.bumptech.glide.load.p072n.InterfaceC2201o
        /* renamed from: b */
        public InterfaceC2199n<Model, Model> mo33496b(C2207r c2207r) {
            return C2221v.m33525c();
        }
    }

    /* compiled from: UnitModelLoader.java */
    /* renamed from: com.bumptech.glide.load.n.v$b */
    /* loaded from: classes2.dex */
    private static class C2223b<Model> implements InterfaceC2130d<Model> {

        /* renamed from: c */
        private final Model f6546c;

        C2223b(Model model) {
            this.f6546c = model;
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: a */
        public Class<Model> mo33507a() {
            return (Class<Model>) this.f6546c.getClass();
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: b */
        public void mo33506b() {
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        /* renamed from: e */
        public void mo33503e(EnumC1949f enumC1949f, InterfaceC2130d.InterfaceC2131a<? super Model> interfaceC2131a) {
            interfaceC2131a.mo33545d((Model) this.f6546c);
        }

        @Override // com.bumptech.glide.load.p070m.InterfaceC2130d
        public EnumC1993a getDataSource() {
            return EnumC1993a.LOCAL;
        }
    }

    /* renamed from: c */
    public static <T> C2221v<T> m33525c() {
        return (C2221v<T>) f6544a;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: a */
    public boolean mo33500a(Model model) {
        return true;
    }

    @Override // com.bumptech.glide.load.p072n.InterfaceC2199n
    /* renamed from: b */
    public InterfaceC2199n.C2200a<Model> mo33499b(Model model, int i, int i2, C2122h c2122h) {
        return new InterfaceC2199n.C2200a<>(new C2366b(model), new C2223b(model));
    }
}
