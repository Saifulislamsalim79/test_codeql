package p201g.p259r;

import androidx.recyclerview.widget.InterfaceC1738r;
import kotlin.e0.d.l;
import kotlin.p491i0.C11841h;
/* compiled from: NullPaddedListDiffHelper.kt */
/* renamed from: g.r.o */
/* loaded from: classes2.dex */
public final class C7986o {

    /* renamed from: a */
    public static final C7986o f19237a = new C7986o();

    private C7986o() {
    }

    /* renamed from: a */
    private final void m16941a(InterfaceC1738r interfaceC1738r, int i, int i2, int i3, int i4, Object obj) {
        int i5 = i - i3;
        if (i5 > 0) {
            interfaceC1738r.mo17095d(i3, i5, obj);
        }
        int i6 = i4 - i2;
        if (i6 > 0) {
            interfaceC1738r.mo17095d(i2, i6, obj);
        }
    }

    /* renamed from: b */
    public final <T> void m16940b(InterfaceC1738r interfaceC1738r, InterfaceC7885g0<T> interfaceC7885g0, InterfaceC7885g0<T> interfaceC7885g02) {
        int m10268d;
        int m10268d2;
        int m10268d3;
        int m10268d4;
        l.f(interfaceC1738r, "callback");
        l.f(interfaceC7885g0, "oldList");
        l.f(interfaceC7885g02, "newList");
        int max = Math.max(interfaceC7885g0.mo16938b(), interfaceC7885g02.mo16938b());
        int min = Math.min(interfaceC7885g0.mo16938b() + interfaceC7885g0.mo16939a(), interfaceC7885g02.mo16938b() + interfaceC7885g02.mo16939a());
        int i = min - max;
        if (i > 0) {
            interfaceC1738r.mo17097b(max, i);
            interfaceC1738r.mo17098a(max, i);
        }
        int min2 = Math.min(max, min);
        int max2 = Math.max(max, min);
        m10268d = C11841h.m10268d(interfaceC7885g0.mo16938b(), interfaceC7885g02.getSize());
        m10268d2 = C11841h.m10268d(interfaceC7885g0.mo16938b() + interfaceC7885g0.mo16939a(), interfaceC7885g02.getSize());
        m16941a(interfaceC1738r, min2, max2, m10268d, m10268d2, EnumC7976n.ITEM_TO_PLACEHOLDER);
        m10268d3 = C11841h.m10268d(interfaceC7885g02.mo16938b(), interfaceC7885g0.getSize());
        m10268d4 = C11841h.m10268d(interfaceC7885g02.mo16938b() + interfaceC7885g02.mo16939a(), interfaceC7885g0.getSize());
        m16941a(interfaceC1738r, min2, max2, m10268d3, m10268d4, EnumC7976n.PLACEHOLDER_TO_ITEM);
        int size = interfaceC7885g02.getSize() - interfaceC7885g0.getSize();
        if (size > 0) {
            interfaceC1738r.mo17098a(interfaceC7885g0.getSize(), size);
        } else if (size < 0) {
            interfaceC1738r.mo17097b(interfaceC7885g0.getSize() + size, -size);
        }
    }
}
