package kotlin.p549l0;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.e0.d.l;
import kotlin.p549l0.InterfaceC13257f;
import kotlin.p557z.AbstractC13689d;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Regex.kt */
/* renamed from: kotlin.l0.g */
/* loaded from: classes3.dex */
public final class C13260g implements InterfaceC13257f {

    /* renamed from: a */
    private List<String> f29425a;

    /* renamed from: b */
    private final Matcher f29426b;

    /* compiled from: Regex.kt */
    /* renamed from: kotlin.l0.g$a */
    /* loaded from: classes3.dex */
    public static final class C13261a extends AbstractC13689d<String> {
        C13261a() {
        }

        @Override // kotlin.p557z.AbstractC13669a, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return m5530h((String) obj);
            }
            return false;
        }

        @Override // kotlin.p557z.AbstractC13669a
        /* renamed from: e */
        public int mo4055e() {
            return C13260g.this.m5531d().groupCount() + 1;
        }

        /* renamed from: h */
        public /* bridge */ boolean m5530h(String str) {
            return super.contains(str);
        }

        @Override // kotlin.p557z.AbstractC13689d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return m5528l((String) obj);
            }
            return -1;
        }

        @Override // kotlin.p557z.AbstractC13689d, java.util.List
        /* renamed from: k */
        public String get(int i) {
            String group = C13260g.this.m5531d().group(i);
            return group != null ? group : "";
        }

        /* renamed from: l */
        public /* bridge */ int m5528l(String str) {
            return super.indexOf(str);
        }

        @Override // kotlin.p557z.AbstractC13689d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return m5527m((String) obj);
            }
            return -1;
        }

        /* renamed from: m */
        public /* bridge */ int m5527m(String str) {
            return super.lastIndexOf(str);
        }
    }

    public C13260g(Matcher matcher, CharSequence charSequence) {
        l.f(matcher, "matcher");
        l.f(charSequence, MetricTracker.Object.INPUT);
        this.f29426b = matcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final MatchResult m5531d() {
        return this.f29426b;
    }

    @Override // kotlin.p549l0.InterfaceC13257f
    /* renamed from: a */
    public InterfaceC13257f.C13259b mo5534a() {
        return InterfaceC13257f.C13258a.m5536a(this);
    }

    @Override // kotlin.p549l0.InterfaceC13257f
    /* renamed from: b */
    public List<String> mo5533b() {
        if (this.f29425a == null) {
            this.f29425a = new C13261a();
        }
        List<String> list = this.f29425a;
        l.d(list);
        return list;
    }
}
