package p201g.p227h.p238l;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import p201g.p227h.p237k.C7675h;
/* compiled from: ContentInfoCompat.java */
/* renamed from: g.h.l.c */
/* loaded from: classes2.dex */
public final class C7685c {

    /* renamed from: a */
    final ClipData f18406a;

    /* renamed from: b */
    final int f18407b;

    /* renamed from: c */
    final int f18408c;

    /* renamed from: d */
    final Uri f18409d;

    /* renamed from: e */
    final Bundle f18410e;

    /* compiled from: ContentInfoCompat.java */
    /* renamed from: g.h.l.c$a */
    /* loaded from: classes2.dex */
    public static final class C7686a {

        /* renamed from: a */
        ClipData f18411a;

        /* renamed from: b */
        int f18412b;

        /* renamed from: c */
        int f18413c;

        /* renamed from: d */
        Uri f18414d;

        /* renamed from: e */
        Bundle f18415e;

        public C7686a(ClipData clipData, int i) {
            this.f18411a = clipData;
            this.f18412b = i;
        }

        /* renamed from: a */
        public C7685c m17827a() {
            return new C7685c(this);
        }

        /* renamed from: b */
        public C7686a m17826b(Bundle bundle) {
            this.f18415e = bundle;
            return this;
        }

        /* renamed from: c */
        public C7686a m17825c(int i) {
            this.f18413c = i;
            return this;
        }

        /* renamed from: d */
        public C7686a m17824d(Uri uri) {
            this.f18414d = uri;
            return this;
        }
    }

    C7685c(C7686a c7686a) {
        ClipData clipData = c7686a.f18411a;
        C7675h.m17866f(clipData);
        this.f18406a = clipData;
        int i = c7686a.f18412b;
        C7675h.m17869c(i, 0, 3, TransactionField.TRANSACTION_CHANNEL);
        this.f18407b = i;
        int i2 = c7686a.f18413c;
        C7675h.m17867e(i2, 1);
        this.f18408c = i2;
        this.f18409d = c7686a.f18414d;
        this.f18410e = c7686a.f18415e;
    }

    /* renamed from: a */
    static String m17832a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    /* renamed from: e */
    static String m17828e(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? String.valueOf(i) : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP";
    }

    /* renamed from: b */
    public ClipData m17831b() {
        return this.f18406a;
    }

    /* renamed from: c */
    public int m17830c() {
        return this.f18408c;
    }

    /* renamed from: d */
    public int m17829d() {
        return this.f18407b;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("ContentInfoCompat{clip=");
        sb.append(this.f18406a.getDescription());
        sb.append(", source=");
        sb.append(m17828e(this.f18407b));
        sb.append(", flags=");
        sb.append(m17832a(this.f18408c));
        if (this.f18409d == null) {
            str = "";
        } else {
            str = ", hasLinkUri(" + this.f18409d.toString().length() + ")";
        }
        sb.append(str);
        sb.append(this.f18410e != null ? ", hasExtras" : "");
        sb.append("}");
        return sb.toString();
    }
}
