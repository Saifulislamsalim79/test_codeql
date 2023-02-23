package ai.kudi.dip.library.p048l;

import ai.kudi.dip.library.C0785d;
import ai.kudi.dip.library.C0786e;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import io.intercom.android.sdk.views.holder.AttributeType;
import kotlin.e0.d.g;
import kotlin.e0.d.l;
import kotlin.p549l0.C13277t;
/* compiled from: ItemOptionsRecyclerView.kt */
/* renamed from: ai.kudi.dip.library.l.a */
/* loaded from: classes2.dex */
public final class C0840a extends LinearLayout {

    /* renamed from: c */
    private final TextView f2350c;

    /* renamed from: d */
    private final RecyclerView f2351d;

    public /* synthetic */ C0840a(Context context, AttributeSet attributeSet, int i, int i2, g gVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: a */
    public final <T extends RecyclerView.AbstractC1620e0> void m37892a(RecyclerView.AbstractC1623h<T> abstractC1623h) {
        l.f(abstractC1623h, "adapter");
        this.f2351d.setLayoutManager(new GridLayoutManager(getContext(), 2));
        this.f2351d.setAdapter(abstractC1623h);
        this.f2351d.setHasFixedSize(true);
    }

    public final String getLabel() {
        CharSequence m5414M0;
        String obj = this.f2350c.getText().toString();
        if (obj != null) {
            m5414M0 = C13277t.m5414M0(obj);
            return m5414M0.toString();
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    public final void setLabel(String str) {
        l.f(str, AttributeType.TEXT);
        this.f2350c.setText(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0840a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        l.f(context, "context");
        View.inflate(context, C0786e.layout_selection_recyclerview, this);
        View findViewById = findViewById(C0785d.tv_recycler_label);
        l.e(findViewById, "findViewById(R.id.tv_recycler_label)");
        this.f2350c = (TextView) findViewById;
        View findViewById2 = findViewById(C0785d.rv_recycler_list);
        l.e(findViewById2, "findViewById(R.id.rv_recycler_list)");
        this.f2351d = (RecyclerView) findViewById2;
    }
}
