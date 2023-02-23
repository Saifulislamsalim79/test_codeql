package io.intercom.com.bumptech.glide.load.p400n;

import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.p415q.C10882b;
/* compiled from: UnitModelLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.v */
/* loaded from: classes3.dex */
public class C10717v<Model> implements InterfaceC10697n<Model, Model> {

    /* renamed from: a */
    private static final C10717v<?> f24536a = new C10717v<>();

    /* compiled from: UnitModelLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.v$a */
    /* loaded from: classes3.dex */
    public static class C10718a<Model> implements InterfaceC10699o<Model, Model> {

        /* renamed from: a */
        private static final C10718a<?> f24537a = new C10718a<>();

        /* renamed from: a */
        public static <T> C10718a<T> m12475a() {
            return (C10718a<T>) f24537a;
        }

        @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10699o
        /* renamed from: b */
        public InterfaceC10697n<Model, Model> mo12453b(C10705r c10705r) {
            return C10717v.m12476c();
        }
    }

    /* compiled from: UnitModelLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.v$b */
    /* loaded from: classes3.dex */
    private static class C10719b<Model> implements InterfaceC10631b<Model> {

        /* renamed from: c */
        private final Model f24538c;

        C10719b(Model model) {
            this.f24538c = model;
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: a */
        public Class<Model> mo12474a() {
            return (Class<Model>) this.f24538c.getClass();
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: b */
        public void mo12473b() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public void cancel() {
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: e */
        public void mo12472e(EnumC10482g enumC10482g, InterfaceC10631b.InterfaceC10632a<? super Model> interfaceC10632a) {
            interfaceC10632a.mo12496d((Model) this.f24538c);
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public EnumC10507a getDataSource() {
            return EnumC10507a.LOCAL;
        }
    }

    /* renamed from: c */
    public static <T> C10717v<T> m12476c() {
        return (C10717v<T>) f24536a;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: a */
    public boolean mo12457a(Model model) {
        return true;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: b */
    public InterfaceC10697n.C10698a<Model> mo12456b(Model model, int i, int i2, C10626i c10626i) {
        return new InterfaceC10697n.C10698a<>(new C10882b(model), new C10719b(model));
    }
}
