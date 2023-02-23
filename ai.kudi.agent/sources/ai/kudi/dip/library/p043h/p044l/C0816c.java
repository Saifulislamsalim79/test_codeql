package ai.kudi.dip.library.p043h.p044l;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.C0755a;
import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import ai.kudi.dip.library.p043h.p044l.C0816c;
import ai.kudi.dip.library.p046j.C0828a;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p557z.C13726r;
/* compiled from: FilterBottomSheetAdapter.kt */
/* renamed from: ai.kudi.dip.library.h.l.c */
/* loaded from: classes2.dex */
public final class C0816c extends RecyclerView.AbstractC1623h<AbstractC0818b> {

    /* renamed from: a */
    private final Context f2298a;

    /* renamed from: b */
    private String f2299b;

    /* renamed from: c */
    private List<String> f2300c;

    /* renamed from: d */
    private InterfaceC11771p<? super String, ? super Integer, C13666w> f2301d;

    /* compiled from: FilterBottomSheetAdapter.kt */
    /* renamed from: ai.kudi.dip.library.h.l.c$a */
    /* loaded from: classes2.dex */
    public final class C0817a extends AbstractC0818b {

        /* renamed from: b */
        private final TextView f2302b;

        /* renamed from: c */
        private final TextView f2303c;

        /* renamed from: d */
        final /* synthetic */ C0816c f2304d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0817a(C0816c c0816c, View view) {
            super(c0816c, view);
            l.f(c0816c, "this$0");
            l.f(view, "container");
            this.f2304d = c0816c;
            View findViewById = view.findViewById(C0785d.statusTextView);
            l.e(findViewById, "container.findViewById(R.id.statusTextView)");
            this.f2302b = (TextView) findViewById;
            View findViewById2 = view.findViewById(C0785d.indexTextView);
            l.e(findViewById2, "container.findViewById(R.id.indexTextView)");
            this.f2303c = (TextView) findViewById2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static final void m37944b(C0817a c0817a, C0816c c0816c, String str, int i, View view) {
            l.f(c0817a, "this$0");
            l.f(c0816c, "this$1");
            l.f(str, "$status");
            c0817a.setBackgroundColor();
            InterfaceC11771p<String, Integer, C13666w> m37950b = c0816c.m37950b();
            if (m37950b == null) {
                return;
            }
            m37950b.invoke(str, Integer.valueOf(i));
        }

        private final void setBackgroundColor() {
            Drawable m36322f = C1335a.m36322f(this.f2304d.getContext(), C0756b.grey_circular_shape);
            if (m36322f != null) {
                C0828a.m37918a(m36322f, this.f2304d.getContext(), C0755a.colorSecondary);
            }
            this.f2303c.setBackground(m36322f);
        }

        @Override // ai.kudi.dip.library.p043h.p044l.C0816c.AbstractC0818b
        /* renamed from: a */
        public void mo37942a(final String str, final int i) {
            l.f(str, TransactionField.STATUS);
            this.f2302b.setText(str);
            String str2 = this.f2304d.f2299b;
            String upperCase = str.toUpperCase();
            l.e(upperCase, "(this as java.lang.String).toUpperCase()");
            if (l.b(str2, upperCase)) {
                setBackgroundColor();
            }
            View container = getContainer();
            final C0816c c0816c = this.f2304d;
            container.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.h.l.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C0816c.C0817a.m37944b(C0816c.C0817a.this, c0816c, str, i, view);
                }
            });
        }
    }

    /* compiled from: FilterBottomSheetAdapter.kt */
    /* renamed from: ai.kudi.dip.library.h.l.c$b */
    /* loaded from: classes2.dex */
    public abstract class AbstractC0818b extends RecyclerView.AbstractC1620e0 {

        /* renamed from: a */
        private final View f2305a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC0818b(C0816c c0816c, View view) {
            super(view);
            l.f(c0816c, "this$0");
            l.f(view, "container");
            this.f2305a = view;
        }

        /* renamed from: a */
        public abstract void mo37942a(String str, int i);

        protected final View getContainer() {
            return this.f2305a;
        }
    }

    public C0816c(Context context) {
        List<String> m3891e;
        l.f(context, "context");
        this.f2298a = context;
        this.f2299b = "";
        m3891e = C13726r.m3891e();
        this.f2300c = m3891e;
    }

    /* renamed from: b */
    public final InterfaceC11771p<String, Integer, C13666w> m37950b() {
        return this.f2301d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: c */
    public void onBindViewHolder(AbstractC0818b abstractC0818b, int i) {
        l.f(abstractC0818b, "holder");
        abstractC0818b.mo37942a(this.f2300c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    /* renamed from: d */
    public AbstractC0818b onCreateViewHolder(ViewGroup viewGroup, int i) {
        l.f(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f2298a).inflate(C0786e.content_filter_agent_referral_list, viewGroup, false);
        l.e(inflate, "view");
        return new C0817a(this, inflate);
    }

    /* renamed from: e */
    public final void m37947e(List<String> list) {
        l.f(list, "options");
        this.f2300c = list;
    }

    /* renamed from: f */
    public final void m37946f(InterfaceC11771p<? super String, ? super Integer, C13666w> interfaceC11771p) {
        this.f2301d = interfaceC11771p;
    }

    /* renamed from: g */
    public final void m37945g(String str) {
        l.f(str, TransactionField.STATUS);
        String upperCase = str.toUpperCase();
        l.e(upperCase, "(this as java.lang.String).toUpperCase()");
        this.f2299b = upperCase;
    }

    public final Context getContext() {
        return this.f2298a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1623h
    public int getItemCount() {
        return this.f2300c.size();
    }
}
