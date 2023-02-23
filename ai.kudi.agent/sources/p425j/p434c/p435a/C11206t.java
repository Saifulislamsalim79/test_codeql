package p425j.p434c.p435a;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
/* compiled from: SpannableBuilder.java */
/* renamed from: j.c.a.t */
/* loaded from: classes3.dex */
public class C11206t implements Appendable, CharSequence {

    /* renamed from: c */
    private final StringBuilder f25297c;

    /* renamed from: d */
    private final Deque<C11207a> f25298d;

    /* compiled from: SpannableBuilder.java */
    /* renamed from: j.c.a.t$a */
    /* loaded from: classes3.dex */
    public static class C11207a {

        /* renamed from: a */
        public final Object f25299a;

        /* renamed from: b */
        public int f25300b;

        /* renamed from: c */
        public int f25301c;

        /* renamed from: d */
        public final int f25302d;

        C11207a(Object obj, int i, int i2, int i3) {
            this.f25299a = obj;
            this.f25300b = i;
            this.f25301c = i2;
            this.f25302d = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SpannableBuilder.java */
    /* renamed from: j.c.a.t$b */
    /* loaded from: classes3.dex */
    public static class C11208b extends SpannableStringBuilder {
        C11208b(CharSequence charSequence) {
            super(charSequence);
        }
    }

    public C11206t() {
        this("");
    }

    /* renamed from: e */
    private void m11383e(int i, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            boolean z = spanned instanceof C11208b;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            int length = spans != null ? spans.length : 0;
            if (length > 0) {
                if (!z) {
                    for (int i2 = 0; i2 < length; i2++) {
                        Object obj = spans[i2];
                        m11379i(obj, spanned.getSpanStart(obj) + i, spanned.getSpanEnd(obj) + i, spanned.getSpanFlags(obj));
                    }
                    return;
                }
                for (int i3 = length - 1; i3 >= 0; i3--) {
                    Object obj2 = spans[i3];
                    m11379i(obj2, spanned.getSpanStart(obj2) + i, spanned.getSpanEnd(obj2) + i, spanned.getSpanFlags(obj2));
                }
            }
        }
    }

    /* renamed from: g */
    static boolean m11381g(int i, int i2, int i3) {
        return i3 > i2 && i2 >= 0 && i3 <= i;
    }

    /* renamed from: j */
    public static void m11378j(C11206t c11206t, Object obj, int i, int i2) {
        if (obj == null || !m11381g(c11206t.length(), i, i2)) {
            return;
        }
        m11377k(c11206t, obj, i, i2);
    }

    /* renamed from: k */
    private static void m11377k(C11206t c11206t, Object obj, int i, int i2) {
        if (obj != null) {
            if (obj.getClass().isArray()) {
                for (Object obj2 : (Object[]) obj) {
                    m11377k(c11206t, obj2, i, i2);
                }
                return;
            }
            c11206t.m11379i(obj, i, i2, 33);
        }
    }

    /* renamed from: a */
    public C11206t m11387a(char c) {
        this.f25297c.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(char c) throws IOException {
        m11387a(c);
        return this;
    }

    /* renamed from: b */
    public C11206t m11386b(CharSequence charSequence) {
        m11383e(length(), charSequence);
        this.f25297c.append(charSequence);
        return this;
    }

    /* renamed from: c */
    public C11206t m11385c(CharSequence charSequence, int i, int i2) {
        CharSequence subSequence = charSequence.subSequence(i, i2);
        m11383e(length(), subSequence);
        this.f25297c.append(subSequence);
        return this;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.f25297c.charAt(i);
    }

    /* renamed from: d */
    public C11206t m11384d(String str) {
        this.f25297c.append(str);
        return this;
    }

    /* renamed from: f */
    public List<C11207a> m11382f(int i, int i2) {
        int i3;
        int length = length();
        if (m11381g(length, i, i2)) {
            if (i == 0 && length == i2) {
                ArrayList arrayList = new ArrayList(this.f25298d);
                Collections.reverse(arrayList);
                return Collections.unmodifiableList(arrayList);
            }
            ArrayList arrayList2 = new ArrayList(0);
            Iterator<C11207a> descendingIterator = this.f25298d.descendingIterator();
            while (descendingIterator.hasNext()) {
                C11207a next = descendingIterator.next();
                int i4 = next.f25300b;
                if ((i4 >= i && i4 < i2) || (((i3 = next.f25301c) <= i2 && i3 > i) || (next.f25300b < i && next.f25301c > i2))) {
                    arrayList2.add(next);
                }
            }
            return Collections.unmodifiableList(arrayList2);
        }
        return Collections.emptyList();
    }

    /* renamed from: h */
    public char m11380h() {
        return this.f25297c.charAt(length() - 1);
    }

    /* renamed from: i */
    public C11206t m11379i(Object obj, int i, int i2, int i3) {
        this.f25298d.push(new C11207a(obj, i, i2, i3));
        return this;
    }

    /* renamed from: l */
    public SpannableStringBuilder m11376l() {
        C11208b c11208b = new C11208b(this.f25297c);
        for (C11207a c11207a : this.f25298d) {
            c11208b.setSpan(c11207a.f25299a, c11207a.f25300b, c11207a.f25301c, c11207a.f25302d);
        }
        return c11208b;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f25297c.length();
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        List<C11207a> m11382f = m11382f(i, i2);
        if (m11382f.isEmpty()) {
            return this.f25297c.subSequence(i, i2);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f25297c.subSequence(i, i2));
        int length = spannableStringBuilder.length();
        for (C11207a c11207a : m11382f) {
            int max = Math.max(0, c11207a.f25300b - i);
            spannableStringBuilder.setSpan(c11207a.f25299a, max, Math.min(length, (c11207a.f25301c - c11207a.f25300b) + max), c11207a.f25302d);
        }
        return spannableStringBuilder;
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f25297c.toString();
    }

    public C11206t(CharSequence charSequence) {
        this.f25298d = new ArrayDeque(8);
        this.f25297c = new StringBuilder(charSequence);
        m11383e(0, charSequence);
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) throws IOException {
        m11386b(charSequence);
        return this;
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        m11385c(charSequence, i, i2);
        return this;
    }
}
