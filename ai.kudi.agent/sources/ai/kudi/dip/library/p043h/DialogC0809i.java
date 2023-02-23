package ai.kudi.dip.library.p043h;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import ai.kudi.dip.library.C0756b;
import ai.kudi.dip.library.C0796f;
import ai.kudi.dip.library.bottomSheets.models.C0757a;
import ai.kudi.dip.library.p043h.p044l.C0816c;
import ai.kudi.dip.library.p045i.C0825d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.content.C1335a;
import androidx.recyclerview.widget.C1723k;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.bottomsheet.DialogC4547a;
import io.intercom.android.sdk.views.holder.AttributeType;
import java.util.List;
import kotlin.C13666w;
import kotlin.e0.d.l;
import kotlin.p483e0.p484c.InterfaceC11767l;
import kotlin.p483e0.p484c.InterfaceC11771p;
import kotlin.p483e0.p485d.AbstractC11802m;
/* compiled from: FilterBottomSheet.kt */
/* renamed from: ai.kudi.dip.library.h.i */
/* loaded from: classes2.dex */
public final class DialogC0809i extends DialogC4547a {

    /* renamed from: c */
    private C0816c f2278c;

    /* renamed from: d */
    private final C0757a f2279d;

    /* compiled from: FilterBottomSheet.kt */
    /* renamed from: ai.kudi.dip.library.h.i$a */
    /* loaded from: classes2.dex */
    static final class C0810a extends AbstractC11802m implements InterfaceC11771p<String, Integer, C13666w> {
        C0810a() {
            super(2);
        }

        @Override // kotlin.p483e0.p484c.InterfaceC11771p
        public /* bridge */ /* synthetic */ C13666w invoke(String str, Integer num) {
            invoke(str, num.intValue());
            return C13666w.f30112a;
        }

        public final void invoke(String str, int i) {
            l.f(str, TransactionField.STATUS);
            DialogC0809i.this.f2279d.m38048f(str);
            DialogC0809i.this.f2279d.m38050d().invoke(str, Integer.valueOf(i));
            DialogC0809i.this.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC0809i(Context context, InterfaceC11767l<? super C0757a, C13666w> interfaceC11767l) {
        super(context, C0796f.FilterListDialog);
        l.f(context, "context");
        l.f(interfaceC11767l, "params");
        this.f2279d = new C0757a();
        C0825d m37925c = C0825d.m37925c(getLayoutInflater(), null, false);
        l.e(m37925c, "inflate(layoutInflater, null, false)");
        setContentView(m37925c.getRoot());
        this.f2278c = new C0816c(context);
        interfaceC11767l.invoke(this.f2279d);
        C0816c c0816c = this.f2278c;
        if (c0816c == null) {
            return;
        }
        c0816c.m37947e(this.f2279d.m38053a());
        c0816c.notifyDataSetChanged();
        String m38052b = this.f2279d.m38052b();
        c0816c.m37945g(m38052b == null ? "" : m38052b);
        this.f2279d.m38051c().invoke();
        C0816c c0816c2 = this.f2278c;
        l.d(c0816c2);
        c0816c2.m37946f(new C0810a());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        m37925c.f2322c.setLayoutManager(linearLayoutManager);
        m37925c.f2322c.setAdapter(this.f2278c);
        C1723k c1723k = new C1723k(context, linearLayoutManager.m35389v2());
        Drawable m36322f = C1335a.m36322f(context.getApplicationContext(), C0756b.transactions_divider);
        l.d(m36322f);
        c1723k.m34703f(m36322f);
        m37925c.f2322c.m35294h(c1723k);
        m37925c.f2321b.setOnClickListener(new View.OnClickListener() { // from class: ai.kudi.dip.library.h.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DialogC0809i.m37967c(DialogC0809i.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m37967c(DialogC0809i dialogC0809i, View view) {
        l.f(dialogC0809i, "this$0");
        dialogC0809i.dismiss();
    }

    /* renamed from: d */
    public final void m37966d(List<String> list) {
        l.f(list, AttributeType.LIST);
        C0816c c0816c = this.f2278c;
        if (c0816c != null) {
            c0816c.m37947e(list);
        }
        C0816c c0816c2 = this.f2278c;
        if (c0816c2 == null) {
            return;
        }
        c0816c2.notifyDataSetChanged();
    }
}
