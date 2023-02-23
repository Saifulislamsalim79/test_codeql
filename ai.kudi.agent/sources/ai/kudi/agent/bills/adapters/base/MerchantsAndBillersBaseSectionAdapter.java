package ai.kudi.agent.bills.adapters.base;

import ai.kudi.agent.bills.adapters.MerchantsAndBillersHeaderViewHolder;
import ai.kudi.agent.bills.base.MerchantsOrBillers;
import ai.kudi.agent.pin.KudiPin;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.p483e0.p485d.Log_OC;
import p425j.p426a.p427a.p428a.AbstractC11119a;
/* compiled from: MerchantsAndBillersSectionAdapter.kt */
@Metadata(m10422d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0002\u0010\nJ\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0006\u0010\u001d\u001a\u00020\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, m10421d2 = {"Lai/kudi/agent/bills/adapters/base/MerchantsAndBillersBaseSectionAdapter;", "MB", "Lai/kudi/agent/bills/base/MerchantsOrBillers;", "Lio/github/luizgrp/sectionedrecyclerviewadapter/Section;", "context", "Landroid/content/Context;", KudiPin.KUDI_PIN_TITLE, "", "merchantsOrBillers", "", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/List;)V", "getContext", "()Landroid/content/Context;", "expanded", "", "getExpanded", "()Z", "setExpanded", "(Z)V", "getMerchantsOrBillers", "()Ljava/util/List;", "getTitle", "()Ljava/lang/String;", "getContentItemsTotal", "", "getHeaderViewHolder", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "isExpanded", "core_release"}, k = 1, m10420mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public abstract class MerchantsAndBillersBaseSectionAdapter<MB extends MerchantsOrBillers> extends AbstractC11119a {
    private final Context context;
    private boolean expanded;
    private final List<MB> merchantsOrBillers;
    private final String title;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MerchantsAndBillersBaseSectionAdapter(android.content.Context r6, java.lang.String r7, java.util.List r8) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.p483e0.p485d.Log_OC.getArray(r6, r0)
            java.lang.String r0 = "title"
            kotlin.p483e0.p485d.Log_OC.getArray(r7, r0)
            java.lang.String r0 = "merchantsOrBillers"
            kotlin.p483e0.p485d.Log_OC.getArray(r8, r0)
            j.a.a.a.c$b r1 = p425j.p426a.p427a.p428a.C11123c.m11639a()
            int r2 = ai.kudi.agent.core.C0038R.C0041layout.include_bill_item
            r1.m11624o(r2)
            int r2 = ai.kudi.agent.core.C0038R.C0041layout.include_bill_section_header
            r1.m11625n(r2)
            j.a.a.a.c r3 = r1.m11626m()
            r5.<init>(r3)
            r5.context = r6
            r5.title = r7
            r5.merchantsOrBillers = r8
            r4 = 1
            r5.expanded = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.kudi.agent.bills.adapters.base.MerchantsAndBillersBaseSectionAdapter.<init>(android.content.Context, java.lang.String, java.util.List):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p426a.p427a.p428a.AbstractC11119a
    public int getContentItemsTotal() {
        boolean $z0 = this.expanded;
        if ($z0) {
            List $r1 = this.merchantsOrBillers;
            int $i0 = $r1.size();
            return $i0;
        }
        return 0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Context getContext() {
        Context r1 = this.context;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean getExpanded() {
        boolean z0 = this.expanded;
        return z0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // p425j.p426a.p427a.p428a.AbstractC11119a
    public RecyclerView.AbstractC1620e0 getHeaderViewHolder(View view) {
        Log_OC.append(view);
        MerchantsAndBillersHeaderViewHolder $r1 = new MerchantsAndBillersHeaderViewHolder(view);
        TextView $r3 = $r1.getTitle();
        String $r2 = this.title;
        $r3.setText($r2);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final List getMerchantsOrBillers() {
        List r1 = this.merchantsOrBillers;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String getTitle() {
        String r1 = this.title;
        return r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final boolean isExpanded() {
        boolean z0 = this.expanded;
        return z0;
    }

    public final void setExpanded(boolean z) {
        this.expanded = z;
    }
}
