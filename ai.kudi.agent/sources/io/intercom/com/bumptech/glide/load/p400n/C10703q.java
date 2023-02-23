package io.intercom.com.bumptech.glide.load.p400n;

import io.intercom.com.bumptech.glide.EnumC10482g;
import io.intercom.com.bumptech.glide.load.C10626i;
import io.intercom.com.bumptech.glide.load.EnumC10507a;
import io.intercom.com.bumptech.glide.load.InterfaceC10622g;
import io.intercom.com.bumptech.glide.load.engine.GlideException;
import io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b;
import io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n;
import io.intercom.com.bumptech.glide.p416r.C10892h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p201g.p227h.p237k.InterfaceC7672e;
/* compiled from: MultiModelLoader.java */
/* renamed from: io.intercom.com.bumptech.glide.load.n.q */
/* loaded from: classes3.dex */
class C10703q<Model, Data> implements InterfaceC10697n<Model, Data> {

    /* renamed from: a */
    private final List<InterfaceC10697n<Model, Data>> f24512a;

    /* renamed from: b */
    private final InterfaceC7672e<List<Throwable>> f24513b;

    /* compiled from: MultiModelLoader.java */
    /* renamed from: io.intercom.com.bumptech.glide.load.n.q$a */
    /* loaded from: classes3.dex */
    static class C10704a<Data> implements InterfaceC10631b<Data>, InterfaceC10631b.InterfaceC10632a<Data> {

        /* renamed from: c */
        private final List<InterfaceC10631b<Data>> f24514c;

        /* renamed from: d */
        private final InterfaceC7672e<List<Throwable>> f24515d;

        /* renamed from: e */
        private int f24516e;

        /* renamed from: f */
        private EnumC10482g f24517f;

        /* renamed from: w */
        private InterfaceC10631b.InterfaceC10632a<? super Data> f24518w;

        /* renamed from: x */
        private List<Throwable> f24519x;

        C10704a(List<InterfaceC10631b<Data>> list, InterfaceC7672e<List<Throwable>> interfaceC7672e) {
            this.f24515d = interfaceC7672e;
            C10892h.m12015c(list);
            this.f24514c = list;
            this.f24516e = 0;
        }

        /* renamed from: f */
        private void m12495f() {
            if (this.f24516e < this.f24514c.size() - 1) {
                this.f24516e++;
                mo12472e(this.f24517f, this.f24518w);
                return;
            }
            C10892h.m12014d(this.f24519x);
            this.f24518w.mo12497c(new GlideException("Fetch failed", new ArrayList(this.f24519x)));
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: a */
        public Class<Data> mo12474a() {
            return this.f24514c.get(0).mo12474a();
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: b */
        public void mo12473b() {
            List<Throwable> list = this.f24519x;
            if (list != null) {
                this.f24515d.mo11983a(list);
            }
            this.f24519x = null;
            for (InterfaceC10631b<Data> interfaceC10631b : this.f24514c) {
                interfaceC10631b.mo12473b();
            }
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b.InterfaceC10632a
        /* renamed from: c */
        public void mo12497c(Exception exc) {
            List<Throwable> list = this.f24519x;
            C10892h.m12014d(list);
            list.add(exc);
            m12495f();
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public void cancel() {
            for (InterfaceC10631b<Data> interfaceC10631b : this.f24514c) {
                interfaceC10631b.cancel();
            }
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b.InterfaceC10632a
        /* renamed from: d */
        public void mo12496d(Data data) {
            if (data != null) {
                this.f24518w.mo12496d(data);
            } else {
                m12495f();
            }
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        /* renamed from: e */
        public void mo12472e(EnumC10482g enumC10482g, InterfaceC10631b.InterfaceC10632a<? super Data> interfaceC10632a) {
            this.f24517f = enumC10482g;
            this.f24518w = interfaceC10632a;
            this.f24519x = this.f24515d.mo11982b();
            this.f24514c.get(this.f24516e).mo12472e(enumC10482g, this);
        }

        @Override // io.intercom.com.bumptech.glide.load.p398m.InterfaceC10631b
        public EnumC10507a getDataSource() {
            return this.f24514c.get(0).getDataSource();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10703q(List<InterfaceC10697n<Model, Data>> list, InterfaceC7672e<List<Throwable>> interfaceC7672e) {
        this.f24512a = list;
        this.f24513b = interfaceC7672e;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: a */
    public boolean mo12457a(Model model) {
        for (InterfaceC10697n<Model, Data> interfaceC10697n : this.f24512a) {
            if (interfaceC10697n.mo12457a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // io.intercom.com.bumptech.glide.load.p400n.InterfaceC10697n
    /* renamed from: b */
    public InterfaceC10697n.C10698a<Data> mo12456b(Model model, int i, int i2, C10626i c10626i) {
        InterfaceC10697n.C10698a<Data> mo12456b;
        int size = this.f24512a.size();
        ArrayList arrayList = new ArrayList(size);
        InterfaceC10622g interfaceC10622g = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC10697n<Model, Data> interfaceC10697n = this.f24512a.get(i3);
            if (interfaceC10697n.mo12457a(model) && (mo12456b = interfaceC10697n.mo12456b(model, i, i2, c10626i)) != null) {
                interfaceC10622g = mo12456b.f24505a;
                arrayList.add(mo12456b.f24507c);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new InterfaceC10697n.C10698a<>(interfaceC10622g, new C10704a(arrayList, this.f24513b));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiModelLoader{modelLoaders=");
        List<InterfaceC10697n<Model, Data>> list = this.f24512a;
        sb.append(Arrays.toString(list.toArray(new InterfaceC10697n[list.size()])));
        sb.append('}');
        return sb.toString();
    }
}
