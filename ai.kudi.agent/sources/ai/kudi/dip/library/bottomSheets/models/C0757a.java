package ai.kudi.dip.library.bottomSheets.models;

import java.util.List;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
import kotlin.p557z.C13726r;
/* compiled from: FilterBottomSheetParams.kt */
/* renamed from: ai.kudi.dip.library.bottomSheets.models.a */
/* loaded from: classes2.dex */
public class C0757a {

    /* renamed from: a */
    private List<String> f2124a;

    /* renamed from: b */
    private String f2125b;

    /* renamed from: c */
    private InterfaceC11756a<C13666w> f2126c;

    /* renamed from: d */
    private InterfaceC11771p<? super String, ? super Integer, C13666w> f2127d;

    /* compiled from: FilterBottomSheetParams.kt */
    /* renamed from: ai.kudi.dip.library.bottomSheets.models.a$a */
    /* loaded from: classes2.dex */
    static final class C0758a extends AbstractC11802m implements InterfaceC11756a<C13666w> {

        /* renamed from: c */
        public static final C0758a f2128c = new C0758a();

        C0758a() {
            super(0);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11756a
        public /* bridge */ /* synthetic */ C13666w invoke() {
            invoke2();
            return C13666w.f30112a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    /* compiled from: FilterBottomSheetParams.kt */
    /* renamed from: ai.kudi.dip.library.bottomSheets.models.a$b */
    /* loaded from: classes2.dex */
    static final class C0759b extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {

        /* renamed from: c */
        public static final C0759b f2129c = new C0759b();

        C0759b() {
            super(2);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(String str, Integer num) {
            invoke(str, num.intValue());
            return C13666w.f30112a;
        }

        public final void invoke(String str, int i) {
            l.f(str, "$noName_0");
        }
    }

    public C0757a() {
        List<String> m3891e;
        m3891e = C13726r.m3891e();
        this.f2124a = m3891e;
        this.f2125b = "";
        this.f2126c = C0758a.f2128c;
        this.f2127d = C0759b.f2129c;
    }

    /* renamed from: a */
    public final List<String> m38053a() {
        return this.f2124a;
    }

    /* renamed from: b */
    public final String m38052b() {
        return this.f2125b;
    }

    /* renamed from: c */
    public final InterfaceC11756a<C13666w> m38051c() {
        return this.f2126c;
    }

    /* renamed from: d */
    public final InterfaceC11771p<String, Integer, C13666w> m38050d() {
        return this.f2127d;
    }

    /* renamed from: e */
    public final void m38049e(List<String> list) {
        l.f(list, "<set-?>");
        this.f2124a = list;
    }

    /* renamed from: f */
    public final void m38048f(String str) {
        this.f2125b = str;
    }

    /* renamed from: g */
    public final void m38047g(InterfaceC11756a<C13666w> interfaceC11756a) {
        l.f(interfaceC11756a, "<set-?>");
        this.f2126c = interfaceC11756a;
    }

    /* renamed from: h */
    public final void m38046h(InterfaceC11771p<? super String, ? super Integer, C13666w> interfaceC11771p) {
        l.f(interfaceC11771p, "<set-?>");
        this.f2127d = interfaceC11771p;
    }
}
