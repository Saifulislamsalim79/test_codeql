package kotlin.p549l0;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p491i0.C11841h;
import kotlin.p557z.C13724q;
/* compiled from: Regex.kt */
/* renamed from: kotlin.l0.h */
/* loaded from: classes3.dex */
public final class C13262h implements Serializable {

    /* renamed from: d */
    public static final C13263a f29428d = new C13263a(null);

    /* renamed from: c */
    private final Pattern f29429c;

    /* compiled from: Regex.kt */
    /* renamed from: kotlin.l0.h$a */
    /* loaded from: classes3.dex */
    public static final class C13263a {
        private C13263a() {
        }

        /* renamed from: a */
        public final String m5518a(String str) {
            l.f(str, "literal");
            String quote = Pattern.quote(str);
            l.e(quote, "Pattern.quote(literal)");
            return quote;
        }

        public /* synthetic */ C13263a(g gVar) {
            this();
        }
    }

    public C13262h(Pattern pattern) {
        l.f(pattern, "nativePattern");
        this.f29429c = pattern;
    }

    /* renamed from: c */
    public static /* synthetic */ InterfaceC13257f m5524c(C13262h c13262h, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return c13262h.m5525b(charSequence, i);
    }

    /* renamed from: a */
    public final boolean m5526a(CharSequence charSequence) {
        l.f(charSequence, MetricTracker.Object.INPUT);
        return this.f29429c.matcher(charSequence).find();
    }

    /* renamed from: b */
    public final InterfaceC13257f m5525b(CharSequence charSequence, int i) {
        InterfaceC13257f m5515c;
        l.f(charSequence, MetricTracker.Object.INPUT);
        Matcher matcher = this.f29429c.matcher(charSequence);
        l.e(matcher, "nativePattern.matcher(input)");
        m5515c = C13264i.m5515c(matcher, i, charSequence);
        return m5515c;
    }

    /* renamed from: d */
    public final InterfaceC13257f m5523d(CharSequence charSequence) {
        InterfaceC13257f m5514d;
        l.f(charSequence, MetricTracker.Object.INPUT);
        Matcher matcher = this.f29429c.matcher(charSequence);
        l.e(matcher, "nativePattern.matcher(input)");
        m5514d = C13264i.m5514d(matcher, charSequence);
        return m5514d;
    }

    /* renamed from: e */
    public final boolean m5522e(CharSequence charSequence) {
        l.f(charSequence, MetricTracker.Object.INPUT);
        return this.f29429c.matcher(charSequence).matches();
    }

    /* renamed from: f */
    public final String m5521f(CharSequence charSequence, String str) {
        l.f(charSequence, MetricTracker.Object.INPUT);
        l.f(str, "replacement");
        String replaceAll = this.f29429c.matcher(charSequence).replaceAll(str);
        l.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    /* renamed from: g */
    public final String m5520g(CharSequence charSequence, String str) {
        l.f(charSequence, MetricTracker.Object.INPUT);
        l.f(str, "replacement");
        String replaceFirst = this.f29429c.matcher(charSequence).replaceFirst(str);
        l.e(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    /* renamed from: h */
    public final List<String> m5519h(CharSequence charSequence, int i) {
        List<String> m3901b;
        l.f(charSequence, MetricTracker.Object.INPUT);
        C13277t.m5388m0(i);
        Matcher matcher = this.f29429c.matcher(charSequence);
        if (i != 1 && matcher.find()) {
            ArrayList arrayList = new ArrayList(i > 0 ? C11841h.m10268d(i, 10) : 10);
            int i2 = 0;
            int i3 = i - 1;
            do {
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                if (i3 >= 0 && arrayList.size() == i3) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        m3901b = C13724q.m3901b(charSequence.toString());
        return m3901b;
    }

    public String toString() {
        String pattern = this.f29429c.toString();
        l.e(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C13262h(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.e0.d.l.f(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "Pattern.compile(pattern)"
            kotlin.e0.d.l.e(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p549l0.C13262h.<init>(java.lang.String):void");
    }
}
