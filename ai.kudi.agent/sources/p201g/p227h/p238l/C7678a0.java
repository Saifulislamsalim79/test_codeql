package p201g.p227h.p238l;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.e0.d.l;
import kotlin.p548k0.InterfaceC13230h;
/* compiled from: ViewGroup.kt */
/* renamed from: g.h.l.a0 */
/* loaded from: classes2.dex */
public final class C7678a0 {

    /* compiled from: ViewGroup.kt */
    /* renamed from: g.h.l.a0$a */
    /* loaded from: classes2.dex */
    public static final class C7679a implements InterfaceC13230h<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f18402a;

        C7679a(ViewGroup viewGroup) {
            this.f18402a = viewGroup;
        }

        @Override // kotlin.p548k0.InterfaceC13230h
        public Iterator<View> iterator() {
            return C7678a0.m17852c(this.f18402a);
        }
    }

    /* compiled from: ViewGroup.kt */
    /* renamed from: g.h.l.a0$b */
    /* loaded from: classes2.dex */
    public static final class C7680b implements Iterator<View>, Object {

        /* renamed from: c */
        private int f18403c;

        /* renamed from: d */
        final /* synthetic */ ViewGroup f18404d;

        C7680b(ViewGroup viewGroup) {
            this.f18404d = viewGroup;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.f18404d;
            int i = this.f18403c;
            this.f18403c = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18403c < this.f18404d.getChildCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f18404d;
            int i = this.f18403c - 1;
            this.f18403c = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: a */
    public static final View m17854a(ViewGroup viewGroup, int i) {
        l.f(viewGroup, "<this>");
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + viewGroup.getChildCount());
    }

    /* renamed from: b */
    public static final InterfaceC13230h<View> m17853b(ViewGroup viewGroup) {
        l.f(viewGroup, "<this>");
        return new C7679a(viewGroup);
    }

    /* renamed from: c */
    public static final Iterator<View> m17852c(ViewGroup viewGroup) {
        l.f(viewGroup, "<this>");
        return new C7680b(viewGroup);
    }
}
