package p425j.p434c.p435a;

import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.List;
import p425j.p434c.p435a.AbstractC11178e;
import p577n.p578a.p582b.AbstractC14429r;
import p577n.p578a.p583c.C14440d;
/* compiled from: MarkwonImpl.java */
/* renamed from: j.c.a.h */
/* loaded from: classes3.dex */
class C11185h extends AbstractC11178e {

    /* renamed from: a */
    private final TextView.BufferType f25273a;

    /* renamed from: b */
    private final C14440d f25274b;

    /* renamed from: c */
    private final AbstractC11197m f25275c;

    /* renamed from: d */
    private final List<InterfaceC11187i> f25276d;

    /* renamed from: e */
    private final AbstractC11178e.InterfaceC11180b f25277e;

    /* renamed from: f */
    private final boolean f25278f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MarkwonImpl.java */
    /* renamed from: j.c.a.h$a */
    /* loaded from: classes3.dex */
    public class RunnableC11186a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ TextView f25279c;

        RunnableC11186a(TextView textView) {
            this.f25279c = textView;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (InterfaceC11187i interfaceC11187i : C11185h.this.f25276d) {
                interfaceC11187i.mo11365h(this.f25279c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C11185h(TextView.BufferType bufferType, AbstractC11178e.InterfaceC11180b interfaceC11180b, C14440d c14440d, AbstractC11197m abstractC11197m, C11182g c11182g, List<InterfaceC11187i> list, boolean z) {
        this.f25273a = bufferType;
        this.f25277e = interfaceC11180b;
        this.f25274b = c14440d;
        this.f25275c = abstractC11197m;
        this.f25276d = list;
        this.f25278f = z;
    }

    @Override // p425j.p434c.p435a.AbstractC11178e
    /* renamed from: c */
    public void mo11429c(TextView textView, String str) {
        m11425g(textView, m11424h(str));
    }

    /* renamed from: e */
    public AbstractC14429r m11427e(String str) {
        for (InterfaceC11187i interfaceC11187i : this.f25276d) {
            str = interfaceC11187i.mo11423b(str);
        }
        return this.f25274b.m1737b(str);
    }

    /* renamed from: f */
    public Spanned m11426f(AbstractC14429r abstractC14429r) {
        for (InterfaceC11187i interfaceC11187i : this.f25276d) {
            interfaceC11187i.mo11420e(abstractC14429r);
        }
        InterfaceC11193l mo11411a = this.f25275c.mo11411a();
        abstractC14429r.mo1763a(mo11411a);
        for (InterfaceC11187i interfaceC11187i2 : this.f25276d) {
            interfaceC11187i2.mo11417k(abstractC14429r, mo11411a);
        }
        return mo11411a.mo11404h().m11376l();
    }

    /* renamed from: g */
    public void m11425g(TextView textView, Spanned spanned) {
        for (InterfaceC11187i interfaceC11187i : this.f25276d) {
            interfaceC11187i.mo11364i(textView, spanned);
        }
        AbstractC11178e.InterfaceC11180b interfaceC11180b = this.f25277e;
        if (interfaceC11180b != null) {
            interfaceC11180b.m11445a(textView, spanned, this.f25273a, new RunnableC11186a(textView));
            return;
        }
        textView.setText(spanned, this.f25273a);
        for (InterfaceC11187i interfaceC11187i2 : this.f25276d) {
            interfaceC11187i2.mo11365h(textView);
        }
    }

    /* renamed from: h */
    public Spanned m11424h(String str) {
        Spanned m11426f = m11426f(m11427e(str));
        return (TextUtils.isEmpty(m11426f) && this.f25278f && !TextUtils.isEmpty(str)) ? new SpannableStringBuilder(str) : m11426f;
    }
}
