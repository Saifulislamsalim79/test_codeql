package p201g.p254o.p255a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.C1556g0;
import androidx.lifecycle.C1566i0;
import androidx.lifecycle.C1583u;
import androidx.lifecycle.InterfaceC1584v;
import androidx.lifecycle.d0;
import androidx.lifecycle.o;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p201g.p218e.C7535h;
import p201g.p227h.p237k.C7669b;
import p201g.p254o.p256b.C7815a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LoaderManagerImpl.java */
/* renamed from: g.o.a.b */
/* loaded from: classes2.dex */
public class C7810b extends AbstractC7809a {

    /* renamed from: c */
    static boolean f18656c = false;

    /* renamed from: a */
    private final o f18657a;

    /* renamed from: b */
    private final C7813c f18658b;

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: g.o.a.b$a */
    /* loaded from: classes2.dex */
    public static class C7811a<D> extends C1583u<D> {

        /* renamed from: a */
        private final int f18659a;

        /* renamed from: b */
        private final Bundle f18660b;

        /* renamed from: c */
        private final C7815a<D> f18661c;

        /* renamed from: d */
        private o f18662d;

        /* renamed from: e */
        private C7812b<D> f18663e;

        /* renamed from: f */
        private C7815a<D> f18664f;

        /* renamed from: a */
        C7815a<D> m17251a(boolean z) {
            if (C7810b.f18656c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f18661c.m17245a();
            throw null;
        }

        /* renamed from: b */
        public void m17250b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f18659a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f18660b);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f18661c);
            C7815a<D> c7815a = this.f18661c;
            c7815a.m17244b(str + "  ", fileDescriptor, printWriter, strArr);
            throw null;
        }

        /* renamed from: c */
        void m17249c() {
            o oVar = this.f18662d;
            C7812b<D> c7812b = this.f18663e;
            if (oVar == null || c7812b == null) {
                return;
            }
            super.removeObserver(c7812b);
            observe(oVar, c7812b);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onActive() {
            if (C7810b.f18656c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f18661c.m17242d();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            if (C7810b.f18656c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f18661c.m17241e();
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void removeObserver(InterfaceC1584v<? super D> interfaceC1584v) {
            super.removeObserver(interfaceC1584v);
            this.f18662d = null;
            this.f18663e = null;
        }

        @Override // androidx.lifecycle.C1583u, androidx.lifecycle.LiveData
        public void setValue(D d) {
            super.setValue(d);
            C7815a<D> c7815a = this.f18664f;
            if (c7815a == null) {
                return;
            }
            c7815a.m17243c();
            throw null;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f18659a);
            sb.append(" : ");
            C7669b.m17876a(this.f18661c, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: g.o.a.b$b */
    /* loaded from: classes2.dex */
    public static class C7812b<D> implements InterfaceC1584v<D> {
    }

    /* compiled from: LoaderManagerImpl.java */
    /* renamed from: g.o.a.b$c */
    /* loaded from: classes2.dex */
    static class C7813c extends d0 {

        /* renamed from: b */
        private static final C1556g0.InterfaceC1559b f18665b = new C7814a();

        /* renamed from: a */
        private C7535h<C7811a> f18666a = new C7535h<>();

        /* compiled from: LoaderManagerImpl.java */
        /* renamed from: g.o.a.b$c$a */
        /* loaded from: classes2.dex */
        static class C7814a implements C1556g0.InterfaceC1559b {
            C7814a() {
            }

            @Override // androidx.lifecycle.C1556g0.InterfaceC1559b
            public <T extends d0> T create(Class<T> cls) {
                return new C7813c();
            }
        }

        C7813c() {
        }

        /* renamed from: b */
        static C7813c m17247b(C1566i0 c1566i0) {
            return (C7813c) new C1556g0(c1566i0, f18665b).m35533a(C7813c.class);
        }

        /* renamed from: a */
        public void m17248a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f18666a.m18438j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                if (this.f18666a.m18438j() <= 0) {
                    return;
                }
                C7811a m18437k = this.f18666a.m18437k(0);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f18666a.m18440h(0));
                printWriter.print(": ");
                printWriter.println(m18437k.toString());
                m18437k.m17250b(str2, fileDescriptor, printWriter, strArr);
                throw null;
            }
        }

        /* renamed from: c */
        void m17246c() {
            int m18438j = this.f18666a.m18438j();
            for (int i = 0; i < m18438j; i++) {
                this.f18666a.m18437k(i).m17249c();
            }
        }

        protected void onCleared() {
            super.onCleared();
            if (this.f18666a.m18438j() <= 0) {
                this.f18666a.m18446b();
            } else {
                this.f18666a.m18437k(0).m17251a(true);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7810b(o oVar, C1566i0 c1566i0) {
        this.f18657a = oVar;
        this.f18658b = C7813c.m17247b(c1566i0);
    }

    @Override // p201g.p254o.p255a.AbstractC7809a
    @Deprecated
    /* renamed from: a */
    public void mo17253a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f18658b.m17248a(str, fileDescriptor, printWriter, strArr);
    }

    @Override // p201g.p254o.p255a.AbstractC7809a
    /* renamed from: c */
    public void mo17252c() {
        this.f18658b.m17246c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C7669b.m17876a(this.f18657a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
