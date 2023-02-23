package p425j.p434c.p435a;

import p425j.p434c.p435a.InterfaceC11193l;
/* compiled from: MarkwonVisitorFactory.java */
/* renamed from: j.c.a.m */
/* loaded from: classes3.dex */
abstract class AbstractC11197m {

    /* compiled from: MarkwonVisitorFactory.java */
    /* renamed from: j.c.a.m$a */
    /* loaded from: classes3.dex */
    class C11198a extends AbstractC11197m {

        /* renamed from: a */
        final /* synthetic */ InterfaceC11193l.InterfaceC11195b f25283a;

        /* renamed from: b */
        final /* synthetic */ C11182g f25284b;

        C11198a(InterfaceC11193l.InterfaceC11195b interfaceC11195b, C11182g c11182g) {
            this.f25283a = interfaceC11195b;
            this.f25284b = c11182g;
        }

        @Override // p425j.p434c.p435a.AbstractC11197m
        /* renamed from: a */
        InterfaceC11193l mo11411a() {
            return this.f25283a.mo11397a(this.f25284b, new C11204r());
        }
    }

    AbstractC11197m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static AbstractC11197m m11412b(InterfaceC11193l.InterfaceC11195b interfaceC11195b, C11182g c11182g) {
        return new C11198a(interfaceC11195b, c11182g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract InterfaceC11193l mo11411a();
}
